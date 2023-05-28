package uz.pdp.entity.client.util;

import java.util.Scanner;
public interface ScannerUtil {
    Scanner SCANNER_STR = new Scanner(System.in);
    Scanner SCANNER_NUM = new Scanner(System.in);
    static String getString(String title) {
        System.out.println(title);
        return SCANNER_STR.nextLine();
    }
    static Integer getInteger(String title) {
        System.out.println(title);
        return SCANNER_NUM.nextInt();
    }
    static Double getDouble(String title) {
        System.out.println(title);
        return SCANNER_NUM.nextDouble();
    }
}
