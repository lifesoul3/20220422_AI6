using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WindowsFormsApp11
{
    public class Tiger:Cat
    {
        public string Stripe { get; set; }

        public void fight()
        {
            Console.WriteLine(Stripe+"줄무늬를 가진 "+EyeColor+"눈의"+Name+"이가 기습을 준비합니다");
        }
    }
}
