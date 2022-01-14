package net.javaguides.springboot.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document
public class User {
	
	@Id

    private String id;
    private String name;
    private String username;
    private String email;
    private String address;
    private long phone;
    private String website;
    private String company;
    

    public User() 
    {

    }


	public User(String id, String name, String username, String email, String address, long phone, String website,
			String company) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.email = email;
		this.address = address;
		this.phone = phone;
		this.website = website;
		this.company = company;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public long getPhone() {
		return phone;
	}


	public void setPhone(long phone) {
		this.phone = phone;
	}


	public String getWebsite() {
		return website;
	}


	public void setWebsite(String website) {
		this.website = website;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}
    
}
    