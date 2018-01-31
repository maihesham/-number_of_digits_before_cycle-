

 

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.lang.*;
public class Main {
/*
* 1-get Remainder = n%d;
* 2-while 
*    Multiply the remainder by 10.
	  get e = remainder / d in array
	  if e in array 
	      break;
	  else 
       add e in array
	  Remainder = remainder % d.
	  
	          
* */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		int d=input.nextInt();
		int re=n%d;
		ArrayList rems=new ArrayList();
		int e=0;
		int to_return=0;
		
		while(re!=0){
			re=re*10;
			e=re/d;
			for(int i=0;i<rems.size();i++){
				int a=(int) rems.get(i);
				if(a==e){
					to_return=1;
					break;
				}
			}
			if(to_return==0){
				rems.add(e);
				int q=re%d;
				
				re=q;
			}else if(to_return==1){
				break;
			}
			
			
		}
		if(re==0){
			System.out.print("no repeating cycle  n/d  = ");
		}else{
			System.out.println("number of digits in repeating cycle =  "+" "+rems.size());;
			System.out.println("for infinty");
		}
		
		
		System.out.print(n/d+""+".");
		for(int i=0;i<rems.size();i++){
			int a=(int) rems.get(i);
			System.out.print(a);
		}
      
	}

}