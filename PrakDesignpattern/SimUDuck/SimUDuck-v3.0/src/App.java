public class App {
    public static void main(String[] args) throws Exception {
        Duck mallard = new MallardDuck();
        Duck redhead = new RedheadDuck();
        Duck rubber = new RubberDuck();
        Duck model = new ModelDuck();

        System.out.println("\nMallard Duck:");
        mallard.display();
        mallard.performQuack();
        mallard.performFly();
        System.out.println("--------------------");
        System.out.println("Red Head Duck:");
        redhead.display();
        redhead.performQuack();
        redhead.performFly();
        System.out.println("--------------------");
        System.out.println("Rubber Duck:");
        rubber.display();
        rubber.performQuack();
        rubber.performFly();
        System.out.println("--------------------");
        System.out.println("Model Duck:");
        model.display();
        model.performQuack();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
        System.out.println("--------------------");
    }
}
