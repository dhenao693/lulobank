package utils;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Constants {

    public static final String PATH_SQL_FILES = "src/test/resources/sqlFiles/%s.txt";
    public static final String DELETE_DISCOUNTS = "DeleteDiscounts";
    public static final String INSERT_DISCOUNTS = "InsertDiscounts";
    public static final String DELETE_MENU = "DeleteMenu";
    public static final String INSERT_MENU = "InsertMenu";
    public static final String DELETE_SGI = "DeleteSGI";
    public static final String INSERT_SGI = "InsertSGI";
    public static final int MILLIS = 40000;
    public static final String JENKINS_URL = "JENKINS_URL";
    public static final String API_TOKEN = "API_TOKEN";
    public static final String MENU_BASE_SYNCHRONIZATION = "menu-base-synchronization";
    public static final String MENU_DISCOUNTS_SYNCHRONIZATION = "menu-discounts-synchronization";
    public static final String TARGET = "target";
    public static final String PROJECT_NAME = "menu-or-apitest";
    public static final String JSON = "json";
    public static final int ZERO_VALUE = 0;
    public static final String CLASS_PATH = "classpath:karate";
    public static final boolean TRUE_VALUE = true;
    public static final String IGNORE_TAGS = "~@ignore";
    public static final int PARALLEL = 2;
}
