package com.platform.enquiry.entity;

import java.util.Objects;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EntityScan
public class Enquiry {
	@Id
	long id;
	String name;
	String address;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Enquiry other = (Enquiry) obj;
		return Objects.equals(address, other.address) && id == other.id && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Enquiry [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
