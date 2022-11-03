class Binary { 
int Search(int arr[], int lb, int ub, int key){ 
 int mid; 
 while(ub>=lb) { 
 mid = lb+(ub-lb)/2; 
 if(arr[mid]==key) { 
 return mid; 
 } 
 else if(arr[mid]>key) { 
 ub = mid-1; 
 } 
 else{ 
 lb = mid+1; 
 } 
 } 
 return -1; 
 } 
} 
import java.util.Scanner; 
public class BinarySearch { 
public static void main(String args[]) { 
 int a[] = {1,2,3,4,5,6,7,8,9}; // Works Only For sorted lists 
 int size = a.length; 
 Scanner var = new Scanner(System.in); 
 System.out.print("Enter A Number : "); 
 int num = var.nextInt(); 
 var.close(); 
 Binary B = new Binary(); 
 int res = B.Search(a, 0, size-1, num); 
 if(res==-1) { 
 System.out.println("Number NOT Found"); 
 } 
 else { 
 System.out.println(num + " is found at index " + res); 
 } 
 } 
} 
