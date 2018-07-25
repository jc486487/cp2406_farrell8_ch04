public class Billing
{
    public static void main(String[] args)
    {
        double price = 13.0;
        int quantity = 3;
        double coupon = 3.99;

        double tax1= computeBill(price);
        System.out.println("Tax: $" + tax1);

        double tax2= computeBill(price, quantity);
        System.out.println("Tax: $" + tax2);

        double tax3= computeBill(price, quantity, coupon);
        System.out.println("Tax: $" + tax3);
    }
    public static double computeBill(double price)
    {
        double tax = price + (0.8 * price);
        return tax;
    }

    public static double computeBill(double price, int quantity)
    {
        double total = price * quantity;
        double tax = total + (0.8 * total);
        return tax;
    }

    public static double computeBill(double price, int quantity, double coupon)
    {
        double total = (price * quantity) - coupon;
        double tax = total + (0.8 * total);
        return tax;
    }
}
