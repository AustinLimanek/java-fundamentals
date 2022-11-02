package inheritance;

import java.util.ArrayList;

public class Theater extends Business{

    private ArrayList<String> movies= new ArrayList<>();

    public Theater(String name){
        super(name);
    }

    public void addMovie(String movie){
        if (!this.movies.contains(movie)) this.movies.add(movie);
    }

    public void removeMovie(String movie){
        this.movies.remove(movie);
    }

    @Override
    public String toString(){
        return this.getName() + " currently has " + movies.size() + " movies";
    }

    public ArrayList<String> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<String> movies) {
        this.movies = movies;
    }
}
