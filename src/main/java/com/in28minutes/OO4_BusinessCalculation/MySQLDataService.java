package com.in28minutes.OO4_BusinessCalculation;

import org.springframework.stereotype.Component;

@Component("mySQLDataService")
public class MySQLDataService implements DataService{
    @Override
    public int[] retrieveData() {
        return new int[]{1,2,3,4,5};
    }
}
