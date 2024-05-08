package constants;

import java.io.File;

public interface Constants {

	String seperator = File.separator;
	String projectPath = System.getProperty("user.dir");
	String mainPath = projectPath + seperator + "src" + seperator + "main";
	String testPath = projectPath + seperator + "src" + seperator + "test";
	String mainResourcePath = mainPath + seperator + "resources";
	String testResourcePath = testPath + seperator + "resources";
	String reportsFolderPath = projectPath + seperator + "Reports"+seperator;
	String defaultReportFileName = "index";
	String reportConfigurationFilePath = mainResourcePath+seperator+"reportconfiguration.xml";
	String passedScreenshotsFolderPath = projectPath + seperator + "PassedScreenShots" + seperator;
	String failedScreenshotsFolderPath = projectPath + seperator + "FailedScreenShots" + seperator;
	String configurationPropertyFilePath = testResourcePath + seperator + "configuration.properties";
	String environmentFilePath = testResourcePath + seperator + "environments.properties";
	String tracePath = projectPath+seperator+"Traces"+seperator;
	String videoPath = projectPath+"Videos"+seperator;
	
	


	
	

}
