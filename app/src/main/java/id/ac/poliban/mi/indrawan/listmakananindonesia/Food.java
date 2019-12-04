package id.ac.poliban.mi.indrawan.listmakananindonesia;

public class Food {
    private String food;
    private String foodName;
    private String foodDesc;

    public Food(String food, String foodName, String foodDesc) {
        this.food = food;
        this.foodName = foodName;
        this.foodDesc = foodDesc;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodDesc() {
        return foodDesc;
    }

    public void setFoodDesc(String foodDesc) {
        this.foodDesc = foodDesc;
    }

    @Override
    public String toString() {
        return String.format("%30s\n\n$s", getFoodName(), getFoodDesc());
    }
}
