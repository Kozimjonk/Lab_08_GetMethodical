import java.util.Scanner;

public class SafeInput
{
    /**
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";  // Set this to zero length. Loop runs until it isn’t
        do {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        } while (retString.length() == 0);

        return retString;

    }

    /**
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static int GetInt(Scanner pipe, String prompt)
    {
        int userInput = 0;
        String trash = "";
        boolean keepGoing = false;
        do {
            System.out.println("\n" + prompt + ":");
            if (pipe.hasNextInt()) {
                userInput = pipe.nextInt();
                pipe.nextLine();
                keepGoing = true;
            } else {
                trash = pipe.nextLine();
                System.out.println(trash + " is not a valid integer, try again!");
            }

        } while (!keepGoing);
        return userInput;

    }

    /**
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */

    public static int getDouble(Scanner pipe, String prompt)
    {
        double userInput = 0;
        String trash = "";
        boolean keepGoing = false;
        do {
            System.out.println("\n" + prompt + ":");
            if (pipe.hasNextInt()) {
                userInput = pipe.nextInt();
                pipe.nextLine();
                keepGoing = true;
            }
            else {
                trash = pipe.nextLine();
                System.out.println(trash + "It is not valid number, try again!");
            }
        } while (!keepGoing);


        return (int) userInput;
    }


    /**
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retInt = 0;
        String trash;
        boolean keepGoing = false;

        do {
            System.out.println("\n" + prompt + ":");
            if (pipe.hasNextInt()) ;
            {
                retInt = pipe.nextInt();
                if (retInt >= low && retInt <= high) {
                    keepGoing = true;
                } else {
                    System.out.println("Please enter number range between" + low + " and " + high + "!");

                }
            }


        } while(!keepGoing);
        return retInt;
    }
    /**
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        boolean done = false;
        String trash = "";
        String retVal = "";

        do
        {
            System.out.println(prompt + " " + regEx + ": ");
            retVal = pipe.nextLine();
            if (retVal.matches(regEx))
            {
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("Enter a matching pattern not: " + trash);
            }

        }while(!done);
        return retVal;

    }
}



