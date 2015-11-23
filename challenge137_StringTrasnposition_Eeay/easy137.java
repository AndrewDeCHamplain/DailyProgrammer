import java.util.Arrays;

/**
 * @author Andrew DeChamplain
 *
 */
public class easy137 {

	public static void main(String[] args) {

		String[] input1 = {"Hello, World!"};
		String[] input2 = {"Kernel", "Microcontroller", "Register", "Memory", "Operator"};
		
		easy137 dailyProg = new easy137();
		int arraySize1 = dailyProg.largestString(input1);
		int arraySize2 = dailyProg.largestString(input2);
		
		input1 = dailyProg.padStrings(input1, arraySize1);
		input2 = dailyProg.padStrings(input2, arraySize2);

		input1 = dailyProg.transposition(input1, arraySize1);
		input2 = dailyProg.transposition(input2, arraySize2);
		
		dailyProg.print(input1);
		dailyProg.print(input2);
	}

	/*
	* Function to print an array of Strings
	*/
	private void print(String[] input) {
		for(int i=0; i<input.length; i++){
			System.out.println(input[i]);
		}
	}

	/*
	* Find which string in the array is the longest, this i important to determine 
	* the length of the resulting Array.
	*/
	private int largestString(String[] input){
		int largestLength = 0;
		for(int i=0; i<input.length; i++){
			if(input[i].length()>largestLength){
				largestLength = input[i].length();
			}
		}
		return largestLength;
	}
	
	/*
	* This step is needed so when there are multiple words the longer words dont have their end 
	* letters overlap the previous words
	*/
	private String[] padStrings(String[] input, int maxLength){
		for(int i=0; i<input.length; i++){
			while(input[i].length()<maxLength){
				input[i] = input[i] + " ";
			}
		}
		return input;
	}

	/*
	* The actually trasnposition 
	*/
	private String[] transposition(String[] input, int maxLength){
		
		String[] transposed = new String[maxLength];
		Arrays.fill(transposed, "");
		
		for(int i=0; i<input.length; i++){
			String[] s = input[i].split("");
			for(int j=0; j<s.length; j++){
				transposed[j] = transposed[j] + s[j];
			}
			
		}
		return transposed;
	}
}
