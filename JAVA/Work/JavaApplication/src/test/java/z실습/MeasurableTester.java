package z실습;

import java.util.Arrays;

import z실습2.Data;
import z원본.Country;
import z원본.Measurable;

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
        for (Measurable acc : accounts) {
            System.out.println(acc.getMeasure());
        }
        
        Measurable[] countries = new Measurable[3];
        countries[0] = new Country("Uruguay", 176220);
        countries[1] = new Country("Thailand", 513120);
        countries[2] = new Country("Belgium", 30510);
        
        double averageBalance = Data.average(accounts);
        System.out.println("Average balance = " + averageBalance);
        System.out.println("Expected balance = 4000");
        
        Arrays.sort(accounts);
        for (Measurable acc : accounts) { // for ( : account 배열을 acc 라는 double타입을 갖는 measurable 인스턴스로 순서대로 출력 for-each
                                          // 문)
            System.out.println(acc.getMeasure()); // getMeasure !! area 랑 관련됨!
        }
        
        Comparable[] countries = new Comparable[3];
        countries[0] = new Country("Uruguay", 176220);
        countries[1] = new Country("Thailand", 513120);
        countries[2] = new Country("Belgium", 30510);
        
        Arrays.sort(countries);
        for (Comparable bcc : countries) { // for ( : account 배열을 acc 라는 double타입을 갖는 measurable 인스턴스로 순서대로 출력 for-each
                                           // 문)
            System.out.println(bcc.getComparable());
        }
    }
}
