package diet;

import java.util.HashMap;
import java.util.Map;
import java.util.RandomAccess;
import java.util.TreeMap;

/**
 * Represents a recipe of the diet.
 * <p>
 * A recipe consists of a a set of ingredients that are given amounts of raw materials.
 * The overall nutritional values of a recipe can be computed
 * on the basis of the ingredients' values and are expressed per 100g
 */
public class Recipe implements NutritionalElement {
    private String name;
    private Food food;

    private Map<NutritionalElement, Double> ingredients = new HashMap<>();

    public Recipe(String name, Food food) {
        this.name = name;
        this.food = food;
    }

    /**
     * Adds a given quantity of an ingredient to the recipe.
     * The ingredient is a raw material.
     *
     * @param material the name of the raw material to be used as ingredient
     * @param quantity the amount in grams of the raw material to be used
     * @return the same Recipe object, it allows method chaining.
     */
    public Recipe addIngredient(String material, double quantity) {
        NutritionalElement rawMaterial = food.getRawMaterial(material);
        if (!ingredients.containsKey(rawMaterial)) ingredients.put(rawMaterial,quantity);
        else ingredients.put(rawMaterial,ingredients.get(rawMaterial) + quantity);
        return null;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getCalories() {
        return 0.0;
    }

    @Override
    public double getProteins() {
        return 0.0;
    }

    @Override
    public double getCarbs() {
        return 0.0;
    }

    @Override
    public double getFat() {
        return 0.0;
    }

    /**
     * Indicates whether the nutritional values returned by the other methods
     * refer to a conventional 100g quantity of nutritional element,
     * or to a unit of element.
     * <p>
     * For the {@link Recipe} class it must always return {@code true}:
     * a recipe expressed nutritional values per 100g
     *
     * @return boolean indicator
     */
    @Override
    public boolean per100g() {
        // a recipe expressed nutritional values per 100g
        return true;
    }

}
