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
            if (pipe.hasNextInt())
            {
                userInput = pipe.nextInt();
                pipe.nextLine();
                keepGoing = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("(" + trash + ")" + " It is not valid number, try again!");
            }
        }while (!keepGoing);


        return (int) userInput;
    }


    /**
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retInt = 0;
        String trash = "";
        boolean keepGoing = false;

        do
        {
            System.out.println("\n" + prompt + ":");
            if (pipe.hasNextInt()) ;
            {
                retInt = pipe.nextInt();
                pipe.nextLine();
                if (retInt >= low && retInt <= high)
                {
                    keepGoing = true;
                }
                else
                {
                    System.out.println("You entered \"" + false + "\"");
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
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double retDouble = 0;
        boolean validDouble = false;
        String trash = "";
        do {
            System.out.println("\n" + prompt);
            if (pipe.hasNextDouble())
            {
                retDouble = pipe.nextDouble();
                pipe.nextLine();
                if (retDouble >= low && retDouble <= high)
                {
                    validDouble = true;
                }
                else
                {
                    System.out.println("You entered \"" + retDouble + "\"");
                    System.out.println("Enter a valid number [" + low + "-" + high + "]");
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("Enter a valid double, NOT \"" + trash + "\"");
            }

        }while(!validDouble);

        return retDouble;

    }
    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        boolean retYN = false;
        boolean validInput = false;
        String response;
        do {
            System.out.println("\n" + prompt);
            response = pipe.nextLine();
            if (response.equalsIgnoreCase("Y"))
            {
                retYN = false;
                validInput = true;
            }
            else
            {
                System.out.println("Invalid Input. Enter [Y/N] ");
            }

        }while(!validInput);
        return retYN;
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
    public static void prettyHeader(String msg)
    {
        int whiteSpace = (53 - msg.length()) / 2;
        for (int x = 0; x <= whiteSpace; x++)
        {
            System.out.println(" ");
        }
        System.out.println("***");
        for (int x = 0; x <= 27; x++);
    }

    }




