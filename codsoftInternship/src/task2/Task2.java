package task2;

import java.util.Scanner;
public class Task2 {
		public static void main(String[] args) {
					Scanner sc=new Scanner(System.in);
					System.out.println("enter Number of subjects");
					int n=sc.nextInt();
					int []ar=new int[n];
					int StudentTotalMarks=0;  
					for(int i=0; i<ar.length; i++)
					{
						System.out.println("Enter marks for subject"+ i+1 +":");
						ar[i]=sc.nextInt();
						StudentTotalMarks=StudentTotalMarks+ar[i];
				}
					
					
					System.out.println("total marks:"+StudentTotalMarks);
					double AP=(double)StudentTotalMarks/n;
					System.out.println("Average percentage:"+AP);
					char grade=calculGrade(AP);
					System.out.println("Gradc:"+grade);
				}

				public static char calculGrade(double P) {
					if(P>=90) {
						return 'A';
					}
					else if(P>=80)
					{
						return'B';
					}
					else if(P>=70) {
					return 'C';
				}
					else if(P>=60) {
						return 'D';
					}
					else {
						return 'F';
					}
				}
				
			}


		







