/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfactorypattern;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author arash
 */
public class MyFactoryPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String carName= getCar();
        CarFactory car = new CarFactory();
        Car c= car.orderCar(carName);
        if (c!= null){
           c.printCar();
        }
    }
    
    private static String getCar(){
        Scanner sc= new Scanner(System.in);
        ArrayList<String> al=new ArrayList<String>();
        al.add("Chevy");
        al.add("Toyota");
        al.add("Mazda");
        al.add("Ford");
        int max= al.size()-1;
        System.out.println("Order an available used car please- Numbers 0 ~ "+max+" are valid:");
        for (int i=0; i<al.size(); i++){
            System.out.println(i + "- "+ al.get(i));
        }
        int opt= sc.nextInt();
        return al.get(opt);
    }
    
}
