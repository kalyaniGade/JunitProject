package virtusa.truven.junit;

public class Junit {

	private int id;

	private String name;

	private double salary;


	private long phoneNum;



	public Junit() {
		super();

	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public long getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}

	@Override
	public String toString() {
		return "Junit [id=" + id + ", name=" + name + ", salary=" + salary + ", phoneNum=" + phoneNum + "]";
	}

}
