# Errors and Solutions
|No.|Input / Error| Reason| Solution |
|---|---|----|----|
|1| Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException | When you try to access an invalid bound.| Correcting the size of the index.|
|2| int[] input =[1, 100, 1000, 200, 450]; <br>  illegal start of expression |Initialization of an array is incorrect | int[] input = new int[]{1, 100, 1000, 200, 450};|
|3| inputArray[i] == ")" <br> bad operand types for binary operator '==';| Use single quotes for literal char s, double quotes for literal String s, like so: char c = 'a'; String s = "hello" | inputArray[i] == ')'|
|4| openBracket = openBracket + 1; <br> Instance Variable and Local Variable with Same Name | Doesn't return the value because it's life ends within the method scope. | this.openBracket = openBracket + 1;|
|5| public static void main (String[]args){ <br> illegal start of expression <br>  ‘;’ expected |  The seven errors are simply Java complaining about not being able to read the file. | You need to close the method modulo with a brace: }.|
|6| if (berth == "L") { | When comparing String you use .equals() or .equalsIgnoreCase().| if (berth.equals("L")) { |
|7| interface Coach { <br> book(); <br> } | return type required | interface Coach { <br> void book(); <br> } |
|8| Printing random letters and number with @  | It is trying to print an object directly. | |



