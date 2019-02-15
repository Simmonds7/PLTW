
/**
 * Write a description of class Song here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Song
{
    // instance variables - replace the example below with your own
    private int rating;
    private String title;
    private double price;
    private boolean favorite;
    public static double totalCost = 0.0;
    public static int numSongs = 0;
    public Song()
    {
        // initialise instance variables
        rating = 0;
        title = "";
        price = 0.0;
        favorite = false;
    }
    
    public void AddToFavorites()
    {
        favorite = true;
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
    
    public void setPrice (double p)
    {
        price = p;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public Song(String title, double price)
    {
        this.title = title;
        this.price = price;
        totalCost = totalCost + price;
        numSongs = numSongs + 1;
    }
    
    public Song(String title, double price, int rating)
    {
        this.title = title;
        this.price = price;
        this.rating = rating;
        totalCost = totalCost + price;
        numSongs = numSongs + 1;
    }
}
