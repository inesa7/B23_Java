package day48_Recap.bookTask;

public class BookObject {

    public static void main(String[] args) {

        Ebook ebook = new Ebook("Titanik", "adventure", "Cameron", 15.88, 120, 200);
        ebook.readBook();
        ebook.getPages();
        ebook.getSize();
        System.out.println(ebook);


        AudioBook audioBook = new AudioBook("Gone with the wind", "romance", "Margaret Mitchell", 10.99, 20, "John");
        audioBook.listen();
        audioBook.getLength();
        audioBook.getPrice();
        audioBook.getNarrator();
        System.out.println(audioBook);


    }



}
