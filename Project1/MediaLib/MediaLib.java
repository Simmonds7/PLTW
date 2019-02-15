
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
        double aveCost;
        double aveRate;
        double avePages;
        int aveLength = 0;
        System.out.println("Welcome to your Media Library!");
        Song.totalCost = 0;
        Song.numSongs = 0;
        Movie.numMovies = 0;
        Book.numBooks = 0;
        
        Song song1 = new Song("Johnny B. Goode", 0.99, 10);
        Song song2 = new Song("Chop Suey!", 0.99, 10);
        Song song3 = new Song("Country Roads", 1.29, 8);
        Song song4 = new Song("Sicko Mode", 1.29, 1);
        Song song5 = new Song("Peter Griffin Church Hymns", 0.99, 9);
        Song song6 = new Song("Sweet Victory", 1.29, 10);
        Song song7 = new Song("Soviet National Anthem", 0.00, 6);
        Song song8 = new Song("The song that plays in the dropship in Apex Legends", 0.00, 10);
       
        System.out.println("Song Title: " + song1.getTitle() + "  | Rating: " + song1.getRating() + " |" + "  | Price: $" + song1.getPrice() + " |");
        System.out.println("Song Title: " + song2.getTitle() + "  | Rating: " + song2.getRating() + " |" + "  | Price: $" + song2.getPrice() + " |");
        System.out.println("Song Title: " + song3.getTitle() + "  | Rating: " + song3.getRating() + " |" + "  | Price: $" + song3.getPrice() + " |");
        System.out.println("Song Title: " + song4.getTitle() + "  | Rating: " + song4.getRating() + " |" + "  | Price: $" + song4.getPrice() + " |");
        System.out.println("Song Title: " + song5.getTitle() + "  | Rating: " + song5.getRating() + " |" + "  | Price: $" + song5.getPrice() + " |");
        System.out.println("Song Title: " + song6.getTitle() + "  | Rating: " + song6.getRating() + " |" + "  | Price: $" + song6.getPrice() + " |");
        System.out.println("Song Title: " + song7.getTitle() + "  | Rating: " + song7.getRating() + " |" + "  | Price: $" + song7.getPrice() + " |");
        System.out.println("Song Title: " + song8.getTitle() + "  | Rating: " + song8.getRating() + " |" + "  | Price: $" + song8.getPrice() + " |");
        
        System.out.println("Total price of all songs: " + (Song.totalCost));
        System.out.println("Total number of songs: " + (Song.numSongs));
        aveCost = Song.totalCost / Song.numSongs;
        aveRate = (song1.getRating() + song2.getRating() + song3.getRating() + song4.getRating() + song5.getRating() + song6.getRating() + song7.getRating() + song8.getRating()) / Song.numSongs;
        System.out.println("Average Cost of all songs: " + aveCost);
        System.out.println("Average Rating of all songs: " + aveRate);
        
        Movie movie1 = new Movie("The Big Lebowski", 145, 10);
        Movie movie2 = new Movie("The Matrix", 188, 10);
        Movie movie3 = new Movie("Bohemian Rhapsody", 165, 10);
        Movie movie4 = new Movie("Revengers: Finite Quarrel", 198, 5);
        Movie movie5 = new Movie("Avatard", 80, 3);
        
        System.out.println("Movie Title: " + movie1.getTitle() + "    | Rating: " + movie1.getRating() + " | Length: " + (movie1.getLength() / 60) + " hours and " + (movie1.getLength() % 60) + " minutes.");
        System.out.println("Movie Title: " + movie2.getTitle() + "    | Rating: " + movie2.getRating() + " | Length: " + (movie2.getLength() / 60) + " hours and " + (movie2.getLength() % 60) + " minutes.");
        System.out.println("Movie Title: " + movie3.getTitle() + "    | Rating: " + movie3.getRating() + " | Length: " + (movie3.getLength() / 60) + " hours and " + (movie3.getLength() % 60) + " minutes.");
        System.out.println("Movie Title: " + movie4.getTitle() + "    | Rating: " + movie4.getRating() + " | Length: " + (movie4.getLength() / 60) + " hours and " + (movie4.getLength() % 60) + " minutes.");
        System.out.println("Movie Title: " + movie5.getTitle() + "    | Rating: " + movie5.getRating() + " | Length: " + (movie5.getLength() / 60) + " hours and " + (movie5.getLength() % 60) + " minutes.");
        
        aveLength = (movie1.getLength() + movie2.getLength() + movie3.getLength() + movie4.getLength() + movie5.getLength()) / Movie.numMovies;
        System.out.println("The average length of all " + Movie.numMovies + " movies is: " + (aveLength / 60) + " hours and " + (aveLength % 60) + " minutes.");
        
        Book book1 = new Book("The Lorax", 245, 8);
        Book book2 = new Book("One Fish, Two Fish, Red Fish, Blue Fish.", 30, 10);
        Book book3 = new Book("The Dictionary", 2000, 1);
        
        System.out.println("Book Title: " + book1.getTitle() + "    | Rating: " + book1.getRating() + " | # pages: " + book1.getPages() + ".");
        System.out.println("Book Title: " + book2.getTitle() + "    | Rating: " + book2.getRating() + " | # pages: " + book2.getPages() + ".");
        System.out.println("Book Title: " + book3.getTitle() + "    | Rating: " + book3.getRating() + " | # pages: " + book3.getPages() + ".");
        
        avePages = (book1.getPages() + book2.getPages() + book3.getPages()) / Book.numBooks;
        
        System.out.println("The average page number of all " + Book.numBooks + " books is " + avePages + " pages.");
    }
}
