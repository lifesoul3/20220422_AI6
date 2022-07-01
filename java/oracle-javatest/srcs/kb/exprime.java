package kb;
//주어진 숫자x개(3개이상 50개이하)=1차원 배열 사이즈
//배열내부의 각원소 1이상 1000이하의 자연수
//배열내부의 각원소는 중복X
//배열내부의 숫자들을 각각 더하기하여 소수의 갯수 찾기

import java.util.Arrays;
import java.util.Random;

public class exprime {
	public static void main(String[] args) {
	Random r=new Random();
	int[] arr=new int[7];//배열 사이즈 랜덤 생성
	int[] a=new int[r.nextInt(6)+1];//더할 갯수 재배열

	for(int i=0;i<arr.length;i++) {
		arr[i]=r.nextInt(10)+1;
		for(int j=0;j<i;j++) {
		if(arr[i]==arr[j]) i--;
		}
	}
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}

	int k=0;
	for(int i=0;i<7;i++) {
	
		
	}
	}
}
