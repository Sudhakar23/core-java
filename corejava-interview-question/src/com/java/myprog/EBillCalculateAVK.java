package com.java.myprog;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class EBillCalculateAVK {

	public static void main(String[] args) {
		
		System.out.print("Enter unit consumed : ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		double energyCharge = 0;
		int fixedCharge = 0;
		DecimalFormat df = new DecimalFormat("0.00");
		double calculatedBill = 0.0;

		System.out.println("Unit consumed is " + num);
		System.out.println("(EnergyCharge for  00 to  50 unit : " + energyCharge + " ) " +""+df.format(calculatedBill));
		if (num > 0 && num <= 50) {
			//System.out.println("(EnergyCharge for  00 to  50 unit : " + energyCharge + " ) " +"  "+df.format(calculatedBill));
		
		} else if (num > 50 && num <= 100) {
			energyCharge = 1.50;
			fixedCharge = 10;
			calculatedBill = (num - 50) * energyCharge;
			System.out.println("(EnergyCharge for  51 to 100 unit : " + energyCharge + " ) " + df.format(calculatedBill));
			
		} else if (num > 100 && num <= 250) { 
			double chargeTemp = 0.0;
			fixedCharge = 15;

			energyCharge = 2.0;
			calculatedBill = 50 * energyCharge;
			System.out.println("(EnergyCharge for  51 to 100 unit : " + energyCharge + " ) " + df.format(calculatedBill));
			
			energyCharge = 3.0;
			chargeTemp = (num-100) * energyCharge;
			calculatedBill = calculatedBill + chargeTemp;
			System.out.println("(EnergyCharge for 101 to 250 unit : " + energyCharge + " ) " + df.format(chargeTemp));

		}else if (num > 250) { 
			double chargeTemp = 0.0;
			fixedCharge = 25;

			energyCharge = 3.50;
			calculatedBill = 50 * energyCharge;
			System.out.println("(EnergyCharge for  51 to 100 unit : " + energyCharge + " ) " + df.format(calculatedBill));
			
			energyCharge = 4.60;
			chargeTemp = 150 * energyCharge;
			calculatedBill = calculatedBill + chargeTemp;
			System.out.println("(EnergyCharge for 101 to 250 unit : " + energyCharge + " ) " + df.format(chargeTemp));
			
			energyCharge = 6.60;
			chargeTemp = (num-250) * energyCharge;
			calculatedBill = calculatedBill + chargeTemp;
			System.out.println("(EnergyCharge for 251 and above   : " + energyCharge + " ) " + df.format(chargeTemp));

		}

		System.out.print("Total ( calculateCharge + fixedCharge ) ");
		System.out.println(" " + df.format(calculatedBill) + " + " + df.format(fixedCharge) + " = " + df.format(calculatedBill + fixedCharge));
	}

}