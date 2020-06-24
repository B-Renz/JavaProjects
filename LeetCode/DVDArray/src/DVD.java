public class Main {

    public static void main(String[] args) {

        //The actual code for creating Array to hold DVD's.
        DVD[] dvdCollection = new DVD[15];

        //A simple definition for a DVD.
        class DVD {
            public final String name;
            public final int releaseYear;
            public final String director;

            public DVD(String name, int releaseYear, String director) {
                this.name = name;
                this.releaseYear = releaseYear;
                this.director = director;
            }

            public String toString() {
                System.out.println(
                        this.name + ", directed by " + this.director + ", released by " + this.releaseYear);
            }
        }
    }
}