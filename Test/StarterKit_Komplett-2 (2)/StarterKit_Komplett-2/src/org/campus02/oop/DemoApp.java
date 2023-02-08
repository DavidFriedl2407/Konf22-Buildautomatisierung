package org.campus02.oop;

import java.util.HashMap;

public class DemoApp {

	public static void main(String[] args) {
		PersonManager personManager=new PersonManager();
		for (int i = 0; i < 100; i++) {
			personManager.add(createTestPerson());
		}
		GenderAnalyzer genderAnalyzer=new GenderAnalyzer();
		personManager.doAnalysis(genderAnalyzer);
		genderAnalyzer.analyze();
		CountryAnalyzer countryAnalyzer=new CountryAnalyzer();
		personManager.doAnalysis(countryAnalyzer);
		HashMap<String, Integer> countryResult = countryAnalyzer.getHashMap();
		for (String country : countryResult.keySet()) {
			System.out.println(country+" "+countryResult.get(country));
		}
		MaxSalaryAnalyzer maxSalaryAnalyzer=new MaxSalaryAnalyzer();
		personManager.doAnalysis(maxSalaryAnalyzer);
		maxSalaryAnalyzer.analyze();




	}
	
	
	public static Person createTestPerson()
	{
		String[] firstnames = new String[] {"John", "Max", "Susi", "Georg", "Gerald", "Michael", "Steve", "Jörg", "Sebastian", "Louis", "Thomas", "Tom", "Sandra", "Beate", "Birgit"};
		String[] lastnames = new String[] {"Muster", "Doe", "Schultz", "Cuevas", "Rhodes", "Mckenzie", "Taylor", "Glenn", "Reilly", "Morris", "Herman", "Beltran", "Swanson", "Roth"};
		String[] eyeColors = new String[] {"blau", "braun", "grün", "gelb"};
		String[] countries = new String[] {"AT", "DE", "CH", "SI"};
		char[] genders = new char[] {'M', 'F'};
		
		Person p = new Person(
				getRandom(firstnames), getRandom(lastnames), 
				getRandom(genders), 
				(int) (Math.random()* 100.0), 
				getRandom(countries), (int) (Math.random() * 5900) + 1000, 
				getRandom(eyeColors), (int) (Math.random() * 50) + 50,
				(int)(Math.random() * 50) + 160);
		
		
	
		return p;
	}
	
	public static String getRandom(String[] arr)
	{
		return arr[(int) (Math.random() * 100.0) % arr.length];
	}
	
	public static char getRandom(char[] arr)
	{
		return arr[(int) (Math.random() * 100) % arr.length];		
	}
	
}
