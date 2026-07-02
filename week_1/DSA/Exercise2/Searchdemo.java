package Exercise2;
import java.util.Arrays;

public class Searchdemo {

    public static Product linearSearch(Product[] products, int productId) {

        for (int i = 0; i < products.length; i++)
            if (products[i].productId == productId) return products[i];
    
        return null;
    }

    public static Product binarySearch(Product[] products, int productId) {

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (products[mid].productId == productId) return products[mid];
            else if (products[mid].productId < productId) low = mid + 1;
            else high = mid - 1;
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(103, "Laptop", "Electronics"),
                new Product(101, "Phone", "Electronics"),
                new Product(105, "Shoes", "Fashion"),
                new Product(102, "Watch", "Accessories"),
                new Product(104, "Bag", "Fashion")
        };

        Product result = linearSearch(products, 104);

        System.out.println("Linear Search");

        if (result != null) {
            System.out.println("Product ID : " + result.productId);
            System.out.println("Product Name : " + result.productName);
            System.out.println("Category : " + result.category);
        } 
        else System.out.println("Product not found");
        

        Arrays.sort(products, (p1, p2) -> p1.productId - p2.productId);

        result = binarySearch(products, 104);

        System.out.println("\nBinary Search");

        if (result != null) {
            System.out.println("Product ID : " + result.productId);
            System.out.println("Product Name : " + result.productName);
            System.out.println("Category : " + result.category);
        } 
        else System.out.println("Product not found");
        
    }
}