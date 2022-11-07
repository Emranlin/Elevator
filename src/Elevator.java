import java.util.Scanner;

public class Elevator {
    private int currentFloor;
    private int maxFloor;
    private int capacity;


    public Elevator(int currentFloor,int maxFloor,int capacity){
        this.currentFloor=currentFloor;
        this.maxFloor=maxFloor;
        this.capacity=capacity;

    }
    Scanner scanner=new Scanner(System.in);
    int number=scanner.nextInt();
    public boolean isMoveOn() {
        return true;
    }
    public void moveToFloor(int weight,int number){
        if(isAllowableFloor(number)&&isAllowableWeigt(weight))
        while(currentFloor!=number){
            if(currentFloor<number){
                currentFloor++;
                System.out.println(currentFloor);
            }else{
                currentFloor--;
                System.out.println(currentFloor);
            }
        }
        else{
            if(!isAllowableWeigt(number))
                System.out.println("Don't allow more 200 kg"+capacity);
            if(!isAllowableFloor(number))
                System.out.println("There isn't like this floor"+maxFloor);
        }
    }
    public boolean isAllowableWeigt(int weight){
        if(capacity>200||capacity<0){
            return false;}
        else {
            return true;
        }

    }public boolean isAllowableFloor(int maxFloor){
        if(number>maxFloor|| maxFloor<currentFloor){
            return false;
        } else{
            return true;}
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setMaxFloor(int maxFloor) {
        this.maxFloor = maxFloor;
    }

    public int getMaxFloor() {
        return maxFloor;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}




