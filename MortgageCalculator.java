import java.awt.*;
import java.text.NumberFormat;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
    //Principle Of Loan
		System.out.print("Principle: ");
		Scanner p = new Scanner(System.in);
		double principle = p.nextDouble();
    
    //Annual interest Rate
		System.out.print("Annual interest Rate: ");
		Scanner r = new Scanner(System.in);
		double rate = p.nextDouble();		
    
    //Number of years
		System.out.print("Period (years): ");
		Scanner n = new Scanner(System.in);
		double period = n.nextDouble();		
    
		//Convert Annual rate to monthly rate
		double mRate = (rate/100)/12;
    
    //Convert number of years to months
		double mN = period * 12;
		
		System.out.print("Mortgage: ");
		
		//Formula
		double mortgage = principle * ((mRate*Math.pow((1+mRate), mN))/(Math.pow((1+mRate),mN)-1));
		
		//Formatting the result to currency
		NumberFormat result = NumberFormat.getCurrencyInstance();
		System.out.println(result.format(mortgage));
	}
}
