package JAVA;

public class variable {
    public static void main(String[] args) {
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
    }
    
}
