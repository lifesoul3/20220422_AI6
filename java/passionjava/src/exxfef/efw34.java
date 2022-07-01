package exxfef;

import java.util.Random;

class ab{
	Random r=new Random();
    int[] ar = new int[] {173,163,161,167,151,154,158,154,132,162,160,168,171,164,158,158,171,168
    ,153,166,160,130,141,162,149,164,173,143,138,151,160,142,169,176,155,156,163,161,167,163,141
    ,156,180,157,157};

    int[] ar2 = new int[6];

    int sum = 0;
	
    public void a() {
    	   
         for(int i = 0; i < ar.length; i++)
         {
             sum += ar[i];
         }
         ar2[0] = 174;

         b();
    }
    
    private void b()
    {
        for(int i = 0; i < ar2.length; i++)
        {
          ar2[i] = r.nextInt(sum)+1;    
        }
        sum = 0;
        for(int i=0; i < ar2.length; i++)
        {
            sum = 0;
            for(int j = 0; j < ar.length; j++)
            {
                sum += ar[j];
                if (ar2[i] <= sum)
                {
                    ar2[i] = j+1;
                    break;

                }
            }
        }
        //c();
        alpha();
    }
    private void alpha() {
    	for(int i=0;i<ar2.length;i++) {
    		System.out.println(ar2[i]);
    	}
    	
    }
    

    private void c1()
    {
        for (int i = 0; i < ar2.length; i++)
        {
            for (int j = 0; j < ar2.length; j++)
            {
                if (ar2[i] == ar2[j])
                {
                    //textBox1.Text = "same";
                }
            }
        }


    }

    private void c()
    {
        int count = 0;
        for(int i = 0; i < ar2.length; i++)
        {
            for(int j=0; j < ar2.length; j++)
            {
                if (ar2[i] == ar2[j])
                {
                    count++;
                }
                System.out.println(count);
            }
        }
        
        //if (count == 0) { d(); c1(); }
        // else d1();
        d1();
    }

    private void d1()
    {
        for(int i = 0; i < ar2.length; i++)
        {
            ar2[i] = 0;
       
        }
        //b();
    }
    
    
	
}


public class efw34 {
	public static void main(String[] args) {
		ab ab=new ab();
		ab.a();
	}
}
