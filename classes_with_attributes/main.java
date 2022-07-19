public class Main {

     public static void main(String[] args) {


         ProductManager productManager = new ProductManager();
         Product product = new Product(1, "Leptop", "Monster Leptop", 7,500, 10);

/*
         Product product = new Product();
         product.setName("Laptop");
         product.setId(0);
         product.setPrice(10,000);
         product.setStockAmount(3);
*/

         productManager.Add(product);
         System.out.println(product.getCode());

     }
 }