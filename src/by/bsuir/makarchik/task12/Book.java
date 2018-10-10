package by.bsuir.makarchik.task12;

import java.util.Objects;

public class Book implements Cloneable, Comparable<Book>{
    private String title;
    private String author;
    private int price;
    private int isbn;
    private static int edition;

    public Book(){

    }

    public Book(String title, String author, int price, int isbn, int edition){
          this.author = author;
          this.title = title;
          this.price = price;
          this.isbn = isbn;
          Book.edition = edition;
    }

    public String getAuthor(){
        return author;
    }

    public String getTitle(){
        return title;
    }

    public int getPrice(){
        return price;
    }

    public int getEdition(){
        return Book.edition;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        else
            if(obj instanceof Book)
                return this.title.equals(((Book)obj).title) && this.author.equals(((Book)obj).author)
                && this.price == ((Book)obj).price;
            else
                return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, price);
    }

    @Override
    public String toString() {
        return "Book: " + this.title + " " + this.author + " " + this.price + " by " + Book.edition;
    }

    @Override
    public Book clone(){
        return new Book(this.title, this.author, this.price, this.isbn, Book.edition);
    }

    @Override
    public int compareTo(Book b){
        return this.isbn - b.isbn;
    }
}
