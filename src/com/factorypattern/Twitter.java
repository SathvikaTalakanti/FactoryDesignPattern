package com.factorypattern;

public class Twitter implements  SocialMedia
{
    @Override
    public void runningApp()
    {
        System.out.println("Twitter is running in background");
    }
}
