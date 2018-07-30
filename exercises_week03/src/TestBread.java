public class TestBread
{
    public static void main(String[] args)
    {
        Bread bakery = new Bread("rye", 230);
        Bread bakery2 = new Bread("Whole meal", 120);
        Bread bakery3 = new Bread("White", 150);

        System.out.println("1st type: \nBread Type: " + bakery.getBreadType() + "\nCalories per slice: " + bakery.getCaloriesSlice() + "\n" +  Bread.Motto);
        System.out.println("2nd type: \nBread Type: " + bakery2.getBreadType() + "\nCalories per slice: " + bakery2.getCaloriesSlice() + "\n" + Bread.Motto);
        System.out.println("3rd type: \nBread Type: " + bakery3.getBreadType() + "\nCalroies per slice: " + bakery3.getCaloriesSlice() + "\n" + Bread.Motto);

    }
}
