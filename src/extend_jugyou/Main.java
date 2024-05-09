package extend_jugyou;

public class Main {

	public static void main(String[] args) {
		String name = "田中";
		Employee e = new Employee(name);
		Manager m = new Manager(name);
		e.operation();
		m.management();
	}

}
