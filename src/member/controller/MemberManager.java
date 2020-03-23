package member.controller;

import java.util.Scanner;

import member.model.vo.Member;

public class MemberManager {

	private static Member[] m = new Member[10];
	private static int ctn = 0;
	private Scanner sc = new Scanner(System.in);
	
	public void MemberManager() {}
	
	public void insertMember() {
		
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("패스워드 : ");
		String pwd = sc.next();
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);
		System.out.print("이메일 : ");
		String email = sc.next();
		m[ctn]  = new Member(id, pwd, name, age, gender, email);
		ctn++;
		System.out.println("입력이 완료되었습니다. 메인 메뉴로 돌아갑니다."); return;
		
	}

	public static void printAllMember() {
		
	}


}