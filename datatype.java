package JAVA;

public class datatype {
    public static void main(String[] args) {
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
    }
    
}
