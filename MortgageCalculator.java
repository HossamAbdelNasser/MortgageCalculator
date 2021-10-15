import java.awt.*;
import java.text.NumberFormat;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		
		final byte MONTHS_IN_YEAR = 12;
		final byte PERCENT = 100;
		
		Scanner scanner = new Scanner(System.in);
		
    //Principle Of Loan
		System.out.print("Principle: ");
		int principle = scanner.nextInt();
    
    //Annual interest Rate
		System.out.print("Annual interest Rate: ");
		float annualInterest = scanner.nextFloat();				
    
    //Number of years
		System.out.print("Period (years): ");
		byte years = scanner.nextByte();		
    
    //Convert Annual interest to monthly interest
		double monthlyInterest = (annualInterest/PERCENT)/MONTHS_IN_YEAR;
    
    //Convert number of years to months
		double NumberOfMonths = years * MONTHS_IN_YEAR;
		
		
    //Formula
		double mortgage = principle * ((monthlyInterest*Math.pow((1+monthlyInterest), NumberOfMonths))/(Math.pow((1+monthlyInterest),NumberOfMonths)-1));
		
    //Formatting the result to currency
		NumberFormat result = NumberFormat.getCurrencyInstance();
		System.out.println("Mortgage: " + result.format(mortgage));
	}
}
