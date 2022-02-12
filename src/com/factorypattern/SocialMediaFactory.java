package com.factorypattern;

public class SocialMediaFactory
{
   public SocialMedia getApp(String name)
   {
       if(name==null || name.isEmpty())
       {
           return null;
       }
       else if(name.equals("FB"))
       {
           return new Facebook();
       }
       else if(name.equals("IG"))
       {
           return new Instagram();
       }
       else if(name.equals("TW"))
       {
           return new Twitter();
       }
       else
       {
           return new WhatsApp();
       }
   }
}
