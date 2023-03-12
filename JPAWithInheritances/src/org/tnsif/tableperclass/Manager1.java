package org.tnsif.tableperclass;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Table(name="Manager1")
@Entity
public class Manager1 extends Employee1 {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//private data members
	private Integer deptid;
	private String deptname;
	
	//getters and setters
	public Integer getDeptid() {
		return deptid;
	}
	public void setDeptid(Integer deptid) {
		this.deptid = deptid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
