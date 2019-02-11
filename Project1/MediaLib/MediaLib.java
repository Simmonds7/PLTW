
/**
 * Write a description of class MediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MediaLib
{
    static void main()
    {
        System.out.println("Welcome to your Media Library!");
        
        Song song1 = new Song();
        song1.setTitle("Johnny B. Goode");
        song1.setRating(10);
        System.out.println(song1.getTitle() + "    | Rating: " + song1.getRating() + " |");
        
        Movie movie1 = new Movie();
        movie1.setTitle("Monty Python and the Holy Grail");
        movie1.setRating(10);
        System.out.println(movie1.getTitle() + "    | Rating: " + movie1.getRating() + " |");
        
        Book book1 = new Book();
        book1.setTitle("The Necronomicon");
        book1.setRating(9.5);
        System.out.println(book1.getTitle() + "    | Rating: " + book1.getRating() + " |");
    }
}
