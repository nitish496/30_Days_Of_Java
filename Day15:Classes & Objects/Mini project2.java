//p-8:library
class Book{
    int bookId;
    String author;
    String title;
    double price;
    boolean isAvailable;
    
    void display(){
       System.out.println("Book ID   : " + bookId);
        System.out.println("Title     : " + title);
        System.out.println("Author    : " + author);
        System.out.println("Price     : $" + price);
        System.out.println("--------------------------");
    }

void borrowBook(){
    if(isAvailable){
        isAvailable = false;
         System.out.println(title+" has been someone else");
    }else{
         System.out.println(title+" has been borrowed");
    }
}
void returnBook(){
    isAvailable = true;
     System.out.println(title+" has been returned");
}
void showAvailability(){
    if(isAvailable){
         System.out.println("status: Available");
    }else{
         System.out.println("status: NOT Available");
    }
}

}
public class Miniproject2{
    public static void main(String[]args){
              Book book1 = new Book();
        book1.bookId = 101;
        book1.title = "Java Programming";
        book1.author = "James Gosling";
        book1.price = 49.99;
        book1.isAvailable = true;

        Book book2 = new Book();
        book2.bookId = 102;
        book2.title = "Data Structures";
        book2.author = "Mark Allen";
        book2.price = 39.99;
        book2.isAvailable = true;

        Book book3 = new Book();
        book3.bookId = 103;
        book3.title = "Database Systems";
        book3.author = "Thomas Connolly";
        book3.price = 44.99;
        book3.isAvailable = false;

        System.out.println("========== LIBRARY MANAGEMENT ==========\n");
        book1.display();
        book1.borrowBook();
        book1.returnBook();
        book1.showAvailability();
        System.out.println();

        book2.display();
        book2.borrowBook();
        book2.returnBook();
        book2.showAvailability();
        System.out.println();

        book3.display();
        book3.borrowBook();
        book3.returnBook();
        book3.showAvailability();
        System.out.println();
    }
}