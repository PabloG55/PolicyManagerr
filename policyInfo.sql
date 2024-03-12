CREATE DATABASE policyInfo;

USE policyInfo;


DROP TABLE IF EXISTS PolicyInformation;


CREATE TABLE PolicyInformation (
    policy_number INT PRIMARY KEY,
    provider_name VARCHAR(255),
    policyholder_firstname VARCHAR(255),
    policyholder_lastname VARCHAR(255),
    policyholder_age INT,
    smoking_status VARCHAR(20),
    policyholder_height DOUBLE,
    policyholder_weight DOUBLE
);

INSERT INTO PolicyInformation VALUES 
(3450, 'State Farm', 'Alice', 'Jones', 20, 'smoker', 65, 110),
(3455, 'Aetna', 'Bob', 'Lee', 54, 'non-smoker', 72, 200),
(2450, 'Met Life', 'Chester', 'Williams', 40, 'smoker', 71, 300),
(3670, 'Global', 'Cindy', 'Smith', 55, 'non-smoker', 62, 140),
(1490, 'Reliable', 'Jenna', 'Lewis', 30, 'smoker', 60, 105),
(3477, 'State Farm', 'Craig', 'Duncan', 23, 'smoker', 66, 215);
