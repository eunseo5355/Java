import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��Ͻÿ�: ");  // �Է� �ȳ��� ���
		int a = scanner.nextInt();	// �Է� �ޱ�
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};	// �迭 �����ϰ� �ʱ�ȭ
		
		// �迭�� ���̱��� �ݺ�
		for(int i = 0; i<unit.length; i++) {
			if(i != 0 && a%unit[i-1]/unit[i] != 0) {
				System.out.println(unit[i] + "�� " + "¥��: " + a%unit[i-1]/unit[i] + "��");
			}
			else if(i == 0 && a/unit[i] != 0){
			System.out.println(unit[i] + "�� " + "¥��: " + a/unit[i] + "��");
			}
		}
		scanner.close();
	}
}
