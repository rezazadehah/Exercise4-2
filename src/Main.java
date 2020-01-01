import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("username ra vared konid");
        String userName = scanner.nextLine();

        System.out.println("password ra vared konid");

        String  password = scanner.nextLine();

        if (checkPass(password) && checkUserName(userName))
        {
            System.out.println("shoma vared shodid");
        }else
        {
            System.out.println("etelaAte vared shode eshtebah ast");
        }
    }

    private static boolean checkUserName(String value){
        return value.equals("amir");
    }

    private static boolean checkPass(String value){
        return value.equals("amir");
    }
}
