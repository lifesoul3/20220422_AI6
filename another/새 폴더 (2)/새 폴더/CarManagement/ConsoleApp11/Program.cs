using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp11
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<Animal> animals = new List<Animal>();
            Animal a = new Animal();
            a.Name = "낙타";
            a.Age = 2;
            animals.Add(a);

            Animal b=new Animal();
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

            Cat e = new Cat();
            e.Name = "떼껄룩";
            e.Age = 1;
            e.EyeColor = "red";
            animals.Add(e);

            Cat f =new Cat();
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
            k.Name = "젠킨킨";
            k.Age = 2;
            k.EyeColor = "gray";
            k.Stripe = "moonslice";
            animals.Add(k);

            Tiger l = new Tiger();
            l.Name = "리로이";
            l.Age = 5;
            l.EyeColor = "golden";
            l.Stripe = "sunlight";
            animals.Add(l);

            foreach (var item in animals)
            {
                item.sleep();
                if (item is Dog)
                {
                    (item as Dog).bark();
                }
                if(item is Cat)
                {
                    (item as Cat).meow();
                }
                if(item is Hamster)
                {
                    (item as Hamster).grooming();
                }
                if(item is Lion)
                {
                    (item as Lion).cryout();
                }
                if(item is Tiger)
                {
                    (item as Tiger).fight();
                }
                Console.WriteLine();
            }


        }
    }
}
