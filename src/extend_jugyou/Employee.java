package extend_jugyou;

public class Employee {
	private String name;
	
	public Employee(String name) {
		this.name = name;
	}
	
	public void operation() {
		System.out.println(name+"は一般です。");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
