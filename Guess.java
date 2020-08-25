import java.util.Scanner;

public class Guess {

    public static int number = 5;

    public void guess() {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number to guess: ");
        int num = in.nextInt();


        if (num == number) {
            System.out.println("You guessed the number!Congrat");
            System.exit(0);
        } else if (num < number) {
            System.out.println("The number is more.Try again");
            guess();
        } else System.out.println("The number is less.Try again");
        guess();

    }

    public void guess1(){
        for (int i = 0; i <101; i++) {
            if (i==number){
                System.out.println("Success");
                break;
            }else if (i<number){
                System.out.println("More");
                continue;
            }else System.out.println("Less");
            continue;

        }
    }


}
