package org.piper.springmvc;

import mockit.Mocked;
import org.junit.Assert;
import org.junit.Test;
import org.piper.springmvc.controller.IndexController;

public class ControllerTest {

    @Mocked
    private IndexController indexController;

    @Test
    public void test(){
        Assert.assertNull(indexController.index());
    }
}
