using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace bookmanagement
{
    public class Book
    {
        public string Isbn { get; set; }
        public string Name { get; set; }
        public string Publisher { get; set; }
        public int Page { get; set; }

        public int UserId { get; set; }
        public string UserName { get; set; }
        public bool IsBorrowed { get; set; }
        public DateTime BorrowedAt { get; set; }

    }
}


//private void saves()
//{
//    Book book1 = new Book();
//    book1.Isbn = "12345";
//    book1.Name = "It 초급";
//    book1.Publisher = "한빛아카데미";
//    book1.Page = 400;
//    book1.UserId = 0;
//    book1.IsBorrowed = false;
//    DataManager.Books.Add(book1);

//    Book book2 = new Book();
//    book2.Isbn = "34567";
//    book2.Name = "It 중급";
//    book2.Publisher = "한빛아카데미";
//    book2.Page = 380;
//    book2.UserId = 0;
//    book2.IsBorrowed = false;
//    DataManager.Books.Add(book2);

//    Book book3 = new Book();
//    book3.Isbn = "67890";
//    book3.Name = "It 고급";
//    book3.Publisher = "한빛아카데미";
//    book3.Page = 500;
//    book3.UserId = 0;
//    book3.IsBorrowed = false;
//    DataManager.Books.Add(book3);

//    DataManager.save();
//}