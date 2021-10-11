package com.xztie.compareversions;

import org.junit.Assert;
import org.junit.Test;

public class CompareVersionsTest {
    private static final int LESS_THAN_RET = -1;
    private static final int GREATER_THAN_RET = 1;
    private static final int EQUAL_RET = 0;

    @Test
    public void lessThanTest() {
        Assert.assertEquals(LESS_THAN_RET, CompareVersions.compareTwoVersions("0", "1.1"));
        Assert.assertEquals(LESS_THAN_RET, CompareVersions.compareTwoVersions("0.1", "1.1"));
        Assert.assertEquals(LESS_THAN_RET, CompareVersions.compareTwoVersions("1", "1.1"));
        Assert.assertEquals(LESS_THAN_RET, CompareVersions.compareTwoVersions("0.1", "2"));
        Assert.assertEquals(LESS_THAN_RET, CompareVersions.compareTwoVersions("1.1", "1.2"));
        Assert.assertEquals(LESS_THAN_RET, CompareVersions.compareTwoVersions("1.2", "1.2.9.9"));
        Assert.assertEquals(LESS_THAN_RET, CompareVersions.compareTwoVersions("1.2.9", "1.3"));
        Assert.assertEquals(LESS_THAN_RET, CompareVersions.compareTwoVersions("1.3", "1.3.4"));

        Assert.assertEquals(LESS_THAN_RET, CompareVersions.compareTwoVersions("1.3.4", "1.3.5"));
        Assert.assertEquals(LESS_THAN_RET, CompareVersions.compareTwoVersions("1.3.4", "1.10"));
    }

    @Test
    public void greaterThanTest() {
        Assert.assertEquals(GREATER_THAN_RET, CompareVersions.compareTwoVersions("1.1", "0"));
        Assert.assertEquals(GREATER_THAN_RET, CompareVersions.compareTwoVersions("1.1", "0.1"));
        Assert.assertEquals(GREATER_THAN_RET, CompareVersions.compareTwoVersions("1.1", "1"));
        Assert.assertEquals(GREATER_THAN_RET, CompareVersions.compareTwoVersions("2", "0.1"));
        Assert.assertEquals(GREATER_THAN_RET, CompareVersions.compareTwoVersions("1.2", "1.1"));
        Assert.assertEquals(GREATER_THAN_RET, CompareVersions.compareTwoVersions("1.2.9.9", "1.2"));
        Assert.assertEquals(GREATER_THAN_RET, CompareVersions.compareTwoVersions("1.3", "1.2.9"));
        Assert.assertEquals(GREATER_THAN_RET, CompareVersions.compareTwoVersions("1.3.4", "1.3"));
        Assert.assertEquals(GREATER_THAN_RET, CompareVersions.compareTwoVersions("1.10", "1.3.4"));
    }

    @Test
    public void equalTest() {
        Assert.assertEquals(EQUAL_RET, CompareVersions.compareTwoVersions("1.1", "1.1"));
        Assert.assertEquals(EQUAL_RET, CompareVersions.compareTwoVersions("0", "0"));
        Assert.assertEquals(EQUAL_RET, CompareVersions.compareTwoVersions("1", "1"));
        Assert.assertEquals(EQUAL_RET, CompareVersions.compareTwoVersions("10", "10"));
        Assert.assertEquals(EQUAL_RET, CompareVersions.compareTwoVersions("2.3", "2.3"));
    }
}
