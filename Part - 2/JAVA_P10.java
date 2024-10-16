import java.util.Arrays;

public class JAVA_P10 {

public static void main(String[] args) {

String str="Hello";
String pqr="Daksh";

StringBuilder str1=new StringBuilder();

System.out.println("Length of string : "+str.length());
System.out.println("Lowercase of String : "+str.toLowerCase());
System.out.println("Uppercase of the string : "+str.toUpperCase());

str1.append(str);
System.out.println("Reverse string : "+str1.reverse());


if(!str.isEmpty()){
String tqr=str.toUpperCase();
char tempArray[] = tqr.toCharArray();
Arrays.sort(tempArray);
System.out.println("Sort the string : "+new String(tempArray));
}

}

}
