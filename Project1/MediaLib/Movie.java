
/**
 * Write a description of class Movie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Movie
{
    // instance variables - replace the example below with your own
    private int rating;
    private String title;
    
    public Movie()
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
    
    public void setRating (int rate)
    {
        rating = rate;
    }
    
    public int getRating()
    {
        return rating;
    }
}
