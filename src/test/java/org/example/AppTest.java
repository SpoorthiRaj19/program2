package org.example;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {
    @Test
    public void add()
    {
        Main main=new Main();
        int res=main.add(2,3);
        Assert.assertEquals(5,res);
    }
}
