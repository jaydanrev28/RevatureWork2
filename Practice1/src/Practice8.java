class Car{
    public String name;
    public String color;
    public int price;
    public String engineType;

    public Car(String name, String color, int price, String engineType){
        this.name = name;
        this.color = color;
        this.price = price;
        this.engineType =engineType;
    }
    public Car(Car carObj) {
        this.name = carObj.name;
        this.color = carObj.color;
        this.price = carObj.price;
        this.engineType = carObj.engineType;
    }
    public Car(Car carObj, int price){
        this.name = carObj.name;
        this.color = carObj.color;
        this.price = price;
        this.engineType = carObj.engineType;
    }
}
public class Practice8 {
    public static void main(String[] args) {
    Car car1 = new Car("McLaren","Teal",1000000, "Naturally aspirated V10");
    Car car2 = new Car(car1);
    Car car3 = new Car(car1,100000);
System.out.println("Name: "+car1.name +"\n" +"Color: " + car1.color +"\n" +"Price: "+ car1.price +"\n" +
        "Engine Type" +car1.engineType);
    }
}
