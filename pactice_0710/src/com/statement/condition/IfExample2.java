package com.statement.condition;

import java.util.Scanner;

// class 첫 글자는 대문자
public class IfExample2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력 : ");
		int score = sc.nextInt();
		
		if (score >= 60) {
			System.out.println("축하합니다.");
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
	}
}
