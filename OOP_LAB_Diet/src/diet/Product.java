package diet;

public class Product implements NutritionalElement {


    @Override
    public String getName() {
        return null;
    }

    @Override
    public double getCalories() {
        return 0;
    }

    @Override
    public double getProteins() {
        return 0;
    }

    @Override
    public double getCarbs() {
        return 0;
    }

    @Override
    public double getFat() {
        return 0;
    }

    @Override
    public boolean per100g() {
        return false;
    }
}
