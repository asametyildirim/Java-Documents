public class Main {

     public static void main(String[] args) {
         //reference
         CustomerManager customerManager = new CustomerManager();
         CustomerManager customerManager1 = new CustomerManager();
         customerManager = customerManager1;
         customerManager.Add();
         customerManager.Remove();
         customerManager.Update();

     }
}