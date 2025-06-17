

import java.util.*;

public class Product {
   int productId;
   String productName;
   String category;

   public Product(int productId, String productName, String category) {
      this.productId = productId;
      this.productName = productName;
      this.category = category;
   }

   public String toString() {
      return "[" + productId + ", " + productName + ", " + category + "]";
   }

   public static Product linearSearch(Product[] products, String name) {
      for (int i = 0; i < products.length; i++) {
         if (products[i].productName.equalsIgnoreCase(name))
            return products[i];
      }
      return null;
   }

   public static Product binarySearch(Product[] products, String name) {
      int start = 0;
      int end = products.length - 1;

      while (start <= end) {
         int mid = (start + end) / 2;
         String midName = products[mid].productName;

         if (midName.equalsIgnoreCase(name)) {
            return products[mid];
         } else if (midName.compareToIgnoreCase(name) < 0) {
            start = mid + 1;
         } else {
            end = mid - 1;
         }
      }
      return null;
   }
   public static void main(String[] args) {
        
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shirt", "Clothing"),
            new Product(3, "Smartphone", "Electronics"),
            new Product(4, "Book", "Stationery")
        };

       
        Product found1 = linearSearch(products, "skirt");
        System.out.println("Linear Search Result: " + (found1 != null ? found1 : "Not found"));

        
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

       
        Product found2 = binarySearch(products, "Book");
        System.out.println("Binary Search Result: " + (found2 != null ? found2 : "Not found"));
    }

}
