import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("����: ");	// �����ϴ� ���� �Է� �ȳ��� ���
		int a = scanner.nextInt();	// �����ϴ� ���� �Է¹ޱ�
		System.out.print("����: ");	// �����ϴ� ����  �Է� �ȳ��� ���
		int b = scanner.nextInt();	// �����ϴ� ���� �Է¹ޱ�
		System.out.print("���: ");	// ���� ������� �Է��ϴ� �ȳ��� ���
		int c = scanner.nextInt();	// ��� �Է� �ޱ�
		int sum = 0;	// ���� ���ϴ� ���� �����ϰ� �ʱ�ȭ
		
		// �����ϴ� ���ں��� ������ ���ڱ��� �ݺ�
		for(int i=a; i<=b; i+=c){ 
			sum += i;	// sum������ i�� ���� �����ش�
		}
		
		System.out.print(a + "���� " + b + "���� " + c + "�� ����� ��: " + sum);	// ����� �� ���
		scanner.close(); 
	}

}
