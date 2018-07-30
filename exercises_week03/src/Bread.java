public class Bread
{
    String breadType;
    int caloriesSlice;

    public Bread(String breadType, int caloriesSlice)
    {
        this.breadType = breadType;
        this.caloriesSlice = caloriesSlice;
    }

    public String getBreadType() {
        return breadType;
    }

    public int getCaloriesSlice() {
        return caloriesSlice;
    }

    public final static String Motto= "The staff of life";
}
