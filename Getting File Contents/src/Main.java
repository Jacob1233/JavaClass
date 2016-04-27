import java.io.IOException;

public class Main {

	public static void main(String[] args) {
			
		try {
			Fetch.getAverageAndMax(Fetch.getFileContents("src/numbers.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
