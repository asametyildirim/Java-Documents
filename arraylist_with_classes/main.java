import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<Customer>();
        Customer birinci = new Customer(1, "Samet", "Yıldırım");
        customers.add(birinci);
        customers.add(new Customer(2, "Ali", "Yıldırım"));
        customers.add(new Customer(3, "Kaan", "Yıldırım"));
        customers.remove(0);

        for(Customer customer:customers){
            System.out.println(customer.firstname);
        }
    }
}