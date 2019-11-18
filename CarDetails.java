public class CarDetails {
    String brand;
    String model;
    int year;
    double engineCapacity;
    int numberOfDoors;
    double price;
    String carInfo()
    {
        return "This is " + brand + " " + model + " from "+ year + " year \n"+
                "Capacity : "+engineCapacity+ "\n"+"Number of doors is "+ numberOfDoors + "\n"
                + "The car price is "+price;
    }
    void infoAboutCar(){
        System.out.println(carInfo());
    }
}
