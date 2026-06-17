import java.util.Scanner;
class Circle3
{
static void findArea(double r) {
System.out.println("Area:"+Math.PI*r*r);
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
double r=sc.nextDouble();
findArea(r);
}
}