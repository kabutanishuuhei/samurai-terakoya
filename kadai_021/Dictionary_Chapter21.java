package kadai_021;

import java.util.HashMap;



public class Dictionary_Chapter21 {
	
	HashMap <String,String> zisyo = new HashMap<String,String>();
	
	public  Dictionary_Chapter21() {
		zisyo.put("apple", "りんご");
		zisyo.put("peach", "桃");
		zisyo.put("banana", "バナナ");
		zisyo.put("lemon", "レモン");
		zisyo.put("pear", "梨");
		zisyo.put("kiwi", "キウイ");
		zisyo.put("strawberry", "いちご");
		zisyo.put("grape", "ぶどう");
		zisyo.put("muscat", "マスカット");
		zisyo.put("cherry", "さくらんぼ");
		
		
	}
	public void Investigate(String Hname) {
		
		if(zisyo.get(Hname)==null) {
			System.out.println(Hname+"は辞書には存在しません");
		}else{
			System.out.println(Hname+"の意味は"+zisyo.get(Hname));
		}
	}
	
	
}
