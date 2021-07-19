package com.TestNG_Programs;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import jdk.nashorn.internal.ir.annotations.Ignore;

public class stcm_test {
	
@BeforeSuite
public void setproperty() {
System.out.println("set property");
}

@Test

private void empName() {
System.out.println("EMP NAME");
	
}


@Ignore
private void emNumber() {
System.out.println("EMP  NUMBER");
}

@Test(groups = "EMPLOYEE")
private void empPhone() {
System.out.println("EMP PHONE");
}

@Test(groups = "EMPLOYEE")
private void empSalary() {
	System.out.println("EMP  SALARY");

}


}
