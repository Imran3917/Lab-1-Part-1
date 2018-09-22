import java.util.Scanner;

public class PartOne {
	
	//separate method for calculations
		public static void computeNumbers() {
			
			//variables for number storage
					int num1,num2,length;
					//hundreds, tens and ones variables
					int hundreds1,tens1,ones1;
					int hundreds2,tens2,ones2;
					
					//input variable
					Scanner input=new Scanner(System.in);
					//prompt for first number input
					System.out.print("Enter first 3 digits number: ");
					num1=input.nextInt();
					
					//calculate number length
					length = String.valueOf(num1).length();
					//check on length of number
					while(length!=3) {
						System.out.print("Please enter only 3 digit number: ");
						num1=input.nextInt();
						length = String.valueOf(num1).length();
					}
					
					//calculate hundredth, tenth and ones unit
					hundreds1 = num1/100;
					num1 = num1%100;
					tens1 = num1/10;
					ones1 = num1%10;
					
					
					//prompt for second number input
					System.out.print("Enter second 3 digits number: ");
					num2=input.nextInt();
					length = String.valueOf(num2).length();
					//check on length of number
					while(length!=3) {
						System.out.print("Please enter only 3 digit number: ");
						num2=input.nextInt();
						length = String.valueOf(num2).length();
					}
					
					//calculate hundredth, tenth and ones place
					hundreds2 = num2/100;
					num2 = num2%100;
					tens2 = num2/10;
					ones2 = num2%10;
					
					
					//check if corresponding sums are equal
					if((hundreds1+hundreds2) == (tens1+tens2) && (tens1+tens2) == (ones1 + ones2))
						//print True
						System.out.println("Result: True");
					else
						//otherwise print False
						System.out.println("Result: False");	
					
					//close input scanner
					input.close();
				}
				
				//main function
				public static void main(String[] args) {
					//call function
					computeNumbers();
				
			
		}




}
