/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peter
 */
public class SteamedMilk extends CondimentDecorator{
    
     public SteamedMilk(Beverage beverage){
        this.beverage=beverage;
    }
     
     public String getDescription(){
        return beverage.getDescription() + "Steamed Milk ";
    }
    
    public double cost(){
        return beverage.cost() + .10;
    }
}
