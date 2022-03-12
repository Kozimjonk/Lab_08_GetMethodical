import java.util.Scanner;

public  class FavNumbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int favNum;
        favNum = SafeInput.getDouble(in, "Enter favorite number ");
        System.out.println(favNum + " is your favorite number");

    }
}
