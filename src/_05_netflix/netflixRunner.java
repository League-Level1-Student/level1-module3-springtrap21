package _05_netflix;

public class netflixRunner {
public static void main(String[] args) {
	Movie M = new Movie("The Grinch", 5);
	Movie N = new Movie("A Tale of a Hobo", 1);
	Movie O = new Movie("Platoon", 4);
	Movie P = new Movie("Lion King(Live Action)", 2);
	Movie Q = new Movie("Hacksaw Ridge", 5);
	System.out.println(M.getTicketPrice());
	System.out.println(N.getTicketPrice());
	System.out.println(O.getTicketPrice());
	System.out.println(P.getTicketPrice());
	System.out.println(Q.getTicketPrice());
	NetflixQueue R = new NetflixQueue();
	R.addMovie(M);
	R.addMovie(N);
	R.addMovie(O);
	R.addMovie(P);
	R.addMovie(Q);
	R.printMovies();
	System.out.println("The best movie is . . . " + M);
	System.out.println("The second best movie is. . . " + Q);
}
}
