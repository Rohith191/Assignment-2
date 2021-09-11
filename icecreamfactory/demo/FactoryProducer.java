package com.icecreamfactory.demo;

public class FactoryProducer {
   public static AbstractFactory getFactory(boolean Ab){   
      if(Ab){
         return new AbIceCreamFactory();         
      }else{
         return new IceCreamFactory();
      }
   }
}