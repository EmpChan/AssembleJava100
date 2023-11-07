package pracitce;

import java.util.Scanner;
import java.util.ArrayList;
public class Java78 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		ArrayList<Integer> arr = new ArrayList<>();
		String[] part = input.split("");
		int b = 0;
		for (int i = 0; i < part.length; i++) {
			try {
				b = Integer.parseInt(part[i]);
			} catch (Exception e) {
				arr.add(i);
			}
		}
		arr.add(0,-1); 
		arr.add(0); 
		// 넘임시에 숫자를 넣을 때 for문을 한 번만 쓰기 위해 arr의 처음과 끝에 원소 추가
		String[] numimshi = new String[arr.size()-2];
		for (int i = 0; i < numimshi.length ; i++) {
			numimshi[i] = "";
		} // 넘임시 초기화
		int[] num = new int[arr.size()-2];
		for (int j = 1; j < arr.size(); j++) {
			for (int i = arr.get(j - 1) + 1; i < arr.get(j); i++) {
				numimshi[j-1] += part[i];
			}
		} // 첫번째 수부터 마지막 수까지 넘임시에 넣기
		for (int i = 0; i < num.length ; i++) {
			num[i] = Integer.parseInt(numimshi[i]);
		} // 넘임시에 든 스트링형 숫자들 integer로 변환해 num에 넣기
		arr.remove(0);
		arr.remove(arr.size()-1);
		for (int i = 0 ; i < arr.size() - 1; i++) {
			switch (part[arr.get(i)]) {
				case "+":
					num[i + 1] = num[i] + num[i + 1];
					break;
				case "-":
					num[i + 1] = num[i] - num[i + 1];
					break;
				case "*":
					num[i + 1] = num[i] * num[i + 1];
					break;
				case "/":
					num[i + 1] = num[i] / num[i + 1];
				default:
					break;
			}
		}
		System.out.println(num[num.length - 1]);
	}
}
