package model;


import javax.persistence.*;

@Entity
public class Contact {
	@Id
	private int id;
	
	
	@Column(length=40)
	private String name;
	
	@Column(length=40)	
	private String email;
	
	@Column(length=12)
	private String phone;
	
	@Column(length=40)
	private String companyName;
	
	@Column(length=40)
	private String information;
	
	@Column(length=40)
	private String created_by;
	
	@Column(length=40)
	private String updated_by;
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public String getUpdated_by() {
		return updated_by;
	}

	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}

	public void setName(String name) {
		this.name = name;
	}

}
