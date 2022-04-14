package myproject.inheritancemapping.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy =InheritanceType.TABLE_PER_CLASS)
public class Person {

	@Id
	@Column
	private String pname;
	@Column
	private String paddr;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPaddr() {
		return paddr;
	}
	public void setPaddr(String paddr) {
		this.paddr = paddr;
	}
	
	
}
