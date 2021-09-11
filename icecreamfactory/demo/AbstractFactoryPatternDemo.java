package com.icecreamfactory.demo;

public class AbstractFactoryPatternDemo {
   public static void main(String[] args) {
      //get IceCream factory
      AbstractFactory IceCreamFactory = FactoryProducer.getFactory(false);
      //get an object of IceCream Vanilla
      IceCream IceCream1 = IceCreamFactory.getIceCream("VANILLA");
      //call draw method of IceCream Vanilla
      IceCream1.flavour();
      //get an object of IceCream Strawberry 
      IceCream IceCream2 = IceCreamFactory.getIceCream("STRAWBERRY");
      //call draw method of IceCream Strawberry
      IceCream2.flavour();
      //get IceCream factory
      AbstractFactory IceCreamFactory1 = FactoryProducer.getFactory(true);
      //get an object of IceCream Vanilla
      IceCream IceCream3 = IceCreamFactory1.getIceCream("VANILLA");
      //call flavour method of IceCream Vanilla
      IceCream3.flavour();
      //get an object of IceCream Strawberry 
      IceCream IceCream4 = IceCreamFactory1.getIceCream("STRAWBERRY");
      //call flavour method of IceCream Strawberry
      IceCream4.flavour();
      
   }
}