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

		System.out.println("\nEnter the word 'specific' if you want to see percents off in more detail. Otherwise just enter a percent and the dollar amount.");
		System.out.println("\n   (percent)   (amount)");
		System.out.println("Ex.    50       199 \n");

		ArrayList<Double> thePercents = new ArrayList<Double>();
		ArrayList<Double> theAmounts = new ArrayList<Double>();

		do{
			System.out.println("(y) - To continue..\n(all) - To display multiple..\n(q) - to quit program..\nContinue?");
			user = sc.nextLine();

			if(user.equals("y")){
				do{
					System.out.println("Percent >> ");
					yPercent = sc.nextLine();

					if(yPercent.equals("q")){
						System.out.println("balls");
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

					System.out.printf("%.2f is the remaining amount.\n", amountRemaining);
					System.out.printf("%.2f the final price.\n", result);

				}while(true);

				
			}else if(user.equals("all")){

				do{
					System.out.println("Amount >> ");
					allAmount = sc.nextLine();

					if(allAmount.equals("q")){
						break;
					}

					double douAllAmount = Double.parseDouble(allAmount);
					for(int i = 1; i <= 9; i++){
						double allPercentage = (i * 10);
						System.out.println(i * 10);
					}
					
					//System.out.println("(y) - To continue..\n(all) - To display multiple..\n(q) - to quit program..\nContinue?");


					
				}while(true);
			}
			
/*
			System.out.println("Amount >> ");
			amount = sc.nextDouble();

			// 25% / 100 = 0.25
			// $80 x 0.25 = $20
			// $80 - $20 = $60

			double dottedPercent = percent / 100;
			double amountRemaining = amount * dottedPercent;
			double result = amount - amountRemaining;

			thePercents.add(dottedPercent);
			theAmounts.add(result);

			System.out.printf("%.2f \n",(amount - result));
			System.out.printf("%.2f \n", result);
*/


			/*
			for(int i = 0; i <= 10; i++){
				
			}*/

			
		}while(!user.equals("q"));
	
	}
}
