package com.tests;

import com.service.Contract;
import com.service.IContract;
import org.junit.Assert;
import org.junit.Test;

public class Service {
    @Test
    public void toSaveTest() {
        IContract service = new Contract();
        String retorno = service.toSave();
        Assert.assertEquals("Success", retorno);
    }
    @Test
    public void toFindTest() {
        IContract service = new Contract();
        String retorno = service.toFind();
        Assert.assertEquals("Client Was Found", retorno);
    }
    @Test
    public void toDeleteTest() {
        IContract service = new Contract();
        String retorno = service.toDelete();
        Assert.assertEquals("Client Was Delete With Success", retorno);
    }
    @Test
    public void toRefreshTest() {
        IContract service = new Contract();
        int retorno = service.toRefresh();
        Assert.assertEquals(1000, retorno);
    }
}
