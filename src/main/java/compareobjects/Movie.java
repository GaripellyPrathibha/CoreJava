package compareobjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Movie {
    int yearReleased;
    double rating;
    double budget;
    double collectionAmount;

    public Movie(int yearReleased,double rating,double budget,double collectionAmount) {
        this.yearReleased=yearReleased;
        this.rating=rating;
        this.budget=budget;
        this.collectionAmount=collectionAmount;
    }
    public static void main(String[] args)
    {
        Movie movie1 = new Movie(2023, 8.5, 80.0, 100.0);
        Movie movie2 = new Movie(2011, 5.0,100.0, 80.0);
        Movie movie3 = new Movie(2005, 7.0, 60.0, 200.0);

        RatingAndProfitComparator ratingProfitComparator = new RatingAndProfitComparator();
        int resultRatingProfit = ratingProfitComparator.compare(movie1, movie2);
        System.out.println("Compare by Rating and Profit: " + resultRatingProfit);

        YearandRatingComparator yearRatingComparator = new YearandRatingComparator();
        int resultYearRating = yearRatingComparator.compare(movie1, movie2);
        System.out.println("Compare by Year Released and Rating: " + resultYearRating);
    }

}
