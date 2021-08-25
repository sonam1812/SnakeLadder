package com.SnakeLadder;

public class SnakeLadder {
	public static  void main(String[] args) {
		 
	        System.out.println("You got : "+roll());
	        luck();
	    }

	    public static int roll() {
	        return (int) Math.floor(Math.random() * 6) + 1;
	    }

	    public static int luck() {
	        return (int) Math.floor(Math.random() * 3);
	    }
	}		      
	


