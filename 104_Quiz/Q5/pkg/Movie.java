// Name: Giorgio Banna
// Collaborators: Emin, Wyatt

package pkg;

public class Movie{
    String movieName;
    double rating;
    int numRatings;
    int revenue;

    public Movie(){
        movieName = "Avenegers";
        rating = 8.0;
        numRatings = 33;
        revenue = 623357910;
    }
    
    public Movie(String movieName, double rating, int numRatings, int revenue){
        this.movieName = movieName;
        this.rating = rating;
        this.numRatings = numRatings;
        this.revenue = revenue;
    }
    
    public void movieToString(){
        System.out.println("Movie: "+movieName);
        System.out.println("Rating: "+rating);
        System.out.println("Number of ratings: "+numRatings);
        System.out.println("Revenue: "+revenue);
        System.out.println(" ");
    }
    
    public String getMovieName(){
        return movieName;
    }
    
    public int getRevenue(){
        return revenue;
    }
    
    // public void addRating(double a){
    //     this.rating = (rating * numRatings + a)/(numRatings+1);
    //     this.numRatings = numRatings+1;
    // }
    
    public void addRating(double c) {
    double z;
    z = rating * numberratings;
    rating = (z + c)/(numberratings + rating);  

}
    
    public boolean compareRatings(Movie b){
        double c = b.getRating();
        if (this.rating > c){
            return true;
        }
        else{
            return false;
        }
    }
    
    public double getRating(){
        return rating;
    }
    
    public int revenueToString(){
        return this.revenue;
    }
 
}
