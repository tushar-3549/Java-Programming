//Restaurant Billing System
package Project1;

import java.util.ArrayList;

public class Bill {
	private ArrayList<String> orderedFood;
	private ArrayList<Integer> orderedQuantity;

	public Bill() {
		// ArrayList created here
		orderedFood = new ArrayList<String>();
		orderedQuantity = new ArrayList<Integer>();

	}

	private double totalCost;

	public double getTotal() {
		return totalCost;
	}

	public void addOrder(String meal, int quantity, String[] dish, double[] cost) {
		orderedFood.add(meal);
		orderedQuantity.add(quantity); // Autoboxing done here
		for (int i = 0; i < dish.length; i++) {
			if (meal.equals(dish[i])) {
				// totalcost is initialized to be zero
				// when a bill instance is constructed
				totalCost += quantity * cost[i];
			}
		}
	}

	public void getOrder() {
		for (int i = 0; i < orderedFood.size(); i++) {
			System.out.println(orderedFood.get(i) + "   " + orderedQuantity.get(i));
		}
	}
}
