/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydecimaltobinary;


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
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return binary.toString();
    }
     
    public static void main(String a[]){
        System.out.println("Binary value of 2 is: "+convertDecialToBinary(2));
        System.out.println("Binary value of 15 is: "+convertDecialToBinary(15));
        System.out.println("Binary value of 23 is: "+convertDecialToBinary(23));
    }
}
 
 class Stack {
    private int stackSize;
    private int[] stackArr;
    private int top;
 
    /**
     * constructor to create stack with size
     * @param size
     */
    public Stack(int size) {
        this.stackSize = size;
        this.stackArr = new int[stackSize];
        this.top = -1;
    }
 
    /**
     * This method adds new entry to the top
     * of the stack
     * @param entry
     * @throws Exception
     */
    public void push(int i){
       
        System.out.println("Adding: "+i);
        this.stackArr[++top] = i;
    }
 
    /**
     * This method removes an entry from the
     * top of the stack.
     * @return
     * @throws Exception
     */
    public int pop() throws Exception {
        if(this.isEmpty()){
            throw new Exception("Stack is empty. Can not remove element.");
        }
        int entry = this.stackArr[top--];
        //System.out.println("Removed entry: "+entry);
        return entry;
    }
     
    /**
     * This method returns top of the stack
     * without removing it.
     * @return
     */
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
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
  
    
        }
    }
 }