import java.io.Serializable;

// Create an employee class with id, name and salary.
//Create a class with main() write a code to persist the object in the file.
//Create another class with main() write code to read the object from the file.
//run the first main(), this should write the object in file succesfullky.
//now run the second main(), this should read the object from the file and display it on the console screen.
//HINT:- Use Serialization and Deserialization
public class Employee implements Serializable{
	private int id;
	private String name;
	private int salary;
	public Employee(int Id, String Name, int Salary) {
		this.id = Id;
		this.name = Name;
		this.salary = Salary;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
				+ "]";
	}

}
