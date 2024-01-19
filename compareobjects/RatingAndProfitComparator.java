package compareobjects;

import java.util.Comparator;

public class RatingAndProfitComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie m1, Movie m2) {
        if (m1.rating == m2.rating) {
            return Double.compare(m2.collectionAmount - m2.budget, m1.collectionAmount - m1.budget);
        }
        return Double.compare(m2.rating, m1.rating);
    }
}
