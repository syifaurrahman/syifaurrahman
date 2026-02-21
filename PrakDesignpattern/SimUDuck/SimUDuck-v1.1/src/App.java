public class App {
    public static void main(String[] args) throws Exception {
        Duck MallarDuck1 = new Mallar();
        Duck RedHead1 = new Redhead();
        Duck RubberDuck1 = new Rubber();
        
        System.out.println("\nMallar Duck:");
        MallarDuck1.display();
        MallarDuck1.quack();
        MallarDuck1.fly();
        System.out.println("--------------------");
        System.out.println("Read Head Duck:");
        RedHead1.display();
        RedHead1.quack();
        RedHead1.fly();
        System.out.println("--------------------");
        System.out.println("Rubber Duck:");
        RubberDuck1.display();
        RubberDuck1.quack();
        RubberDuck1.fly();
        System.out.println("--------------------");
    }
}
