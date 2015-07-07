import java.io.Closeable;
import java.util.Scanner;


public class student {
    public static void main(String[] args) {
         System.out.println("What is your order?");
         Scanner scanner = new Scanner(System.in);
         int input= scanner.nextInt();
         if (input ==1){
        	 System.out.println("1、增加一个学生");
         }
         if (input == 2) {
		     System.out.println("2、显示所有学生");
		 }
		 if(input == 3) {
			 System.out.println("3、退出程序");
		 }
		 if (input != 1 && input!=2 && input!=3){
		     System.out.println("输入错误！");
		 }
		 scanner.close();
		 }
    }

