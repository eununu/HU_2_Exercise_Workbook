import java.util.Scanner;

public class C08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int max_num, min_num;
		System.out.print("ù��° ���ڸ� �Է��ϼ��� ");
		int num1= s.nextInt();
	
		System.out.print("�ι�° ���ڸ� �Է��ϼ��� ");
		int num2= s.nextInt();
		
		System.out.print("����° ���ڸ� �Է��ϼ��� ");
		int num3= s.nextInt();
		s.close();
	
		max_num= num1;
		min_num= num1;
		
		if(max_num< num2) max_num= num2;
		if(min_num> num2) min_num= num2;
		if(max_num< num3) max_num= num3;
		if(min_num> num3) min_num= num3;
		
		System.out.print("���� ū ���� "+ max_num + " �̰� ���� ���� ���� "+ min_num + " �Դϴ�.");
	}
}
