public class TestSandwichFilling
{
    public static void main(String[] args)
    {
        SandwichFilling type1 = new SandwichFilling("Egg and Mayo", 120);
        SandwichFilling type2 = new SandwichFilling("Cheese and letuce", 100);
        SandwichFilling type3 = new SandwichFilling("Chicken", 130);

        System.out.println("Type 1: \nFilling: " + type1.getFillingType() + "\nCalories per serving: " + type1.getCaloriesServing());
        System.out.println("Type 2: \nFilling: " + type2.getFillingType() + "\nCalories per serving: " + type2.getCaloriesServing());
        System.out.println("Type 3: \nFilling: " + type3.getFillingType() + "\nCalories per serving: " + type3.getCaloriesServing());

    }
}
