package JAVA;

public class continuestat {
    public static void main(String[] args) {

        System.out.println("Continue Statement:");
        System.out.println("Example:");

        outer: for(int i = 0; i < 10; i++)
        {
            for(int j =0;j<10;j++)
            {
                if (j > i) {
                    System.out.println();
                    continue outer;
                }
                System.out.print(" " + (i * j));
            }
        }
        System.out.println();
    }
    
}
