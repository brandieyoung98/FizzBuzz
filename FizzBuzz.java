
import java.util.*;
import java.lang.*;
import java.io.*;

// implementation of the first way I thought to solve FizzBuzz
// although this returns correct output, I will write a more space efficient version soon XD
public class FizzBuzz{
	public static void main (String[] args){
		String [] nums = new String[101]; //to include 0-100 but we will ignore the 0 index
		//initialize with all nums
		for(int i = 0 ; i <= 100; i++){
			nums[i] =i + "";
		}

		//set the multiples of 3
		int k = 1;
		while(k * 3 <= 100){
			nums[k*3] = "Fizz";
			k++;
		}

		//then set the multiples of 5, checking the multiples of 3 first
		int z = 1;
		while(z * 5 <= 100){
			if(nums[z*5].equals("Fizz")){
				nums[z*5] = "FizzBuzz";
			}
			else{
				nums[z*5] = "Buzz";
			}
			z++;
		}

		//print em!
		for(int i = 1; i <= 100; i++){
			System.out.println(nums[i]);
		}	

	}
}
