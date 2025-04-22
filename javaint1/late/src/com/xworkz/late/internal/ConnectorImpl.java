package com.xworkz.late.internal;

public class ConnectorImpl implements Connector{

    public ConnectorImpl(){
        System.out.println("no-args const of connrctorImpl");
    }

    @Override
    public void run(){
        System.out.println("Running run in ConnectorImpl");
    }
}
