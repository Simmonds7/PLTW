
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
}

