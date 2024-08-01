package com.koreaIT.JAM;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.koreaIT.JAM.dto.Article;

public class Main {
	public static void main(String[] args) {
		System.out.println("== 프로그램 시작");
		
		Scanner sc = new Scanner(System.in);
		
		int lastArticleId = 1;
		List<Article> articles = new ArrayList<>();

		while (true) {

			System.out.printf("명령어)");
			String cmd = sc.nextLine();
			
			if (cmd.equals("exit")) {
				break;
			}

			if (cmd.equals("article write")) {
				System.out.printf("제목 : ");
				String title = sc.nextLine();
				System.out.printf("내용 : ");
				String body = sc.nextLine();
				
				Article article = new Article(lastArticleId, title, body);
				
				articles.add(article);
				System.out.printf("%d번 게시물이 작성되었습니다.\n", lastArticleId);
				lastArticleId++;
			} else if (cmd.equals("article list")) {
				if (articles.size() == 0) {
					System.out.println("게시물이 없습니다.");
				}
			}
		}
		
		sc.close();
		System.out.println("프로그램 종료");
	}
}
