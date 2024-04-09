import java.util.ArrayList;
import java.util.List;

class NutritionPlan {
    private int dailyCaloricIntake;
    private int carbohydrateRatio;
    private int proteinRatio;
    private int fatRatio;
    private List<String> mealPlans;
    private String fitnessGoal;
    private List<String> dietaryRestrictions;

    public NutritionPlan(int dailyCaloricIntake, int carbohydrateRatio, int proteinRatio, int fatRatio,
                         List<String> mealPlans, String fitnessGoal, List<String> dietaryRestrictions) {
        this.dailyCaloricIntake = dailyCaloricIntake;
        this.carbohydrateRatio = carbohydrateRatio;
        this.proteinRatio = proteinRatio;
        this.fatRatio = fatRatio;
        this.mealPlans = mealPlans;
        this.fitnessGoal = fitnessGoal;
        this.dietaryRestrictions = dietaryRestrictions;
    }

    public int getDailyCaloricIntake() {
        return dailyCaloricIntake;
    }

    public void setDailyCaloricIntake(int dailyCaloricIntake) {
        this.dailyCaloricIntake = dailyCaloricIntake;
    }

    public int getCarbohydrateRatio() {
        return carbohydrateRatio;
    }

    public void setCarbohydrateRatio(int carbohydrateRatio) {
        this.carbohydrateRatio = carbohydrateRatio;
    }

    public int getProteinRatio() {
        return proteinRatio;
    }

    public void setProteinRatio(int proteinRatio) {
        this.proteinRatio = proteinRatio;
    }

    public int getFatRatio() {
        return fatRatio;
    }

    public void setFatRatio(int fatRatio) {
        this.fatRatio = fatRatio;
    }

    public List<String> getMealPlans() {
        return mealPlans;
    }

    public void setMealPlans(List<String> mealPlans) {
        this.mealPlans = mealPlans;
    }

    public String getFitnessGoal() {
        return fitnessGoal;
    }

    public void setFitnessGoal(String fitnessGoal) {
        this.fitnessGoal = fitnessGoal;
    }

    public List<String> getDietaryRestrictions() {
        return dietaryRestrictions;
    }

    public void setDietaryRestrictions(List<String> dietaryRestrictions) {
        this.dietaryRestrictions = dietaryRestrictions;
    }
    @Override
    public String toString() {
        return "Nutrition Plan:\n" +
                "Daily Caloric Intake: " + dailyCaloricIntake + "\n" +
                "Carbohydrate Ratio: " + carbohydrateRatio + "%\n" +
                "Protein Ratio: " + proteinRatio + "%\n" +
                "Fat Ratio: " + fatRatio + "%\n" +
                "Meal Plans: " + mealPlans + "\n" +
                "Fitness Goal: " + fitnessGoal + "\n" +
                "Dietary Restrictions: " + dietaryRestrictions;
    }
}


