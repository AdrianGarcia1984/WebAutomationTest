package org.example;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
//import org.junit.Test;
import org.testng.annotations.Parameters;
import org.testng.log4testng.Logger;



public class AppTest {
    //public Logger log = Logger.getLogger(AppTest.class);
    public Logger log;
    public void beforeClass() {
    }

    @BeforeMethod
    public void setUp() {
        log = Logger.getLogger(AppTest.class);
    }


    @Test
    @Parameters({"string1", "string2"})
    public void testParameters(String a, String b){
        log.info(a);
        log.info(b);
    }


}
