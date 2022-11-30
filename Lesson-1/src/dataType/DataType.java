package dataType;

import object.Account;

import java.util.Date;

public class DataType {
    String dataType_1 = "Ký tự";

    Date dataType_2 = new Date();
    Date dataType_22 = new Date(1999, 6, 20);

    Gender dataType_3 = Gender.Male;

    int[] dataType_4 = {1,2,3};
    boolean aBoolean1 = true;
    int a = 1;
    Integer integer = new Integer(a);
    Integer integer2 = Integer.valueOf(a);

    Account account = new Account();
}

enum Gender{
    Male, Female;
}