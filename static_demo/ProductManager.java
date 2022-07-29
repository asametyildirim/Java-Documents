public class ProductManager {

    public void add(Product product){
        if(ProductValidator.kontrol(product)){
            System.out.println("Product add");
        }else{
            System.out.println("Eror");
        }
    }
}
