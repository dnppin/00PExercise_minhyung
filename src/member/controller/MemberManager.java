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

	public static void printAllMember() {
		
	}


}