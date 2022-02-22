package assignment02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class AssignmentTwo {

	
		
		public static void Prob1(ArrayList<String> S1)
		{
			Map<String,Integer> ma1=new HashMap<String,Integer>();
			
			for(String sr : S1)
				
			{
				if(ma1.containsKey(sr))
				{
					ma1.put(sr, ma1.get(sr) + 1);
				}
				else
				{
					ma1.put(sr,1);
				}
			}
			
			System.out.println(ma1);
		}
		

		public static Map<String, String> Prob2(ArrayList<String> S1)
		{
			Map<String, String> ma2 = new HashMap<String, String>();

			for (String s : S1) {
				if(ma2.containsKey(s.substring(0,1)))
				{
					String w=ma2.get(s.substring(0,1));
					ma2.put(s.substring(0,1), w+s);
					
				}
				else
					ma2.put(s.substring(0,1), s);
			}
			return ma2;

		}
		
		
		public static Set<Integer> Prob3(ArrayList<Integer> A1)
		{
			Set<Integer> S=new LinkedHashSet<Integer>();
			for(int i:A1)
			{			
				while(!S.add(i))
				{
					
					i=i+1;
				}
			}
			
			return S;
		}
		
		
		public static ArrayList<String> Prob4(ArrayList<String> A1) {

			ArrayList<String> A2 = new ArrayList<String>();
			for (String s : A1) {
				char s1[] = s.toCharArray();
				
				int n = s1.length;
				int ind = 0;

				for (int i = 0; i < n; i++) {

					int j;
					for (j = 0; j < i; j++) {
						if (s1[i] == s1[j]) {
							break;
						}
					}

					if (j == i) {
						s1[ind++] = s1[i];
					}
				}
				

				A2.add(String.valueOf(Arrays.copyOf(s1, ind)));
			}
			return A2;
		}

		


		public static Map<String, String> Prob05(ArrayList<String> A) {
			Map<String, String> M = new HashMap<String, String>();

			for (String a : A) {
				
				M.put(a.substring(0,1), a.substring(a.length() - 1, a.length()));
			}
			
			return M;
		}
		

		public static Map<String,Boolean> Prob6(ArrayList<String> S1)
		{
			Map<String,Boolean> M1=new HashMap<String,Boolean>();
			
			for(String s:S1)
			{
				if(M1.containsKey(s))
				{
					M1.put(s, true);
				}else {
					M1.put(s, false);
				}
				}
			
			return M1;
		}

			
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			   Scanner sc = new Scanner(System.in);

				System.out.println("        problem01       ");

				ArrayList<String> a1 = new ArrayList<String>();
				
				System.out.println("Enter no.of elements");
				int n1 = sc.nextInt();
				for (int i = 0; i < n1; i++) {
					System.out.println("Enter the elements");
					String s1 = sc.next();
					
					a1.add(s1);
				}
				
				AssignmentTwo.Prob1(a1);
				
				
				System.out.println("               problem02                 ");
				
				System.out.println("Enter no.of elements");
				int n2 = sc.nextInt();		
				ArrayList<String> a2=new ArrayList<String>();
				for (int i = 0; i < n2; i++) {
					
					System.out.println("Enter the elements");
					String s2 = sc.next();
					a2.add(s2);
				}
				System.out.println(Prob2(a2));


				System.out.println("                   problem03              ");

				System.out.println("Enter no.of elements");
				int n3 = sc.nextInt();		
				ArrayList<Integer> a3=new ArrayList<Integer>();
				for (int i = 0; i < n3; i++) {
					
					System.out.println("Enter the elements");
					int n = sc.nextInt();
					a3.add(n);
				}
				
				Set<Integer> set=Prob3(a3);
				
			  System.out.println(set);

				
				
			  System.out.println("                  problem4              ");

			  System.out.println("Enter no.of elements");
				int n4 = sc.nextInt();		
				ArrayList<String> a4=new ArrayList<String>();
				for (int i = 0; i < n4; i++) {
					System.out.println("Enter the elements");
					String s3 = sc.next();
					a4.add(s3);
				}
				System.out.println(Prob4(a4));
				
 System.out.println("                  problem5                  ");

				 System.out.println("Enter no.of elements");
					int n5 = sc.nextInt();			
				ArrayList<String> a5=new ArrayList<String>();
				
				for (int i = 0; i < n5; i++) {
					System.out.println("Enter the elements");
					String st5 = sc.next();
					a5.add(st5);
				}
				
				System.out.println(Prob05(a5));

				
				System.out.println("              problem6             ");

				System.out.println("Enter no.of elements");
				int n6 = sc.nextInt();		
				ArrayList<String> a6=new ArrayList<String>();
				for (int i = 0; i < n6; i++) {
					
					System.out.println("Enter the elements");
					String s6 = sc.next();
					a6.add(s6);
				}
				
				
				System.out.println(Prob6(a6));

			}
			



}
