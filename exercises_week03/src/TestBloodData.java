public class TestBloodData
{
    public static void main(String[] args)
    {
        BloodData bd = new BloodData();
        String type = bd.getBloodType();
        char factor = bd.getRhFactor();

        bd.setBloodType(type);
        bd.setRhFactor(factor);
    }
}
