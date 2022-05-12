/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peter
 */
public class Mocha extends CondimentDecorator {
    
    public Mocha(Beverage beverage){
        this.beverage=beverage;
    }
    
    public String getDescription(){
        return beverage.getDescription() + "Mocha ";
    }
    
    public double cost(){
        return beverage.cost() + .20;
    }
}
