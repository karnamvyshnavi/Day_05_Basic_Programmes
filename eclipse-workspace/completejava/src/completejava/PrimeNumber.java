package completejava;

import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n= sc.nextInt();
		int count=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i == 0) {
				count +=1;
			}
		}
    
		if(count == 1) {
			System.out.println("Not a Prime number"+" "+n);
		}
		else {
			System.out.println("Prime number"+" "+n);
		}

		
	}

}
