import java.util.Scanner;
import java.util.ArrayList;

class Main {

	
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String user = null;
		double percent = 0;
		double amount = 0;
		String yPercent = null;
		String yAmount = null;
		String allAmount = null;

		System.out.println("\nEnter either..");

		// Arraylist to keep calculations in memory and recall them if necessary. (NOT IMPLEMENTED YET). Perhaps make another method that only prints the results by the user typing "history" or something similar.
		ArrayList<Double> thePercents = new ArrayList<Double>();
		ArrayList<Double> theAmounts = new ArrayList<Double>();

		// for single price calculations.
		do{
			System.out.println("(y) - To continue for an individual calculation.\n(all) - To display multiple calculations.\n(q) - to quit program..\nContinue?");
			user = sc.nextLine();

			if(user.equals("y")){
				do{
					System.out.println("Percent >> ");
					yPercent = sc.nextLine();

					if(yPercent.equals("q")){
						break;
					}

					System.out.println("Amount >>");
					yAmount = sc.nextLine();

					if(yAmount.equals("y")){
						break;
					}

					double douPercent = Double.parseDouble(yPercent);
					double douAmount = Double.parseDouble(yAmount);

					double dottedPercent = douPercent / 100;
					double amountRemaining = douAmount * dottedPercent;
					double result = douAmount - amountRemaining;

					thePercents.add(dottedPercent);
					theAmounts.add(result);

					System.out.printf("%.2f Is the Discount.\n", amountRemaining);
					System.out.printf("%.2f Is the Final Price.\n", result);

				}while(true);

				// For multiple results by just entering one price.
			}else if(user.equals("all")){

				do{
					System.out.println("Amount >> ");
					allAmount = sc.nextLine();


					if(allAmount.equals("q")){
						break;
					}

					double numberPercent = 0.00;
					double allPercentage = 0;
					double douAllAmount = Double.parseDouble(allAmount);
					
					for(int i = 5; i <= 95; i+=5){
						numberPercent+=0.05;
						double theNumberPercent = numberPercent % 100;
						double moneySaved = douAllAmount * theNumberPercent;
						double finalPayment = moneySaved - douAllAmount;
						

						System.out.printf("%.2f percent off - Discount: ", theNumberPercent);
						System.out.printf("$%.2f - Final Payment is: ", moneySaved);
						System.out.printf("$%.2f - \n", finalPayment);
						
					}

					
				}while(true);
			}

			// 25% / 100 = 0.25
			// $80 x 0.25 = $20
			// $80 - $20 = $60

			
		}while(!user.equals("q"));
		System.out.println("Have a nice day! :)");
	
	}
}
