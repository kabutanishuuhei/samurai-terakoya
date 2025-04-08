package kadai_015;

public class Car_Chapter15 {
	
	private int gear=1;
	
	private int speed=10;
	
	public  void gearChange(int afterGear) {
		System.out.println("ギア"+gear+"から"+afterGear+"に切り替えました");
		gear=afterGear;
	}
	public void run() {
		if(gear>=1&&gear<=5) {
			System.out.println("速度は時速"+gear*speed+"です");
		}else {
		System.out.println("速度は時速"+speed+"です");
		}
	}
}
