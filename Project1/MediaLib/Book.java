
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    // instance variables - replace the example below with your own
    private double rating;
    private String title;
    private double pages;
    public static int numBooks;
    
    public Book()
    {
        // initialise instance variables
        rating = 0;
        title = "";
    }
    
    public void setTitle (String t)
    {
        title = t;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public void setRating (double rate)
    {
        rating = rate;
    }
    
    public double getRating()
    {
        return rating;
    }
    
    public Book(String title, double pages, int rating)
    {
        this.title = title;
        this.pages = pages;
        this.rating = rating;
        numBooks = numBooks + 1;
    }
    
    public double getPages()
    {
        return pages;
    }
}

