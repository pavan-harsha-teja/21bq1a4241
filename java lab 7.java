import java.util.Random; 
public class RandomDice { 
public static void main(String[] args) { 
 Random R = new Random(); 
 int count1=0, count2=0, count3=0, count4=0,count5=0,count6=0; 
 int dice1,dice2; 
 for(int i=1;i<=10000;i++) { 
 dice1 = 1+R.nextInt(6); 
 dice2 = 1+R.nextInt(6); 
 
 if(dice1==dice2) { 
 switch(dice1) { 
case 1: 
 count1++; 
break; 
 case 2: 
 count2++; 
break; 
 case 3: 
 count3++; 
break; 
 case 4: 
 count4++; 
 case 5: 
 count5++; 
break; 
 case 6: 
 count6++; 
break; 
 } 
 } 
 } 
 System.out.println("Frequency of 1 : " + count1); 
 System.out.println("Frequency of 2 : " + count2); 
 System.out.println("Frequency of 3 : " + count3); 
System.out.println("Frequency of 4 : " + count4); 
 System.out.println("Frequency of 5 : " + count5); 
 System.out.println("Frequency of 6 : " + count6); 
}
}