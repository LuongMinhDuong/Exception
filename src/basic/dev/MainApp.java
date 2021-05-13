package basic.dev;

import java.util.Scanner;

public class MainApp {
	static void checkConnection(boolean isConnect) throws NetWorkException{
		if(!isConnect) throw new NetWorkException("Not internet connection");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean isConnect = sc.nextBoolean();
		try {
			checkConnection(isConnect);
		} catch (NetWorkException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}


