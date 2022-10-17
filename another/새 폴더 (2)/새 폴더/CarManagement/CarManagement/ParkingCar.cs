using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CarManagement
{
    //테이블에 있는 내용을 읽어서 리스트에 담는다
    public class ParkingCar
    {
        public int ParkingSopt { get; set; }
        public String CarNumber { get; set; }
        public String DriverName { get; set; }
        public String PhoneNumber { get; set; }
        public DateTime ParkingTime { get; set; }

    }

}
