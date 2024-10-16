import java.util.Scanner;

public class JAVA_P7 {

public static void main(String[] args) {
String name;
int n;

Scanner sc = new Scanner(System.in);
System.out.println("Enter String: ");
name = sc.nextLine();

System.out.println("Enter how many times you want to print: ");
n = sc.nextInt();

System.out.println(front_times(n, name));
}

public static String front_times(int n, String name) {
int value = name.length();
String result = "";
String print;

if (value >= 3) {
print= name.substring(0, 3);
} else {
print = name.substring(0, value);
}

for (int i = 0; i < n; i++) {
result += print;
}

return result;
}
}
