using System;
using System.Collections.Generic;
using System.Data;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace CarManagement
{

    public class DataManager
    {
        public static List<ParkingCar> cars = new List<ParkingCar>();
        
        static DataManager()
        {
            Load();
        }  
        public static void Load()
        {
            try
            {
                DBHelper.selectQuery();
                cars.Clear();
                
                foreach(DataRow item in DBHelper.dt.Rows)
                {
                    ParkingCar car = new ParkingCar();
                    car.ParkingSopt = int.Parse(item["ParkingSpot"].ToString());
                    car.CarNumber = item["CarNumber"].ToString();
                    car.DriverName = item["DriverName"].ToString();
                    car.PhoneNumber = item["PhoneNumber"].ToString();
                    car.ParkingTime = item["ParkingTime"].ToString()==""?
                        new DateTime():
                        DateTime.Parse(item["ParkingTime"].ToString());
                    
                    cars.Add(car);
                }
            }
            catch(Exception ex)
            {
                System.Windows.Forms.MessageBox.Show(ex.Message);
                //throw;
            }
        }

        public static void printLog(string contents)
        {
            DirectoryInfo id = new DirectoryInfo("parkingHistory");
            if (id.Exists == false)
            {
                id.Create();
            }
                using (StreamWriter sw = new StreamWriter("parkingHistory\\parkingHistory.txt",true))
                {
                sw.WriteLine(contents);
                }
        }

        public static void save(string parkingspottext, string carnumber, string drivername, string phonenumber, bool isRemove = false)
        {
            try
            {
                DBHelper.updateQuery(parkingspottext, carnumber, drivername, phonenumber, isRemove);
            }
            catch (Exception)
            {
            }
        }

        //out과 ref의 차이
        //ref는 참조값을 전달한다
        public static bool save(string command, string parkingspot, out string contents)
        {
            contents = "";
            DBHelper.selectQuery(int.Parse(parkingspot));
            if(command == "insert")
            {
                return DBinsert(parkingspot, ref contents);
            }
            else
            {
                return DBdelete(parkingspot, ref contents);
            }
         
        }

        private static bool DBdelete(string parkingspot, ref string contents)
        {
            if (DBHelper.dt.Rows.Count != 0)
            {
                DBHelper.deleteQuery(parkingspot);
                contents = $"주차공간{parkingspot}이 삭제되었습니다";
                return true;
            }
            else
            {
                contents = "해당 주차 공간이 아직 없습니다";
                return false;
            }
        }

        private static bool DBinsert(string parkingspot, ref string contents)
        {
            if (DBHelper.dt.Rows.Count == 0)
            {
                DBHelper.insertQuery(parkingspot);
                contents = $"주차공간{parkingspot}이 추가되었습니다";
                return true;
            }
            else
            {
                contents = "해당 주차 공간이 이미 존재합니다";
                return false;
            }
        }
    }



}
