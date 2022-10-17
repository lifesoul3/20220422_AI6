using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Zoo_Winform
{
    public class Lion : Cat
    {
        public int CountofWife { get; set; }

        public void CryOut()
        {
            if(CountofWife==0)
            {
                Console.WriteLine("암사자가 웁니다.");
            }
            else
            {
                Console.WriteLine(CountofWife+"마리의 암사자와 함께 울부 짖습니다.");
            }
        }
    }
}
