
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
    public static int lengthMin;
    public static int lengthHour;
    private int length;
    public static int numMovies;
    
    
    public Movie()
    {
        // initialise instance variables
        rating = 0;
        title = "";
        lengthHour = 0;
        lengthMin = 0; 
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
    
    public Movie(String title, int length, int rating)
    {
        this.title = title;
        this.rating = rating;
        this.length = length;
        numMovies = numMovies + 1;
        
    }
    
    public int getLength()
    {
        return length;
    }
}
