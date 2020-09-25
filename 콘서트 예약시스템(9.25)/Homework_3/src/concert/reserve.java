package concert;

import java.util.Scanner;


public class reserve {

	public static void main(String[] args) {
		
		boolean flag = true;
		
		
		String cusName = null; // ������ ����
		int stGubun = 0; // �¼�Ÿ��
		int stNum = 0;
		
		Book ss = new Book(cusName, stGubun, stNum);
		
		Scanner sc = new Scanner(System.in);
		
		while(flag) { // - ���� �ý����� �޴��� "����", "��ȸ", "���", "������"�� �ִ�.
					  // - ���� �̸�, ���� ��ȣ, ���� �޴�, �߸��� ��� � ���ؼ� ���� �޽����� ����ϰ� ����ڰ� �ٽýõ��ϵ��� �Ѵ�.
			System.out.println();
			System.out.println("=============��ǰ�ܼ�ƮȦ ����ý����Դϴ�.==============");
			System.out.println("���ϴ� ������ ��ȣ�� �Է��ϼ���. 1)���� 2)��ȸ 3)��� 4)������"); 
			
			int service_num = sc.nextInt();
			switch(service_num) {
			case 1: 
				ss.bookSeat();
				break;
			case 2: 
				ss.searchSeat();
				break;
			case 3: 
				ss.canSeat();
				break;
			case 4: // ������
				System.out.println("�ý����� ����˴ϴ�.");
				flag = false;
				break;
			default:
				System.out.println("�߸� �����̽��ϴ�. �ùٸ� ��ȣ�� �Է����ּ���.");
			}
		}
	}
}

class Book{
	String cusName; // ������ ����
	int stGubun; // �¼�Ÿ��
	int stNum; // �¼���ȣ
	String[][] seats = new String[3][10]; // �¼����� - S A B �� 10����.
	String[] list = {"S","A","B"};
	
	public Book(String cusName, int stGubun, int stNum) {
		this.cusName = cusName;
		this.stGubun = stGubun;
		this.stNum = stNum;
		
		for(int i = 0 ; i < 3 ; i++) {
			for(int j = 0; j < 10 ; j++) {
				seats[i][j] = "__";
			}
		}
	}
	
	public void bookSeat() { // �¼�����
		
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------�¼� ����-----------");
		System.out.println("������ �Է��ϼ���");
		System.out.println("���� :");
		String cusName = sc.next();
		while(true) {
			System.out.println("���Ͻô� �¼������ �����ϼ���. S�� = 1/A�� = 2/B�� = 3 (���ڷ� �Է����ּ���)");
			System.out.println("�¼���� :");
			int stGubun = sc.nextInt() - 1;
			System.out.println("���Ͻô� �¼���ȣ�� �����ϼ���. 1~10��");
			System.out.println("�¼���ȣ :");
			int stNum = sc.nextInt() - 1 ;
         		if(stNum>10){
         			System.out.println("�߸��� �¼���ȣ �Դϴ�. �ٽ� �Է����ּ���.");
         			stNum = sc.nextInt()-1;
         		}
         		if(seats[stGubun][stNum].equals(cusName)){
         			System.out.println("�̹� ����� �ڸ��Դϴ�.�ٽ� �õ����ּ���.");
         	}
         	seats[stGubun][stNum] = (cusName);
         	break;
		}
		System.out.println();
	}
	
	public void searchSeat() { // �¼���ȸ �� ���
		
		System.out.println("-----------�¼���ȸ-----------");
		for (int i = 0; i < 3; i++) {
            System.out.print("\n" + list[i] + "�� ");
            for (int j = 0; j < 10; j++) {
                System.out.print(" "+ seats[i][j]);
            }
        }
	}
	
	public void canSeat() { // �¼����
		
			Scanner sc = new Scanner(System.in);
			System.out.println("-----------���� ���-----------");
			System.out.println("������ ����:");
				String canName = sc.next();
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 10; j++) {
						if(canName.equals(seats[i][j])) {
							seats[i][j] = "__";
							System.out.println("������ ��� �Ǿ����ϴ�.");
							break;
					}
				}
			}
	}
}

