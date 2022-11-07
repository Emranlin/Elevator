import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Elevator elevator = new Elevator(1, 10, 200);
        while (true) {
            System.out.println("Input the weight");
            int weight = new Scanner(System.in).nextInt();
            System.out.println("Input  your floor");
            int floor = new Scanner(System.in).nextInt();
            elevator.moveToFloor(weight,floor );
        }
    }
}