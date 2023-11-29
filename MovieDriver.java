import java.util.Scanner;

public class MovieDriver {

	public static void main(String[]args) {
		
		//Create a new object of type Scanner that reads from the keyboard
		Scanner scanner = new Scanner(System.in);
		char anotherMovie = 'y';
		
		//loop to display at least once and then if the user wishes to input more movies
		
		do {
			
		
		//Create a new movie object
		Movie movie = new Movie();
		
		//Prompt the user to enter the title of a movie 
		System.out.println("Enter the name of the movie: ");
		//Read in the line that the user types
		String movieName = scanner.nextLine();
		//Set the title in the movie object
		movie.setTitle(movieName);
		
		
		//Prompt the user to enter the movie’s rating
		System.out.println("Enter the rating of the movie: ");
		//Read in the line that the user types
		String movieRate = scanner.nextLine();
		//Set the rating in the movie object
		movie.setRating(movieRate);
		
		//Prompt the user to enter the number of tickets sold at a (unnamed) theater
		System.out.println("Enter the number of tickets sold for this movie: ");
		//Read in the integer that the user types
		int numbTicketSold = scanner.nextInt();
		//Set the number of tickets sold in the movie object
		movie.setSoldTickets(numbTicketSold);
		
		//Print out the information using the movie’s toString method
		System.out.println(movie.toString());
		
		//prompt user to enter if they would like to add another movie
		System.out.println("\nDo you want to enter another (y or n): ");
		anotherMovie = scanner.next().charAt(0);
		
		scanner.nextLine();
		
		}while(anotherMovie == 'y' || anotherMovie =='Y');
		
		//bye message
		System.out.println("Goodbye");
		
		scanner.close();
		
		
	}
}
