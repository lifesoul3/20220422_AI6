using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Zoo_Winform
{
    public partial class Form1 : Form
    {
        public List<Animal> animals = new List<Animal>();
        public Form1()
        {
            InitializeComponent();

            //animals.Add(new Animal());
            //animals.Add(new Animal());
            //Dog d1 = new Dog();
            //Dog d2 = new Dog();
            //animals.Add(d1);
            //animals.Add(d2);
            //다형성 활용
            //Animal c1 = new Cat();
            //Animal c2 = new Cat();
            //animals.Add(c1);
            //animals.Add(c2);
            //animals.Add(new Hamster());
            //animals.Add(new Hamster());
            //Animal l1 = new Lion();
            //Cat l2 = new Lion(); //Lion은 Cat의 자손 클래스이다.
            //(l1 as Lion).countOfWife = 1; //형변환
            //                              l2는 암사자라서 countOfWife값이 0
            //                              정수 값 지정 안하면 기본 값 0임(=자바도 똑같음)
            //animals.Add(l1);
            //animals.Add(l2);
            //Tiger t1 = new Tiger();
            //t1.Name = "랑이";
            //t1.Age = 5;
            //t1.pattern = "호피";
            //Animal t2 = new Tiger();
            //if (t2 is Tiger) //형변환 가능여부 체크
            //{
            //    (t2 as Tiger).Name = "호랭";
            //    (t2 as Tiger).Age = 2;
            //    (t2 as Tiger).pattern = "민";
            //}
            //animals.Add(t1);
            //animals.Add(t2);

           
            Animal a = new Animal();
            a.Name = "낙타";
            a.Age = 2;
            animals.Add(a);

            Animal b = new Animal();
            b.Name = "소";
            b.Age = 3;
            animals.Add(b);

            Dog c = new Dog();
            c.Name = "바둑이";
            c.Age = 1;
            c.HairColor = "blue";
            animals.Add(c);

            Dog d = new Dog();
            d.Name = "백구";
            d.Age = 2;
            d.HairColor = "white";
            animals.Add(d);

            Cat es = new Cat();
            es.Name = "떼껄룩";
            es.Age = 1;
            es.EyeColor = "red";
            animals.Add(es);

            Cat f = new Cat();
            f.Name = "옹냐";
            f.Age = 2;
            f.EyeColor = "green";
            animals.Add(f);

            Hamster g = new Hamster();
            g.Name = "모찌";
            g.Age = 1;
            g.Species = "snow";
            animals.Add(g);

            Hamster h = new Hamster();
            h.Name = "햄토리";
            h.Age = 2;
            h.Species = "golden";
            animals.Add(h);

            Lion i = new Lion();
            i.Name = "심바";
            i.Age = 1;
            i.EyeColor = "brown";
            i.CountofWife = 1;
            animals.Add(i);

            Lion j = new Lion();
            j.Name = "무파사";
            j.Age = 3;
            j.EyeColor = "black";
            j.CountofWife = 7;
            animals.Add(j);

            Tiger k = new Tiger();
            k.Name = "퀸";
            k.Age = 2;
            k.EyeColor = "gray";
            k.Stripe = "민";
            animals.Add(k);

            Tiger l = new Tiger();
            l.Name = "킹";
            l.Age = 5;
            l.EyeColor = "golden";
            l.Stripe = "호피";
            animals.Add(l);






        }

        private void button_console_Click(object sender, EventArgs e)
        {
            foreach (var item in animals)
            {
                item.Sleep();
                if (item is Dog)
                {
                    (item as Dog).Bark();
                }

                if (item is Cat)
                {
                    if (item is Lion)
                    {
                        (item as Lion).CryOut();
                    }

                    else if (item is Tiger)
                    {
                        (item as Tiger).Fight();
                    }

                    else
                    {
                    (item as Cat).meow();
                    }
                }

                if (item is Hamster)
                {
                    (item as Hamster).grooming();
                }
                
                Console.WriteLine();
            }

            //foreach (var item in animals)
            //{
            //    item.Sleep();
            //    if (item is Dog)
            //    {
            //        ((Dog)(item)).Bark();
            //    }
            //    if (item is Cat)
            //        (item as Cat).meow(); //Lion, Tiger도 meow호출함... 
            //    즉 이 클래스들은 Cat으로부터 왔기 때문이다.
            //                              Dog, Cat, Hamster들이 Sleep을 호출 할 수 있는 것과 같다.


            //    item 역시 var 였으나 Lion으로 형변환
            //    형변환 성공했다면 l은 Lion타입이 맞고(new Lion으로 인스턴스 만들어짐)
            //    형변환 실패했다면 l 에는 null값이 있다.(Lion이외의 타입인 경우)
            //    var l = item as Lion;
            //    if (l != null) //l이 Lion으로 인스턴스 만들었다면 null이 아니다.
            //        l.CryOut();

            //    if (item is Tiger)
            //    {
            //        var t = item as Tiger;
            //        t.Fight();
            //    }

            //}
        }

        private void button_MessageBox_Click(object sender, EventArgs e)
        {
            //모든 속성에 값들을 부여하고
            //그 것을 한 번에 messageBox로 띄워보자.
            string contents = "";
            for(int i = 0; i<animals.Count; i++)
            {


                //사자의 countOfWife는 이미 값을 지정함
                //(new Form에서)

                contents+="이름:"+animals[i].Name+" ";
                contents+=animals[i].Age+"살 ";
                if(animals[i] is Hamster)
                    contents += (animals[i] as Hamster).Species + "종류 쥐 ";
                if (animals[i] is Tiger)
                    contents += (animals[i] as Tiger).Stripe + "무늬 호랑이 ";
                if(animals[i] is Lion)
                {
                    var temp = animals[i] as Lion;
                    if (temp.CountofWife == 0)
                        contents += "암사자 ";
                    else
                        contents += temp.CountofWife + "마리의 암사자와 함께하는 숫사자 ";
                }

                if (animals[i] is Dog)
                    contents += (animals[i] as Dog).HairColor + "털색의 개 ";
                if (animals[i] is Cat)
                {
                    contents += (animals[i] as Cat).EyeColor + "눈색의 고양이 ";
                }
                contents += Environment.NewLine;//"\n"이랑 똑같은 거


            }

            //여기서 만약에 호랑이, 사자인 경우
            //Cat이 가지고 있는 눈색깔 속성을 안 나타나게 하려면 어떻게 해야할까?


            //그리고 지금처럼 털색1, 털색2가 아니라
            //털색 : 녹색, 파랑
            //눈색 : 금색, 회색
            //이렇게 나타내고 싶다면 어떻게 코드를 짜야할까
            //단 털색 눈색은 저 2개만 있다고 가정한다.
            MessageBox.Show(contents);
        }
    }
}
