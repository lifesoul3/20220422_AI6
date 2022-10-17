using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WindowsFormsApp11
{
    public class Animal
    {
        public string Name { get; set; }
        public int Age { get; set; }
        
        public void sleep()
        {
            Console.WriteLine(Name+"이/가 잠들었습니다");
        }
       
    }
}
