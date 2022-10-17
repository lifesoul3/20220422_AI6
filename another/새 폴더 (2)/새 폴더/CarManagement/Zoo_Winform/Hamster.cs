using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Zoo_Winform
{
    public class Hamster : Animal
    {
        public string Species { get; set; }

        public void grooming()
        {
            Console.WriteLine(Name + "인 햄스터(종:" + Species + ")가 그루밍을 합니다");
        }
    }
}
