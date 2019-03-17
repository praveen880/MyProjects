package com.mypack;

import java.util.Scanner;

public class Examples {


	  /*  public static void printStars(int n) 
	    { 
	        int i, j; 
	  
	        for(i=0; i<n; i++) 
	        {   
	            for(j=0; j<=i; j++) 
	            { 																
	                System.out.print("1 "); 
	               
	            } 
	  
	            
	            System.out.println(); 
	        } 
	        
	   } */
	   
	    public static void main(String args[]) 
	    { 
	      //  int n = 10; 
	      //  printStars(n); 
	    	
	   /* 	//===EX2===
	    	
	    	System.out.println("BITE MIN  VALUE==="+Byte.MIN_VALUE);
	    	System.out.println("BITE MAXIMUM VALUE==="+Byte.MAX_VALUE);
	    	System.out.println("SHORT MIN=="+Short.MIN_VALUE);
	    	System.out.println("SHORT MAX=="+Short.MAX_VALUE);
	    	System.out.println("LONG MIN=="+Long.MIN_VALUE);
	    	System.out.println("LONG MAX=="+Long.MAX_VALUE);
	    	System.out.println("FLOAT MIN"+Float.MIN_VALUE);
	    	System.out.println("FLOAT MAX=="+Float.MAX_VALUE);
	    	System.out.println("INT MIN=="+Integer.MIN_VALUE);
	    	System.out.println("INT MAX=="+Integer.MAX_VALUE);
	    	System.out.println("DOUBLE MIN=="+Double.MIN_VALUE);
	    	System.out.println("DOUBLE MAX=="+Double.MAX_VALUE);
	    	
	    	*/
	    	
	    	
	    	//====EX3===
	    	
	    /*	// IMPLICIT 
	    	
	    	int a=10;
	    	float b=a;
	    	long c=a;
	    	double d=a;
	   
	    	System.out.println(a);
	    	System.out.println(b);
	        System.out.println(c);
	        System.out.println(d);
	        
	        // EXPLICIT
	    	
	        float v1=3.9f;
	        
	        int v2=(int) v1;
	        
	        System.out.println(v1);
	    	System.out.println(v2);
	    	
	    	*/
	    	
	    	
	    	//===EX4===
	    	
	   	    	
	    	
	    /*	int a=10 , b=20 ,c=30 , d=40 , e=50;
	     
	        
	        System.out.println(a++); 
	        
	        System.out.println(a--);  
	 
	        System.out.println(++b); 
	       
	        System.out.println(--b); 
	    	
	        System.out.println(d++); 
	        
	        System.out.println(d--);  
	    	
	        System.out.println(++c);
	        
	        System.out.println(--e);
	    	
	    	*/
	    	
	    	
	    	//===EX5===
	    	
	 
 /*	int a=100, b=50;
	    	
	    	System.out.println("a>b   -->"+(a>b));
	    	System.out.println("a>=b  -->"+(a>=b));
	    	System.out.println("a<b   -->"+(a<b));
	    	System.out.println("a<=b  -->"+(a<=b));
	    	System.out.println("a=b   -->"+(a=b));
	    	System.out.println("a!=b  -->"+(a!=b));
	    	System.out.println("a==b  -->"+(a==b));
	    	
	    	*/
	    	
	    	
	    	//===EX6===
	    	
	    	// PRINTING  GIVEN NUMBER IS  +VE (OR) -VE 
	    	
	    /*	
	    	int num1, num2;
		
	     
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("ENTER NUM1 VALUE");
	    	num1=sc.nextInt();
	    	System.out.println("ENTER NUM2 VALUE");
	    	num2=sc.nextInt();
	    	
	    		
	    	
	    	if(num1>=0)
	    	
	    	{
	    		System.out.println(num1+" == IS POSITIVE NUMBER");
	    		
	    	}
	    	else
	    	{
	    		System.out.println(num1+" == IS NAGATIVE NUMBER");
	    	}
	    	
	    	if(num1==num2)
	    	{
	    		System.out.println(num1+" AND "+num2+" BOTH ARE EQUAL ");
	    	}
	    	else
	    	{
	    		System.out.println(num1+" AND "+num2+" BOTH ARE NOT EQUAL ");
	    	}
	    	if(num1>num2)
	    	{
	    		System.out.println(num1+" IS BIGGER THAN "+num2);
	    	}
	    	else
	    	{
	    		System.out.println(num2+" IS BIGGER THAN "+num1);
	    	}
	    	
	    	
	    */	
	    	
	    	
	    	//===EX7===
	    	
	     /*
	      	
	    	int n=676;
	    	
	    	System.out.println(n+" TOTAL TIME HAVING "+(n/60)+" HOURS  AND " +(n%60)+ " MINUTS");
	    	
	    	System.out.println(n+" TOTAL DAYS HAVING "+(n/60)+" MONTHS  AND " +(n%60)+ " DAYS");
	    	
	    	
	    	*/
	    	
	    	//===EX8===
	    	
	    	// STUDENT DATA
	 /*   	
	    float mathes , statistics , computer, total, per;
	    
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter MARKS IN MATHES");
	    mathes=sc.nextFloat();
	    System.out.println("ENTER MARKS IN STATISTICS");
	    statistics=sc.nextFloat();
	    System.out.println("ENTER MARKS IN COMPUTER");
	    computer=sc.nextFloat();
	     float a= mathes;
	     float b=statistics;
	     float c=computer;
	     
	     total=(a+b+c);
	     
	    per=total/3;
	    
	    String grade;
		if(per>70)
	    
	    	grade = "A";
	    
	    else if(per<70 && per>60)
	    	
	    	grade="B";
		
	    else if(per<60 && per>50)
	    	
	    	grade="C";
		
	    else
	    	
	    	grade ="D";
		
		String result;
		if(a<35 || b<35 || c<35)
		{
			 result = "FAIL";
		}
		else
		{
			result ="PASS";
		}
			
		System.out.println("TOTAL      " +total);
		System.out.println("PERCENTAGE " +per);
		System.out.println("GRADE      "+grade);
	    System.out.println("RESULT     "+result);	
	    	
	    	
	    */
	    	
	    //===EX8===	
	    	
	    // PERSON AGE STATUS           // CHILD  = BELOW 13
	    	                           // TEEN   =13-19
	    	                           // YOUNG  =20-30
	    	                           // OLD    =30 ABOVE
	    	
	/*    	
	    int age ;
	    
	    Scanner sc=new Scanner(System.in);
	    System.out.println("ENTER YOUR AGE");
	    age=sc.nextInt();
	    
	    if(age<13)
	    {
	    	System.out.println("YOU ARE IN CHILD AGE");
	    }
	    else if(age>13 && age<19)
	    {
	    	System.out.println("YOU ARE IN TEEN AGE");
	    }
	    else if(age>20 && age<30)
	    {
	    	System.out.println("YOU ARE IN YOUNG AGE");
	    }
	    else 
	    {
	    	System.out.println("YOU ARE IN OLD AGE");
	    }
	    	
	    */	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    } 
	    
	   
	

	
}
 


