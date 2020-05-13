package Festival;

public abstract class RaceFood {
    protected String brandName;
    protected String locationOfPurchase;
    protected String sponsorName;
    protected int numOfRunners;
    protected double totalCost;

    public RaceFood(int numOfRunners, String brandName, String locationOfPurchase, String sponsorName) {
        this.brandName = brandName;
        this.locationOfPurchase = locationOfPurchase;
        this.sponsorName = sponsorName;
        this.numOfRunners = numOfRunners;
    }

    /* --------------------GET METHODS----*/
    public String getBrandName() {
        return brandName;
    }

    public String getLocationOfPurchase() {
        return locationOfPurchase;
    }

    public String getSponsorName() {
        return sponsorName;
    }

    public int getNumOfRunners() {
        return numOfRunners;
    }
    /* --------------------SET METHODS----*/
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setLocationOfPurchase(String locationOfPurchase) {
        this.locationOfPurchase = locationOfPurchase;
    }

    public void setSponsorName(String sponsorName) {
        this.sponsorName = sponsorName;
    }

    public void setNumOfRunners(int numOfRunners) {
        this.numOfRunners = numOfRunners;
    }

    public double getTotalCost()
    {
        return totalCost;
    }

    public void setTotalCost(double totalCost)
    {
        this.totalCost = totalCost;
    }
    public String determineBudget()
    {
        //TODO: Complete
        return null;
    }

    public String toString()
    {
        return "Generic";
    }
}
