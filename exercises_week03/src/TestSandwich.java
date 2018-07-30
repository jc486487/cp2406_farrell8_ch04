public class TestSandwich
{
    public static void main(String[] args)
    {
        Sandwich type1 = new Sandwich(new Bread("Whole meal", 100), new SandwichFilling("chicken", 70));
        Sandwich type2 = new Sandwich(new Bread("Whole meal", 120), new SandwichFilling("chicken", 70));
        Sandwich type3 = new Sandwich(new Bread("Whole meal", 80), new SandwichFilling("chicken", 70));

        System.out.println("Type 1: \nBread: " + type1.bread.getBreadType() + "\nSandwich filling: " + type1.sandwichFilling.getFillingType() +
                "\nTotal Calories: " + ((2*type1.bread.getCaloriesSlice()) + type1.sandwichFilling.getCaloriesServing()));

        System.out.println("\nType 2: \nBread: " + type2.bread.getBreadType() + "\nSandwich filling: " + type2.sandwichFilling.getFillingType() +
                "\nTotal Calories: " + ((2*type2.bread.getCaloriesSlice()) + type2.sandwichFilling.getCaloriesServing()));

        System.out.println("\nType 3: \nBread: " + type3.bread.getBreadType() + "\nSandwich filling: " + type3.sandwichFilling.getFillingType() +
                "\nTotal Calories: " + ((2*type3.bread.getCaloriesSlice()) + type3.sandwichFilling.getCaloriesServing()));
    }
}
