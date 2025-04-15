package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	public String getMychoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		String hand = null;
		boolean i = false;

		while(i != true) {
			Scanner scanner = new Scanner(System.in);

			hand = scanner.next();

			if (hand.equals("s") || hand.equals("p") || hand.equals("r")) {
				i=true;

			} else {
				System.out.println("エラーです再入力してください");
			}
		}

		return hand;

	}

	public String getRandom() {
		String[] janken = {"パー","チョキ","グー"};
		
		int i=(int)Math.floor(Math.random()*3);
		
		String emhand = janken[i];
		
		return emhand;
		
	}

	public void playGame() {
		HashMap<String,String> jankenlist = new HashMap<String,String>();
		
		jankenlist.put("p","パー");
		jankenlist.put("r","グー");
		jankenlist.put("s","チョキ");
		
		String myhand=getMychoice();
		
		String enmhand=getRandom();
		
		System.out.println("自分の手は"+jankenlist.get(myhand)+",対戦相手の手は"+enmhand);
		
		if(jankenlist.get(myhand).equals(enmhand)) {
			System.out.println("あいこです");
		}else if((myhand.equals("p")&&enmhand.equals("グー"))||(myhand.equals("s")&&enmhand.equals("パー"))||(myhand.equals("r")&&enmhand.equals("チョキ"))) {
			System.out.println("あなたの勝ちです");
		}else {
			System.out.println("あなたの負けです");
		}
		
		
	}
}
