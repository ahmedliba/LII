package test;

import movie.movie;
import movie.movieItem;

public class movieTest {
    public static void main(String[] args) {
        movie myMovie = new movie();

        movieItem item1 = new movieItem("Inception", "Christopher Nolan");
        movieItem item2 = new movieItem("Titanic", "James Cameron");

        myMovie.addmovieItem(item1);
        myMovie.addmovieItem(item2);

        myMovie.printmovieDetails();
    }
}
