package com.xworkz.late.Runner;

import com.xworkz.late.external.ConnectorUser;
import com.xworkz.late.internal.Connector;
import com.xworkz.late.internal.ConnectorImpl;

public class ConnectorRunner {
    public static void main(String[] args) {
        Connector connector= new ConnectorImpl();
        ConnectorUser connectorUser=new ConnectorUser(connector);
        connectorUser.execute();
    }
}
