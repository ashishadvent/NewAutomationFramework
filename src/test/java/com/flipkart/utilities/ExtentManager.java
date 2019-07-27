/**
 * 
 */
package com.flipkart.utilities;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

/**
 * @author ashish
 *
 */
public class ExtentManager {
	
	private static ExtentReports extent;
	private static String reportFileName="test-Automation-report"+".html";
	private static String fileSeparator= System.getProperty("File.Separator");
	private static String reportFilePath = System.getProperty("user.dir")+fileSeparator+reportFileName;
	private static String reportFileLocation =  reportFilePath +fileSeparator+ reportFileName;
	
	public static ExtentReports getExtentInstance() {
		
		if(extent==null) {
			createExtentReportInstance();
		}
		return extent;
		
	}

	private static ExtentReports createExtentReportInstance() {
		String fileName=getreportPath(reportFilePath);
		
		ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter(fileName);
		
        
        htmlReporter.config().setTheme(Theme.STANDARD);
        htmlReporter.config().setDocumentTitle(reportFileName);
        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setReportName(reportFileName);
        htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");        
        htmlReporter.config().setTheme(Theme.DARK);
        //htmlReporter.config().setChartVisibilityOnOpen(true);
        extent=new ExtentReports();
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("OS","Window");
        extent.setSystemInfo("Env", "QA Production");
        
		
		
		
		return extent;
		// TODO Auto-generated method stub
		
	}

	private static String getreportPath(String reportFilePath2) {
		// TODO Auto-generated method stub
		File testDirectory = new File(reportFilePath2);
        if (!testDirectory.exists()) {
        	if (testDirectory.mkdir()) {
                System.out.println("Directory: " + reportFilePath2 + " is created!" );
                return reportFileLocation;
            } else {
                System.out.println("Failed to create directory: " + reportFilePath2);
                return System.getProperty("user.dir");
            }
        } else {
            System.out.println("Directory already exists: " + reportFilePath2);
        }
		return reportFileLocation;
		
	}

}
