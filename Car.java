public class Car {
    private int noOfGear = 4;
    private String color = "White";

    public void  printCarInfo(){
        System.out.println(noOfGear);
        System.out.println(color);

    }

}

class RaceCar extends Car{
    private int maxSpeed;

    public RaceCar(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        super.printCarInfo();

    }
    public void  RaceCarInfo(){
        System.out.println(maxSpeed);
    }
    public static void main (String[]args){
        RaceCar rc = new RaceCar(1000);

        rc.RaceCarInfo();
    }
}


