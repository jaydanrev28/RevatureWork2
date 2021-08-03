// in proper Dependncy manageemnt
//class Engine{
//    public Engine(String type){
//
//    }
//}
//
//class Tyre{
//    public Tyre(String type){
//
//    }
//}
//
//class Car{
//    Engine engine;
//    Tyre tyre;
//
//    public  Car(){
//        this.engine = new Engine();
//        this.tyre = new Tyre();
//    }
//}

class Engine{

}

class Tyre{

}

class CarFactory2{
    public  static void getInstance(int id){
        switch (id){
            case 0:
                System.out.println("");
                break;
            case 1:
                System.out.println("");
                break;
        }
    }
}

class Car{
    Engine engine;
    Tyre tyre;

    public Car(Engine engine, Tyre tyre){
        this.engine = engine;
        this.tyre = tyre;
    }
}





public class Practice_7 {
    public static void main(String[] args) {
        ICar car1 = CarFactory.getCarInstance(1);
        car1.getCarModel();
        car1.getCarColor();
    }
}