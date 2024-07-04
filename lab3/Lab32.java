package lab3;
import java.util.*;
import java.lang.*;
import java.util.Arrays;
public class Lab32{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		String words[] = new String[n];
		for(int i=0;i<words.length;i++){
			System.out.println("Enter word : ");
			words[i] = sc.next();
		}
		int randomInd = (int)(Math.random()*n-1);
		System.out.println("Enter any word : ");
		String userword = sc.next();
		String randomword = words[randomInd];
		 char arr1[] = randomword.toCharArray();
		 char arr2[] = userword.toCharArray();
		if(randomword.length()==userword.length()){
			Arrays.sort(arr1);
			Arrays.sort(arr2);
		}else{
			System.out.println("Not anagram");
			return;
		}
		int c=0;
		for(int i=0;i<arr1.length;i++){
			if(arr1[i] != arr2[i]){
				c++;
			}
		}
		if(c==0){
			System.out.println("anagram");
		}else{
			System.out.println("not anagram ::"+randomword);
		}
	}
}