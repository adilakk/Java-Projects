package hotel;
import java.util.Random;
import java.util.Scanner;

public class BobcatHotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final double single_cost = 50.50;
		final double double_cost = 75.00;
		final double queen_cost = 100.75;
		final double king_cost = 150.25;
		final double master_cost = 225.50;
		
		int guest, room_type, aaa, club, nights, meal_choice, meal=0;
		
		double prelim_cost=0, final_cost, meal_cost=0, room_cost=0, aaa_discount_price=0, club_discount_price=0;


		System.out.println("ROOM OPTIONS");
		System.out.println("1. Single @ " + single_cost + "per night");
		System.out.println("2. Double @ " + double_cost + "per night");
		System.out.println("3. Queen @ " + queen_cost + "per night");
		System.out.println("4. King @ " + king_cost + "per night");
		System.out.println("5. Master Suite @ " + master_cost + " per night");
		
		Scanner kbd = new Scanner(System.in);
		
		System.out.println();
		System.out.print("Number of guests: ");
		guest = kbd.nextInt();
		

		System.out.print("Place your choice of room (enter 1/2/3/4/5 depending on the rooms listed above): ");
		room_type = kbd.nextInt();

		System.out.print("Please enter the number of nights: ");
		nights = kbd.nextInt();

		System.out.print("Are you a AAA member? (enter 1 for yes and 0 for no): ");
		aaa = kbd.nextInt();
		
		System.out.print("Are you a club member? (enter 1 for yes and 0 for no): ");
		club = kbd.nextInt();

		boolean aaa_discount=false, club_discount=false;
		if (aaa==1) aaa_discount=true;

		if (club == 1) {
			Random rnd = new Random();
			int rand = 0;
			while(true) {
				rand = rnd.nextInt(11);
				if (rand !=0) break;
			}

			if(rand >= 4) {
				System.out.println();
				System.out.println("Congratulations! You've qualified for our Stay 4 nights get 1 free promotion");
				System.out.println("Discount will be applied during checkout depending on the number of days");
				club_discount=true;
			}
			if (rand < 4)
				System.out.println();
				System.out.println("Unfortunately, you didn't qualify for our "+"Stay four nights get one free promotion."+" Better luck next time!");
		}

		System.out.println("  ");		
		System.out.println("MEAL PACKAGES (PRICES SHOWN ARE PER NIGHT)");
		System.out.println("0. Complementary @ $o per guest");
		System.out.println("1. Standard @ $30 per guest");
		System.out.println("2. Deluxe @ $50 per guest");

		if (room_type == 5) {
			System.out.print("3. Indulgence @ $85 per guest");
			System.out.println();
		}

		System.out.print("\nPlease select your desired meal package (enter 0/1/2 corresponding to the options shown above): ");
		meal_choice = kbd.nextInt();


		switch(meal_choice) {
		case 0:
			meal = 0;
			break;
		case 1:
			meal = 30;
			break;
		case 2:
			meal = 50;
			break;
		case 3:
			meal = 85;
			break;
		}

		meal_cost = guest * nights * meal;

		switch(room_type) {
		case 1:
			room_cost = single_cost * nights;
			prelim_cost = room_cost + meal_cost;
			if (aaa_discount == true) {
				aaa_discount_price = prelim_cost * 0.1;
			}
			if (club_discount == true) {
				club_discount_price = (single_cost * ((int) nights / 4)); 
			}
			break;
		case 2:
			room_cost = double_cost * nights;
			prelim_cost = room_cost + meal_cost;
			if (aaa_discount == true) {
				aaa_discount_price = prelim_cost * 0.1;
			}
			if (club_discount == true) {
				club_discount_price = (double_cost * ((int) nights / 4)); 
			}
			break;
		case 3:
			room_cost = queen_cost * nights;
			prelim_cost = room_cost + meal_cost;
			if (aaa_discount == true) {
				aaa_discount_price = prelim_cost * 0.1;
			}
			if (club_discount == true) {
				club_discount_price = (queen_cost * ((int) nights / 4)); 
			}
			break;
		case 4:
			room_cost = king_cost * nights;
			prelim_cost = room_cost + meal_cost;			
			if (aaa_discount == true) {
				aaa_discount_price = prelim_cost * 0.1;
			}
			if (club_discount == true) {
				club_discount_price = (king_cost * ((int) nights / 4)); 
			}
			break;
		case 5:
			room_cost = master_cost * nights;
			prelim_cost = room_cost + meal_cost;
			if (aaa_discount == true) {
				aaa_discount_price = prelim_cost * 0.1;
			}
			if (club_discount == true) {
				club_discount_price = (master_cost * ((int) nights / 4)); 
			}
			break;
		}
		
		
		final_cost = prelim_cost - (club_discount_price + aaa_discount_price);
		
		System.out.println();
		System.out.println("CHECKOUT:");
		System.out.println("Room cost: \t \t \t$" + room_cost);
		
		if (meal_cost > 0)
		System.out.println("Meal cost: \t \t \t+$" + meal_cost);
		
		System.out.println("Preliminary Total Cost \t\t$" + prelim_cost);
		
		if (aaa_discount_price > 0)
			System.out.println("AAA Discount: \t \t \t-$" + aaa_discount_price);
		
		if (club_discount_price > 0)
			System.out.println("Club Member Discount: \t \t-$" + club_discount_price);
		
		if (aaa_discount_price + club_discount_price == 0)
			System.out.println("No Discounts Applied");
		
		System.out.println("Total Cost of Booking: \t \t$" + final_cost);	
		

		kbd.close();
		
	}

}
