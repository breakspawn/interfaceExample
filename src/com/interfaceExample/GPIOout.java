package com.interfaceExample;

public class GPIOout implements IWriter{
    public int address = 9090;
    @Override
    public void out(String message)
    {
        System.out.println("GPIO write message: " + message);
    }

}
