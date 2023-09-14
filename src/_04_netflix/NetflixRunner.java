package _04_netflix;

public class NetflixRunner {
	public static void main(String[] args) {
		Movie movie = new Movie("Barbie", 3);
		Movie movie2 = new Movie("Blue Beetle", 4);
		Movie movie3 = new Movie("Gran Turismo", 5);
		Movie movie4 = new Movie("Oppenheimer", 4);
		Movie movie5 = new Movie("Meg 2: The Trench", 3);
		String price = movie3.getTicketPrice();
		System.out.println(price);
		NetflixQueue queue = new NetflixQueue();
		queue.addMovie(movie);
		queue.addMovie(movie2);
		queue.addMovie(movie3);
		queue.addMovie(movie4);
		queue.addMovie(movie5);
		queue.printMovies();
		System.out.println("The best movie is " + queue.getBestMovie());
		System.out.println("The second best movie is " + queue.getMovie(1));
	}
}
	