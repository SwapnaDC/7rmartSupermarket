package utilities;


	import com.aventstack.extentreports.ExtentReports;
	import com.aventstack.extentreports.reporter.ExtentSparkReporter;

	public class ExtentReportUtility {
		static ExtentReports extent;
	
		
	    public synchronized static ExtentReports createExtentReports()
	    {
	    	
	    	
	    		String path =System.getProperty("user.dir")+"\\extent-reports\\extent-report.html";
	    		
	    		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
	    		reporter.config().setReportName("Web Automation Results");
	    		reporter.config().setDocumentTitle("Test Results");

	    		extent =new ExtentReports();
	    		extent.attachReporter(reporter);
	    		extent.setSystemInfo("Tester", "Ram");
	    		return extent;
	    	
	    }  
}
