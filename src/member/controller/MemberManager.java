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

	public void searchId() {
		
		System.out.print("검색할 아이디를 입력하세요 : ");
		String id = sc.next();
		
		for(int i = 0; i < m.length; i++) {
			if(m[i].getUserId().equals(id)) {
				//printOne();
			} else {
				System.out.println("검색한 회원 정보가 존재하지 않습니다.");
				return;
			}
			
			
		}
	}
	
	public void searchName() {
		
		System.out.print("검색할 이름을 입력하세요 : ");
		String name = sc.next();
		
		for(int i = 0; i < m.length; i++) {
			if(m[i].getUserName().equals(name)) {
				//printOne();
			} else {
				System.out.println("검색한 회원 정보가 존재하지 않습니다.");
				return;
			}
		}
		
	}
	
	public void searchEmail() {
		
		System.out.print("검색할 이메일을 입력하세요 : ");
		String email = sc.next();
		
		for(int i = 0; i < m.length; i++) {
			if(m[i].getEmail().equals(email)) {
				//printOne();
			} else {
				System.out.println("검색한 회원 정보가 존재하지 않습니다.");
				return;
			}
		}
	}
	
	public void updatePwd() {
		
		System.out.print("수정할 회원의 아이디를 입력하세요 : ");
		String id = sc.next();
		
		for(int i = 0; i < m.length; i++) {
			if(m[i].getUserId().equals(id)) {
				System.out.print("변경할 비밀번호를 입력하세요 : ");
				String pwd = sc.next();
				m[i].setUserPwd(pwd);
				System.out.println("패스워드 수정이 완료되었습니다.");
				return;
			} else {
				System.out.println("수정할 회원이 존재하지 않습니다.");
			}
		}
	}
	
	public void updateName() {
		
		System.out.print("수정할 회원의 아이디를 입력하세요 : ");
		String id = sc.next();
		
		for(int i = 0; i < m.length; i++) {
			if(m[i].getUserId().equals(id)) {
				System.out.print("변경할 회원의 이름을 입력하세요 : ");
				String name = sc.next();
				m[i].setUserId(id);
				System.out.println("이름 수정이 완료되었습니다.");
				return;
			}
		}
	}
	
	public void updateEmail() {
		
	}
	
	public static void printAllMember() {
		
		
	}


}













