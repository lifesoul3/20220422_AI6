using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp11
{
    public class Cat:Animal
    {
        public string EyeColor { get; set; }
        
        public void meow()
        {
            Console.WriteLine(EyeColor+"색 눈을 가진"+Name+"가 움니다");
        }
    }
}
