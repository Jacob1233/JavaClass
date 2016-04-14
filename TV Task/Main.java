public class Main {

	public static void main(String[] args) {
		TV tv1 = new TV();
		tv1.turnOn();
		tv1.setChannel(30);
		tv1.setVolume(3);

		TV tv2 = new TV();
		tv2.turnOn();
		tv2.channelUp();
		tv2.channelUp();
		tv2.volumeUp();

		TV tv3 = new TV();
		tv3.setChannel(30);
		tv3.channelUp();
		tv3.volumeUp();

		System.out.println("tv1's channel: " + tv1.channel);
		System.out.println("tv1's volume:  " + tv1.volume);
		System.out.println("tv2's channel: " + tv2.channel);
		System.out.println("tv2's volume:  " + tv2.volume);
		System.out.println("tv3's channel: " + tv3.channel);
		System.out.println("tv3's volume:  " + tv3.volume);

	}

}
