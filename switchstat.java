package JAVA;

public class switchstat {

    public static void main(String[] args) {
        System.out.println("---> Control Statment <---");
        System.out.println("Switch Statement:");
      
        System.out.println("Example2:");
        int month = 4;
        String season;
  
        for(int i = 0; i < 12; i++)
        {
            System.out.println("i:"+i);
           switch (i) {
               case 0:
               case 1:
               case 2:
               case 3:
               case 4:
                   System.out.println("i is less than 5");
                   break;
           
               case 5:
               case 6:
               case 7:
               case 8:
               case 9:
                   System.out.println("i is less than 10");
                   break;
           
               default:
                   System.out.println("i is 10 or more");
                   break;
           }
        }
        System.out.println();

        System.out.println("Example3:");
         
         
        System.out.println("month:"+month);
        System.out.println("season:");
        switch (month) {
               case 12:
               case 1:
               case 2:
                  season ="winter";
                  break;

               case 3:
               case 4:
               case 5:
                   season ="spring";
                   break;
   
               case 6:
               case 7:
               case 8:
                   season ="summer";
                    break;
              
               case 9:
               case 10:
               case 11:
                    season ="Autumn";
                    break;
         
           
               default:
                      season ="Bogus Month";
                     break;
           }

           System.out.println("April is In the:"+season);
           System.out.println();
    
           
           System.out.println("Example4:");
      
            String str = "two";

            System.out.println("String:"+str);
          switch (str) {
           case "one":
                System.out.println("one");
               break;

           case "two":
                   System.out.println("two");
                   break;
           
           case "three":
                   System.out.println("three");
                   break;
           
           default:
                   System.out.println("No Allowed");
                   break;
          
          }
    }

    
}
