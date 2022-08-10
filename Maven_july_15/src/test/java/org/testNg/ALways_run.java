package org.testNg;

import org.testng.annotations.Test;

public class ALways_run{ 
@Test
private void bike() {
System.out.println("bike yamaha");
}
@Test
private void car() {
System.out.println(10/0);
}
@Test(dependsOnMethods= "car",alwaysRun=true,enabled=false)
private void offers() {
System.out.println("offer");
}
}

