public class DemoTasks {
    public static void main(String[] args) { //accepts an array of arguments
        printToScreen();
        DemoTasks obj = new DemoTasks();
        obj.printWelcome();
        System.out.println(obj.numberReturn());

    }

    public static void printToScreen(){ //can access directly
        System.out.println("Hello there! How are you?!");
    }

    public void printWelcome(){ //need an object instantiation
        System.out.println("Welcome!");
    }

    public int numberReturn(){ //return
        return 2;
    }




}
