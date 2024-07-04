package JAVA;

public class breakstat {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        System.out.println("break Statement:");
        System.out.println("Example:");

        int i =0;

        while (i < 100) {
            if (i == 10) break;
            System.out.println("i:" +i);
            i++;
        }
        System.out.println("Loop Complete");
        System.out.println();

        System.out.println("Example2:");
   
        for(int i2 = 0; i2 < 3 ; i2++)
        {
            System.out.print("No1:" + i2 + ":");
         
            for( int j =0; j < 100; j++)
            {
                if (j == 10) break;
                System.out.print(j+" ");    
            }
            System.out.println();
       }
       System.out.println("Loop Complete");
      
       System.out.println();
        
        System.out.println("Example3:");

        boolean t =true;

        first: {
            second: {
                third: {
                    System.out.println("Before Break");
                    if (t) break second;
                    System.out.println("not Executed");
                }
                System.out.println("not Executed");
            }
            System.out.println("not Executed");
        }
   
        System.out.println();
        
        System.out.println("Example4:");
           
        outer: for(int i2=0; i2 < 3; i2++){
            System.out.print("no:" + i2 + ":");

            for(int j = 0; j < 100; j++)
            {
                if(j ==10) break outer;
                System.out.print(j + " ");
            }
            System.out.println("Not Printed");
        }
       System.out.println("Loop Complete");







    }
    
}
