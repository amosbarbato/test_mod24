package com.service;

public class Contract implements IContract{
    @Override
    public String toSave() {
        return "Success";
    }

    @Override
    public String toFind() {
        return "Client Was Found";
    }

    @Override
    public String toDelete() {
        return "Client Was Delete With Success";
    }

    @Override
    public Integer toRefresh() {
        return 1000;
    }
}
