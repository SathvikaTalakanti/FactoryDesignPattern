package com.factorypattern;

public class Main
{
   public static void main(String[] args)
   {
      SocialMediaFactory socialMediaFactory=new SocialMediaFactory();
      SocialMedia socialMedia=socialMediaFactory.getApp("IG");
      socialMedia.runningApp();
   }
}
