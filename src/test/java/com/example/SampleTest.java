package com.example;

//testing automation 3
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {
    @Test
    public void verifyMath() {
        int result = 2 + 2;
        Assert.assertEquals(result, 4, "Math check");
    }
}
