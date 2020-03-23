package ex38;

import java.util.Scanner;

public class Main {

	// 문제
	// 치킨쿠폰 재귀
	// 쿠폰 몇개있는지와 도장을 몇개받아야 쿠폰을 주는지를 입력
	
	public static void doFunc(int coupon, int stamp, int k, int ans) {
		if (coupon > 0) {
			coupon--;
			stamp++;
			ans++;
			doFunc(coupon, stamp, k, ans);
			return;
		} else if (stamp > 0){
		    if (stamp/k > 0) {
		    	stamp -= k;
		    	coupon++;
		    	doFunc(coupon, stamp, k, ans);
		    }
		}
		if (coupon == 0 && stamp/k == 0) {
			System.out.println(ans);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k;
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		k = s.nextInt();
		int coupon = n;
		
		doFunc(coupon, 0, k, 0);
	}

}
