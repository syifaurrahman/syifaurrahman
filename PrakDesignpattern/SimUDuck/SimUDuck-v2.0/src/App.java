public class App {
    public static void main(String[] args) throws Exception {
        MallarDuck MallarDuck1 = new MallarDuck();
        RedheadDuck RedHead1 = new RedheadDuck();
        RubberDuck RubberDuck1 = new RubberDuck();
        DecoyDuck DecoyDuck1 = new DecoyDuck();

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
        System.out.println("--------------------");
        System.out.println("Decoy Duck:");
        DecoyDuck1.display();
        System.out.println("--------------------");
    }
}
