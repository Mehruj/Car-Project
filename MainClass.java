public class MainClass {
    public static void main(String []args){
        Car toyota = new Car(2015, "Toyota");
        System.out.println("Speed: "+toyota.getSpeed());
         toyota.accelerate();
        System.out.println("Speed: "+toyota.getSpeed());
        toyota.accelerate();
        System.out.println("Speed: "+toyota.getSpeed());
        toyota.accelerate();
        System.out.println("Speed: "+toyota.getSpeed());
        toyota.accelerate();
        System.out.println("Speed: "+toyota.getSpeed());
        toyota.accelerate();
        System.out.println("Speed: "+toyota.getSpeed());
        toyota.brake();
        System.out.println("Speed: "+toyota.getSpeed());
        toyota.brake();
        System.out.println("Speed: "+toyota.getSpeed());
        toyota.brake();
        System.out.println("Speed: "+toyota.getSpeed());
        toyota.brake();
        System.out.println("Speed: "+toyota.getSpeed());
        toyota.brake();
    }
}
