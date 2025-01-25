class Product {
    String productname;
    double price;
    double discountRates;
}
public Product(String productname,double price,double discountRates){
    this.productname = productname;
    this.price = price;
    this.discountRates = discountRates;

}
public double calculateDiscountedPrice {
    return price - (price * discountRates / 100);
    
}
public static void main(String args[]){
    Product product1 = new Product("Laptop",120000.0,20);
    Product product2 = new Product("TV",30000.0,10);
    System.out.println(product1.productname + " - Discounted price: $" + product1.calculateDiscountedPrice());
    System.out.println(product2.productname + " - Discounted price: $" + product2.calculateDiscountedPrice());
    
}