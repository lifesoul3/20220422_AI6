using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace winform1
{
    public class Student
    {
        public int score { get; set; }
        public int study(int score)
        {
            this.score = score;
            return score;
        }
    }
}
