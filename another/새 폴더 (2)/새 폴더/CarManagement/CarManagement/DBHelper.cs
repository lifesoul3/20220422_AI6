using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


namespace CarManagement
{
    //데이터 베이스 접근 클래스
    //import alt-enter
    public class DBHelper
    {

        private static SqlConnection conn = new SqlConnection();
        public static SqlDataAdapter da;
        public static DataSet ds;
        public static DataTable dt;


        public static void ConnectDB()
        {
            conn.ConnectionString = String.Format("Data Source=({0}); "+" initial Catalog={1};"+"integrated Security={2};"
                +"Timeout=3","local","MyDb","SSPI");
            conn = new SqlConnection(conn.ConnectionString);
            conn.Open();
        }


        public static void selectQuery(int ParkingSpot = -1)
        {
            try
            {
                ConnectDB();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = conn;
                if(ParkingSpot== -1)
                {
                    cmd.CommandText = "select * from ParkingTable";
                }
                else
                {
                    cmd.CommandText = "select * from ParkingTable where ParkingSpot=" + ParkingSpot;
                }
                da = new SqlDataAdapter(cmd);
                ds = new DataSet();
                da.Fill(ds,"ParkingTable");
                dt = ds.Tables[0];
            }
            catch (Exception ex)
            {
                System.Windows.Forms.MessageBox.Show(ex.Message);
            }
            finally//무조건 실행함
            {
            conn.Close();
            }
        }

        public static void updateQuery(string parkingspottext, string carnumber, string drivername, string phonenumber, bool isRemove)
        {
            try
            {
                ConnectDB();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = conn;
                cmd.CommandType = CommandType.Text;

                string sqlcommand="";
                if(isRemove)//출차
                {
                    sqlcommand = "update ParkingTable set CarNumber='',DriverName='',PhoneNumber='',ParkingTime=null where ParkingSpot=@p1";
                    cmd.Parameters.AddWithValue("@p1", parkingspottext);
                }
                else
                {
                    sqlcommand = "update ParkingTable set CarNumber=@p1, DriverName=@p2, PhoneNumber=@p3, ParkingTime=@p4 where ParkingSpot=@p5";
                    cmd.Parameters.AddWithValue("@p1", carnumber);
                    cmd.Parameters.AddWithValue("@p2", drivername);
                    cmd.Parameters.AddWithValue("@p3", phonenumber);
                    cmd.Parameters.AddWithValue("@p4", DateTime.Now.ToString("yyyy-MM-dd HH:mm:ss.fff"));
                    cmd.Parameters.AddWithValue("@p5", parkingspottext);
                }

                cmd.CommandText = sqlcommand;
                cmd.ExecuteNonQuery();
            }
            catch (Exception)
            {

            }
            finally
            {
                conn.Close();
            }
        }


        public static void exceutequery(string parkingspot,string command)
        {
            string sqlcommand = "";
            if (command == "insert")
            {
                sqlcommand = "insert into ParkingTable(parkingspot) values (@p1)";
            }
            else
            {
                sqlcommand = "delete from ParkingTable where parkingspot=@p1";
            }
            try
            {
                ConnectDB();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection= conn;
                cmd.CommandType=CommandType.Text;
                cmd.Parameters.AddWithValue("@p1", parkingspot);
                cmd.CommandText = sqlcommand;
                cmd.ExecuteNonQuery();
            }
            catch (Exception)
            {
            }
            finally
            {
                conn.Close();
            }
        }


        public static void deleteQuery(string parkingspot)
        {
            exceutequery(parkingspot, "delete");
            
        }

        public static void insertQuery(string parkingspot)
        {
            exceutequery(parkingspot, "insert");
        }
    }
}
