import java.util.Scanner;
public class Books {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        int n = Scanner.nextInt();
        scanner.nextLine().trim();
        Book1[] book = new Book1[n];
        for (int i = 0; i < n; i++) {
            String BookName = scanner.nextLine().trim();
            String AuthorName = scanner.nextLine().trim();
            long ISBN = Long.parseDouble(scanner.nextLine().trim());
            book[i] = new Book1(bookName, authorName, ISBNNumber);
        }
        for (int i = 0, i<n;
        i++){
            System.out.println();
            for (int j = 0,j<n,j++){
                System.out.println(book[j])
            }
        }
    }
        class Book1{
    private String bookName;
    private String authorName;
    private long ISBNNumber;

    public String getBookName(){
        return bookName;
    }
    public static setBookName(String bookName){
        this.bookName = bookName;
    }
    public String getAuthorName(){
        return authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public void setISBNNumber(long ISBNNumber){
        this.ISBNNumber = ISBNNumber;
    }
    public Book(String bookNmae,String authorName,long ISBNNumber){
        this.bookName = bookName;
        this.authorName = authorName;
        this.ISBNNumber = ISBNNumber;
    }
    @Override
    public String toString(){
        return String.format(getBookName(),getAuthorName(),getISBNNumber());
    }
}

    }
}
