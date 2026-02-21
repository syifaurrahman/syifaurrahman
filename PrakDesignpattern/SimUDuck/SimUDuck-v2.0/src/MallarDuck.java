public class MallarDuck extends Duck implements Flyable, Quackable  {
    public void display(){
        System.out.println("This is a Mallar Duck");
    }

    public void fly(){
        System.out.println("This duck can fly!");
    }

    public void quack(){
        System.out.println("Quack!!");
    }
}
