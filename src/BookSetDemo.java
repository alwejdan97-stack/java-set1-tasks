import java.util.HashSet;
import java.util.Set;

public class BookSetDemo {
    public static void main(String[] args){
        Set<String> bookTitle = new HashSet<>();
        bookTitle.add("title 1");
        bookTitle.add("title 2");
        bookTitle.add("title 3");
        bookTitle.add("title 4");
        bookTitle.add("title 5");
        System.out.println(bookTitle);
        bookTitle.add("title 5");
        System.out.println(bookTitle);
        System.out.println("check if title 1 avilable: " + bookTitle.contains("title 1"));
        bookTitle.remove("title 1");
        System.out.println(bookTitle);
        System.out.println("total size is: " + bookTitle.size());
        bookTitle.clear();
        System.out.println(bookTitle);
        System.out.println("total size is: " + bookTitle.size());
    }
}
