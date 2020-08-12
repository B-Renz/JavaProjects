package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    //byte
        //short
        //long
        //int
        //float
        //double
        //char
        //boolean
        String myString = "This is a string";
        System.out.println("my string is equal to " + myString);

        myString = myString + ", and this is more.";
        System.out.println("my string is equal to " + myString);
        myString = myString + " \u00A9 2020";
        System.out.println("my string is equal to " + myString);

        String lastString = "10";
        int myINt = 50;
        lastString = lastString + myINt;
        System.out.println("Last string is equal to " + lastString);
    }
}
