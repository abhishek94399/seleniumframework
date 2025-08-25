package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class MyExtentManager implements ITestListener  {
	
	ExtentSparkReporter sparkRepoter;
	ExtentReports report;
	ExtentTest test;

	public void onStart(ITestContext context) {
	    
		sparkRepoter = new ExtentSparkReporter(System.getProperty("user.dir")+"/Reports/report.html");
		
		sparkRepoter.config().setReportName("churail");
		sparkRepoter.config().setDocumentTitle("Biwi");
		sparkRepoter.config().setTheme(Theme.DARK);
		
		report = new ExtentReports();
		
		report.attachReporter(sparkRepoter);
		
		report.setSystemInfo("Resource", "Puja Devi");
		report.setSystemInfo("Window", "Chori ka Hai");	
		
	  }

 
		

				public void onTestSuccess(ITestResult result) {
					
					test = report.createTest(result.getName());
					test.log(Status.PASS, result.getName());
				
				  }
 
				public void onTestFailure(ITestResult result) {
				
					test =  report.createTest(result.getName());
					
					test.log(Status.FAIL, result.getThrowable());
				  }

				  public void onTestSkipped(ITestResult result) {
				
					  test = report.createTest(result.getName());
					  test.log(Status.SKIP, result.getThrowable());
				  }
			
  public void onFinish(ITestContext context) {
	report.flush();
	  
  }

	
	
}
