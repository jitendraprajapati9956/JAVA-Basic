package JAVA;

public class dowhile {
    
    public static void main(String[] args) 
    
    throws java.io.IOException{
        char choice;

     do {
         System.out.println("Select:");
         System.out.println("1.if:");
         System.out.println("2.switch:");
         System.out.println("3.while:");
         System.out.println("4.do-while:");
         System.out.println("5.for:\n");
         choice = (char) System.in.read();
     
        } while (choice < '1' || choice > '5');

        System.out.println("\n");


    switch (choice) {
        case '1':
             System.out.println("1.if:");
             System.out.println("if(condition)  statement;");
             System.out.println("else statment");
        
            break;

        case '2':
             System.out.println("2.switch:");
             System.out.println("switch(expression){");
             System.out.println("case constant:");
             System.out.println("statment sequence");
             System.out.println("break;");
             System.out.println("//..");
             System.out.println("}");
           
            break;

        case '3':
              System.out.println("3.while:");
              System.out.println("while(condition) statment;");
            
            break;
        
        case '4':
              System.out.println("4.do-while:");
              System.out.println("do {");
              System.out.println("statment;");
              System.out.println("} while(condition);");
           
            break;
            
        case '5':
             System.out.println("5.for:");
             System.out.println("for(init; condition;increment/decrement)");
             System.out.println("statment;");
          
            break;
    
        default:
            break;
    }







       
    }
}
