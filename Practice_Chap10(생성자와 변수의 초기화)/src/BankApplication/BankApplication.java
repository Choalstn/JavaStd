package BankApplication;

import java.util.Arrays;
import java.util.Scanner;

public class BankApplication {
	
	//배열 100개 정적멤버로 되어있고, 배열임으로 한계가 있 (메모리 낭비, 정적이다.)
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		boolean run = true;
		
		while(run) {
			System.out.println("-------------------------------------------------");
			System.out.println("1. 계좌 생성 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("-------------------------------------------------");
			System.out.print("선택 > ");
			
			int choice = sc.nextInt();
			
			if(choice == 1) {
				createAccount();
				
			}
			else if (choice == 2) {
				accountList();
				
			}
			else if(choice == 3) {
				deposit();
				
			}
			else if(choice == 4) {
				withDraw();
				
			}
			else if(choice == 5) {
				System.out.println("계좌 관리 프로그램을 종료합니다.");
				run = false;
			}
			else {
				System.out.println("잘못 입력");
			}
		}
	}
	
	public static void createAccount() {
		System.out.println("-------------------");
		System.out.println("계좌를 생성합니다.");
		System.out.println("-------------------");
		
		System.out.print("계좌 번호 : ");
		String ano = sc.next();
		
		System.out.print("계좌주 : ");
		String owner = sc.next();
		
		System.out.print("초기 입금액 : ");
		int balance = sc.nextInt();
		
		Account newAccount = new Account(ano, owner, balance);
		
		for(int i =0; i<accountArray.length; i++) {
			 if(accountArray[i] == null) {
				 accountArray[i] = newAccount;
				 System.out.println("계좌가 생성되었습니다.");
				 //System.out.println(accountArray[i].getAno() + ", " + accountArray[i].getOwner() + ", " + accountArray[i].getBalance());
				 break;
				 
			 }
		}
		
		
	}
	
	public static void accountList() {
		System.out.println("-------------------");
		System.out.println("계좌목록을 출력합니다.");
		System.out.println("-------------------");
		
		for(int i = 0; i<accountArray.length; i++) {
			Account account = accountArray[i];
			//계좌에 대한 내용이 존재한다면, 
			if(account != null) {
				System.out.print(account.getAno());
				System.out.print("\t");
				System.out.print(account.getOwner());
				System.out.print("\t");
				System.out.print(account.getBalance());
				System.out.println(" ");
			}
		}
		
	}
	
	//예금하기 
	public static void deposit() {
		System.out.println("-------------------");
		System.out.println("예금합니다.");
		System.out.println("-------------------");
		
		System.out.print("계좌번호 입력 : ");
		String ano = sc.next();
		System.out.print("예금액 : ");
		int money = sc.nextInt();
		
		Account account = findAccount(ano);
		
		if(account == null ) {
			System.out.println("계좌가 없습니다. ");
			return;
		}
		else {
			account.setBalance(account.getBalance() + money);
			System.out.println("예금 성공. 현재 잔액 : " + account.getBalance());
		}
		
		
	}
	
	
	//출금
	public static void withDraw() {
		System.out.println("-------------------");
		System.out.println("출금합니다.");
		System.out.println("-------------------");
		
		System.out.print("계좌번호 입력 : ");
		String ano = sc.next();
		System.out.print("출금액 : ");
		int money = sc.nextInt();
		
		Account account = findAccount(ano);
		
		if(account == null ) {
			System.out.println("계좌가 없습니다. ");
			return;
		}
		else {
			account.setBalance(account.getBalance() - money);
			System.out.println("출금 성공. 현재 잔액 : " + account.getBalance());
		}
		 
	}
	
	public static Account findAccount(String ano) {
		Account account = null;
		
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				//매개변수로 넘어온 계좌번호와 동일하다면...
				if(accountArray[i].getAno().equals(ano)) {
					 account = accountArray[i];
					 break;
				}
			}
		}
		return account;
	}

}
