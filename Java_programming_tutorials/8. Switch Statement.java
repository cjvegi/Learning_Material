// switch statement: checks a value for each case

class SwitchStatement{
    public static void main(String args[]) {
        int age = 10;
        switch (age){
            case 1:
                System.out.println("You can crawl");
                break;
            case 2:
                System.out.println("You can talk");
                break;
            default:
                System.out.println("I don't know your age!");
            break;
        }
        
    }
}