package com.factorypattern;

public class Instagram implements SocialMedia
{
    @Override
    public void runningApp()
    {
        System.out.println("Instagram is running in background");
    }
}
