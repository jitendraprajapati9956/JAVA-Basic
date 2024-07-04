package JAVA;

public class foreachloop {

    public static void main(String[] args) {
        System.out.println("---> Control Statment <---");
        System.out.println("For Each loop:");
       
        int nums[] = {1,2,3,4,5,6,7,8,9,10};
        int sum2 = 0;
      

        System.out.println("Example2:");
        for (int x3 : nums) {
           System.out.println("num is:" +x3);
           sum2 += x3;
          if (x3 == 5) 
          {
           break;      
          }
        }
        System.out.println();

        System.out.println("Sum is first five num:" +sum2);
        System.out.println();

        System.out.println("Example3:");
        for (int x3 : nums) {
            System.out.print(x3 + " ");
            x3 = x3 * 10;
         }
         System.out.println();

         for (int x3 : nums) {
            System.out.print(x3 + " ");
         }
         System.out.println();

         System.out.println("Example4:");
         System.out.println("Multidimensional Arrays");
         int sum = 0;
         int nums2[][] = new int [3][5];

         for( int i = 0; i < 3 ; i++)
         {
            for (int j = 0; j < 5; j++) {
                nums2[i][j] = (i+1) * (j+1);
            }
         }

         for (int x[]  : nums2) {
            for (int y  : x) {
                System.out.println("number:" +y);
                sum += y;
            }
         }
         System.out.println("Sum is:" +sum);
         System.out.println();

         System.out.println("Example5:");
         int nums3[] = {6,8,3,7,5,6,1,4};
         int val = 5;
         boolean found = false;

         System.out.println("Search:"+val);
         
         for (int x4 : nums3) {
            if (x4 == val) {
                found = true;
                break;
            }
         }
         if (found) {
            System.out.println("number found");
         }
         System.out.println();

         System.out.println("Example6:");
         System.out.println("number of x:");

         for (var x =2.5 ; x < 100.0; x = x *2)
         {
            System.out.println(x + " ");
         }
         System.out.println();

         int[] nums4 = {1,2,3,4,5,6};
         System.out.println("number in array:");

         for (var v : nums4) {
            System.out.println(v + "in array");
         }
         System.out.println();
      
    }
     
}
