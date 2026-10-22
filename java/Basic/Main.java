import java.util.Scanner;
class Publication {
    protected String title;
    protected double price;

     Scanner sc = new Scanner(System.in);

    void set() {
        System.out.print("Enter title: ");
        title = sc.nextLine();
        System.out.print("Enter price: ");
        price = sc.nextDouble();
        sc.nextLine();
    }

    void get() {
        System.out.println("Title: " + title);
        System.out.println("Price: $" + price);
    }

    void display() {
        get();
    }
}
class Book extends Publication {
    private int pageCount;
    @Override
    void set() {
        super.set();

        System.out.print("Enter page count: ");
        pageCount = sc.nextInt();
        sc.nextLine();
    }
    @Override
    void get() {
        super.get();
        System.out.println("Page Count: " + pageCount);
    }

    @Override
    void display() {
        System.out.println("\n--- Book Details ---");
        get();
    }
}
class Tape extends Publication {
    private double playingTime;

    @Override
    void set() {
        super.set();

        System.out.print("Enter playing time in minutes: ");
        playingTime = sc.nextDouble();
        sc.nextLine();
    }
    @Override
    void get() {
        super.get();
        System.out.println("Playing Time: " + playingTime + " minutes");
    }
    @Override
    void display() {
        System.out.println("\n--- Tape Details ---");
        get();
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Book b = new Book();
        Tape t = new Tape();
        b.set();
        t.set();
        b.display();
        t.display();
    }
}