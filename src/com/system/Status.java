package com.system;



public class Status{
    static int n=100;
    
    public int status(){
        if(n>0){
        System.out.println("Available!");
        System.out.println("The number of seats left are   "+n);
        return 1;}
        else{
            System.out.println("Not Available!");
            return 0;
        }

    }
    
}

    

