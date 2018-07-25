public class FormLetterWriter
{
    public static void main(String[] args)
    {
        String firstName = "Sherin";
        String lastName = "Varghese";
        displaySalutation(lastName);
        displaySalutation(firstName, lastName);
    }

    public static void displaySalutation(String lastName)
    {
        System.out.println("Dear Mr. or Ms. " + lastName + "\nThank you for your recent order.");
    }
    public  static void displaySalutation(String firstName, String lastName)
    {
        System.out.println("Dear " + firstName + " " + lastName + "\nThank you for your recent order.");
    }
}
