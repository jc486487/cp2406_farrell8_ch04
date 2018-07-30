public class SandwichFilling
{
    String fillingType;
    int caloriesServing;

    public SandwichFilling(String fillingType, int caloriesServing)
    {
        this.fillingType = fillingType;
        this.caloriesServing = caloriesServing;
    }

    public int getCaloriesServing() {
        return caloriesServing;
    }

    public String getFillingType() {
        return fillingType;
    }
}
