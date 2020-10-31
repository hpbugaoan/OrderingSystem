# OrderingSystem# Welcome to the OrderingSystem

This ordering system is made using **Spring Boot 2.4** and other technologies used into this systems are **lombock**, **h2 database**, **thymeleaf** and **JPA**.

In developing this application I used Eclipse IDE Version: 2019-09 R (4.13.0). For the database I used an in memory database like h2 database so that no need to install or configure a new database when running this example. This database approach is frequently used in doing some test cases.

# Screenshots

![Home Page](https://raw.githubusercontent.com/hpbugaoan/OrderingSystem/main/OS_images/homePage.JPG)

![Registration Form](https://raw.githubusercontent.com/hpbugaoan/OrderingSystem/main/OS_images/registration_form.JPG)
![Results](https://raw.githubusercontent.com/hpbugaoan/OrderingSystem/main/OS_images/result_details.JPG)
![View Bookings](https://raw.githubusercontent.com/hpbugaoan/OrderingSystem/main/OS_images/View%20Bookings.JPG)
![h2_database_access](https://github.com/hpbugaoan/OrderingSystem/blob/main/OS_images/h2_access.JPG)
![Database Contents](https://raw.githubusercontent.com/hpbugaoan/OrderingSystem/main/OS_images/database_contents.JPG)

# Instructions

1. Install a Maven 3.0 and above
2. Go to Ordering System Application physical path using cmd.
3. Run "_mvn eclipse:eclipse -Dwtpversion=2.0_" to support eclipse IDE.
4. Import Ordering System Application in eclipse project.
5. Update Maven Project and tick "_Force Update of Snapshots/Release_".
6. Run "_mvn clean compile install_".
7. Run project as Java Application.

# How to access the h2 database
1. Open any type of browsers.
2. Add the following link to the URL http://localhost:8090/h2-console/ 
3. A login will appear.,
4. Login using the access setuped on the application.properties under the application src/main/resources.

# Stopping the Spring Application in Process

1. Open cmd in windows.
2. Type command _**netstat -ano | find "8090"**_
3. Type command _**taskkill /f /pid <PID>**_

# Test Cases
1. Context Mapping Check
2. Check All Data in DB if present


