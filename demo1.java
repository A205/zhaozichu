package score;

import java.util.Scanner;

public class demo1 {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
			int score=scanner.nextInt();
				
		if(score<0||score>100)
		{
			System.out.println("�������");
		}
		else{
			if(score>=60)
			{
				System.out.println("�ɼ��ϸ�");
			}
			else{
				System.out.println("�ɼ����ϸ�");
			}
			
		}

	}

}
