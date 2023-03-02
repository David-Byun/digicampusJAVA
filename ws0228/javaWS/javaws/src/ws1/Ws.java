package ws1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ws {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Input Command[q, a1, a2, a3, a4]");
			String cmd = sc.next();
			if(cmd.equals("q")) {
				System.out.println("Quit..");
				break;
			} else if(cmd.equals("a1")) {System.out.println("5~9까지의 숫자를 입력해주세요");

			int input = Integer.parseInt(sc.next());
			int[] arr = new int[input];
			Random r = new Random();
			for (int i = 0; i < arr.length; i++) {
				arr[i] = r.nextInt(9)+1;
			}
			System.out.println("배열 정보 출력 : " + Arrays.toString(arr));
		    int sum = 0;
			int cnt = 0;
			for (int i = 0; i < arr.length; i++) {
					sum += arr[i];
					cnt++;	
			}

			System.out.println( sum);
			System.out.println((double) sum / cnt );
				

			} else if(cmd.equals("a1")) {System.out.println("5~9까지의 숫자를 입력해주세요");

			int input = Integer.parseInt(sc.next());
			int[] arr = new int[input];
			Random r = new Random();
			for (int i = 0; i < arr.length; i++) {
				arr[i] = r.nextInt(9)+1;
			}
			System.out.println("배열 정보 출력 : " + Arrays.toString(arr));
		    int sum = 0;
			int cnt = 0;
			for (int i = 0; i < arr.length; i++) {
					sum += arr[i];
					cnt++;	
			}

			System.out.println( sum);
			System.out.println((double) sum / cnt );
				

				// 5~9까지의 숫자를 입력받는다.
				// 입력받은 숫자만큼 배열을 생성하고
				// 1~9까지의 랜덤한 숫자를 배열에 넣는다.
				// 배열 정보를 출력한다.
				// 배열의 합과 평균을 출력한다.
			
			} else if(cmd.equals("a1")) {System.out.println("5~9까지의 숫자를 입력해주세요");

			int input = Integer.parseInt(sc.next());
			int[] arr = new int[input];
			Random r = new Random();
			for (int i = 0; i < arr.length; i++) {
				arr[i] = r.nextInt(9)+1;
			}
			System.out.println("배열 정보 출력 : " + Arrays.toString(arr));
		    int sum = 0;
			int cnt = 0;
			for (int i = 0; i < arr.length; i++) {
					sum += arr[i];
					cnt++;	
			}
			System.out.println( sum);
			System.out.println((double) sum / cnt );
				
				
			} else if(cmd.equals("a2")) {
				System.out.println("5~9까지의 숫자를 입력해주세요");

				// 5~9까지의 숫자를 입력받는다.
				int input = Integer.parseInt(sc.next());

				// 입력받은 숫자만큼 배열을 생성하고
				int[] arr = new int[input];

				// 1~9까지의 랜덤한 숫자를 배열에 넣는다.
				Random r = new Random();

				for (int i = 0; i < arr.length; i++) {
					arr[i] = r.nextInt(9) + 1;
				}

				// 배열 정보를 출력한다.

				// 배열의 합과 평균을 출력한다.

				System.out.println("배열 정보 출력 : " + Arrays.toString(arr));


				// 짝수번째 숫자들의 합과 평균을 출력한다.
				int sum = 0;
				int cnt = 0;
				for (int i = 0; i < arr.length; i++) {
					if (i % 2 != 0) {
						sum += arr[i];
						cnt++;
					}
				}

				System.out.println("짝수번째 숫자들의 합 = " + sum);
				System.out.println("짝수번째 숫자들의 평균 = " + (double) sum / cnt );
				
			} else if(cmd.equals("a3")) {
		
				// 5~9까지의 숫자를 입력받는다.
				while(true) {
					System.out.println("5~9 사이의 숫자를 하나 입력해주세요");
					int n3 = Integer.parseInt(sc.next());
					if (n3 < 5 || n3 > 9) {
						System.out.println("잘못 입력하셨습니다. 처음으로 돌아갑니다.");
					} else {
						
					// 입력받은 숫자만큼 배열을 생성하고
						int arr[] = new int[n3];
					
					// 1~9까지의 랜덤한 숫자를 배열에 넣는다.
						Random r = new Random();
						for(int i=0; i< arr.length; i++) {
							arr[i] = r.nextInt(9)+1;
						}
					
					// 배열 정보를 출력한다.
						System.out.println(Arrays.toString(arr));
					
					// 배열의 합과 평균을 출력한다.
						int sum3 = 0;
						double avg3 = 0.0;
						for(int a:arr) {
							sum3 += a;
						}
					
						avg3 = sum3 / (arr.length * 1.0);
						System.out.printf("<배열의 합과 평균> sum = %d, average = %4.2f \n", sum3, avg3);
					
					// 짝수 값만의 합과 평균을 출력한다.
						int sum3E = 0;
						double avg3E =0.0;
						int cnt3 = 0;
						for(int a:arr) {
							if (a%2 == 0) {
								sum3E += a;
								cnt3++;
							}
						}
						
						avg3E = sum3E / (cnt3 * 1.0);
						System.out.printf("<배열의 짝수값들의 합> sum = %d, average = %4.2f \n\n", sum3E, avg3E);
						break;
					}
				}
			
				
			} else if(cmd.equals("a4")) {

				// 5~9까지의 수를 2개 입력받는다.
			    System.out.println("5~9까지의 수 1개를 입력하세요.");	
				int num1 = Integer.parseInt(sc.next());
				System.out.println("5~9까지의 수 1개를 입력하세요.");	
				int num2 = Integer.parseInt(sc.next());

				// 5~9까지의 수를 2개 입력받는다..
				// 2차원 배열을 만든다.
				// 1~9까지의 랜덤한 숫자를 배열에 넣는다.
				// 배열 정보를 출력한다.
				// 배열의 합과 평균을 출력한다.

				
				// 2차원 배열을 만든다.
				int arr[][] = new int[num1][num2];
				Random r = new Random();
				
				// 1~9까지의 랜덤한 숫자를 배열에 넣는다.
				for(int i=0; i<arr.length; i++) {             
					for(int j=0; j<arr[i].length; j++) {      
						arr[i][j] = r.nextInt(9)+1;
					}
				}
				
				// 배열 정보를 출력한다.
				System.out.println(Arrays.deepToString(arr));
				
				// 배열의 합과 평균을 출력한다.
			    int sum4 = 0;
				double avg4 = 0.0;
	
				for(int i=0; i<arr.length; i++) {             
					for(int j=0; j<arr[i].length; j++) {
						sum4 += arr[i][j];
					}
					avg4 = (sum4*1.0) / (num1*num2);
					}
					System.out.printf("sum = %d, avg = % 4.2f \n", sum4, avg4);	
				} 
					
			else {
				System.out.println("Invalid Command...");
				System.out.println("Try Again.");
			}
		}
		System.out.println("Bye...");
		sc.close();
	}
}