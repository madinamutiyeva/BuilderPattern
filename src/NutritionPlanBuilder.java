import java.util.List;

abstract class NutritionPlanBuilder {
    protected int dailyCaloricIntake;
    protected int carbohydrateRatio;
    protected int proteinRatio;
    protected int fatRatio;
    protected List<String> mealPlans;
    protected String fitnessGoal;
    protected List<String> dietaryRestrictions;

    public abstract NutritionPlanBuilder setCaloricIntake(int dailyCaloricIntake);

    public abstract NutritionPlanBuilder setMacronutrientRatios(int carbohydrateRatio, int proteinRatio, int fatRatio);

    public abstract NutritionPlanBuilder setMealPlans(List<String> mealPlans);

    public abstract NutritionPlanBuilder setFitnessGoal(String fitnessGoal);

    public abstract NutritionPlanBuilder setDietaryRestrictions(List<String> dietaryRestrictions);

    public abstract NutritionPlan build();
}
