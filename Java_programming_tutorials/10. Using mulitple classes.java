class multipleclass{
    public static void main(String args[]) {
        // we are initialzing other class object 
        otherclass otherclassobject = new otherclass();
        otherclassobject.simplemessage();
        
    }
}


// other classs

public class otherclass{
    public void simplemessage(){ 
        // simplemessage is a method in the classs otherclass
        System.out.println("This is the other class");

    }
}