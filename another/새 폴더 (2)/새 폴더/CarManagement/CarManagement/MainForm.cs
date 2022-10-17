using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace CarManagement
{
    public partial class MainForm : Form
    {

        public MainForm()
        {
            InitializeComponent();
            label_now.Text = DateTime.Now.ToString("yyyy년 MM월 dd일 hh시 mm분 ss초");
            try
            {

                textBox_parkingSpot.Text = DataManager.cars[0].ParkingSopt.ToString();
                textBox_carNumber.Text = DataManager.cars[0].CarNumber;
                textBox_driverName.Text = DataManager.cars[0].DriverName;
                textBox_phoneNumber.Text = DataManager.cars[0].PhoneNumber;

                textBox_findNum.Text = textBox_parkingSpot.Text;
               
            }
            catch(Exception)
            {
                MessageBox.Show("데이터 없음");
            }
            if (DataManager.cars.Count > 0)
            {
                dataGridView_parkingManager.DataSource = DataManager.cars;
            }
        }

        private void timer_now_Tick(object sender, EventArgs e)
        {
            label_now.Text = DateTime.Now.ToString("yyyy년 MM월 dd일 hh시 mm분 ss초");
        }

        private void button_parking_Click(object sender, EventArgs e)
        {
            //Writelog("주차버튼클릭");
            if (textBox_parkingSpot.Text.Trim() == "")
            {
                MessageBox.Show("주차 공간을 입력하세요(주차)");
            }
            else if(textBox_carNumber.Text.Trim() == "")
            {
                MessageBox.Show("차량 번호를 입력해주세요");
            }
            else
            {
                try
                {
                    ParkingCar car = DataManager.cars.Single(x => x.ParkingSopt.ToString() == textBox_parkingSpot.Text);
                    if (car.CarNumber.Trim() != "")
                    {
                        MessageBox.Show("이미 차가 있습니다");
                    }
                    else
                    {
                        car.CarNumber = textBox_carNumber.Text;
                        car.DriverName = textBox_driverName.Text;
                        car.PhoneNumber = textBox_phoneNumber.Text;
                        car.ParkingTime = DateTime.Now;

                        dataGridView_parkingManager.DataSource = null;
                        dataGridView_parkingManager.DataSource = DataManager.cars;

                        DataManager.save(textBox_parkingSpot.Text, textBox_carNumber.Text, textBox_driverName.Text, textBox_phoneNumber.Text);
                        string contents=$"주차공간{textBox_parkingSpot.Text}에 {textBox_driverName.Text}차를 주차했습니다";

                        Writelog(contents);
                        MessageBox.Show(contents);
                    }
                }
                catch (Exception)
                {
                    MessageBox.Show($"주차공간{textBox_parkingSpot.Text}은/는 없습니다");
                }
            }
        }

        private void button_remove_Click(object sender, EventArgs e)
        {
            //Writelog("주차버튼클릭");
            if (textBox_parkingSpot.Text.Trim() == "")
            {
                MessageBox.Show("출차 공간을 입력하세요(주차)");
            }
            else if (textBox_carNumber.Text.Trim() == "")
            {
                MessageBox.Show("차량 번호를 입력해주세요");
            }
            else
            {
                try
                {
                    ParkingCar car = DataManager.cars.Single(x => x.ParkingSopt.ToString() == textBox_parkingSpot.Text);
                    if (car.CarNumber.Trim() == "")
                    {
                        MessageBox.Show("비어있는곳입니다");
                    }
                    else
                    {
                        string oldcar = car.CarNumber;
                        car.CarNumber ="";
                        car.DriverName ="";
                        car.PhoneNumber = "";
                        car.ParkingTime = new DateTime();

                        dataGridView_parkingManager.DataSource = null;
                        dataGridView_parkingManager.DataSource = DataManager.cars;

                        DataManager.save(textBox_parkingSpot.Text, "", "", "",true);
                        string contents = $"주차공간{textBox_parkingSpot.Text}에 {textBox_driverName.Text}차를 출차했습니다";

                        Writelog(contents);
                        MessageBox.Show(contents);
                    }
                }
                catch (Exception)
                {
                    MessageBox.Show($"주차공간{textBox_parkingSpot.Text}은/는 없습니다");
                }
            }
        }

        private void Writelog(string contents)
        {
            string logcontents = $"[{DateTime.Now.ToString("yyyy년 MM월 dd일 hh시 mm분 ss초")}]{contents}";
            DataManager.printLog(logcontents);
            listBox_log.Items.Insert(0, logcontents);
        }

        private void MainForm_Load(object sender, EventArgs e)
        {

        }

        private void dataGridView_parkingManager_CellClick(object sender, DataGridViewCellEventArgs e)
        {

            try
            {
                ParkingCar car =
                dataGridView_parkingManager.CurrentRow.DataBoundItem as ParkingCar;
                textBox_parkingSpot.Text = car.ParkingSopt.ToString();
                textBox_carNumber.Text = car.CarNumber;
                textBox_driverName.Text = car.DriverName;
                textBox_phoneNumber.Text = car.PhoneNumber;

                textBox_findNum.Text = car.ParkingSopt.ToString();
            }
            catch
            {

            }
        }

        private void textBox_driverName_TextChanged(object sender, EventArgs e)
        {

        }
        private string lookupparkingspot(int parkingspot)
        {
            string parkedcarnum = "";
            try
            {
                foreach (var item in DataManager.cars)
                {
                    if (item.ParkingSopt == parkingspot)
                    {
                        parkedcarnum = item.CarNumber;
                        break;
                    }
                }
            }
            catch (Exception)
            {
            }
            return parkedcarnum;
        }
        //해당공간 정보를 메세지박스로 띄움
        private void button_find_Click(object sender, EventArgs e)
        {
            try
            {
                string contents="";
                int parkingspot = int.Parse(textBox_findNum.Text);
                string parkingcar=lookupparkingspot(parkingspot);
                if (parkingcar.Trim() != "")
                {
                     contents = $"주차공간{parkingspot}에 주차된 차는 {parkingcar}입니다";
                }
                else
                {
                    contents= $"주차공간{parkingspot}에 차가없습니다";
                }
                    Writelog(contents);
                    MessageBox.Show(contents);
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        private void button_refresh_Click(object sender, EventArgs e)
        {
            DataManager.Load();
            dataGridView_parkingManager.DataSource = null;
            if(DataManager.cars.Count > 0)
            {
                dataGridView_parkingManager.DataSource = DataManager.cars;
            }
        }

        //주차공간을 추가및 삭제
        private void soptadddelete(string parkingspot,string command)
        {
            //int.parse와 trycatch가 합쳐진것
            //parkingspot이 int이면 int pspot을 선언한뒤 값 입력
            //else일 경우 0으로 변환
            parkingspot = parkingspot.Trim();
            int.TryParse(parkingspot, out int pspot);
            if (pspot <= 0)
            {
                Writelog("주차공간번호는 0이상이어야 합니다");
                MessageBox.Show("주차공간은 0이상의 숫자여야합니다");
                return;//이벤트 종료
            }
            string contents = "";
            bool check = DataManager.save(command, parkingspot, out contents);
                
            if(check)   button_refresh.PerformClick();
            
            MessageBox.Show(contents);
            Writelog(contents);
            

        }
        
        private void button_delete_Click(object sender, EventArgs e)
        {
            soptadddelete(textBox_findNum.Text, "delete");
        }

        private void button_add_Click(object sender, EventArgs e)
        {
            soptadddelete(textBox_findNum.Text, "insert");
        }

    }
}
