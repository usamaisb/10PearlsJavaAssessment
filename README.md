**Following Pre-Requisites needs to be downloaded, and the associated environment variables needs to be setup.**<br/>
 1. _JDK_ <br/>
 1. _Git_ <br/>
 1. _Maven_ <br/><br/>

[Clone the Git repo](https://github.com/usamaisb/10PearlsJavaAssessment.git) <br />
**In project folder where the POM xml file is located execute the following maven command:**<br />
_mvn -Dtest=JavaAssessmentTest#ExecuteAssessmentTest test_<br />

**Or Alternatively you can import the Project in IntelliJ IDEA**<br />
_Execute the test “JavaAssessmentTest” in src/test/java._<br />

**The test script will be executed by following steps:**<br />
1. Navigate to [baseUrl](http://book.theautomatedtester.co.uk/)
1. Verify if the page is loaded using the text displayed on the page
1. Click on chapter1
1. Verify if the chapter1 page is loaded successfully
1. Navigate to home page
1. Verify if the home page is loaded
1. Tear down
