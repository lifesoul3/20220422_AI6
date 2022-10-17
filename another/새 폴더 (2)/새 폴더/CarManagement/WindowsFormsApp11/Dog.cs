using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WindowsFormsApp11

{
    public class Dog:Animal
    {
        public string HairColor { get; set; }
        
        public void bark()
        {
            Console.WriteLine("털이"+HairColor+"색인"+Name+"가 짖습니다");
        }
    }
}
