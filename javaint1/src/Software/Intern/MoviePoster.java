package Software.Intern;

public class MoviePoster  extends Poster {
    public MoviePoster() {
        super();
        System.out.println("No-args constructor of MoviePoster");

        super.displayPoster();
        System.out.println("Displaying a Movie Poster");

        super.rollPoster();
        System.out.println("Rolling up a Movie Poster");

        super.framePoster();
        System.out.println("Framing a Movie Poster");

        super.removePoster();
        System.out.println("Removing a Movie Poster");
    }
}
