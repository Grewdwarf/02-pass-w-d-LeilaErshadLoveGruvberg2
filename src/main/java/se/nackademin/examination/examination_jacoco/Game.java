package se.nackademin.examination.examination_jacoco;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {

	private ResultFromInputs resultFromInputs = new ResultFromInputs();
	
	
	public void run(ArrayList<String> values){
		DataAnalysis dataAnalysis = new DataAnalysis();
		getGenderFromInputValues(values);
		getAgeFromInputValues(values);		
		System.out.println(dataAnalysis.buildFinalString(values));
		runGame(values.get(0),values.get(1),values.get(2),getGenderFromInputValues(values),getAgeFromInputValues(values),values.get(5));
	}
	
	
	
	public ArrayList<String> collectInputData(){
		ArrayList<String> resultArray = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		String inputValue = "";
		System.out.println("Enter the name of the Game (String):");
		inputValue = scanner.nextLine();
		resultArray.add(inputValue);
		System.out.println("Enter your first name (String):");
		inputValue = scanner.nextLine();
		resultArray.add(inputValue);
		System.out.println("Enter your last name (String)");
		inputValue = scanner.nextLine();
		resultArray.add(inputValue);
		System.out.println("Enter your gender(Char):");
		inputValue = scanner.nextLine();
		resultArray.add(inputValue);
		System.out.println("Enter your age (int):");
		inputValue = scanner.nextLine();
		resultArray.add(inputValue);
		System.out.println("Enter your homecity (String):");
		inputValue = scanner.nextLine();
		resultArray.add(inputValue);
		
		return resultArray;
	}
	
	public char getGenderFromInputValues(ArrayList<String> arrayOfInputs){
		char genderCharacter = arrayOfInputs.get(3).charAt(0);	
		return genderCharacter;		
	}	
	
	public int getAgeFromInputValues(ArrayList<String> arrayOfInputs){
		int ageValue = Integer.parseInt(arrayOfInputs.get(4));	
		return ageValue;
	}
	

	public void runGame(String gameName, String firstName, String lastName, char gender, int age, String homeCity) {
		System.out.println("#####################-- "+gameName+" --#####################");
		int valueName = calculateOutPutBasedOnNames(firstName, lastName);
		int valueGender = calculateOutPutBasedOnGender(gender);
		int valueAge = calculateOutPutBasedOnAge(age);
		int valueHomecity = calculateOutPutBasedOnHomeCity(homeCity);

		resultFromInputs.setResultForNameLenght(valueName);
		resultFromInputs.setResultForGender(valueGender);
		resultFromInputs.setResultForAge(valueAge);
		resultFromInputs.setResultForHomeCity(valueHomecity);
		Conversor conversor = new Conversor();
		buildFinalString(firstName, lastName, this.resultFromInputs, conversor);

	}

	

	public int calculateOutPutBasedOnNames(String firstName, String lastName) {
		if (firstName.length() < lastName.length()) {
			return 0;
		}
		if (firstName.length() > lastName.length()) {
			return 1;
		} else {
			return 2;
		}
	}

	public int calculateOutPutBasedOnGender(char gender) {
		if (gender == 'M') {
			return 0;
		}if (gender == 'F') {
			return 1;
		}
		return 2;
	}

	public int calculateOutPutBasedOnAge(int age) {
		if (age <= 25) {
			return 0;
		} else {
			return 1;
		}
	}

	public int calculateOutPutBasedOnHomeCity(String homeCity) {
		if (homeCity.substring(0, 1).equalsIgnoreCase("a")) {
			return 0;
		}if (homeCity.substring(0, 1).equalsIgnoreCase("b")) {
			return 1;
		}if (homeCity.substring(0, 1).equalsIgnoreCase("c")) {
			return 2;
		}if (homeCity.substring(0, 1).equalsIgnoreCase("d")) {
			return 3;
		}if (homeCity.substring(0, 1).equalsIgnoreCase("e")) {
			return 4;
		}if (homeCity.substring(0, 1).equalsIgnoreCase("f")) {
			return 5;
		}if (homeCity.substring(0, 1).equalsIgnoreCase("g")) {
			return 6;
		}if (homeCity.substring(0, 1).equalsIgnoreCase("h")) {
			return 7;
		}if (homeCity.substring(0, 1).equalsIgnoreCase("i")) {
			return 8;
		}if (homeCity.substring(0, 1).equalsIgnoreCase("j")) {
			return 9;
		} else {
			return 10;
		}
	}
	
	public void buildFinalString(String firstName, String lastName, ResultFromInputs resultFromInputs, Conversor conversor) {
		conversor.setNameConverterArrayValues();
		conversor.setAgeConverterArrayValues();
		conversor.setGenderConverterArrayValues();
		conversor.setCityConverterArrayValues();

		int gender = resultFromInputs.getResultForGender();
		int age = resultFromInputs.getResultForAge();
		int name = resultFromInputs.getResultForNameLenght();
		int homecity = resultFromInputs.getResultForHomeCity();

		System.out.println(firstName + " " + lastName + ", your are a great " + conversor.getGenderConverterArray().get(gender));
		System.out.println(conversor.getAgeConverterArray().get(age));
		System.out.println(conversor.getNameConverterArray().get(name)+ " and combining that with the first letter of your homecity, i.e. "+conversor.getCityConverterArray().get(homecity) );
		System.out.println("it seems that you are a dedicated student and will be a great Software Tester Engineer!");

	}
}
