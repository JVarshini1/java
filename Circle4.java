import java.util.Scanner;
class Circle4
{
double findArea(double r) {
return Math.PI*r*r;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
double r=sc.nextDouble();
Circle4 c=new Circle4();
double res=c.findArea(r);
System.out.println(res);
}
}