package com.SnakeLadder;

public class SnakeLadder {
	public static  void main(String[] args) {
		 
		        int store = 0;
		        while (store <= 99) {
		            int roll = roll();
		            System.out.println("PLayer1 got : " + roll);
		            store += roll;
		            System.out.println("Player1 is now at : " + store);
		            if (store > 100)
		            {
		                store -= roll;
		                System.out.println("Player can not surpass 100 and is reverted back to : " +store);
		            }
		            if (store < 89 && store > 11) {
		                switch (luck()) {
		                    case 1 -> {
		                        store += roll;
		                        System.out.println("Player1 got a ladder is now at : " + store);
		                    }
		                    case 2 -> {
		                        store -= roll;
		                        System.out.println("Player1 got a snake is now at : " + store);
		                    }
		                }
		            }
		        }
		        System.out.println("Player 1 has won");
		    }

		    public static int roll() {
		        return (int) Math.floor(Math.random() * 6) + 1;
		    }

		    public static int luck() {
		        return (int) Math.floor(Math.random() * 3);
		    }
		}	
		        