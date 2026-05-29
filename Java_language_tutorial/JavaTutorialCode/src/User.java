import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User {
    private String name;
    private LocalDate birthday;
    private ArrayList<Book> books = new ArrayList<Book>();

    User(String Name, String Birthday){
        this.name = Name;
        this.birthday = LocalDate.parse(Birthday);
    }

    public int age(){
        int age = Period.between(this.birthday, LocalDate.now()).getYears();
        return age;
    }

    public String getName(){
        return this.name;
    }

    public LocalDate getBirthday(){
        return this.birthday;
    }

    public String borrowedBooks(){
        return this.books.toString();
    }

    public void getBooks(){
        for (Book borrowed : this.books){ //Loop through the object array list
            System.out.println(borrowed.getTitle());
        }
    }

    public void borrow(Book book){
        this.books.add(book);
    }
}
