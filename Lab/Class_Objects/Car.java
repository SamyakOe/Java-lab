public class Car {
    String model;
    int price, mileage;
    Car(String model, int price, int mileage){
        this.model=model;
        this.price=price;
        this.mileage=mileage;
    }
    void compareMilage(Car otherCar){
        if(this.mileage>otherCar.mileage)
            System.out.println(this.model+" has better Mileage.");
        else
            System.out.println(otherCar.model+" has better Mileage.");
    }
    public static void main(String[] args) {
        Car car1=new Car("Maruti Suzuki", 600000, 30);
        Car car2=new Car("Hyundai", 200000, 25);
        car1.compareMilage(car2);
    }
}