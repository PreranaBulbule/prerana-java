package com.xworkz.late.external;

import com.xworkz.late.internal.Connector;

public class ConnectorUser {
    Connector connector;

    public ConnectorUser(Connector connector){
        this.connector=connector;
        System.out.println("Connector-arg const of ConnectorUser");
    }

    public void execute(){
        System.out.println("Running execute in ConnectorUser");

        if(this.connector !=null){
            this.connector.run();
        }
    }
}
