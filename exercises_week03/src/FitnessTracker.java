import java.time.*;
import java.util.Scanner;

public class FitnessTracker
{
    String activity;
    int minutes;
    LocalDate date;
    Scanner inputDevice;

    public FitnessTracker()
    {
        activity = "Running";
        minutes = 0;
        date = LocalDate.of(2018, 1, 1);
        inputDevice = new Scanner(System.in);
    }

    public FitnessTracker(String activity, int minutes, LocalDate date)
    {
        this.activity = activity;
        this.minutes = minutes;
        this.date = date;
    }

    public void getActivity()
    {
        System.out.println("Enter the activity");
        activity = inputDevice.nextLine();
    }

    public void getMinutes()
    {
        System.out.println("Enter the number of minutes");
        minutes = inputDevice.nextInt();
    }

    public void getDate()
    {
        int year, month, day;
        System.out.println("Enter the year");
        year = inputDevice.nextInt();

        System.out.println("Enter the month");
        month = inputDevice.nextInt();

        System.out.println("Enter the date");
        day = inputDevice.nextInt();

        date = LocalDate.of(year, month, day);
    }
}
