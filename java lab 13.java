import java.util.Random; 
class GenerateRandomInt extends Thread { 
 Random R = new Random(); 
public void run() { 
 for(int i=0;i<10;i++) { 
 int num = 1 + R.nextInt(20); // From 1 to 20
 PrintSquare PS = new PrintSquare(num); 
 PrintCube PC = new PrintCube(num); 
 if(num%2==0) { 
 PS.start(); 
 } 
 else { 
 PC.start(); 
 } 
 try { 
 sleep(1000); // sleeps for 1 sec 
 } 
 catch(InterruptedException e) { 
 System.out.println("Exception Caught"); 
 } 
 } 
 } 
} 
class PrintSquare extends Thread { 
int num; 
 PrintSquare(int x){ 
 num = x; 
 } 
public void run() { 
 System.out.println("Square of " + num + ": " + num*num); 
 } 
} 
class PrintCube extends Thread { 
int num; 
 PrintCube(int x){ 
 num = x; 
 } 
public void run() { 
 System.out.println("Cube of " + num + ": " + num*num*num); 
 } 
} 
public class RandomIntegerThread { 
public static void main(String[] args) { 
 GenerateRandomInt GR = new GenerateRandomInt(); 
GR.start(); 
}
}