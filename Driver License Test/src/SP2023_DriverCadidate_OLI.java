//SP2023_DriverCadidate_OLI
//SP2023_LAB6PART2_OLI
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

class SP2023_DriverCadidate_OLI {
	
	// DATA MEMBERS
private String last_name;
private String first_name;
private String SSNumber;
private String address;
private char[] answerArray = new char[25];
private String driverLicense = "";

//NO-ARGUMENT CONSTRUCTOR
public SP2023_DriverCadidate_OLI()
{
	
}
//Parameterized constructor
public SP2023_DriverCadidate_OLI(String last_name,String first_name,String SSNumber,String address,char[] answerArray)
{
	this.last_name = last_name;
	this.first_name = first_name;
	this.SSNumber = SSNumber;
	this.address = address;
	this.answerArray = answerArray;
}
public static String generatedriverlicense() {
	Random input = new Random();
	int value1 = input.nextInt(9)+0;
	int value2 = input.nextInt(9)+0;
	int value3 = input.nextInt(9)+0;
	int value4 = input.nextInt(9)+0;
	int value5 = input.nextInt(9)+0;
	int value6 = input.nextInt(9)+0;
	int value7 = input.nextInt(9)+0;
	int value8 = input.nextInt(9)+0;
	
	return String.valueOf(value1)+String.valueOf(value2)+String.valueOf(value3)+String.valueOf(value4)+String.valueOf(value5)+String.valueOf(value6)+String.valueOf(value7)+String.valueOf(value8);
	
}


//Method to evaluate result and generate driver's license
public void evaluateResult(char keySet[], char answerArray[]) {

int[] missed = new int[keySet.length];

int totalCorrect = 0;

int incorrectCount = 0;

for (int i = 0; i < keySet.length; i++) {

if (keySet[i] == answerArray[i]) {

totalCorrect++;

} else {

missed[incorrectCount] = (i+1);

incorrectCount++;

}

}

if (totalCorrect >=20) {

System.out.println("Result:                        PASSED");

} else {

System.out.println("Result:                        FAILED");

}

System.out.print("Missed Questions:");
System.out.print("             ");

for (int i = 0; i < incorrectCount; i++) {

System.out.print(missed[i]);

if (i != incorrectCount - 1) {

System.out.print(",");

}

}

System.out.println();

}



// Method to print result
 @Override
public String toString() {
	 
    SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
    String testDate = dateFormat.format(new Date());
    String finalResult = 
    "SP2023_DriverLicenseComputerTest_OLI.java"+"\n"+		
    "DRIVER TEST RESULT - " + "REJIM" + " " + "OLI" + "\n"+
    "---------------------------------------------------"+"\n"+
    "Driver's name: " +"            " +last_name + ", " + first_name + "\n"+
    "SS Number: " +"                 " +SSNumber +"\n"+
    "Address: " + address + "\n"+
    "Driver's License: " + "           "+generatedriverlicense() + "\n"+
    "Test date: " +"                "+ testDate ;
    
    
    return finalResult;
}

 public String getLastName() {
     return last_name;
 }

 // Method to set last name
 public void setLastName(String lastName) {
     this.last_name = lastName;
 }

 // Method to get first name
 public String getFirstName() {
     return first_name;
 }

 // Method to set first name
 public void setFirstName(String firstName) {
     this.first_name = firstName;
 }

 // Method to get SS number
 public String getSSNumber() {
     return SSNumber;
 }

 // Method to set SS number
 public void setSSNumber(String SSNumber) {
     this.SSNumber = SSNumber;
 }

 // Method to get address
 public String getAddress() {
     return address;
 }

 // Method to set address
 public void setAddress(String address) {
     this.address = address;
 }

 // Method to get answer array
 public char[] getAnswerArray() {
     return answerArray;
 }

 // Method to set answer array
 public void setAnswerArray(char[] answerArray) {
     this.answerArray = answerArray;
 }
 
 // Method to get driver's license
 public String getDriverLicense() {
      return driverLicense;
 }

  // Method to set driver's license
 public void setDriverLicense(String driverLicense) {
    this.driverLicense = driverLicense;
 }
}
	
	
	


