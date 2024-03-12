public class Policy 
{
    private static int instanceCount = 0;
    // Declare all the variables
    private int policyNumber;
    private String providerName;
    private PolicyHolder policyHolder; // Instance of the policy holder class.

    /**
     * Constructor that accepts arguments.
     * @param policyNumber
     * @param providerName
     * @param policyHolder - an instance of the PolicyHolder class
     */
    public Policy(int policyNumber, String providerName, PolicyHolder policyHolder) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyHolder = new PolicyHolder(policyHolder); //we use the copy contructor of the Policy class to avoid security holes
        instanceCount++;
    }

    /**
     * Setter.
     * @param policyNumber
     */
    public void setPolicyNumber(int policyNumber)
    {
        this.policyNumber = policyNumber;
    }

    /**
     * Setter.
     * @param providerName
     */
    public void setProviderName(String providerName)
    {
        this.providerName = providerName;
    }
    
    /**
     * Setter.
     * @param policyHolder
     */
    public void setPolicyHolder(PolicyHolder policyHolder)
    {
        this.policyHolder = new PolicyHolder(policyHolder);
    }

    /**
     * Getter.
     * @return policyNumber
     */
    public int getPolicyNumber()
    {
        return policyNumber;
    }

    /**
     * Getter.
     * @return providerName
     */
    public String getProviderName()
    {
        return providerName;
    }

    /**
     * Getter.
     * @return Instance count
     */
    public int getInstanceCount()
    {
        return instanceCount;
    }
    /**
     * Calculates BMI.
     * @return BMI
     */
    public double bmiCalcualtor()
    {
        final double CONVFACTOR = 703;
        return (policyHolder.getPolicyholderWeight() * CONVFACTOR) / ((policyHolder.getPolicyholderHeight()) * (policyHolder.getPolicyholderHeight()));
    }

    /**
     * Calculates the price of the insurance policy.
     * @return policyPrice
     */
    public double policyPriceCalculator()
    {
        //Declare all the constants.
        final int BASE_FEE = 600;
        final int MAX_YEARS = 50;
        final int MAX_YEARS_FEE = 75;
        final int SMOKER_FEE = 100;
        final int MAX_BMI = 35;
        final int BMI_FEE_CONSTANT = 20;
        double bmiFee = 0;
        double policyPrice = BASE_FEE;

        //If age > 50 put a fee of $75.
        if (policyHolder.getPolicyholderAge() > MAX_YEARS)
        {
            policyPrice += MAX_YEARS_FEE;
        }
        //If smoker put a fee of $100.
        if (policyHolder.getSmokingStatus().equalsIgnoreCase("smoker"))
        {
            policyPrice += SMOKER_FEE;
        }
        //If bmi > 20 put a a fee depending of bmi.
        if (bmiCalcualtor() > MAX_BMI)
        {
            bmiFee = (bmiCalcualtor() - MAX_BMI) * BMI_FEE_CONSTANT;
            policyPrice += bmiFee;
        }
        
        return policyPrice;
    }

    /**
     * Display all the information.
     */
    public String toString()
    {
        return String.format("\nPolicy Number: " + policyNumber +
                            "\nProvider Name: " + providerName +
                            policyHolder.toString() +
                            "\nPolicyholder's BMI: %.2f" +
                            "\nPolicy Price: $%.2f" , bmiCalcualtor(), policyPriceCalculator());
    }

}