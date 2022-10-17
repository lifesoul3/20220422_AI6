using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp11
{
    public class Lion:Cat
    {
        public int CountofWife { get; set; }
        public void cryout()
        {
            Console.WriteLine("사자"+Name+"은/는 "+CountofWife+"마리의 암사자를 거느리고있습니다");
        }
    }
}
