using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace cshap07
{
    public class cat
    {
        public string Name { get; set; }
        public int Age { get; set; }
        public string Color { get; set; }

        public void meow()
        {
            Console.WriteLine(Name+"울고있습니다");
        }

        public string eat()
        {
            return Name+"가 밥을먹습니다";
        }

        public static void jump()
        {
            Console.WriteLine("고양이가 점프합니다");
        }
    }
}
