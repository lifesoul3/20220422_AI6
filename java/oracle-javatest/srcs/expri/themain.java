package expri;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
//주어진 숫자x개(3개이상 50개이하)=1차원 배열 사이즈
//배열내부의 각원소 1이상 1000이하의 자연수
//배열내부의 각원소는 중복X
//배열내부의 숫자들을 각각 더하기하여 소수의 갯수 찾기
public class themain {
	public static void main(String[] args) {
		
		List<Integer> arr=new ArrayList<>();//1차원 배열 사이즈
		Random r=new Random();
		for(int i=0;i<r.nextInt(20)+3;i++) {//배열사이즈 3이상 7이하
			arr.add(r.nextInt(100)+1);	//내부원소값 10이하 
		}
		int k; int l;
		for(int i=0;i<arr.size();i++) {
			for(int j=0;j<i;j++) {
				if(arr.get(i)==arr.get(j)) {
					arr.remove(i);i--;
				}
			}
		}
		for(int i=0;i<arr.size();i++) {
			System.out.print(arr.get(i)+"\t");
		}
		
		
	}
}
