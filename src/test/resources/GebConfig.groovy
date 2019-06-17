/*
	This is the Geb configuration file.

	See: http://www.gebish.org/manual/current/#configuration
*/


//import geb.RpScreenShotListener
import geb.report.ScreenshotReporter
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.firefox.FirefoxDriver

import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver


waiting {
	timeout = 2
}

environments {

	// run via “./gradlew chromeTest”
	// See: http://code.google.com/p/selenium/wiki/ChromeDriver
	chrome {
		driver = { new ChromeDriver() }
	}

	// run via “./gradlew chromeHeadlessTest”
	// See: http://code.google.com/p/selenium/wiki/ChromeDriver
	chromeHeadless {
		driver = {
			ChromeOptions o = new ChromeOptions()
			o.addArguments('headless')
			new ChromeDriver(o)
		}
	}

	// run via “./gradlew firefoxTest”
	// See: http://code.google.com/p/selenium/wiki/FirefoxDriver
	firefox {
		atCheckWaiting = 1

		driver = { new FirefoxDriver() }
	}

	// run via seleniumgrid
	remote {
		DesiredCapabilities cap = DesiredCapabilities.chrome()
//		cap.setPlatform(Platform.WIN10)
		adriver =  new RemoteWebDriver(new URL("http://seleniumgrid.mutualofomaha.com:4444/wd/hub"), cap)
		//		adriver =  new RemoteWebDriver(new URL("http://10.10.231.236:5555/wd/hub"), DesiredCapabilities.chrome())
//		adriver =  new RemoteWebDriver(new URL("http://devopsseleniumgridprod.mutualofomaha.com:4444/wd/hub"), DesiredCapabilities.chrome())
		adriver.manage().window().maximize()
		driver = { adriver }

	}

}

// To run the tests with all browsers just run “./gradlew test”
baseUrl = "http://gebish.org"

/**
 * Following lines set the screenshot directory and define the listener as the Report Portal compatible screenshot listener
 */
reportsDir = new File("build/test-results/GebishOrgSpec")
reporter = new ScreenshotReporter()
//reportingListener = new RpScreenShotListener()
