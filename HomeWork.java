
public class HomeWork {
    public static void main(String[] agre) {
    	double[][] score = new double[5][20];
    	double[] sum = new double[20];
    	double[] sum1 = new double [5];
    	double[] ave = new double [20];
		int i,j;
		
		for (i = 0;i < 5;i++)
		{
		    for (j = 0;j<20;j++) 
		    {
		    	score[i][j] = (int)(0+Math.random()*(100-0+1)) ;
//		    	double tmp = (int)(0+Math.random()*(100-0+1));
//		    	System.out.println(tmp);
			}
		}
		System.out.println("每个学生的成绩：");
		for (j = 0;j<20;j++)
		{
		    for (i = 0;i < 5;i++) 
		    {
		    	System.out.print(score[i][j]+" ");
		    }
		        System.out.println();
	    }
		System.out.println("每个学生的总成绩");
		for (j = 0;j<20;j++)
		{
		    for (i = 0;i < 5;i++) 
		    {
		    	sum[j] = sum[j] + score[i][j];
		    }
		    System.out.println(sum[j]);
        }
		System.out.println("某门课的平均成绩：");
		for (i = 0;i < 5;i++)
		{
		    for (j = 0;j < 20;j++) 
		    {
		    	sum1[i] = sum1[i] + score[i][j];
		    }
		    ave[i] = sum1[i]/20;
		    System.out.println(ave[i]);
        }
}
}
