package JAVA;

public class typeconvert {
    public static void main(String[] args) {
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
    }
    
}
