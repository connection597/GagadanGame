package gagadan;

import java.util.Random;
import java.util.Scanner;

public class GagadanGame {
	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();
	static int choice =0;
	static int num1 =0;
	static int num2 =0;
	static int mu1 =0;
	static int max =0;
	
	public static void main(String []args) {
		System.out.println("======구구단 게임======");
		do {
			System.out.println("1.게임시작 2.연습하기 3.종료");
			choice = sc.nextInt();
			int count =0;
			if(choice == 1) {
				System.out.println("========게임 시작========");
				while(true) {
					num1 = rd.nextInt(9) +1;
					num2 = rd.nextInt(9) +1;
					long start = System.currentTimeMillis();
					System.out.println(num1 +"*"+num2+"=");
					mu1 =sc.nextInt();
					long end   = System.currentTimeMillis();
					if(num1*num2 == mu1 &&(end- start)/ 1000 <=2) {
						count++; continue;
					}else if((end - start)/1000 >2) {
						System.out.println("시간 초과 입니다");
					}
					System.out.println(count +"개 맞췼습니다");
					System.out.println("==============게임 오버==============");
					if(max < count) {
						System.out.println("신기록 달성");
						max = count;
					}
					break;
				}
			}else if (choice ==2) {
				int e_dan;
				System.out.println("시작 단을 입력하세요 : ");
				int s_dan = sc.nextInt();
				do {
					System.out.println("마지막 단을 입력하세요 : ");
					e_dan = sc.nextInt();
				}while (s_dan > e_dan);
				System.out.println("\n"+s_dan+"단 부터" +e_dan+"단까지 출력하겠습니다");
				System.out.println("===========================================");
				for(int i = s_dan; i<= e_dan; i++) {
					System.out.println(i +"단\n");
					for(int j =1; j<= 9; j++) {
						System.out.println(i+"*"+j+"="+ i*j +"\t");
					}
					System.out.println();
				}
				System.out.println("=========================================");
			}else if (choice ==3) {
				System.out.println("종료 되었습니다");
				break;
			}else {
				System.out.println("잘못 입력 하셨습니다");
			}
		
	}while(true);
	}
}
	
			
		
	


