package smsdemoapp.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import smsdemoapp.utility.SmsDemoEnum;

@Entity
@Table(name="details")
public class SmsDemoDetail implements Serializable {

	@Id
	public Integer id;
	
	public String city;
	
	@Column(name="start_date")
	public String startDate;
	
	@Column(name="end_date")
	public String endDate;
	
	public Double price;
	
	public String color;
	
	public String status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endtDate) {
		this.endDate = endtDate;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
