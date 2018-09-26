import java.util.Scanner ; 
public class Calculations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		System.out.println("Enter another one");
		int z = sc.nextInt();
		int x = sc.nextInt();
		System.out.println("The addition between this numbers is:" + (z + x));
		System.out.println("The substraction between this numbers is:" + (z - x));
		System.out.println("The division between this numbers is:" + z / x);
		System.out.println("The multiplication between this numbers is:" + z * x);
	}

}
