// �������� ��������,
// ����� ����� ������ ����� (0-9) � � ������� � ���� (�� ����. ����)
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Insert Number (0-9):");
		int num = in.nextInt();
		System.out.println("");

		
		String numString = "" ;
		switch (num) {
		case 1:
			numString = "one";
			break;
		
		case 2:
			numString = "two";
			break;
		case 3:
			numString = "tree";
			break;
		case 4:
			numString = "four";
			break;
		case 5:
			numString = "five";
			break;
		case 6:
			numString = "six";
			break;
		case 7:
			numString = "seven";
			break;
		case 8:
			numString = "eight";
			break;
		case 9:
			numString = "nine";
			break;
		case 0:
			numString = "zero";
			break;
		}
		if (num < 0 || num > 15){
			System.out.print("�� ��� ������ ����?");
		}
		System.out.println(numString);

	}

}
