package Festival;

public class GranolaBars extends RaceFood
{

    private final int BARS_PER_CASE = 144;
    private final double COST_PER_CASE = 17.00;
    private double totalCost = 0.0;
    private double amountOfBudget = 0.0;

    public GranolaBars(int numOfRunners, String brandName, String locationOfPurchase, String sponsorName, double amountOfBudget) {
        super(numOfRunners, brandName, locationOfPurchase, sponsorName);
        this.totalCost = totalCost;
        this.amountOfBudget = amountOfBudget;
    }

    /* --------------------GET METHODS----*/
    public double getTotalCost() {

        int totalCases = getNumOfRunners()/BARS_PER_CASE;
        int remainder = numOfRunners % BARS_PER_CASE;

        if(remainder!=0)
        {
            totalCases = totalCases + 1;
        }

        totalCost = totalCases * COST_PER_CASE;
        return totalCost;
    }
    public void setTotalCost(double totalCost)
    {
        this.totalCost = totalCost;
    }

    public double getBudgetAmount()
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
            return String.format("Total Cost for Granola Bars is under budget!!");
        }
        else
        {
            return String.format("WARNING - Total Cost for Granola Bars EXCEEDS the budget!!");
        }
    }
    public String toString() {
        return ("\nThere were " + numOfRunners + " runners in the field\n") +
        ("The granola bars used were " + brandName + ". These were purchased at " + locationOfPurchase + ".\n") +
        ("The granola bar sponsor was " + sponsorName + ".\n") +
        ("The total cost for the granola bars is: $" + getTotalCost()) + "0" +
        ("\nThe total budget for the granola bars is: $" + getBudgetAmount()) + "0" + "\n" + determineBudget();
    }
}
