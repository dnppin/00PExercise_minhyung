package member.view;

import java.util.Scanner;

import member.controller.MemberManager;

public class MemberMenu {

	private Scanner sc = new Scanner(System.in);
	private MemberManager mm = new MemberManager();

	public void MemberMenu() {}

	public void mainMenu() {

		do {
			System.out.println(" ======== ȸ�� ���� �޴� =========");
			System.out.println(" 1. �ű� ȸ�� ���");
			System.out.println(" 2. ȸ�� ���� �˻�");
			System.out.println(" 3. ȸ�� ���� ����");
			System.out.println(" 4. ȸ�� ���� ����");
			System.out.println(" 5. ȸ�� ���� ���");
			System.out.println(" 9. ����");
			System.out.println(" ============================");
			System.out.print("   �޴� ��ȣ�� �Է��ϼ��� : ");
			int menuNum = sc.nextInt();

			switch(menuNum) {

			case 1 : MemberManager.insertMember(); break;
			//case 2 : searchMemberMenu(); break;
			//case 3 : updateMemberMenu(); break;
			//case 4 : deleteMemberMenu(); break;
			case 5 : MemberManager.printAllMember(); break;
			case 9 : System.out.println("���α׷��� �����մϴ�."); return;
			}
		} while(true);
	}
	public void searchMemberMenu() {

		do {
			System.out.println(" ========== ȸ������ �˻� =========");
			System.out.println(" 1. ���̵�� �˻��ϱ�");
			System.out.println(" 2. �̸����� �˻��ϱ�");
			System.out.println(" 3. �̸��Ϸ� �˻��ϱ�");
			System.out.println(" 9. ���θ޴���");
			System.out.println(" =============================");
			System.out.print("   �޴� ��ȣ�� �Է��ϼ��� : ");
			int menuNum = sc.nextInt();

			switch(menuNum) {

			//case 1 : MemberManager.searchld(); break;
			//case 2 : MemberManager.searchName(); break;
			//case 3 : MemberManager.searchEmail(); break;
			case 9 : System.out.println("���θ޴��� �̵��մϴ�."); return;
			}

		} while(true);

	}
	public void updateMemberMenu() {
		
		do {
			System.out.println(" ========= ȸ�� ���� ���� ==========");
			System.out.println(" 1. ��й�ȣ �����ϱ�");
			System.out.println(" 2. �̸� �����ϱ�");
			System.out.println(" 3. �̸��� �����ϱ�");
			System.out.println(" 9. ���θ޴���");
			System.out.println(" ==============================");
			System.out.println(" �޴� ��ȣ�� �Է��ϼ��� : ");
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
			
			//case 1 : MemberManager.updatePwd(); break;
			//case 2 : MemberManager.updateName(); break;
			//case 3 : MemberManager.updateEmail(); break;
			case 9 : System.out.println("���θ޴��� �̵��մϴ�."); return;
			
			}
		} while(true);


	}
	
	public void deleteMemerMenu() {
		
		do {
			
			System.out.println(" ============ ȸ�� ���� ���� =============");
			System.out.println(" 1. ȸ�� ����");
			System.out.println(" 2. ��ü ȸ�� ����");
			System.out.println(" 9. ���θ޴���");
			System.out.println(" ====================================");
			System.out.println("�޴� ��ȣ�� �Է��ϼ��� : ");
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
			
			//case 1 : MemberManager.deleteOne(); break;
			//case 2 : MemberManager.deleteAll(); break;
			case 9 : System.out.println("���θ޴��� �̵��մϴ�."); return;
			
			}
			
		} while(true);
		
	}
}