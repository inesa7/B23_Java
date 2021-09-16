package day48_Recap.bookTask;

public class Ebook extends Book {

    private final int size, pages;

    public Ebook(String title, String type, String author, double price, int size, int pages) {
        super(title, type, author, price);
        this.size = size;
        this.pages = pages;
    }

    public int getSize() {
        return size;
    }

    public int getPages() {
        return pages;
    }

    public void readBook(){
        System.out.println(getAuthor()+" is reading a book");
    }

    @Override
    public String toString() {
        return "Ebook{" +
                super.toString()+
                ", size=" + size +
                ", pages=" + pages +
                '}';
    }
}
/*
create the following sub classes of Book:
			1. EBook:
					private variables:
						size, pages (final)

					Encapsulate all the fields

					methods:readBook(), toString()

 */