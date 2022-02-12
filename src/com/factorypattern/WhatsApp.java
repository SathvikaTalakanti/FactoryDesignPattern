package com.factorypattern;

public class WhatsApp implements  SocialMedia
{
    @Override
    public void runningApp()
    {
        System.out.println("WhatsApp is running in background");
    }
}

