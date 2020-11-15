package Demo01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo01Math {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                int i = sc.nextInt();
                System.out.println(i);
                break;

            } catch (InputMismatchException a) {
                System.out.println("出现异常");
            }
        }
    }

    static boolean StringEquals(String a, String b) {
        boolean equals = method(a).equals(method(b));
        return equals;
    }

    public static String method(String s) {
        if (s == null) {
            return "";
        }
        return s.trim();
    }


    /*********************************************************/

    /***
     * @brief 获取指定文件的文件名（不带后缀）
     * @param file_name_array
     * @param file_type
     * @return file_name
     */
    /*static String[] get_file_names(String[] file_name_array, String file_type) {
        String[] res = new String[file_name_array.length];
        int len = 0;
        for (String name : file_name_array) {
            if (name.endsWith("." + file_type)) {
                res[len++] = name.substring(0, name.length() - 1 - file_type.length() - 1);
            }
        }
        String[] result = new String[len];
        for (int i = 0; i < len; i++) {
            result[i] = res[i];
        }
        return result;
    } */


}
