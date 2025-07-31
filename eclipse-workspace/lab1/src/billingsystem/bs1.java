package billingsystem;

import java.util.Scanner;

public class bs1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    
	    System.out.println("enter the base amount");
	    double baseAmount =sc.nextDouble();
	    double gstRate = 0.06;
	    double maintenanceCharge = 50;
	    double gst = baseAmount * gstRate;
	    double totalBillBeforeDiscount = baseAmount + gst + maintenanceCharge;
	    
	    double discount;
	    if(baseAmount > 1000) {
	      discount = totalBillBeforeDiscount * 0.10;
	    }else {
	      discount = totalBillBeforeDiscount * 0.05;
	    }
	    double finalBill = totalBillBeforeDiscount - discount;
	    
	    System.out.println("bill details:");
	    System.out.println("Base Amount" + baseAmount);
	    System.out.println("GST " + gst);
	    System.out.println("Maintenance Charge" + maintenanceCharge);
	    System.out.println("Discount " + discount);
	    System.out.println("Final Amount" + finalBill);
	    sc.close();
	  }

	}
