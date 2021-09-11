package com.icecreamfactory.demo;

public class AbIceCreamFactory extends AbstractFactory {
	   @Override
	   public IceCream getIceCream(String IceCreamType){    
	      if(IceCreamType.equalsIgnoreCase("VANILLA")){
	         return new AbVanilla();         
	      }else if(IceCreamType.equalsIgnoreCase("STRAWBERRY")){
	         return new AbStrawberry();
	      }	 
	      return null;
	   }
	}