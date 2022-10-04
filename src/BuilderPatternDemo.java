public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();

        System.out.println("VEG MEAL");
        vegMeal.showItems();
        System.out.println("Total: " + vegMeal.getCost());

        Meal chickenMeal = mealBuilder.prepareChickenMeal();

        System.out.println("CHICKEN MEAL");
        chickenMeal.showItems();
        System.out.println("Total: " + chickenMeal.getCost());
    }
}
