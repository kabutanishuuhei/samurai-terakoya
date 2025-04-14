package kadai_018;

abstract public class Kato_Chapter18 {
	String familyName="加藤";
	String givenName;
	String address="東京都中野区〇×";
	
	
	
	//共通、住所
	public void commonlntroduce() {
		System.out.println("名前は"+familyName+givenName+"です");
		System.out.println("住所は"+address+"です");
	}
	//個別、名前
    abstract void eachlntroduce();	
    //紹介
    public void execlntroduce() {
    	commonlntroduce();
    	eachlntroduce();
    	System.out.println();
    }
}
