package Project1;

public class Manager {

	public static void main(String[] args) {
		// dish and cost are in same here
		String[] dish = { "Pizza", "Coffe", "Juice", "Salad" };
		double[] cost = { 50, 30, 80, 40 };
		Bill myBill = new Bill();
		System.out.println("..................................................\n");
		System.out.println(".......WELCOME TO RESTAURANT BILLING SYSTEM.......\n");
		System.out.println("..................................................\n");
		System.out.println("Ordered Quantity");
		System.out.println("------- ---------");
		myBill.addOrder("Pizza", 2, dish, cost);
		myBill.addOrder("Cofee", 4, dish, cost);
		myBill.addOrder("Juice", 1, dish, cost);
		myBill.addOrder("Salad", 4, dish, cost);
		myBill.getOrder();

		System.out.println("Your Total payment : " + myBill.getTotal());
		System.out.println("Thank You , Sir");

	}
}
