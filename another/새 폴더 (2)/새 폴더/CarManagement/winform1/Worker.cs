using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace winform1
{
    public class Worker
    {
        public int Pay { get; set; }
        public int Work()
        {   
            return Pay*30;
        }
    }
}
