﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace cshap07
{
    public partial class Dog
    {
        public void bark()
        {
            Console.WriteLine(name+"+이 짖습니다");
        }
        public void sleep()
        {
            Console.WriteLine(name+"이 잠들었습니다");
        }
    }
}
