import java.time.LocalDate;
import java.util.Scanner;

public class FitnessTracker2
{
    String activity;
    int minutes;
    LocalDate date;
    Scanner inputDevice;

    public FitnessTracker2()
    {
        this("running", 1, LocalDate.of(2018, 1, 1));
    }

    public FitnessTracker2(String activity, int minutes, LocalDate date)
    {
        this.activity = activity;
        this.minutes = minutes;
        this.date = date;
        inputDevice = new Scanner(System.in);
    }

    public String getActivity()
    {
        System.out.println("Enter the activity");
        activity = inputDevice.nextLine();
        return activity;
    }

    public int getMinutes()
    {
        System.out.println("Enter the number of minutes");
        minutes = inputDevice.nextInt();
        return minutes;
    }

    public LocalDate getDate()
    {
        int year, month, day;
        System.out.println("Enter the year");
        year = inputDevice.nextInt();

        System.out.println("Enter the month");
        month = inputDevice.nextInt();

        System.out.println("Enter the date");
        day = inputDevice.nextInt();

        date = LocalDate.of(year, month, day);

        return date;
    }
}

