public class Main {

    public static void main(String[] args) {
	Product product = new Product();
        ProductManager productManager = new ProductManager();

	product.name = "Leptop";
	product.price = -9;
	product.color = "Black";
	product.stock = 3;
	productManager.add(product);
    }
}
