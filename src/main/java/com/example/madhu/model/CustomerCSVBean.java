package com.example.madhu.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;

import lombok.Data;

@Data
public class CustomerCSVBean {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@CsvBindByPosition(position = 0)
	@CsvBindByName(column = "id")
	private int id;

	@CsvBindByPosition(position = 1)
	@CsvBindByName(column = "first_name")

	private String firstName;

	@CsvBindByPosition(position = 2)
	@CsvBindByName(column = "last_name")
	private String lastName;

	@CsvBindByPosition(position = 3)
	@CsvBindByName(column = "streetaddress")
	private String streetaddress;

	@CsvBindByPosition(position = 4)
	@CsvBindByName(column = "streetaddressline")
	private String streetaddressline;

	@CsvBindByPosition(position = 5)
	@CsvBindByName(column = "city")
	private String city;

	@CsvBindByPosition(position = 6)
	@CsvBindByName(column = "state")
	private String state;

	@CsvBindByPosition(position = 7)
	@CsvBindByName(column = "postal")
	private long postal;

	@CsvBindByPosition(position = 8)
	@CsvBindByName(column = "phonenumber")
	private long phonenumber;

	@CsvBindByPosition(position = 9)
	@CsvBindByName(column = "email")
	private String email;

	@CsvBindByPosition(position = 10)
	@CsvBindByName(column = "howdidyouhereaboutus")
	private String Howdidyouhereaboutus;

	@CsvBindByPosition(position = 11)
	@CsvBindByName(column = "feedbackaboutus")
	private String Feedbackaboutus;

	@CsvBindByPosition(position = 12)
	@CsvBindByName(column = "suggestionsifanyforfurtherimprovement")
	private String Suggestionsifanyforfurtherimprovement;

	@CsvBindByPosition(position = 13)
	@CsvBindByName(column = "willyoubewillingtorecommendus")
	private String Willyoubewillingtorecommendus;

}
