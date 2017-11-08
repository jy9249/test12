package Z완성본;

import java.util.Arrays;

public class MeasurableTester {

	public static void main(String[] args) {
		Measurable[] accounts = new Measurable[3];
		accounts[0] = new BankAccount();
		accounts[1] = new BankAccount(10000);
		accounts[2] = new BankAccount(2000);
		
		double averageBalance = Data.average(accounts);
		System.out.println("Average balance = " + averageBalance);
		System.out.println("Expected balance = 4000");
		
		Arrays.sort(accounts);
		for(Measurable acc: accounts) {
			System.out.println(acc.getMeasure() );
		}
		
		Measurable[] countries = new Measurable[3];
		countries[0] = new Country("Uruguay", 176220);
		countries[1] = new Country("Thailand", 513120);
		countries[2] = new Country("Belgium", 30510);
		
		double averageArea = Data.average(countries);
		System.out.println("Average area = " + averageArea);
		System.out.println("Expected area = 239950");
		
		Measurable largerOne = Data.larger(countries[0], countries[1]);
		Country largerCountry = (Country) largerOne;
		String name = largerCountry.getName();
		System.out.println("Between " + ((Country)countries[0]).getName() + " and " +
				((Country)countries[1]).getName() + ", " + name + " is larger.");

		Arrays.sort(countries);
		for(Measurable cou: countries) {
			System.out.println(cou.getMeasure() );
		}
	}

}
