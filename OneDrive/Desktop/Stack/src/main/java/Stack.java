/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peter
 */
public class Stack {
    int MAX = 5;
    int[] stack = new int[MAX];
    int top = 0;
    
    
    public void push(int el){
        if(top >= MAX){
            System.out.println("stack is full");
        }else{
            stack[top++] = el;
        }
            
    }
    
    public void pop(){
        if(top == 0){
            System.out.println("stack is empty");
        }else{
            
            top--;   
        }
    }
    
    public void display(){
        for(int i=0;i<top;i++){
            System.out.println(stack[i]);
        }
    }
    
    public int peek(){
         if(top == 0){
            System.out.println("stack is empty");
            return 0;
        }else{
             
        return stack[top];
         }
    }
}
