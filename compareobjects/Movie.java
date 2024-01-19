package compareobjects;

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
    public int compare(Movie m) {

        return 0;
    }


    public static void main(String[] args)
    {
        Movie m1 = new Movie(2020, 8.5, 10000, 15000);
        Movie m2 = new Movie(2022, 9.0, 20000, 25000);

        System.out.println(m1.compare(m2));
        System.out.println(m1.compare(m2));


    }


}
