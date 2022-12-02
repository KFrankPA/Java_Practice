package day25_Constructors;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Movie {
    public String country;
    public String title;
    public String genre;
    public LocalDate releaseDate;
    public String director;
    public ArrayList<String> casts;

    public Movie(String country, String title, String genre, LocalDate releaseDate, String director) {
        this.country = country;
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.director = director;
        this.casts = new ArrayList<>();
    }

    public void addCast(String name){
       casts.add(name);
    }
    public void addCasts(String[] names){
        casts.addAll(Arrays.asList(names));

    }
    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", releaseDate=" + releaseDate +
                ", director='" + director + '\'' +
                ", casts=" + casts +
                '}';
    }



    public static void main(String[] args) {
       Movie movie1 = new Movie("USA", "Avatar", "Fantasy",
               LocalDate.of(2022,12,15), "Jimmy" );
       movie1.addCast("James");
       movie1.addCast("Maria");
       movie1.addCast("Julia");
        System.out.println(movie1);

    }
}
/*
Task04:
    1. Create a custom class named  Movie:
        Attributes:
            country, title, Genre, releaseDate, director, casts (ArrayList<String>)

        Add a constructor to set the country, title, release date, and director of the Movie

        Actions
            addCast(String): adds the given string argument to the arrayList casts
            addCasts(String[]): adds the given string array argument to the arrayList casts
            toString(): returns the name of country, title, release date, and total number of casts

    2. create a class called TestMovieObjects
            1. create an object of the movie:
                    title: Java Developer: Zero to Hero
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 04/18/2021
                    director: Kuzzat Altay
                    Casts: Ozzy, Ali, Muhtar and 5 more students from your group

        print the full info of the movie


 */