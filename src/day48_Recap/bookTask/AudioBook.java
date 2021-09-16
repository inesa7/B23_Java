package day48_Recap.bookTask;

public class AudioBook extends Book {

    private final double length;
    private final String narrator;

    public AudioBook(String title, String type, String author, double price, double length, String narrator) {
        super(title, type, author, price);
        this.length = length;
        this.narrator = narrator;
    }

    public double getLength() {
        return length;
    }

    public String getNarrator() {
        return narrator;
    }

    public void listen(){
        System.out.println(getAuthor()+" is listening to an ebook");
    }

    @Override
    public String toString() {
        return "AudioBook{" +
                super.toString()+
                "length=" + length +
                ", narrator='" + narrator + '\'' +
                '}';
    }
}
/*
AudioBook
					private variables:
						length, narrator(final)

					Encapsulate all the fields

					methods: listen(), toString()
 */