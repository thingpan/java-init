package p09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numList=new ArrayList<>();
		Scanner scan =new Scanner(System.in);
		System.out.println("숫자 3개를 ,를 기준으로 입력해주세요 :");
		String numStr =scan.nextLine();
		String[] strs =numStr.split(",");
		
		for(int i=0; i<strs.length; i++) {
			int num =Integer.parseInt(strs[i]);
			numList.add(num);
		}
	System.out.println("숫자 3개를 ,을 기준으로 입력 해주세요");
	numStr =scan.nextLine();
	strs =numStr.split(",");
	int cnt=0;
	for(int i=0; i<strs.length; i++) {
		int num =Integer.parseInt(strs[i]);
	for(int j=0; j<numList.size(); j++) {
		if(num ==numList.get(j)) {
			cnt++;
					}
				}
	//if(numList.indexOf(num)!=-1){ cnt++;}
			}
	System.out.println("맞춘 갯수:"+cnt);
		}
}
	

	

