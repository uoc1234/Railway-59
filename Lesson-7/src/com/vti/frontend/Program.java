package com.vti.frontend;

import com.vti.Utils.FileUtils;
import com.vti.Utils.ScannerUtils;
import com.vti.Utils.TestStaticUtils;
import com.vti.entity.Account;

import java.io.IOException;
import java.util.Date;
import java.util.regex.*;

public class Program {
    public static void main(String[] args) throws IOException {
//        System.out.println(ScannerUtils.choseMenu(1,6));

//        ------------------------------ Property static ------------------------------------------
//        Account account = new Account();
//        account.setFullName("Nguyễn Văn A");
//
//        Account account1 = new Account();
//        account1.setFullName("Nguyễn Văn B");
//
//        Account account2 = new Account();
//        account2.setFullName("Nguyễn Văn C");
//
//        System.out.println(account);
//        System.out.println(account1);
//        System.out.println(account2);
//        Account.setSchool("VTI");
//        System.out.println("________________________");
//        System.out.println(Account.getSchool());


//        ------------------------------ Method static ------------------------------------------
//        TestStaticUtils.method1();
//        int kq = TestStaticUtils.chia(8,3);
//        System.out.println(kq);

//        ------------------------------ File ------------------------------------------
        // Đường dẫn tuyệt đối
        FileUtils.checkFileExists("/Users/boss/Desktop/Work/VTI/Git/Railway-59/Lesson-7/file/test.txt");

        // Đường dẫn tương đối
        FileUtils.checkFileExists("Lesson-7/file/test.txt");


        FileUtils.createFile("1234.txt");

//        FileUtils.checkFileOrFolder("/Users/boss/Desktop/Work/VTI/Git/Railway-59/Lesson-7/file2/");

//        FileUtils.getAllFile("/Users/boss/Desktop/Work/VTI/Git/Railway-59/Lesson-7/file/");

//        FileUtils.readFile("Lesson-7/file/123.txt");

//        FileUtils.writeFile("Lesson-7/file/123.txt");
    }
}

