using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Zoo_Winform
{
    public class Dog : Animal
    {
        public string HairColor { get; set; }
        
        public void Bark()
        {
            Console.WriteLine("멍멍!");
        }
    }
}
