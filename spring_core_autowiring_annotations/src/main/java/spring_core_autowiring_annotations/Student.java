package spring_core_autowiring_annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	String name;
	int roll;
	@Autowired
	@Qualifier("addr1")
	Address addr;

	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}
	   // @Autowired
	public Student(Address addr) {
		super();
		this.addr = addr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public Address getAddr() {
		return addr;
	}
	   // @Autowired
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", addr=" + addr + "]";
	}
	
}
