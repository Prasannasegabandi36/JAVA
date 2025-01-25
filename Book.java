class Book {
    String title;
    String author;
    double price;

}

public Book(String title, String author, double price) {
    this.title = title;
    this.author = author;
    this.price = price;
    
}
publi void displayDetails() {
    System.out.println("Title: " +title);
    System.out.println("Author: " +author);
    System.out.println("Price: " +price);

}
public static void main(String[] args) {
    Book mybook = Book("Java Intermedited","John ",2000.0);
    mybook.displayDetails();
}