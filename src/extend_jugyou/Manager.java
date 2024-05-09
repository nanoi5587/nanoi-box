package extend_jugyou;

public class Manager extends Employee {
	public Manager(String name) {
		super(name);
	}
	public void management() {
		System.out.println(this.getName()+"は管理者です。");
	}
}
