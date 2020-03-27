package com.interfaceExample;

public class GUIout implements IWriter {
    public int adressGUI = 8080;
    @Override
    public void out(String message)
    {
        System.out.println("GUI write message: " + message);
    }
}

