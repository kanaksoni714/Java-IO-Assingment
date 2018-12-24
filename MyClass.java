//create a class "MyClass".
//create 5 different objects of it.
//add them in an arraylist.
//store arraylist in file.
//Now open a file, read arraylist and display all objects.
//HINT:- Use Serialization and Desrialization with Collection
//import java.nio.file.*;
//
//Path path = Paths.get(filePathString);
//
//if (Files.exists(path)) {
//  // file exist
//}
//
//if (Files.notExists(path)) {
//  // file is not exist
//}
import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class MyClass implements Serializable {
	public String teacher;
	public String student;
	public String books;
	public String housekeepingstaff;
	public String assembly;

	public MyClass(String teacher, String student, String books,
			String housekeepingstaff, String assembly) {
		this.teacher = teacher;
		this.student = student;
		this.books = books;
		this.housekeepingstaff = housekeepingstaff;
		this.assembly = assembly;

	}

	/**
	 * @return the teacher
	 */
	public String getTeacher() {
		return teacher;
	}

	/**
	 * @return the student
	 */
	public String getStudent() {
		return student;
	}

	/**
	 * @return the books
	 */
	public String getBooks() {
		return books;
	}

	/**
	 * @return the housekeepingstaff
	 */
	public String getHousekeepingstaff() {
		return housekeepingstaff;
	}

	/**
	 * @return the assembly
	 */
	public String getAssembly() {
		return assembly;
	}

	public void Arraylist() {

		List<String> list = new ArrayList();
		list.add("Teacher");
		list.add("student");
		list.add("books");
		list.add("housekeepingstaff");
		list.add("assembly");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MyClass [teacher=" + teacher + ", student=" + student
				+ ", books=" + books + ", housekeepingstaff="
				+ housekeepingstaff + ", assembly=" + assembly + "]";
	}

}
