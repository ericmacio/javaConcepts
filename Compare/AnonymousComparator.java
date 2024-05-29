/**
* Comparator to sort employees list or array in order of Salary
*/
public static Comparator<Movie> RatingCompare = new Comparator<Movie>() {
    @Override
    public int compare(Movie m1, Movie m2)
    {
        if (m1.getRating() < m2.getRating())
            return -1;
        if (m1.getRating() > m2.getRating())
            return 1;
        else
            return 0;
    }
};

/**
* Comparator to sort employees list or array in order of Age
*/
public static Comparator<Movie> NameCompare = new Comparator<Movie>() {
    @Override
    public int compare(Movie m1, Movie m2)
    {
        return m1.getName().compareTo(m2.getName());
    }
};