import java.util.Scanner;

public class BloodData
{
    String bloodType;
    char rhFactor;
    Scanner sc;

    public BloodData()
    {
        bloodType = "O";
        rhFactor = '+';
    }

    public BloodData (String bloodType, char rhFactor)
    {
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
        sc = new Scanner(System.in);
    }

    public String getBloodType()
    {
        return bloodType;
    }

    public char getRhFactor()
    {
        return rhFactor;
    }

    public void setBloodType(String type)
    {
        if ((bloodType == "O") || (bloodType == "A") || (bloodType == "B") || (bloodType == "AB") )
            bloodType = type;
    }

    public  void setRhFactor(char factor)
    {
        if ((rhFactor == '+') || (rhFactor == '-'))
            rhFactor = factor;
    }
}
