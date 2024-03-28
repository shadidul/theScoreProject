# theScoreProject
# for this maven project Java 8 is used with Appium Version 1.22.0 (did not upgrade as this was the existing one on my machine)
# Test Cases are executed via the Test Runner Class Directly 
# Appium Wrapper class has both options to run tests locally on ios simulators and Android emulators
# when executing test cases locally on default appium server, set default Appium server url in Appium Wrapper class
# when exeecuting on BrowserStack (or any other cloud) , set the url to browserstack Server url 
#when executing on Browserstack, comment out the local emulator capablities and vice versa to prevent issues 
#browserstack free trial does not ALLOW gps spoofing. I was able to get in touch with the rep @ Browserstack
#who allowed me to use 
#the capablity  capabilities.setCapability("browserstack.gpsLocation", "40.730610,-73.935242");
#however, this was only available to me for 2 days after that they only allow this feature from premium members
#location defaults to Atlanta, GA in Browserstack unless specificed in capability via browserstack.gpsLocation
#The test script validates that for the selected player, the values in the Match Up Tab matches that foundi n the Stats Tab
# MobileBasePage has all the methods and custom swipe methods
