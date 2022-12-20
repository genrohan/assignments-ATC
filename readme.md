This project is created to perform the scenario provided in the Coding Challenge.

I have used PageObject Model to create this framework.
Three pakages: Pages(to create a seperate java file for all the pages the test traverse through), Scenario(to combine all the different test steps to make a complete test use case), and util(contains Base file that setups test environment and Data class to fetch different data sets for the test)

Things to do before running the project:
	1. extract and import in the project as a Maven project in Eclipse(or any other IDE)
	2. Build the the project as Maven project. this will downloads all the jar files required to run the project
	
To perform the test without selenium grid just run the testng.xml file as testNg suite.

To run the test tthrough selenium grid:
	1. install selenium server in your local repository
	2. start selenium server hub in your local system
	3. start selenium server node in system where you want to run the test
	4. in the "data.java" file update the "hubIP" and "portNumber" of the system where hub is running
	5. run the testng.xml file as testng suite
	
	
Result: About the item section is printed in the console.
	