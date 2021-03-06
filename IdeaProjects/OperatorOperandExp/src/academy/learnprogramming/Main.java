package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println(result);
        int previousResult = result;
        System.out.println(previousResult);

        result = result - 1; // 3 - 1 = 2
        System.out.println(result);

        result = result * 10; //2 * 10 = 20
        System.out.println(result);

        result = result / 5; // 20 / 5 = 4
        System.out.println(result);

        result = result % 3; // the remainder of ( 4 % 3) = 1
        System.out.println(result);

        // result = result + 1;
        result++; // 1 + 1 = 2
        System.out.println(result);

        result--; // 2 - 1 = 1
        System.out.println(result);

        // result = result + 2;
        result += 2; // 1 + 2 = 3
        System.out.println(result);

        // result = result * 10
        result *= 10; // 3 * 10 = 30
        System.out.println(result);

        // result = result / 3
        result /= 3; // 30 / 3 = 10
        System.out.println(result);

        // result = result - 2
        result -= 2; // 10 - 2 = 8
        System.out.println(result);

        boolean isBot = false;
        if (isBot == false) {
            System.out.println("It is not a bot... stupid bots...");
            System.out.println("... I love you");
        }

        int topScore = 100;
        if (topScore == 100) {
            System.out.println("You got a perfect 100...");
            System.out.println("... is that good?");
            System.out.println("... is that bad?");
            System.out.println("Who knows");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore <= 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions were true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is an error... wait... nope");
        }

        boolean isCar = false;
        if (isCar == true) {
            System.out.println("Why the F did this print...");
        }
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }
    }
}
