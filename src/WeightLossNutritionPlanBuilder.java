import java.util.List;

// Concrete builder class for WeightGainNutritionPlan
public class WeightLossNutritionPlanBuilder extends NutritionPlanBuilder {
    @Override
    public NutritionPlanBuilder setCaloricIntake(int dailyCaloricIntake) {
        this.dailyCaloricIntake = dailyCaloricIntake;
        return this;
    }

    @Override
    public NutritionPlanBuilder setMacronutrientRatios(int carbohydrateRatio, int proteinRatio, int fatRatio) {
        this.carbohydrateRatio = carbohydrateRatio;
        this.proteinRatio = proteinRatio;
        this.fatRatio = fatRatio;
        return this;
    }

    @Override
    public NutritionPlanBuilder setMealPlans(List<String> mealPlans) {
        this.mealPlans = mealPlans;
        return this;
    }

    @Override
    public NutritionPlanBuilder setFitnessGoal(String fitnessGoal) {
        this.fitnessGoal = fitnessGoal;
        return this;
    }

    @Override
    public NutritionPlanBuilder setDietaryRestrictions(List<String> dietaryRestrictions) {
        this.dietaryRestrictions = dietaryRestrictions;
        return this;
    }

    @Override
    public NutritionPlan build() {
        return new NutritionPlan(dailyCaloricIntake, carbohydrateRatio, proteinRatio, fatRatio,
                mealPlans, fitnessGoal, dietaryRestrictions);
    }
}

