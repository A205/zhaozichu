import java.io.Closeable;
import java.util.Scanner;


public class student {
    public static void main(String[] args) {
         System.out.println("What is your order?");
         Scanner scanner = new Scanner(System.in);
         int input= scanner.nextInt();
         if (input ==1){
        	 System.out.println("1������һ��ѧ��");
         }
         if (input == 2) {
		     System.out.println("2����ʾ����ѧ��");
		 }
		 if(input == 3) {
			 System.out.println("3���˳�����");
		 }
		 if (input != 1 && input!=2 && input!=3){
		     System.out.println("�������");
		 }
		 scanner.close();
		 }
    }

