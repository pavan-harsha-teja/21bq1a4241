public class SavingsAccount { 
static double annualInterestRate; 
private double savingsBalance; 
 SavingsAccount(double bal){ 
 savingsBalance = bal; 
 } 
 
double calculateMonthlyInterest() { 
 return savingsBalance + savingsBalance*annualInterestRate/12; 
 } 
static void modifyInterestRate(double newRate) { 
 annualInterestRate = newRate; 
 } 
} 
import java.util.Scanner; 
public class SavingsAccountTest { 
public static void main(String[] args) { 
 Scanner var = new Scanner(System.in); 
 System.out.print("Enter Interest Rate : "); 
 double rate = var.nextDouble(); 
 var.close(); 
 SavingsAccount saver1 = new SavingsAccount(2000); 
 SavingsAccount saver2 = new SavingsAccount(3000); 
 SavingsAccount.modifyInterestRate(rate); 
 double saver1Balance = saver1.calculateMonthlyInterest(); 
 double saver2Balance = saver2.calculateMonthlyInterest(); 
 System.out.println("New Balance of Saver1 = " + saver1Balance); 
 System.out.println("New Balance of Saver2 = " + saver2Balance); 
 } 
} 
