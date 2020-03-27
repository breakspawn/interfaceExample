package com.interfaceExample;

import java.util.Random;

public class AbstractFabricWriters {
    private int count = 0;
    public IWriter GetWriter() //
    {
        Random r = new Random();
        if(r.nextInt() % 2 == 0)
            return new GUIout();
        else
            return new GPIOout();
    }
}
