import java.util.Scanner;

class MethodWithParameters{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        HelloName helloNameobject = new HelloName();

        System.out.println("Enter your name: ");
        String name = input.nextLine();

        helloNameobject.simplemessage(name);
        
    }
}



// Other class

public class HelloName{    
    public void simplemessage(String name){
        System.out.println("Hello "+ name);
    }
}