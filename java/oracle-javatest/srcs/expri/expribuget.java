package expri;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//단위는 1000,부서의 갯수는 1이상 10미만->list의 길이가 부서의 갯수
//각 부서별 신청금액은 1이상 100이하->갹list 당 부여값 각부서당 신청금
//예산은 1000이하
//2차항의 콜렉터 구성 최대 몇개의 부서에 지원이 가능한가
public class expribuget {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		Random r=new Random();
		int bud=r.nextInt(10000)+1;//예산 생성
		int len=r.nextInt(100)+1;//부서 길이 10이하 생성
		for(int i=0;i<len;i++) {
			list.add(r.nextInt(100)+1);
			System.out.print(list.get(i)+" ");//각 부서별 신청금 할당
		}
		System.out.println();
		list.sort(null);
		int j=0; int cnt=0;
		for(int i=0;i<len;i++) {
			j+=list.get(i); 
			if(j>bud) {j-=list.get(i); break;}cnt++;
			
		}
		System.out.print("예산 :"+bud+"\t");
		System.out.print("지원한 금액 :"+j+"\t");
		System.out.println("부서 갯수 :"+cnt);
	}
	
}
