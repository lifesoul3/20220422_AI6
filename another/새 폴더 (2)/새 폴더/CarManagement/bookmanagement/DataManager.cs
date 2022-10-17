using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Linq;

namespace bookmanagement
{
    public class DataManager
    {
        public static List<Book> Books = new List<Book>();
        public static List<User> Users = new List<User>();

        static DataManager()
        {
            Load();
        }
        public static void Loads()
        {
            string book = File.ReadAllText("./Books.xml");
            System.Windows.Forms.MessageBox.Show(book);
           XElement bookX = XElement.Parse(book);
        }
        public static void Load()
        {
            try
            {

            
                string bookOutput = File.ReadAllText(@"./Books.xml");
                XElement booksXElement = XElement.Parse(bookOutput);

                Books = (from item in booksXElement.Descendants("book")
                         select new Book()
                         {
                             Isbn = item.Element("isbn").Value,
                             Name = item.Element("name").Value,
                             Publisher = item.Element("publisher").Value,
                             Page = int.Parse(item.Element("page").Value),
                             BorrowedAt = DateTime.Parse(item.Element("borrowedAt").Value),
                             IsBorrowed = item.Element("isBorrowed").Value != "0" ? true : false,
                             UserId = int.Parse(item.Element("userId").Value),
                             UserName = item.Element("userName").Value


                         }) .ToList<Book>();



                string userOutput = File.ReadAllText(@"./Users.xml");
                XElement usersXElement = XElement.Parse(userOutput);
                Users = (from item in usersXElement.Descendants("user")
                         select new User()
                         {
                             Id = int.Parse(item.Element("id").Value),
                             Name = item.Element("name").Value
                         }).ToList<User>();
            }
            catch (Exception)
            {
                System.Windows.Forms.MessageBox.Show("데이터 로딩 실패");
            }
        }

        public static void save()
        {
            string bookOutput = "";

            bookOutput += "<books>\n";
            foreach(var item in Books)
            {
                bookOutput += "<book>\n";
                bookOutput += "    <isbn>" + item.Isbn + "</isbn>\n";
                bookOutput += "    <name>"+item.Name+"</name>\n";
                bookOutput += "    <publisher>"+item.Publisher+ "</publisher>\n";
                bookOutput += "    <page>"+item.Page+ "</page>\n";
                bookOutput += "    <borrowedAt>"+item.BorrowedAt.ToString()+ "</borrowedAt>\n";
                bookOutput += "    <isBorrowed>"+(item.IsBorrowed ? 1:0)+ "</isBorrowed>\n";
                bookOutput += "    <userId>"+item.UserId+ "</userId>\n";
                bookOutput += "    <userName>"+item.UserName+ "</userName>\n";
                bookOutput += "</book>\n";
            }
            bookOutput += "</books>";


            string userOutput = "";

            userOutput += "<users>\n";
            foreach(var item in Users)
            {
                userOutput+="<user>\n";
                userOutput+="   <id>"+item.Id+"</id>\n";
                userOutput += "   <name>"+item.Name+"</name>\n";
                userOutput +="</user>\n";
            }
            userOutput += "</users>";

            File.WriteAllText(@"./Books.xml",bookOutput);
            File.WriteAllText(@"./Users.xml",userOutput);


        }
    }
}
