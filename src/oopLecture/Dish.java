package oopLecture;
class Dish {

    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;


    //Constructor
    public Dish(int costInCents, String nameOfDish, boolean wouldRecommend){
        this.costInCents = costInCents;
        this.nameOfDish = nameOfDish;
        this.wouldRecommend = wouldRecommend;
    }


    public int getCostInCents(){
        return costInCents;
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public boolean isWouldRecommend() {
        return wouldRecommend;
    }

    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public void setCostInCents(int newCost){
        this.costInCents = newCost;
    }

    public void printSummary() {

        System.out.printf("Cost: " + costInCents + "\nName: " + nameOfDish + "\nRecommended: " + wouldRecommend + "\n");

    }
}

class DishTest {
    public static void main(String[] args) {

        Dish dish1 = new Dish(1500, "Pizza", true);


//        dish1.setWouldRecommend(true);
//        dish1.setNameOfDish("Pizza");
//
//        dish1.setCostInCents(1500);

        dish1.printSummary();

        DishTools.analyzeDishCost(dish1);
        DishTools.shoutDishName(dish1);
        DishTools.flipRecommendation(dish1);
        dish1.printSummary();
    }


}

class DishTools{
    public static int AVERAGE_COST_OF_DISH_IN_CENTS = 1300;
    public static void shoutDishName(Dish dish){
        System.out.println(dish.getNameOfDish().toUpperCase());
    }
    public static void analyzeDishCost(Dish dish){
        if(dish.getCostInCents() > AVERAGE_COST_OF_DISH_IN_CENTS){
            System.out.println("More expensive than average");
        }
        else if(dish.getCostInCents() < AVERAGE_COST_OF_DISH_IN_CENTS){
            System.out.println("Less expensive than average");
        }

    }
    public static void flipRecommendation(Dish dish){
        dish.setWouldRecommend(!dish.isWouldRecommend());

    }

}
