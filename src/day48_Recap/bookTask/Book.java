package day48_Recap.bookTask;

public class Book {

    private final String title;
    private final String type;
    private final String author;
    private double price;

    public Book(String title, String type, String author, double price) {
        this.title = title;
        this.type = type;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book " +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price;
    }
}
/*
create a class called Book:
			private variables:
				title(final), type(final), author(final), price

			Encapsulate all the fields

			Add a constructor that can set all the fields when an object is created

			methods: toString()

 */