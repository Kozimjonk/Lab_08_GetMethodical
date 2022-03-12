import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        double totalPrice = 0;
        boolean newItem = false;

        do {
            itemPrice = SafeInput.getRangedDouble(in, "Enter price of item [0.50-10.00]:", 0.5,10);
            totalPrice = totalPrice + itemPrice;
            newItem = SafeInput.getYNConfirm(in, "Do you have other items? [Y/N]: ");
        }while(newItem);

    }
}
