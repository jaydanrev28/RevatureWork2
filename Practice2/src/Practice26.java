interface ICustomer{

}
class User{

}

class Customer implements ICustomer{

}
public class Practice26 {
    public static void main(String[] args) {
        Customer customer = new Customer();
        //ICustomer iCustomer = new ICustomer();
        ICustomer iCustomer = new Customer();
        //ICustomer iCustomer = new User();
    }
}
