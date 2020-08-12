package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    double dValue = 20.00d;
	    double secondDValue = 80.00d;
	    double myResult = 100 * (dValue + secondDValue);
        System.out.println("My result = " + myResult);
	    double remainDer = myResult % 40.00d;
        System.out.println("The remainder = " + remainDer);

        boolean isNoRemainder = (remainDer == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
