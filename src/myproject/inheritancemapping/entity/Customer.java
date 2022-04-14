package myproject.inheritancemapping.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cust")
public class Customer extends Person {

	@Column
	private String cid;
	@Column
	private String cmobile;
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCmobile() {
		return cmobile;
	}
	public void setCmobile(String cmobile) {
		this.cmobile = cmobile;
	}
	
	
}
