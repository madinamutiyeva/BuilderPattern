import java.util.List;

public class Main {
    public static void main(String[] args) {
        NutritionPlanDirector director = new NutritionPlanDirector();

        WeightLossNutritionPlanBuilder weightLossBuilder = new WeightLossNutritionPlanBuilder();

        weightLossBuilder.setCaloricIntake(2000)
                .setMacronutrientRatios(40, 30, 30) // 40% углеводов, 30% белков, 30% жиров
                .setMealPlans(List.of("Breakfast: Oatmeal, Lunch: Grilled Chicken Salad, Dinner: Steamed Vegetables"))
                .setFitnessGoal("Weight loss")
                .setDietaryRestrictions(List.of("None"));

        director.setBuilder(weightLossBuilder);

        NutritionPlan weightLossPlan = director.createNutritionPlan();

        System.out.println("Weight Loss Plan: " + weightLossPlan);
    }
}
