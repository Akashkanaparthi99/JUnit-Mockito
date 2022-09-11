package com.trail;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

import com.testcases.bankapp.BankTest;
import com.testcases.calcapp.CalculatorTest;
import com.testcases.studentapp.StudentTest;

@RunWith(JUnitPlatform.class)
//@SelectPackages({"com.testcases.calcapp","com.testcases.studentapp"})
@SelectPackages({"com.testcases.studentapp"})
//@IncludePackages({"com.testcases.studentapp.trial"})
@ExcludePackages({"com.testcases.studentapp.trial"})
//@SelectClasses({BankTest.class,CalculatorTest.class,StudentTest.class})
public class AllTests {
	

}
