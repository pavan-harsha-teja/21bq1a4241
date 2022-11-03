import java.util.Scanner; 
public class ElectricityBill { 
public static void main(String args[]) { 
 Scanner var = new Scanner(System.in); 
 System.out.println("Enter Customer Number : "); 
 int customerNo = var.nextInt(); 
 var.nextLine(); 
 System.out.println("Enter Customer Name : "); 
 String customerName = var.nextLine(); 
 System.out.println("Enter Previous Month Reading : "); 
 double prevMonthReading = var.nextDouble(); 
 System.out.println("Enter Current Month Reading : "); 
 double currMonth = var.nextDouble(); 
 System.out.println("Enter Type of EB Connection : "); 
 System.out.println("\n1.Domestic \n2.Commercial "); 
 int type = var.nextInt(); 
 var.close(); 
 double TotalBill = 0.0; 
 if(type == 1) { 
 if(currMonth>=0 && currMonth<=100) { 
 TotalBill = currMonth; 
 } 
 else if(currMonth>100 && currMonth<=200) { 
 TotalBill = 100 + (currMonth - 100)*2.5; 
 } 
 else if(currMonth>200 && currMonth <=500) { 
 TotalBill = 100 + 100*2.5 + (currMonth-200)*4; 
 } 
 else if(currMonth>500) { 
 TotalBill = 100 + 100*2.5 + 300*4 + (currMonth-500)*6; 
 } 
 else { 
 System.out.println("Invalid Value"); 
 } 
 } 
 else if (type == 2) { 
 if(currMonth>=0 && currMonth<=100) { 
 TotalBill = currMonth*2; 
 } 
 else if(currMonth>100 && currMonth<=200) { 
 TotalBill = 200 + (currMonth - 100)*4.5; 
 } 
 else if(currMonth>200 && currMonth <=500) { 
 TotalBill = 200 + 100*4.5 + (currMonth-200)*6; 
 } 
 else if(currMonth>500) { 
 TotalBill = 200 + 100*4.5 + 300*6 + (currMonth-500)*7; 
 } 
 else { 
 System.out.println("Invalid Value"); 
 } 
 } 
 else { 
 System.out.println("Invalid Type Of EB"); 
 } 
 if(TotalBill<0.0) { 
 System.out.println("Invalid Credentials\n Please Check 
Again"); 
 } 
 
else { 
 System.out.println("Customer Number : " + customerNo); 
 System.out.println("Customer Name : " + customerName); 
 System.out.println("Previous Month Reading : " + prevMonthReading); 
 System.out.println("Current Month Reading : " + currMonth); 
if(type ==1) { 
 System.out.println("Type Of EB Connection : " +"Domestic"); 
 } 
else { 
 System.out.println("Type Of EB Connection : " + "Commercial"); 
 } 
 System.out.println("\n Total Bill : " + TotalBill); 
 } 
 } 
}