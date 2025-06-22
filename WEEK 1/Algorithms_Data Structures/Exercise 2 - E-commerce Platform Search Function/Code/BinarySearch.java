import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {

    // Make sure products are sorted before performing binary search
    public static Product findProductById(Product[] products, int targetId) {
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            Product midProduct = products[mid];

            if (midProduct.productId == targetId) {
                return midProduct;
            } else if (midProduct.productId < targetId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return null;
    }
}