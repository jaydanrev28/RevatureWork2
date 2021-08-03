

interface ICar {
    void getCarModel();

    void getCarColor();
}

class Subaru implements ICar {

    @Override
    public void getCarModel() {
        System.out.println("Subaru WRX STi");
    }

    @Override
    public void getCarColor() {
        System.out.println("Pearlescent White ");
    }
}

class Bmw implements ICar {

    @Override
    public void getCarModel() {
        System.out.println("M4 Series");
    }

    @Override
    public void getCarColor() {
        System.out.println("Yellow");
    }
}

class CarFactory {
    public static ICar getCarInstance(int id) {
        switch (id) {
            case 1:
                return new Subaru();

            case 2:
                return new Bmw();
            default:
                return null;
        }
    }
}


public class Practice_6 {
    public static void main(String[] args) {
//        Audi car1 = new Audi();
//        car1.getCarModel();
//        car1.getCarColor();
//
//        Bmw car2 = new Bmw();
//        car2.getCarModel();
//        car2.getCarColor();

        ICar car1 = CarFactory.getCarInstance(1);
        car1.getCarModel();
        car1.getCarColor();
    }
}

