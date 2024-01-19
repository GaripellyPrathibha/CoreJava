package compareobjects;

import java.util.Comparator;

public class YearandRatingComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie m1, Movie m2) {
        if (m1.yearReleased == m2.yearReleased) {
            return Double.compare(m2.rating, m1.rating);
        }
        return m1.yearReleased - m2.yearReleased;
    }
}
