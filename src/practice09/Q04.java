package practice09;
/*
Type code to add books to library with its information, then create a method to show information of book.
*/
public class Q04 {


    String bookName;
    String authorName;
    int numOfPage;
    static int numOfBooks;
    String bookID;

    public static void main(String[] args) {

        Q04 book1=new Q04("Crime and Punishment", "Dostoevsky",650);

        Q04 book2 = new Q04("Thousand Shiny Suns", "Khaled Houseyini", 276);
        book2.displayBook();
        book1.displayBook();



    }

    Q04(String bookName, String authorName, int numOfPage){
        this.bookName=bookName;
        this.authorName=authorName;
        this.numOfPage=numOfPage;
        numOfBooks++;
        bookID=bookName.substring(0,2)+numOfBooks;

    }

    public void displayBook(){
        System.out.println("Book Name:"+bookName+" Author Name:"+authorName+" Number Of Page:"+numOfPage+" Book ID:"+bookID);


    }
}
