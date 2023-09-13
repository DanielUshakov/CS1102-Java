/*This Java program is a simple quiz game with
 multiple-choice questions.It prompts the user
 to answer four questions and then calculates
 and displays the user's score as a percentage.
 */

// Importing necessary libraries the Scanner class from
// the java.util package, which allows us to take input from the user.
import java.util.Scanner;
public class Quiz {
    // Main method is the entry point of the program. It defines the main
    // method, where the execution of the program starts.
    public static void main (String[] args){
        // Initializing variables:
        // input: An instance of the Scanner class for user input.
        Scanner input = new Scanner(System.in);
        // score: An integer variable to keep track of the user's score.
        int score = 0;

        // Asking the first question using method call System.out.println().
        // Code displays the first question and its answer choices to the user
        System.out.println("         Question #1 ");
        System.out.println("What is a correct syntax to output \"Hello World\" in Java?");
        System.out.println("""
                A) System.out.println("Hello World");
                B) print ("Hello World");
                C) Console.WriteLine("Hello World");
                D) console.log("Hello World")""");
        // In this line code getting the user's answer for the first question
        // It reads the user's input (A, B, C, or D), converts it to uppercase
        // for case-insensitive comparison, and stores it in the answer1 variable.
        String answer1 = input.nextLine().toUpperCase();
        // Checking the user's answer for the first question by comparing the user's
        // answer to the correct answer (in this case "A") and updates the score
        // accordingly. If the answer is correct, it increments the score variable
        // by 1; otherwise, it prints "Incorrect."
        if (answer1.equals("A")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect");
        }
// The same process is repeated for the next three questions
// (Question #2, Question #3, and Question #4) with their respective answer choices, user input, and scoring logic.
        //--------------Question #2 ---------------------
        System.out.println("         Question #2 ");
        System.out.println("How do you insert COMMENTS in Java code?");
        System.out.println("""
                A) # This is a comment
                B) /* This is a comment
                C) // This is a comment
                D) -- This is a comment""");
        String answer2 = input.nextLine().toUpperCase();
        if (answer2.equals("C")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect");
        }

        //--------------Question #3 ----------------------
        System.out.println("         Question #3 ");
        System.out.println("Which data type is used to create a variable that should store text?");
        System.out.println("""
                A) string
                B) Txt
                C) String
                D) char
                """);
        String answer3 = input.nextLine().toUpperCase();
        if (answer3.equals("C")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect");
        }

        //---------------Question #4 ----------------------
        System.out.println(" Question #4 ");
        System.out.println("How do you create a variable with the numeric value 5?");
        System.out.println("""
                A) float x = 5
                B) int x = 5
                C) x = 5
                D) doubly = 5
                """);
        String answer4 = input.nextLine().toUpperCase();
        if (answer4.equals("B")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect");
        }
        // Calculating and displaying the user's grade.
        // This code uses a switch statement to determine
        // the user's grade based on their score and assigns
        // it to the grade variable. It then prints the grade to the console.
        String grade = switch (score) {
            case 4 -> "100%";
            case 3 -> "75%";
            case 2 -> "50%";
            case 1 -> "25%";
            default -> "Failed";
        };
        System.out.println(grade);
    }

}
// References:
// D., J., Eck. (2022). Introduction to Programming using Java.
// Hobart and William Smith Colleges: https://math.hws.edu/javanotes/

