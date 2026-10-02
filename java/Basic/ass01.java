
class Book {
    int bookId;
    String title, author;
    double price;
    int availableCopies;

    // Default Constructor
    Book() {
        bookId = 0;
        title = "Unknown";
        author = "Unknown";
        price = 0;
        availableCopies = 0;
    }

    // Parameterized Constructor
    Book(int id, String t, String a, double p, int copies) {
        bookId = id;
        title = t;
        author = a;
        price = p;
        availableCopies = copies;
    }

    // Display Book Information
    void displayBookInfo() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available Copies: " + availableCopies);
        System.out.println();
    }

    // Issue Book
    void issueBook() {
        if (availableCopies > 0) {
            availableCopies--;
            System.out.println("Book issued.");
        } else {
            System.out.println("Book is unavailable.");
        }
    }

    // Return Book
    void returnBook() {
        availableCopies++;
        System.out.println("Book returned.");
    }

    // Check Availability
    void checkAvailability() {
        if (availableCopies > 0) {
            System.out.println("Book is Available.");
        } else {
            System.out.println("Book is Unavailable.");
        }
    }
}


// =====================================================
//                  CLASS NO: 02
// =====================================================

class Product {
    int id, quantity;
    String name, category;
    double price;

    // Default Constructor
    Product() {
        id = 0;
        name = "Unknown";
        category = "Unknown";
        price = 0;
        quantity = 0;
    }

    // Parameterized Constructor
    Product(int i, String n, String c, double p, int q) {
        id = i;
        name = n;
        category = c;
        price = p;
        quantity = q;
    }

    // Display Product Information
    void display() {
        System.out.println("Product ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println();
    }

    // Add Stock
    void addStock(int q) {
        if (q > 0) {
            quantity += q;
            System.out.println(q + " items added to stock.");
        } else {
            System.out.println("Invalid quantity.");
        }
    }

    // Sell Product
    void sell(int q) {
        if (q > 0 && q <= quantity) {
            quantity -= q;
            System.out.println(q + " items sold.");
        } else {
            System.out.println("Insufficient stock or invalid quantity.");
        }
    }

    // Calculate Total Stock Value
    double value() {
        return price * quantity;
    }

    // Check Stock
    void check() {
        if (quantity == 0) {
            System.out.println("Out of Stock");
        } else if (quantity <= 10) {
            System.out.println("Low Stock");
        } else {
            System.out.println("Available");
        }
    }
}


// =====================================================
//                     MAIN CLASS
// =====================================================

public class ass01 {

    public static void main(String[] args) {

        // =================================================
        //                    BOOK OBJECTS
        // =================================================

        Book book1 = new Book();

        Book book2 = new Book(102,"Java Programming", "James Gosling",2500,5 );
        Book book3 = new Book( 103,"Data Structures","Mark Allen",3000,2);

        book1.displayBookInfo();
        book1.checkAvailability();

        book2.displayBookInfo();
        book2.issueBook();
        book2.issueBook();
        book2.returnBook();
        book2.checkAvailability();


        // Book 3
        System.out.println("========== BOOK 3 ==========");
        book3.displayBookInfo();

        book3.issueBook();
        book3.issueBook();
        book3.issueBook();
        book3.returnBook();

        book3.checkAvailability();

        System.out.println();


        // =================================================
        //                  PRODUCT OBJECTS
        // =================================================

        Product p1 = new Product();

        Product p2 = new Product(
            202,
            "Laptop",
            "Electronics",
            120000,
            15
        );

        Product p3 = new Product(
            203,
            "Keyboard",
            "Accessories",
            3500,
            8
        );


        // Product 1
        System.out.println("========== PRODUCT 1 ==========");
        p1.display();
        p1.check();

        System.out.println();


        // Product 2
        System.out.println("========== PRODUCT 2 ==========");
        p2.display();

        p2.addStock(10);
        p2.sell(5);
        p2.sell(30);

        System.out.println("Total Stock Value: " + p2.value());

        p2.check();

        System.out.println();


        // Product 3
        System.out.println("========== PRODUCT 3 ==========");
        p3.display();

        p3.sell(3);
        p3.addStock(10);

        System.out.println("Total Stock Value: " + p3.value());

        p3.check();
    }
}
