package com.icecreamfactory.demo;

public class IceCreamFactory extends AbstractFactory {
   @Override
   public IceCream getIceCream(String IceCreamType){    
      if(IceCreamType.equalsIgnoreCase("VANILLA")){
         return new Vanilla();         
      }else if(IceCreamType.equalsIgnoreCase("STRAWBERRY")){
         return new Strawberry();
      }	 
      return null;
   }
}