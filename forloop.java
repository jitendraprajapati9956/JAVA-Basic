package JAVA;

public class forloop {

    public static void main(String[] args) {
        System.out.println("---> Control Statment <---");
        System.out.println("For Loop:");
       
        System.out.println("Example2:");
        int n2;

        for(n2 = 10; n2 >0; n2--)
        {
            System.out.println("time"+n2);
        }
        System.out.println();

        System.out.println("Example3:");
        System.out.println("Prime Number:");
       
        int num;
        boolean isprime;
      
        num = 14;
        System.out.println("Number:"+num);

        if (num < 2 )
         {
            isprime =false;    
         }
         else
         {
            isprime = true;
         }
      
        for(int i = 2; i <= num/i; i++)
        {
            if ((num % i) == 0) {
                isprime = false;
                break;
            }
        }

        if (isprime) {
            System.out.println("Prime Number");
        }
       else{
        System.out.println("Not Prime Number");
       }
       System.out.println();
       
       System.out.println("Example4:");
        
       int a2,b2;

       b2 =4;

       for(a2 = 1; a2 < b2; a2++)
       {
        System.out.println("a:"+a2);
        System.out.println("b:"+b2);
        b2--;
       }
       System.out.println();
   
    /*   System.out.println("Example5:"); //infinite loop
       int i3;
       boolean done = false;

       i3 =0;

       for(; !done;)
       {
        System.out.println("i is" +i3);
        if (i3 == 10) {
            done = true;
            i3++;
        }
       }
       */
    }
    
}
