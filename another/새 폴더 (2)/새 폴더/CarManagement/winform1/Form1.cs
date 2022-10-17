using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace winform1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void reset()
        {
            textBox1.Text = "";
            textBox2.Text = "";
            textBox3.Text = "";
        }



        private void button1_Click(object sender, EventArgs e)
        {
            reset();
            Human human = new Human();
            human.Name = "홍길동";
            human.Age = 17;
            textBox1.Text=human.Age.ToString();
            textBox2.Text=human.Name.ToString();
            Console.WriteLine(human.Age);
            Console.WriteLine(human.Name);

           
        }

        private void button2_Click(object sender, EventArgs e)
        {
            reset();
            Student student = new Student();
            
            textBox1.Text = student.study(10).ToString();
            
        }

        private void button3_Click(object sender, EventArgs e)
        {
            reset();
            Worker worker = new Worker();
            worker.Pay = 12;
            textBox1.Text = worker.Work().ToString();
            
        }
    }
}
