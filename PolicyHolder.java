public class PolicyHolder 
{
    //Declare all the variables
    private int policyholderAge;
    private double policyholderHeight, policyholderWeight;
    private String policyholderFirstname, policyholderLastname, smokingStatus;

    /**
     * Constructor that accepets arguments.
     * @param policyholderAge
     * @param policyholderHeight
     * @param policyholderWeight
     * @param policyholderFirstname
     * @param policyholderLastname
     * @param smokingStatus
     */
    public PolicyHolder(int policyholderAge, double policyholderHeight, double policyholderWeight, 
                        String policyholderFirstname, String policyholderLastname, String smokingStatus)
    {
        this.policyholderAge = policyholderAge;
        this.policyholderHeight = policyholderHeight;
        this.policyholderWeight = policyholderWeight;
        this.policyholderFirstname = policyholderFirstname;
        this.policyholderLastname = policyholderLastname;
        this.smokingStatus = smokingStatus;
    }

    /**
     * Copy constructor
     * @param object2 - the object to copy
     */
    public PolicyHolder(PolicyHolder object2)
    {
        policyholderAge = object2.policyholderAge;
        policyholderHeight = object2.policyholderHeight;
        policyholderWeight = object2.policyholderWeight;
        policyholderFirstname = object2.policyholderFirstname;
        policyholderLastname = object2.policyholderLastname;
        smokingStatus = object2.smokingStatus;
    }    

    /**
     * Setter.
     * @param policyholderAge
     */
    public void setPolicyholderAge(int policyholderAge)
    {
        this.policyholderAge = policyholderAge;
    }
    
    /**
     * Setter.
     * @param policyholderHeight
     */
    public void setPolicyholderHeight(double policyholderHeight)
    {
        this.policyholderHeight = policyholderHeight;
    }

    /**
     * Setter.
     * @param policyholderWeight
     */
    public void setPolicyholderWeight(double policyholderWeight)
    {
        this.policyholderWeight = policyholderWeight;
    }
    
    /**
     * Setter.
     * @param policyholderFirstname
     */
    public void setPolicyholderFirstname(String policyholderFirstname)
    {
        this.policyholderFirstname = policyholderFirstname;
    }

    /**
     * Setter.
     * @param policyholderLastname
     */
    public void setPolicyholderLastname(String policyholderLastname)
    {
        this.policyholderLastname = policyholderLastname;
    }

    /**
     * Setter.
     * @param smokingStatus
     */
    public void setSmokingStatus(String smokingStatus)
    {
        this.smokingStatus = smokingStatus;
    }
    
    /**
     * Getter.
     * @return policyholderAge
     */
    public int getPolicyholderAge()
    {
        return policyholderAge;
    }

    /**
     * Getter.
     * @return policyholderHeight
     */
    public double getPolicyholderHeight()
    {
        return policyholderHeight;
    }

    /**
     * Getter.
     * @return policyholderWeight
     */
    public double getPolicyholderWeight()
    {
        return policyholderWeight;
    }

    /**
     * Getter.
     * @return policyholderFirstname
     */
    public String getPolicyholderFirstname()
    {
        return policyholderFirstname;
    }

    /**
     * Getter.
     * @return policyholderLastname
     */
    public String getPolicyholderLastname()
    {
        return policyholderLastname;
    }

    /**
     * Getter.
     * @return smokingStatus
     */
    public String getSmokingStatus()
    {
        return smokingStatus;
    }
    
    public String toString()
    {
        return String.format("\nPolicyholder's First Name: " + policyholderFirstname +
                            "\nPolicyholder's Last Name: " + policyholderLastname +
                            "\nPolicyholder's Age: " + policyholderAge + 
                            "\nPolicyholder's Smoking Status: " + smokingStatus +
                            "\nPolicyholder's Height: %.1f inches"  +
                            "\nPolicyholder's Weight: %.1f pounds" , policyholderHeight, policyholderWeight);
    }
    


}
