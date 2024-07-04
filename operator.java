package JAVA;

public class operator {

    public static void main(String[] args) {
        System.out.println("---> Operator <---");
        System.out.println("1.Arithmetic Operator");
        System.out.println("2.Bitwise Operator");
        System.out.println("3.Relational Operator");
        System.out.println("4.Logical Operator");
        System.out.println("5.Assignment Operator");
    
        System.out.println();

        System.out.println("Arithmetic Operator");
        System.out.println("1.Addition(+)");
        System.out.println("2.Subtraction(-)");
        System.out.println("3.Multiplcation(*)");
        System.out.println("4.Division(/)");
        System.out.println("5.Modulus(%)");
        System.out.println("6.Increment(++)");
        System.out.println("7.Addition Assignment(+=)");
        System.out.println("8.Subtraction Assignment(-=)");
        System.out.println("9.Multiplcation Assignment(*=)");
        System.out.println("10.Division Assignment(/=)");
        System.out.println("11.Modulus Assignment(%=)");
        System.out.println("12.Decrement(--)");
        System.out.println();

        
        System.out.println("Arithmetic Example");
        int a = 1 + 1;
        int b = a * 3;
        int c = b / 4;
        int d = c - a;
        int e = -d;

        System.out.println("Integer Arithmetic:");
        System.out.println("Addition:" +a);
        System.out.println("Multiplication:" +b);
        System.out.println("Division:" +c);
        System.out.println("Subtraction:" +d);
        System.out.println("e:" +e);
        System.out.println();

        System.out.println("Floating-Point Arithmetic:");
        double da = 1 + 1;
        double db = da * 3;
        double dc = db / 4;
        double dd = dc - da;
        double de = -dd;
        System.out.println("Addition:" +da);
        System.out.println("Multiplication:" +db);
        System.out.println("Division:" +dc);
        System.out.println("Subtraction:" +dd);
        System.out.println("e:" +de);
        System.out.println();

        
        System.out.println("Modulus Operator:");
        int x = 42;
        double y = 42.25;
        System.out.println("X mod 10:" +x % 10);
        System.out.println("Y mod 10:" +y % 10);
        System.out.println();

        System.out.println("Arithmetic With Assignment:");
        int aa = 1;
        int bb = 2;
        int cc = 3;

        aa += 5;
        bb *= 4;
        cc  += a * b;
        cc  %= 6;
        System.out.println("a:" +aa);
        System.out.println("b:" +bb);
        System.out.println("c:" +cc);
        System.out.println();

        System.out.println("Increment and Decerement:");
        int a2 = 1;
        int b2 = 2;
        int c2;
        int d2;

        c2 = ++b2;
        d2 = a2++;
        c2++;
        System.out.println("a:" +a2);
        System.out.println("b:" +b2);
        System.out.println("c:" +c2);
        System.out.println("d:" +d2);
        System.out.println();


        System.out.println("Bitwise Operator");
        System.out.println("1.Bitwise unary NOT(~)");
        System.out.println("2.Bitwise AND(&)");
        System.out.println("3.Bitwise OR(|)");
        System.out.println("4.Bitwise exclusive OR(^)");
        System.out.println("5.Shift Right(>>)");
        System.out.println("6.Shift Right Zero Fill(>>>)");
        System.out.println("7.Shift Left(<<)");
        System.out.println("8.Bitwise AND Assignment(&=)");
        System.out.println("9.Bitwise OR Assignment(|=)");
        System.out.println("10.Bitwise exclusive OR Assignment(^=)");
        System.out.println("11.Shift Right Assignment(>>=)");
        System.out.println("12.Shift Right Zero Fill Assignment(>>>=)");
        System.out.println("13.Shift Left Assignment(<<=)");
        System.out.println();

        System.out.println("Example:");

        String binary[] = {
            "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", 
            "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111", 
        };
           int a3 = 3;
           int b3 = 6;
           int c3 = a3 | b3;
           int d3 = a3 & b3;
           int e3 = a3 ^ b3;
           int f3 = (~a3 & b3) | (a3 & ~b3);
           int g3 = ~a & 0x0f;
           
           System.out.println("       a=" +binary[a3]);
           System.out.println("       b=" +binary[b3]);
           System.out.println("   a | b=" +binary[c3]);
           System.out.println("   a & b=" +binary[d3]);
           System.out.println("   a ^ b=" +binary[e3]);
           System.out.println("~a&b|a&b=" +binary[f3]);
           System.out.println("      ~a=" +binary[g3]);
           System.out.println();

           System.out.println("Shift Left(<<):");
           System.out.println("Example:");

           byte a4 = 64 , b4;
           int i4;
           
           i4 = a4 << 2;
           b4 = (byte) (a4 << 2);
          
           System.out.println("value of a:" +a4);
           System.out.println("i: " + i4 + "b: " +b4);
           System.out.println();

           int i5;
           int num = 0xFFFFFFE;

           for (i5 = 0; i5 < 4; i5++)
           {
             num = num << 1;
             System.out.println("Left Shift multiply 2:" +num);
            }
            System.out.println();

            System.out.println("Shift Right(>>)");
            System.out.println("Example:");

            char hex[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e','f'};
            
            byte b5 = (byte) 0xf1;

            System.out.println("b:" + hex[ (b5 >> 4) & 0x0f] + hex[ b5 & 0x0f] );
            System.out.println();

            System.out.println("Example2:");

            byte c6 = (byte) (b5 >> 4);
            byte d6 = (byte) (b5 >> 4);
            byte e6 = (byte) ((b5  &  0xff) >> 4);
              
            System.out.println("b:" +hex[ (b5 >> 4) & 0x0f] + hex[ b5 & 0x0f]);
            System.out.println("c:" +hex[ (c6 >> 4) & 0x0f] + hex[ c6 & 0x0f]);
            System.out.println("d:" +hex[ (d6 >> 4) & 0x0f] + hex[ d6 & 0x0f]);
            System.out.println("e:" +hex[ (e6 >> 4) & 0x0f] + hex[ e6 & 0x0f]);
            System.out.println();

            System.out.println("a:" +a);
            System.out.println("b:" +b);
            System.out.println("c:" +c);
            System.out.println();

             a |= 4;
             b >>= 1;
             c <<= 1;
             a ^= c;
   
             System.out.println("a( a |=4):" +a);
             System.out.println("b( b >>= 1):" +b);
             System.out.println("c( c <<= 1):" +c);
             System.out.println();

   

             System.out.println("Relational Operator");
             System.out.println("1.Equal to(==)");
             System.out.println("2.Not Equal to(!=)");
             System.out.println("3.Greater Than(>)");
             System.out.println("4.Less Than(<)");
             System.out.println("5.Greater Than or Equal to (>=)");
             System.out.println("6.Less Than or Equal to (<=)");
             System.out.println();
         
             System.out.println("Logical Operator");
             System.out.println("1.Logical AND(&)");
             System.out.println("2.Bitwise OR(|)");
             System.out.println("3.Bitwise XOR(^)");
             System.out.println("4.Short-Circuit OR(||)");
             System.out.println("5.Short-Circuit AND(&&)");
             System.out.println("6.Logical Unary NOT(!)");
             System.out.println("7.AND Assignment(&=)");
             System.out.println("8.OR Assignment(|=)");
             System.out.println("9.XOR Assignment(^=)");
             System.out.println("10.Equal to(==)");
             System.out.println("11.Not Equal to(!=)");
             System.out.println("12.Ternary if-then-else(?:)");
             System.out.println();


             System.out.println("Logical Operator");
             System.out.println("Example:");

             boolean a7 = true;
             boolean b7 = false;
             boolean c7 = a7 | b7;
             boolean d7 = a7 & b7;
             boolean e7 = a7 ^ b7;
             boolean f7 = (!a7 & b7) | (!a7 & !b7);
             boolean g7 = !a7;
             

             System.out.println("       a=" +a7);
             System.out.println("       b=" +b7);
             System.out.println("   a | b=" +c7);
             System.out.println("   a & b=" +d7);
             System.out.println("   a ^ b=" +e7);
             System.out.println("!a&b|a&!b=" +f7);
             System.out.println("      !a=" +g7);
             System.out.println();
  
             System.out.println(" The ? Operator");
             System.out.println("Example:");

             int i7,k7;

             i7 = 10;
             k7 = i7 < 0 ? -i7 : i7;

            System.out.println("value of i: " +i7 + "is k:" +k7);
        }

    
}
