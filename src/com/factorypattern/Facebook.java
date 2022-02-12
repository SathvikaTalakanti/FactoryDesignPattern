package com.factorypattern;

public class Facebook implements SocialMedia
{
    @Override
    public void runningApp() {
        System.out.println("Facebook is running in background");
    }
}

