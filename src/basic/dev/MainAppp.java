package basic.dev;

import java.util.Scanner;

public class MainAppp {
/**
 * Check so tuoi nhap vao tren hay duoi 18
 * @param args
 */
	static void checkAge(int checkvalue) throws AgeException {
		if(checkvalue <18) throw new AgeException("Em chua 18 con non va xanh lam");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap gia tri tuoi:");
		int val = sc.nextInt();
		try {
			checkAge(val);
		} catch (AgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
