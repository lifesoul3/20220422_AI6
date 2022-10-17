using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace bookmanagement
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            
            label5.Text = DataManager.Books.Count.ToString();
            label6.Text = DataManager.Users.Count.ToString();
            label7.Text = DataManager.Books.Where((x)=>x.IsBorrowed).Count().ToString();
            label8.Text = DataManager.Books.Where((x) =>{
                return x.IsBorrowed && x.BorrowedAt.AddDays(7) < DateTime.Now;
            }).Count().ToString();

            dataGridView1.DataSource = DataManager.Books;
            dataGridView2.DataSource = DataManager.Users;

            dataGridView1.CurrentCellChanged += DataGridView1_CurrentCellChanged;
            dataGridView2.CurrentCellChanged += DataGridView2_CurrentCellChanged;

            //button3.Click += button3_Click;
            //button4.Click += button4_Click;

        }

        private void DataGridView1_CurrentCellChanged(object sender,EventArgs s)
        {
            try
            {
                Book book=dataGridView1.CurrentRow.DataBoundItem as Book;
                textBox1.Text=book.Isbn;
                textBox2.Text = book.Name;
            }
            catch (Exception)
            {
            }
        }

        private void DataGridView2_CurrentCellChanged(object sender, EventArgs s)
        {
            try
            {
                User user = dataGridView2.CurrentRow.DataBoundItem as User;
                textBox3.Text = user.Id.ToString();
            }
            catch (Exception)
            {
            }
        }

        private void button3_Click(object sender, EventArgs e)
        {
            if (textBox1.Text.Trim() == "")
            {
                MessageBox.Show("Isbn을 입력해주세요111");
            }
           else if(textBox3.Text.Trim() == "")
            {
                MessageBox.Show("사용자 Id를 입력해주세요");
            }
            else
            {
                try
                {
                    Book book = DataManager.Books.Single((x) => x.Isbn == textBox1.Text);
                    if (book.IsBorrowed)
                    {
                        MessageBox.Show("이미 대여 중인 도서입니다");
                    }
                    else
                    {
                        User user = DataManager.Users.Single((x) => x.Id.ToString() == textBox3.Text);
                        book.UserId=user.Id;
                        book.UserName = user.Name;
                        book.IsBorrowed = true;
                        book.BorrowedAt= DateTime.Now;

                        dataGridView1.DataSource = null;
                        dataGridView1.DataSource = DataManager.Books;
                        DataManager.save();

                        MessageBox.Show("\""+book.Name+"\"이/가\""+user.Name+"\"님께 대여되었습니다");
                    }
                }
                catch (Exception)
                {
                    MessageBox.Show("존재하지 않는 도서 또는 사용자입니다.");
                }
            }
        }


        private void button4_Click(object sender, EventArgs e)
        {
            if (textBox1.Text.Trim() == "")
            {
                MessageBox.Show("Isbn을 입력해주세요");
            }
            else
            {
                try
                {
                    Book book=DataManager.Books.Single(x => x.Isbn == textBox1.Text);
                    if (book.IsBorrowed)
                    {
                        User user = DataManager.Users.Single((x) => x.Id.ToString() == book.UserId.ToString());
                        book.UserId = 0;
                        book.UserName = "";
                        book.IsBorrowed = false;
                        book.BorrowedAt = new DateTime();

                        dataGridView1.DataSource = null;
                        dataGridView1.DataSource = DataManager.Books;
                        DataManager.save();

                        if (book.BorrowedAt.AddDays(7) > DateTime.Now)
                        {
                            MessageBox.Show("\"" + book.Name + "\"이/가 연체 상태로 반납되었습니다.");
                        }
                        else
                        {
                            MessageBox.Show("\"" + book.Name + "\"이/가 반납되었습니다.");
                        }
                    }
                    else
                    {
                        MessageBox.Show("대여 상태가 아닙니다.");
                    }
                }
                catch (Exception)
                {
                    MessageBox.Show("존재하지 않는 도서 또는 사용자입니다");
                }
            }
        }

        private void button1_Click(object sender,EventArgs e)
        {
            new Form2().ShowDialog();
            dataGridView1.DataSource = null;
            dataGridView1.DataSource = DataManager.Books;

        }

        private void button2_Click(object sender, EventArgs e)
        {
            new Form3().ShowDialog();
            dataGridView2.DataSource = null;
            dataGridView2.DataSource = DataManager.Users;
        }



    }
}
