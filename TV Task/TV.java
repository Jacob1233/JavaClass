public class TV {

	public int channel;
	public int volume;
	public boolean on;

	public TV() {
		this.channel = 1;
		this.volume = 1;
		this.on = false;
	}

	public void turnOn() {
		on = true;
	}

	public void turnOff() {
		on = false;
	}

	public void setChannel(int c) {
		if (on == true) {
			channel = c;
		}

	}

	public void setVolume(int v) {
		if (on == true) {
			volume = v;
		}

	}

	public void channelUp() {
		if (on == true) {
			channel += 1;
		}

	}

	public void channelDown() {
		if (on == true) {
			channel -= 1;
		}

	}

	public void volumeUp() {
		if (on == true) {
			volume += 1;
		}

	}

	public void volumeDown() {
		if (on == true) {
			volume -= 1;
		}

	}

}
