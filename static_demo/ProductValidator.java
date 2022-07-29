public class ProductValidator {

    public static boolean kontrol(Product product){
        if(product.price>0 && !product.name.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
