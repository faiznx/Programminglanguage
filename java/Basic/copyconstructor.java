//==========================================
//                 Book
//==========================================
class Book {
    String title;
    double price;

    Book(String t, double p) {
        title = t;
        price = p;
    }

    // Copy Constructor
    Book(Book b) {
        title = b.title;
        price = b.price;
    }

    void display() {
        System.out.println("Title: " + title + ", Price: " + price);
    }
}
// ===========================================
//            car 
//============================================
class Car {
    String model;
    double price;

    Car(String m, double p) {
        model = m;
        price = p;
    }

    Car(Car c) {
        model = c.model;
        price = c.price;
    }

    void display() {
        System.out.println("Model: " + model + ", Price: " + price);
    }
}
    //======================================================
    //                      Employee
    //======================================================
    class Employee {
    String name;
    int id;
    double salary;

    Employee(String n, int i, double s) {
        name = n;
        id = i;
        salary = s;
    }

    Employee(Employee e) {
        name = e.name;
        id = e.id;
        salary = e.salary;
    }

    void display() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}

    //====================================
    //              Mobile 
    //=====================================
    class Mobile {
    String brand, model;
    double price;

    Mobile(String b, String m, double p) {
        brand = b;
        model = m;
        price = p;
    }

    Mobile(Mobile mob) {
        brand = mob.brand;
        model = mob.model;
        price = mob.price;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: " + price);
    }

}


public class copyconstructor {
     public static void main(String[] args) {
        Book b1 = new Book("Java Programming", 850);
        Book b2 = new Book(b1);
        b1.display();
        b2.display();


        Car c1 = new Car("Corolla", 5000000);
        Car c2 = new Car(c1);
        c1.display();
        c2.display();

        Employee e1 = new Employee("John Doe", 101, 50000);
        Employee e2 = new Employee(e1);
        e1.display();
        e2.display();

        Mobile m1 = new Mobile("Samsung", "Galaxy S21", 70000);
        Mobile m2 = new Mobile(m1);
        m1.display();
        m2.display();
    
    }
}
    
