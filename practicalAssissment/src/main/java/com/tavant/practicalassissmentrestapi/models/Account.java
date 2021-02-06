package com.tavant.practicalassissmentrestapi.models;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name = "Account")
public class Account {

	@Id	
	@NotBlank(message =" accountNumber should not be empty")
	private Integer AccountNumber;
	
	@NotBlank(message =" accountid should not be empty")
	private String AccountID;
	
	@NotBlank(message =" ifsccode should not be empty")
	private String IFSCCODE;
	
	@NotBlank(message =" BankName should not be empty")
	private String BankName;
	
	@NotBlank(message =" Branch should not be empty")
	private String Branch;

	public int compareTo(Account c) {
		// TODO Auto-generated constructor stub
		return 0;
	}

	
}
