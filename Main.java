public class Main {
    public static void main(String[] args) {

        boolean bark = BarkingDog.shouldWakeUp(true, 1);
        System.out.println(bark);

        bark = BarkingDog.shouldWakeUp(false, 2);
        System.out.println(bark);

        bark = BarkingDog.shouldWakeUp(true, 8);
        System.out.println(bark);

        bark = BarkingDog.shouldWakeUp(true, -1);
        System.out.println(bark);
    }
}
