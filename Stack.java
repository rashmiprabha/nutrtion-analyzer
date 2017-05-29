/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;
/**
 *
 * @author Rashmi
 */
   

class Node {
    
    int data ;
    Node next ;

    public Node (int i) {
        
        
        this.data=i;
        this.next=null;
        
    }

    public void display () {
        
        
        System.out.print(data);
    }
}


  class Stack {
    private Node top ; 
    
    public Stack () {
        this.top=null;
    }
    
    
    public boolean isEmpty () {
        
      
            return (top==null);
        
    }
    public void push (int i) {
        
        Node add=new Node(i);
        add.next=this.top;
        top=add;
        
    }
    public Node pop () {
        
        Node temp=top;
        top=top.next;
        return temp;
    }
    public int peek () {

        if(top!=null)
        {
             return top.data;
        }
        else{
            return 0;
        }
           
        
    }
    
    public void displayStack()
    {
  
        
        Node current = top;
        while(current != null)
        {
            current.display();
            current = current.next; 
        }
        System.out.println("");
    }
    
    
    
    public static void main(String[]args)
    {

        
     DecimalToBinary db1=new DecimalToBinary(25);
     db1.tobinary();
     db1.display();
     
      
    }

    
}


class DecimalToBinary  {
    
    private int deci;
    Stack bin=new Stack();
    
    public DecimalToBinary(int i){
    
        this.deci=i;
        
    }
    
    public void tobinary()
    {
        
        int value=deci;
        while(value!=0)
        {
            bin.push(value%2);
            value=value/2;
        }
        
        
    }
    
    public void display()
    {
       System.out.println("Binary value of decimal value= " +deci);
       bin.displayStack();
    }
    
}
    
    
    
   
    

