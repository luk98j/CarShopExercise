public class CarFactory {
    CarDetails create( String brand, String model, int year, double engineCapacity, int numberOfDoors, double price){
        CarDetails car = new CarDetails();
        car.brand = brand;
        car.model = model;
        car.year = year;
        car.engineCapacity = engineCapacity;
        car.numberOfDoors = numberOfDoors;
        car.price = price;
        return car;
    }
}
