package helloworld;

import java.util.Objects;

/**
 * A book.
 * @author Kevin Ji <kevin.ji@outlook.com>
 */
public class Book implements Comparable<Book> {
    private final String name;
    private final String author;
    private final int pubYear;
    
    public Book(String name, String author, int pubYear) {
        this.name = name;
        this.author = author;
        this.pubYear = pubYear;
    }
    
    public String getName() {
        return name;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public int getPubYear() {
        return pubYear;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.name);
        hash = 47 * hash + Objects.hashCode(this.author);
        hash = 47 * hash + this.pubYear;
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.author, other.author)) {
            return false;
        }
        if (this.pubYear != other.pubYear) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Book o) {
        int compareTo = this.name.compareTo(o.name);
        return compareTo;
    }
    
    public static void main(String[] args) {
        Book harryPotterBook = new Book("Harry Potter and the Half-Blood Prince", "J.K. Rowling", 2005);
        Book orwellBook = new Book("1984", "George Orwell", 1949);
        
        System.out.println(harryPotterBook.equals(orwellBook));
        System.out.println(harryPotterBook.compareTo(orwellBook));
    }
}
