package com.company;

public class Main {

    public static void main(String[] args) {
	int [] array = new int[] {-3,2,5,4,7};
	boolean found = false;
	int searchedValue = -3;
	for (int x : array){
	    if(x == searchedValue){
	        found = true;
	        break;
        }
    }
        System.out.println(found);
    }
}
