public class ConstructorDemos {
    public static void main(String[] args) {
//        demo();
//        ConstructorDemos m = new ConstructorDemos(); //make object of this class to access its member: demo2()
//        m.demo2();

        GameCharactersDemo goodGuy = new GameCharactersDemo("Mario", 10, 10);
        System.out.println(goodGuy.getMaxHealth());

        GameCharactersDemo badGuy = new GameCharactersDemo("Luigi", 50, 100);
        System.out.println(badGuy.getMaxHealth());

    }

    public static void demo(){ //static means we can access members of a class without creating an object
        System.out.println("Hello world");
    }

    public void demo2(){ //non static means we have to use an object to access it
        System.out.println("I'm here!!!");
    }
}
