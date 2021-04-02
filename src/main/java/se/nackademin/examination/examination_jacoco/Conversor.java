package se.nackademin.examination.examination_jacoco;

import java.util.ArrayList;

public class Conversor {
	
	private ArrayList<String> nameConverterArray = new ArrayList<String>();
	private ArrayList<String> genderConverterArray = new ArrayList<String>();
	private ArrayList<String> ageConverterArray = new ArrayList<String>();
	private ArrayList<String> cityConverterArray = new ArrayList<String>();
	
	public Conversor() {

	}

	
	public void setGenderConverterArrayValues(){
		this.genderConverterArray.add("man!");
		this.genderConverterArray.add("woman!");
		this.genderConverterArray.add("person!");		
	}
	
	public void setAgeConverterArrayValues(){
		this.ageConverterArray.add("You are young and talented! Things will come your way soon enough! ");
		this.ageConverterArray.add("You are experienced and talented! Things will come your way soon enough!");		
	}	
	
	public void setNameConverterArrayValues(){
		this.nameConverterArray.add("Your first name is smaller than your last name");		
		this.nameConverterArray.add("Your last name is smaller than your first name");
		this.nameConverterArray.add("The lengths of your first name is your last name are the same");
	}
	
	public void setCityConverterArrayValues(){
		this.cityConverterArray.add(" A, ");
		this.cityConverterArray.add(" B, ");
		this.cityConverterArray.add(" C, ");
		this.cityConverterArray.add(" D, ");
		this.cityConverterArray.add(" E, ");
		this.cityConverterArray.add(" F, ");
		this.cityConverterArray.add(" G, ");
		this.cityConverterArray.add(" H, ");
		this.cityConverterArray.add(" I, ");
		this.cityConverterArray.add(" J,");
		this.cityConverterArray.add(" a letter that comes after J, ");
		
	}

	public ArrayList<String> getNameConverterArray() {
		return nameConverterArray;
	}

	public ArrayList<String> getGenderConverterArray() {
		return genderConverterArray;
	}

	public ArrayList<String> getAgeConverterArray() {
		return ageConverterArray;
	}

	public ArrayList<String> getCityConverterArray() {
		return cityConverterArray;
	}
	
}
