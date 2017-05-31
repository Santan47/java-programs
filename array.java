import java.util.Scanner;
public class array{
public static void main(String[] args)
{
int[] array =new int[5];
Scanner scan=new Scanner(System.in);
for(int i=0;i<5;i++)
{
array[i]=scan.nextInt();
}
for(int element : array)
{
System.out.println(element);
}
}
}

