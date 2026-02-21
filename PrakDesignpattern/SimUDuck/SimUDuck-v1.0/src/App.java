public class App {
    public static void main(String[] args) throws Exception {
        Duck MallarDuck1 = new MallarDuck();
        Duck RedHead1 = new RedheadDuck();
        
        System.out.println("\nMallar Duck:");
        MallarDuck1.display();
        MallarDuck1.quack();
        System.out.println("--------------------");
        System.out.println("Read Head Duck:");
        RedHead1.display();
        RedHead1.quack();
        System.out.println("--------------------");
    }
}
