package member.controller;

import java.util.Scanner;

import member.model.vo.Member;

public class MemberManager {

	private static Member[] m = new Member[10];
	private static int ctn = 0;
	private Scanner sc = new Scanner(System.in);
	
	public void MemberManager() {}
	
	public void insertMember() {
		
		System.out.print("���̵� : ");
		String id = sc.next();
		System.out.print("�н����� : ");
		String pwd = sc.next();
		System.out.print("�̸� : ");
		String name = sc.next();
		System.out.print("���� : ");
		int age = sc.nextInt();
		System.out.print("���� : ");
		char gender = sc.next().charAt(0);
		System.out.print("�̸��� : ");
		String email = sc.next();
		m[ctn]  = new Member(id, pwd, name, age, gender, email);
		ctn++;
		System.out.println("�Է��� �Ϸ�Ǿ����ϴ�. ���� �޴��� ���ư��ϴ�."); return;
		
	}

	public void searchId() {
		
		System.out.print("�˻��� ���̵� �Է��ϼ��� : ");
		String id = sc.next();
		
		for(int i = 0; i < m.length; i++) {
			if(m[i].getUserId().equals(id)) {
				//printOne();
			} else {
				System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�.");
				return;
			}
			
			
		}
	}
	
	public void searchName() {
		
		System.out.print("�˻��� �̸��� �Է��ϼ��� : ");
		String name = sc.next();
		
		for(int i = 0; i < m.length; i++) {
			if(m[i].getUserName().equals(name)) {
				//printOne();
			} else {
				System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�.");
				return;
			}
		}
		
	}
	
	public void searchEmail() {
		
		System.out.print("�˻��� �̸����� �Է��ϼ��� : ");
		String email = sc.next();
		
		for(int i = 0; i < m.length; i++) {
			if(m[i].getEmail().equals(email)) {
				//printOne();
			} else {
				System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�.");
				return;
			}
		}
	}
	
	public void updatePwd() {
		
		System.out.print("������ ȸ���� ���̵� �Է��ϼ��� : ");
		String id = sc.next();
		
		for(int i = 0; i < m.length; i++) {
			if(m[i].getUserId().equals(id)) {
				System.out.print("������ ��й�ȣ�� �Է��ϼ��� : ");
				String pwd = sc.next();
				m[i].setUserPwd(pwd);
				System.out.println("�н����� ������ �Ϸ�Ǿ����ϴ�.");
				return;
			} else {
				System.out.println("������ ȸ���� �������� �ʽ��ϴ�.");
			}
		}
	}
	
	public void updateName() {
		
		System.out.print("������ ȸ���� ���̵� �Է��ϼ��� : ");
		String id = sc.next();
		
		for(int i = 0; i < m.length; i++) {
			if(m[i].getUserId().equals(id)) {
				System.out.print("������ ȸ���� �̸��� �Է��ϼ��� : ");
				String name = sc.next();
				m[i].setUserId(id);
				System.out.println("�̸� ������ �Ϸ�Ǿ����ϴ�.");
				return;
			}
		}
	}
	
	public void updateEmail() {
		
	}
	
	public static void printAllMember() {
		
		
	}


}













