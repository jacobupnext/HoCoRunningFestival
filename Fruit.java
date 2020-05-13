package Festival;

public class Fruit extends RaceFood {

    private final int BANANA_PER_CASE = 64;
    private final int ORANGES_PER_CASE = 32;
    private final double COST_PER_CASE_BANANA = 22.00;
    private final double COST_PER_CASE_ORANGES = 17.50;
    private double totalCostBanana = 0.0;
    private double totalCostOrange = 0.0;
    private double amountOfBudget = 0.0;
    double totalFruitCost;

    public Fruit(int numOfRunners, String brandName, String locationOfPurchase, String sponsorName, double amountOfBudget) {
        super(numOfRunners, brandName, locationOfPurchase, sponsorName);

        this.totalCostBanana = totalCostBanana;
        this.totalCostOrange = totalCostOrange;
        this.amountOfBudget = amountOfBudget;
    }
    /* --------------------GET METHODS----*/
    public double getTotalCostBanana() {
        return totalCostBanana;
    }

    public double getTotalCostOrange() {
        return totalCostOrange;
    }

    /* --------------------SET METHODS----*/

    public void setTotalCostBanana(double totalCostBanana) {
        this.totalCostBanana = totalCostBanana;
    }

    public void setTotalCostOrange(double totalCostOrange) {
        this.totalCostOrange = totalCostOrange;
    }

    public double getAmountOfBudget()
    {
        return amountOfBudget;
    }
    public void setBudgetAmount()
    {
    this.amountOfBudget = amountOfBudget;
    }
    public String determineBudget()
    {
        if(getTotalCost() <= amountOfBudget)
        {
            return String.format("Total Cost for fruit is under budget!!");
        }
        else
        {
            return String.format("WARNING - Total Cost for Fruit EXCEEDS the budget!!");
        }
    }

    public double getTotalCost() {

        int totalOrangeCases = numOfRunners / ORANGES_PER_CASE;
        int orangeRemainder = numOfRunners % ORANGES_PER_CASE;

        if (orangeRemainder != 0)
        {
            totalOrangeCases = (totalOrangeCases + 1);
        }

        int totalBananaCases = numOfRunners / BANANA_PER_CASE;
        int BananaRemainder = numOfRunners % BANANA_PER_CASE;

        if (BananaRemainder != 0)
        {
            totalBananaCases = totalOrangeCases + 1;
        }
        totalFruitCost = (totalOrangeCases * COST_PER_CASE_ORANGES) + (totalBananaCases * COST_PER_CASE_BANANA);
        return totalFruitCost;
    }
    public String toString() {
        return ("\nThere were " + numOfRunners + " runners in the field\n") +
        ("The fruits used were " + brandName + ". These were purchased at " + locationOfPurchase + ".\n") +
        ("The granola bar sponsor was " + sponsorName + ".\n") +
        ("The total cost for the fruit is: $" + totalFruitCost + "0" +
        ("\nThe total budget for the granola bars is: $" + getAmountOfBudget()) + "0" + "\n" + determineBudget());
    }
}
