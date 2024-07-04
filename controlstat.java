package JAVA;

public class controlstat {

    public static void main(String[] args) {
        System.out.println("---> Control Statment <---");
        System.out.println("IF Statment:");
        int x,y;
        
        x = 10;
        y = 20; 

        if (x < y) {
            System.out.println("X is less than Y");
        }
        x = x * 2;
        if (x == y) {
            System.out.println("X is Equal Y");
        }
         x = x * 2;
        if (x > y) {
            System.out.println("X is Grater than  Y");
        }
        System.out.println();

        
        System.out.println("IF Else:");
        int month = 4;
        String season;

        if (month == 12 || month == 1 || month == 2) {
           season = "Winter";
        }
        else if (month == 3 || month == 4 || month == 5 ) {
           season = "Spring";
        }
        else if (month == 6 || month == 7 || month == 8) {
           season = "Summer";
        }
        else if (month == 9 || month == 10 || month == 11) {
           season = "Autumn";
        }
        else
        {
           season = "Bogus Month";
        }
       
        System.out.println("April is In the:"+season);
        System.out.println();
      
        System.out.println("For Loop:");
        System.out.println("Example:");
    
         int x2;

         for(x2 = 0; x2 < 10; x2 = x2+1)
         {
            System.out.println("Loop times:" + x2);
         }
         System.out.println();

        
       
       System.out.println("While Loop:");
        System.out.println("Example:");
        int n = 10;

        while (n > 0) {
            System.out.println("time"+n);
             n--;
        }
      
        System.out.println();
      
        System.out.println("Nested Loop:");
        System.out.println("Example:");
        
        int i4,j4;

        for(i4= 0; i4 < 10 ; i4++)
        {
            for(j4 = i4; j4 < 10; j4++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
      


        System.out.println(" do-while:");
        System.out.println("Example:"); 

        int nn = 10;
        System.out.println("do-while n:"+nn);
        do {
            System.out.println("do-while time:"+nn);
            nn--;
        } while (nn > 0);  //while (--nn > 0);


        System.out.println();

        System.out.println("For Each loop:");
        System.out.println("Example:");
       
         int nums[] = {1,2,3,4,5,6,7,8,9,10};
         int sum = 0;
        
         for (int x3 : nums) {
            System.out.println("num is:" +x3);
            sum += x3;
           
         }
         System.out.println();
         System.out.println("Sum is:" +sum);
         System.out.println();

        



        System.out.println();

         System.out.println("Switch Statement:");
         System.out.println("Example:");
         
         for(int i = 0; i <6; i++)
         {
             System.out.println("i:"+i);
            switch (i) {
                case 0:
                    System.out.println("i is zero");
                    break;
            
                case 1:
                    System.out.println("i is one");
                    break;
            
                case 2:
                    System.out.println("i is two");
                    break;
            
                case 3:
                    System.out.println("i is three");
                    break;
            
                default:
                    System.out.println("i is greater than 3");
                    break;
            }
         }
         System.out.println();

      
         System.out.println("Break Statement:");
         System.out.println("Example:");
     
         for(int i = 0; i < 100; i++)
         {
           if (i == 10)  break;
           System.out.println("i:"+i); 
        }
        System.out.println("Loop complete");

        System.out.println();

      
        System.out.println("Continue Statement:");
        System.out.println("Example:");

        for( int i = 0; i < 10; i++)
        {
            System.out.print(i + " ");
            if(i % 2 == 0) continue;
            System.out.println("");
        }
    
        System.out.println();

      
        System.out.println("Return Statement:");
        System.out.println("Example:");

        boolean t = true;

        System.out.println("Before the Return");

        if(t) return;

        System.out.println("no executed");



        }

       
    }
    

