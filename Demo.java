import java.sql.*;
import java.util.*; // for reading user input and ArrayList


public class Demo {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            // Dynamically load the MySQL JDBC driver class
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish database connection
            String url = System.getenv("DB_URL");
            String username = System.getenv("DB_USERNAME");
            String password = System.getenv("DB_PASSWORD");

            connection = DriverManager.getConnection(url, username, password);


            // Execute SQL query to retrieve data
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM policyinformation");

            // Process retrieved data
            ArrayList<Policy> policies = new ArrayList<Policy>();
            int smokers = 0, nonSmokers = 0;

            while (resultSet.next()) {
                int policyNumber = resultSet.getInt("policy_number");
                String providerName = resultSet.getString("provider_name");
                String policyholderFirstname = resultSet.getString("policyholder_firstname");
                String policyholderLastname = resultSet.getString("policyholder_lastname");
                int policyholderAge = resultSet.getInt("policyholder_age");
                String smokingStatus = resultSet.getString("smoking_status");
                double policyholderHeight = resultSet.getDouble("policyholder_height");
                double policyholderWeight = resultSet.getDouble("policyholder_weight");

                if (smokingStatus.equalsIgnoreCase("smoker")) {
                    smokers++;
                } else {
                    nonSmokers++;
                }

                // Create PolicyHolder and Policy objects and add them to your ArrayList or perform any other desired operations
                PolicyHolder policyHolder = new PolicyHolder(policyholderAge, policyholderHeight, policyholderWeight,
                        policyholderFirstname, policyholderLastname, smokingStatus);

                Policy p = new Policy(policyNumber, providerName, policyHolder);
                
                //Add the policy object to the ArrayList.
                policies.add(p);
            }

            //Use a for loop to get each object of the arraylist  and display all the information.
            for(int i = 0; i < policies.size(); i++)
            {
                System.out.println(policies.get(i));    
            }

            // Close resources
            resultSet.close();
            statement.close();
            connection.close();

            // Display statistics
            System.out.println("The number of policies with a smoker is: " + smokers);
            System.out.println("The number of policies with a non-smoker is: " + nonSmokers);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
