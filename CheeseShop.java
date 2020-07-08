package two;
import java.util.Scanner; 
public class CheeseShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



				Scanner kbd = new Scanner(System.in);

				double hum = 0;
				double red = 0;
				double tel = 0;
				double item;
				double dis = 0;

				System.out.println("We sell 3 kinds of Cheese (in 0.5 lb packages):\n");
				System.out.println("Humboldt Fog: $25.0 per pound\n" + "Red Hawk: $40.5 per pound\n" + "Teleme: $17.25 per pound\n");

				System.out.print("Enter the amount of Humboldt Fog in lbs: ");
				hum=kbd.nextDouble();
				
				while (hum<0 || hum%0.5!=0) {
					if(hum<0) {
						System.out.print("Invalid Input. Enter a value >=0: ");
					}else {
						System.out.print("Enter a value that's multiple of 0.5: ");
					}
					hum=kbd.nextDouble();
				}
				System.out.print("Enter the amount of Red Hawk in lbs: ");
				red=kbd.nextDouble();
				
				while (red<0 || red%0.5!=0) {
					if(red<0) {
						System.out.print("Invalid Input. Enter a value >=0: ");
					}else {
						System.out.print("Enter a value that's multiple of 0.5: ");
					}
					red=kbd.nextDouble();
				}
				System.out.print("Enter the amount of Teleme in lbs: ");
				tel=kbd.nextDouble();
				
				while (tel<0 || tel%0.5!=0) {
					if(tel<0) {
						System.out.print("Invalid Input. Enter a value >=0: ");
					}else {
						System.out.print("Enter a value that's multiple of 0.5: ");
					}
					tel=kbd.nextDouble();
				}



				double humprice = hum * 25;
				double redprice = red * 40.50;
				double telprice = 17.25 * tel;
				double subtotal = humprice + redprice + telprice;
				double hpac = 2 * hum;
				double rpac = 2 * red;

				double humdis = (int)hpac/2;
				double reddis = (int)rpac/3;

				double humdp = humdis * 12.50;
				double reddp = reddis * 20.25;
				double finalprice = subtotal - humdp - reddp;

				System.out.println(" ");
				System.out.print("Display the itemized list? (1 for Yes)");
				item=kbd.nextDouble();

				if (item==1) {
					if (hum>0) {
						System.out.println(hum + "lb of Humboldt Fog @ $25.00 = $" + humprice);
					}
					if (red>0) {
						System.out.println(red + "lb of Red Hawk @ $40.5 = $" + redprice);
					}
					if (tel>0) {
						System.out.println(tel + "lb of Teleme @ $17.25 $" + telprice);
					}
					if (hum==0 && red==0 && tel==0) {
						System.out.println("No items were purchased.");
					}
					System.out.println("\nSubtotal: $" + subtotal);
					System.out.println("\nDiscount...");
					if (humdp>0) {
						System.out.println("Humboldt Fog (Buy 1 Get 1 Free): -$" + humdp);
					}
					if (reddp>0) {
						System.out.println("Red Hawk (Buy 2 Get 1 Free): -$" + reddp);
					}
					if (humdp==0 && reddp==0) {
						System.out.println("None: -$0.0");
					}
					System.out.println("\nFinal Total: $" + finalprice);
				}
				else {
					System.out.println("Subtotal: \t \t $"  + subtotal);
					System.out.println("Discount...");
					
					if (humdp>0) {
						System.out.println("Humboldt Fog (Buy 1 Get 1 Free): \t \t -$" + humdp);
					}
					if (reddp>0) {
						System.out.println("Red Hawk (Buy 2 Get 1 Free): \t \t -$" + reddp);
					}
					if (humdp==0 && reddp==0) {
						System.out.println("None: -$0.0");
					}
					System.out.println("Final Total: \t \t $" + finalprice);

				}
			}

		}