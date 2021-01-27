
public class Test {
	public static void main(String[] args) {
		Employee e1 = new Employee("amit", 2334, 49499);
		Manager m1 = new Manager("suraj", 1000, 2000);

		MarketingExecutive mar1 = new MarketingExecutive("amol", 2000, 2000, 50);

		Employee arr[] = { e1, m1, mar1, new Employee("sunita", 444, 444) };

		for (Employee temp : arr) {
		temp.print();

		}
	}
}
