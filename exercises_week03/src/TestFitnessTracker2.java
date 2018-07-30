import java.time.LocalDate;

public class TestFitnessTracker2
{
    public static void main(String[] args)
    {
        FitnessTracker2 check = new FitnessTracker2();
        String act = check.getActivity();
        int mins = check.getMinutes();
        LocalDate date = check.getDate();
        System.out.println("New Values are:");
        System.out.println("Activity: " + act + "\nMinutes: " + mins + "\nDate: " + date);
    }
}
