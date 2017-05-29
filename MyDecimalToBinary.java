/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydecimaltobinary;

/**
 *
 * @author Rashmi
 */


public class MyDecimalToBinary {

     public static String convertDecialToBinary(int number){
         
        StringBuilder binary = new StringBuilder();
        Stack stack = new Stack(10);
        if(number == 0){
            binary.append("0");
        } else {
            while(number != 0){
                stack.push(number%2);
                number = number/2;
            }
        }
        while(!stack.isEmpty()){
            try {
                binary.append(stack.pop());
            } catch (Exception e) {
                
                e.printStackTrace();
            }
        }
        return binary.toString();
    }
     
    public static void main(String a[]){
        System.out.println("Binary value of 25 is: "+convertDecialToBinary(25));
        System.out.println("Binary value of 156 is: "+convertDecialToBinary(156));
       
        
    }
}
 
 class Stack {
    private int stackSize;
    private int[] stackArr;
    private int top;
 
    
    public Stack(int size) {
        this.stackSize = size;
        this.stackArr = new int[stackSize];
        this.top = -1;
    }
 
 
    public void push(int i){
       
        System.out.println("Adding: "+i);
        this.stackArr[++top] = i;
    }
 
   
    public int pop() throws Exception {
        if(this.isEmpty()){
            throw new Exception("Can not remove element bcz empty stack");
        }
        int entry = this.stackArr[top--];
        
        return entry;
    }
     
   
    public long peek() {
        return stackArr[top];
    }
 
   
    
    public boolean isEmpty() {
        return (top == -1);
    }
 
    
 
    public static void main(String[] args) {
       Stack stack = new Stack(2);
        for(int i=1;i<10;i++){
            stack.push(i);
        }
        for(int i=1;i<4;i++){
            try {
                stack.pop();
            } catch (Exception e) {
                
                e.printStackTrace();
            }
  
    
        }
    }
 }