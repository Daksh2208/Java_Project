
import java.util.*;

public class JAVA_P3 {
public static void main(String[] args) {

float distance;

System.out.print("Enter the distance in metres : ");
Scanner sc = new Scanner(System.in);
distance = sc.nextFloat();
float second,minutes,hours,t_hour,t_minutes,t_seconds;
System.out.print("Enter the time taken to cover "+distance+" metres in hour : ");
hours=sc.nextFloat();
System.out.print("Enter the time taken to cover "+distance+" metres in minutes : ");
minutes=sc.nextFloat();
System.out.print("Enter the time taken to cover "+distance+" metres in seconds : ");
second=sc.nextFloat();

t_hour=hours+(minutes/60)+(second/3600);
t_minutes=(hours*60)+minutes+(second/60);
t_seconds=(t_minutes*60);
float km=distance/1000;
float speed_metre=distance/t_seconds;

System.out.println("Speed is "+speed_metre+" metre/sec");
float speed_km_=km/t_hour;
System.out.println("Speed is "+speed_km_+" km/hours");
float mile = distance/1609;
float speed_mile = mile/t_hour;
System.out.println("Speed is "+speed_mile+" mile/hour");
sc.close();
}
}
