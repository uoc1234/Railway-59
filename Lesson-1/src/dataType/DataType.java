package dataType;

import java.util.Date;

public class DataType {
    String dataType_1 = "Ký tự";

    Date dataType_2 = new Date();

    Gender dataType_3 = Gender.Male;

    int[] dataType_4 = {1,2,3};
}

enum Gender{
    Male, Female;
}