public class CarShop {
    public static void main(String[] args) {
        CarFactory addNewCar = new CarFactory();
        NewPrice newPrice = new NewPrice();
        CarDetails car1 = addNewCar.create("Audi","A3",2005,1.8,4,25.123);
        CarDetails car2 = addNewCar.create("BMW","E46",2001,2.5,3,15.999);
        car1.infoAboutCar();
        newPrice.priceUpgrade(car1, 20.999);
        System.out.println();
        car1.infoAboutCar();
        System.out.println();
        car2.infoAboutCar();

    }
}
