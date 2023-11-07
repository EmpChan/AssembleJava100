package java_ex100;

import java.util.*;

public class Java100 {

	public static void main(String[] args) {
		Random random=new Random();
		int ans=random.nextInt(99)+1;
		int my=0;
		Scanner sc=new Scanner(System.in);
		while(ans!=my){
			System.out.println("번호를 입력하세요.");
			my=sc.nextInt();
			if(ans>my) {
				System.out.println("번호가 정답보다 작습니다.");
				continue;
			}
			else if(ans<my) {
				System.out.println("번호가 정답보다 큽니다.");
				continue;
			}
			else {
				System.out.println("정답입니다.");
				break;
			}
		}

	}
}