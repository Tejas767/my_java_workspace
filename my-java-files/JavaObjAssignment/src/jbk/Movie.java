package jbk;


public class Movie {
    String title;
    String director;
    int releaseYear;
    String leadActor;
    String leadActress;
    double duration;
    String genre;
    double rating;
    
    public static void main(String[] args) {
        Movie m1 = new Movie();
        
        System.out.println(m1.title = "3 Idiots");
        System.out.println(m1.director = "Rajkumar Hirani");
        System.out.println(m1.releaseYear = 2009);
        System.out.println(m1.leadActor = "Aamir Khan");
        System.out.println(m1.leadActress = "Kareena Kapoor");
        System.out.println(m1.duration = 2.80);
        System.out.println(m1.genre = "Comedy-Drama");
        System.out.println(m1.rating = 8.4);
        
        System.out.println("--------------------------------------------");
        
        Movie m2 = new Movie();
        
        System.out.println(m2.title = "Sholay");
        System.out.println(m2.director = "Ramesh Sippy");
        System.out.println(m2.releaseYear = 1975);
        System.out.println(m2.leadActor = "Amitabh Bachchan");
        System.out.println(m2.leadActress = "Hema Malini");
        System.out.println(m2.duration = 3.24);
        System.out.println(m2.genre = "Action-Adventure");
        System.out.println(m2.rating = 8.2);
    }
}
