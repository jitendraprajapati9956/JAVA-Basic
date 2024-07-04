package JAVA;

 class Basic {

     public static void main(String args[]) {
        // Topic
        System.out.println("---> Printing Message <---");
        System.out.println("HEllO Jitendra");
        System.out.println();

        System.out.println("---> Declare Variable <---");
        System.out.println("Example:int a,b,c;");
        System.out.println("Example:int d=3,e,f=5;");
        System.out.println("Example:byte z=22;");
        System.out.println("Example:double pi=3.14;");
        System.out.println("Example:char x='x';");
        System.out.println();

        var avarage = 10.0;
        System.out.println("Value Of Avarage:" +avarage);
        int var  = 1;
        System.out.println("Value Of Var:" +var);
        var k = -1;
        System.out.println("Value Of Avarage:" +k);
        System.out.println();

        
        int num;
        num = 100;
        System.out.println("Num:" +num);
        num = num * 2;
        System.out.println("Num * 2 :" +num);
        System.out.println();

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

        
      
        System.out.println("For Loop:");
         int x2;

         for(x2 = 0; x2 < 10; x2 = x2+1)
         {
            System.out.println("Loop times:" + x2);
         }
         System.out.println();
     
         System.out.println("---> Data Types <---");
         System.out.println("1.Primitive Types:");
         System.out.println("Integers:");
         System.out.println("Byte , size: 8 , range: -128 to 127 ");
         System.out.println("Short , size: 16 , range: -32768 to 32767 ");
         System.out.println("Int , size: 32 , range: -2147483648 to 2147483647 ");
         System.out.println("Long , size: 64 , range: -9223372036854775808 to 9223372036854775807 ");
         System.out.println();

         System.out.println("Example Long Datatype:");
         System.out.println("Distance light days:");
       
         int lightspeed;
         long days;
         long seconds;
         long distance;
         
         lightspeed = 186000;
         days = 1000;
         seconds = days * 24 * 60 * 60;
         distance = lightspeed * seconds;

         System.out.println("Days:" +days);
         System.out.println("Distance:" +distance);
         System.out.println();

         System.out.println("2.Floating-Point Datatype:");
         System.out.println("double , size: 64 , range: 4.9e-324 to 1.8e+308 ");
         System.out.println("float , size: 32 , range: 1.4e-045 to 3.4e+038 ");
         System.out.println();

         System.out.println("Example Double Datatype:");
         System.out.println("Area of Circle:");
         
         double pi,a,r;

         r = 10.8;
         pi = 3.1416;
         a = pi * r * r;
    
         System.out.println("Radius:" +r);
         System.out.println("pi:" +pi);
         System.out.println("Area Of Circle:" +a);
         System.out.println();

         System.out.println("3.Character Datatype:");
         System.out.println("Example:");
         char ch1,ch2;

         ch1 = 88;
         ch2 = 'Y';

         System.out.println("Ch1 and Ch2:");
         System.out.println("Character1:" + ch1 + "Character2: " +ch2);
         System.out.println();

         char ch3;
         ch3 = 'X';
         System.out.println("Character :" +ch3);
         ch3++;
         System.out.println("Increment after Character:" +ch3);
         System.out.println();

         System.out.println("4.Boolean Datatype:");
         System.out.println("Example:");
         boolean b;

         b = false;
         System.out.println("Boolean is:" +b);
         b = true;
         System.out.println("Boolean is:" +b);
       
         if (b) {
            System.out.println("Boolean if statement is run:");
         }
         b = false;
         if (b) {
            System.out.println("Boolean if statement is not run:");
         }

         System.out.println("10 > 9 :" +(10 > 9));
         System.out.println();

         System.out.println("Integer Literals:");
         System.out.println("Example: int x = 0b10");
         System.out.println("Example: int x = 123_4");
         System.out.println("Example: int x = 123__4");
         System.out.println();
  
         System.out.println("Floating Point Literals:");
         System.out.println("Example: double x = 9_426_87.0");
         System.out.println("Example: double x = 9_426_87.10");
         System.out.println();

         System.out.println("Length of Two side Tringle Example:");
        
         double d = 3.0, e = 4.0;

         double dou = Math.sqrt(d * d + e * e);
         System.out.println("a:" +d);
         System.out.println("b:" +e);
         System.out.println("Hypotenus is:" +dou);
         System.out.println();

         System.out.println("---> Scope Variable <---");
         int scope;

         scope = 10;

         if (scope == 10) {
            int scope2 = 20;
            System.out.println("Scope is:" +scope + ",Scope2 is:" +scope2);
            scope = scope2 * 2;
         } //scope 2 not only if block valid
         System.out.println("Scope is:" +scope );
         System.out.println();

         System.out.println("---> LifeTime Variable <---");
     
         int lifetimevar;

         for(lifetimevar = 0; lifetimevar < 3; lifetimevar++)
         {
            int y1 = -1;
            System.out.println("Y is:" +y1);
            y1 = 100;
            System.out.println("Y is:" +y1);
         }
       
         System.out.println();

         System.out.println("---> Type Conversion <---");

         byte b1;
         int in = 257;
         double Double = 323.14;

         System.out.println("Conversion Int to Byte:");
         b1 = (byte) in;
         System.out.println("Int to Byte:int" + in + "  = byte:" + b1);
         System.out.println();

         System.out.println("Conversion Double to int:");
         in = (int) Double;
         System.out.println("Double to int:Double" + Double + "  = int:" +in);
         System.out.println();

         System.out.println("Conversion Double to Byte:");
         b1 = (byte) Double;
         System.out.println("Double to Byte:Double" + Double + "  = byte:" +b1);
         System.out.println();

         System.out.println("Type Promotion:");
         byte bytes = 42;
         char chars = 'a';
         short shorts = 1024;
         int   ints = 50000;
         float floats = 5.67f;
         double doubles = 0.1454;
         double result = (floats * bytes) + (ints / chars) - (doubles * shorts);
         System.out.println((floats * bytes)  + " + " + (ints / chars) + " - " + (doubles * shorts) );
         System.out.println("result:" +result);


         System.out.println();

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