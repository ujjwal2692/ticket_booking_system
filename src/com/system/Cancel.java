package com.system;

public class Cancel extends Status {
    public void cancel_ticket(int ticket_del){
        if(ticket_del+super.n>100){
            System.out.println("Please enter valid ticket delete number");
        }else{
            super.n+=ticket_del;
            System.out.println("Tickets cancelled successfully");
        }
    }
}