package myfactorypattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arash
 */
public class CarFactory {
   public Car orderCar(String name){
       switch (name){
           case "Chevy":
                return new Chevy();
           case "Toyota":
                return new Toyota();
           case "Mazda":
                return new Mazda();
           case "Ford":
                return new Ford();
           default:
               return null;
       }
   }    
}
