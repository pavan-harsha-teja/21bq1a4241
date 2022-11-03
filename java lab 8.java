public class Programmer extends Employee { 
double BP; 
 
double DA,HRA,PF,clubfund,GP,NP; 
 
 Programmer(double x){ 
 BP = x; 
 DA = BP*0.97; 
 HRA = BP*0.1; 
 PF = BP*0.12; 
 clubfund = BP*0.001; 
 
 GP = BP+DA+HRA+PF; 
 NP = GP-PF-clubfund; 
 } 
 
void display() 
 { 
 System.out.println("\nBasic pay : "+BP); 
 System.out.println("Dear Allowance : "+DA); 
 System.out.println("House Rent Allowance : "+HRA); 
 System.out.println("Provident Fund : "+PF); 
 System.out.println("Gross salary : "+GP); 
 System.out.println("Net salary : "+NP); 
 } 
} 
public class Professor extends Employee { 
double BP; 
double DA,HRA,PF,clubfund,GP,NP; 
 Professor(double x){ 
 BP = x; 
 DA = BP*0.97; 
 HRA = BP*0.1; 
 PF = BP*0.12; 
 clubfund = BP*0.001; 
 GP = BP+DA+HRA+PF; 
 NP = GP-PF-clubfund; 
 } 
 
void display() 
 { 
 System.out.println("\nBasic pay : "+BP); 
 System.out.println("Dear Allowance : "+DA); 
 System.out.println("House Rent Allowance : "+HRA); 
 System.out.println("Provident Fund : "+PF); 
 System.out.println("Gross salary : "+GP); 
 System.out.println("Net salary : "+NP); 
 } 
} 
public class AssociateProfessor extends Employee { 
double BP; 
double DA,HRA,PF,clubfund,GP,NP; 
 AssociateProfessor(double x){ 
 BP = x; 
 BP = x; 
 DA = BP*0.97; 
 HRA = BP*0.1; 
 PF = BP*0.12; 
 clubfund = BP*0.001; 
  GP = BP+DA+HRA+PF; 
 NP = GP-PF-clubfund; 
 } 
void display() 
 { 
 System.out.println("\nBasic pay : "+BP); 
 System.out.println("Dear Allowance : "+DA); 
 System.out.println("House Rent Allowance : "+HRA); 
 System.out.println("Provident Fund : "+PF); 
 System.out.println("Gross salary : "+GP); 
 System.out.println("Net salary : "+NP); 
 } 
} 
public class AssistantProfessor extends Employee { 
double BP=0.0; 
double DA,HRA,PF,clubfund,GP,NP; 
 AssistantProfessor(double x){ 
 BP = x; 
 DA = BP*0.97; 
 HRA = BP*0.1; 
 PF = BP*0.12; 
 clubfund = BP*0.001; 
  GP = BP+DA+HRA+PF; 
 NP = GP-PF-clubfund; 
 } 
void display() 
 { 
 System.out.println("\nBasic pay : "+BP); 
 System.out.println("Dear Allowance : "+DA); 
 System.out.println("House Rent Allowance : "+HRA); 
 System.out.println("Provident Fund : "+PF); 
 System.out.println("Gross salary : "+GP); 
 System.out.println("Net salary : "+NP); 
 } 
} 
public class Employee { 
 String Emp_name; 
int Emp_id; 
 String Address; 
 String Mail_id; 
int Mobile_no; 
 Employee(){ 
 } 
 Employee(String name, int id, String add, String mail, int mob){ 
 Emp_name = name; 
 Emp_id = id; 
 Address = add; 
 Mail_id = mail; 
 Mobile_no = mob; 
 } 
 void display() { 
 System.out.println("Employee Name : " + Emp_name); 
 System.out.println("Employee ID : " + Emp_id); 
 System.out.println("Employee Mail : " + Mail_id); 
 System.out.println("Mobile : " + Mobile_no); 
 System.out.println("Address : " + Address); 
 } 
 
} 
import java.util.Scanner; 
public class Payslip { 
public static void main(String[] args) { 
 Scanner var = new Scanner (System.in); 
 System.out.println("\n 1.Programmer \n 2.Professor\n 3.Associate 
Professor\n 4. Assistant Professor\n"); 
 System.out.print("Enter an Option : "); 
 int opt = var.nextInt(); 
 System.out.println(); 
 switch(opt) { 
 case 1: 
 Programmer P1 = new Programmer(75000.0); 
 Employee E1 = new
Employee("Jaswanth",1515757,"Tenali","vvit123@gmail.com",1234567)
E1.display(); 
 P1.display(); 
20BQ1A0555 33
 break; 
 case 2: 
 Professor Pro = new Professor(60000.0); 
 Employee E2 = new
Employee("Someone",1278653,"Tenali","vvit456@gmail.com",1234567); 
 E2.display(); 
 Pro.display(); 
 break; 
 case 3: 
 AssociateProfessor AsoPro = new AssociateProfessor(50000.0); 
 Employee E3 = new Employee("No 
One",1243567,"Tenali","vvit789@gmail.com",1234567); 
 E3.display(); 
 AsoPro.display(); 
 break; 
 case 4: 
 AssistantProfessor Assi = new AssistantProfessor(45000.0); 
 Employee E4 = new
Employee("Anyone",1543627,"Tenali","vvit9999@gmail.com",1234567); 
 E4.display(); 
 Assi.display(); 
 default: 
 System.out.println("Invalid Option")
} 
 var.close(); 
}
}