package JAVA.Array;

public class array {

    public static void main(String[] args) {
        System.out.println("---> Array <---");
        System.out.println("Declaration Array:");
        System.out.println("Example: type variable-name[]");        
        System.out.println("Example2: int al[] = new int[0];");        
        System.out.println("Example3: int[] a2= new int[0];");        
        System.out.println("Example4: var myarray= new int[0];");        
    
        System.out.println();

        System.out.println("One Dimensional Array:");
        System.out.println("Example:");
        System.out.println("Every Month Of Days:");

        int month_days[];

        month_days = new int[12];
        month_days[0] = 31;
        month_days[1] = 28;
        month_days[2] = 31;
        month_days[3] = 30;
        month_days[4] = 31;
        month_days[5] = 30;
        month_days[6] = 31;
        month_days[7] = 31;
        month_days[8] = 30;
        month_days[9] = 31;
        month_days[10] = 30;
        month_days[11] = 31;
        System.out.println("January is:" + month_days[0] + " days.");
        System.out.println();

        System.out.println("Example2:");
       
       int month_day[] ={31,28,31,30,31,30,31,31,30,31,30,31};
       System.out.println("August is:" + month_day[7] + " days.");
       System.out.println();

       System.out.println("Example2:");
       System.out.println("Average Number:");
       double nums[] = {10.1,11.1,11.2,11.3,11.4,11.5};
       double results = 0;
       int intno;

       for(intno = 0; intno < 5; intno++)
       {
          results = results +  nums[intno];
          System.out.println("Average Is:" + " Result: " + results);
          System.out.println("Average Is:" + " Result / 5: " + results /5);
       }
       System.out.println();

       System.out.println("Multi Dimensional Array:");
       System.out.println("Declaration Multi Dimensional Array:");
       System.out.println("Example: int 2D[][] = new int[1][2]");        
       System.out.println();

       System.out.println("Multi Dimensional Array:");
       System.out.println("Example:");
       System.out.println("Prints Number:");

       int twoD[][] = new int[4][5];
       int row,col, k4 = 0;

       for(row = 0; row < 4; row++){
           for(col = 0; col < 5; col++){
               twoD[row][col] = k4;
               k4++;
           }
       }

       for(row = 0; row < 4; row++){
           for(col = 0; col < 5; col++){
            System.out.print("No:" + twoD[row][col] + "  ");
           }
           System.out.println();
       }
       System.out.println();
       System.out.println("Example2:");
       int twoDs[][] = new int[4][];
       twoDs[0] = new int[1]; 
       twoDs[1] = new int[2]; 
       twoDs[2] = new int[3]; 
       twoDs[3] = new int[4]; 

       int i,j,k2 =0;

       for(i = 0; i < 4; i++){
           for(j = 0; j<i+1; j++){
               twoDs[i][j] = k2;
               k2++;
           }
       }
       for(i = 0; i < 4; i++){
           for(j = 0; j <i+1; j++){
               System.out.print(twoDs[i][j] + " ");  
         }
         System.out.println();
       }

       System.out.println();
       System.out.println("Example3:");
       System.out.println("Matrix");
       int m[][] ={{1*1,2*1,3*1,4*1},
                   {1*2,2*2,3*2,4*2},
                   {1*3,2*3,3*3,4*3},
                   {1*4,2*4,3*4,4*4}
                  };
        int row1,col1;

       for(row1 = 0; row1 < 4; row1++){
           for(col1 = 0; col1 < 4; col1++){
            System.out.print(m[row1][col1] + "  ");
         
           }
           System.out.println();

       }
       System.out.println();

       System.out.println("Three Dimensional Array:");
       System.out.println("Example:");
       System.out.println("Matrix:");
       int threeD[][][] = new int[3][4][5];
        int row2,col2,k3;

       for(row2 = 0; row2 < 3; row2++){
           for(col2 = 0; col2 < 4; col2++){
               for(k3 = 0; k3 < 5; k3++){
                   threeD[row2][col2][k3] = row2 * col2 * k3;
                }
           }
       }

       for(row2 = 0; row2 < 3; row2++){
           for(col2 = 0; col2 < 4; col2++){
               for(k3 = 0; k3 < 5; k3++){
                   System.out.print(threeD[row2][col2][k3] + " ");  
               }
               System.out.println();
           }
           System.out.println();
       }
    }
    
}
