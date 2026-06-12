package intro;
public class Demo {
    public static void main(String[] args) {
       
    try {
        int a=10;
        int b=2;
        int result=a/b;
        System.out.println(result);

    } catch (ArithmeticException e) {
        System.out.println("Exception is caught");  
        System.out.println(e);
    }
finally{
    System.out.println("finally block");
 }
 
}}
