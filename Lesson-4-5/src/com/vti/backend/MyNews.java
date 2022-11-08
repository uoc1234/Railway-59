package com.vti.backend;

import com.vti.entity.News;

import java.util.ArrayList;
import java.util.Scanner;

public class MyNews {
    static ArrayList<News> list = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int menu;
        while (true) {
            System.out.println("------------------------- MENU -----------------------");
            System.out.println(" Mời chọn chức năng");
            System.out.println("1. Insert news");
            System.out.println("2. View list news");
            System.out.println("3. Average rate");
            System.out.println("4. Thoát");
            menu = Integer.parseInt(scanner.nextLine());
            switch (menu) {
                case 1:
                    addNews();
                    break;
                case 2:
                    view();
                    break;
                case 3:
//                    showAllCanbo();
                    System.out.println("Chức năng hiển thị danh sách cán bộ");
                    break;
                case 4:
                    return;
            }
        }
    }

    private static void view() {
        System.out.println("--------------------- Danh sách cán bọ ---------------------");
        System.out.println(list);
    }

    private static void addNews() {
        System.out.println("Mời bạn nhập title: ");
        String title = scanner.nextLine();
        System.out.println("Mời bạn nhập ngày công chiếu: ");
        String publishDate = scanner.nextLine();
        System.out.println("Mời bạn nhập tác giả: ");
        String author = scanner.nextLine();
        System.out.println("Mời bạn nhập nội dung: ");
        String content = scanner.nextLine();
        News news = new News(title,publishDate, author, content);
        news.calculate();
        list.add(news);
    }
}
