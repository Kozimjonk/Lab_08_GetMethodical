import java.util.Scanner;

public class DevTest {

    public static void main(String[] args)
    {


        Scanner in = new Scanner(System.in);

        int val;
        val = SafeInput.GetInt(in, "Enter number ");
        System.out.println(val);

        double favNum;
        favNum = SafeInput.getDouble(in, "Enter favorite number ");
        System.out.println(favNum + " is your favorite number");

        int rangedNumber;
        rangedNumber = SafeInput.GetInt(in, "Enter number ");


        String firstName = "";
        String lastName = "";
        firstName = SafeInput.getNonZeroLenString(in, "Enter your first name");
        lastName = SafeInput.getNonZeroLenString(in, "Enter your last name");
        System.out.println("\n Your full name is: " + firstName + " " + lastName);
    }


}

