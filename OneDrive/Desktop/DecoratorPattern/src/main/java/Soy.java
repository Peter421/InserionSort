/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peter
 */
public class Soy extends CondimentDecorator {
    
     public Soy(Beverage beverage){
        this.beverage=beverage;
    }
     
     public String getDescription(){
        return beverage.getDescription() + "Soy ";
    }
    
    public double cost(){
        return beverage.cost() + .15;
    }
}
