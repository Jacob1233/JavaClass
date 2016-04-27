import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Fetch {
	public static String getHTML(String urlToRead) throws Exception {
		StringBuilder result = new StringBuilder();
		URL url = new URL(urlToRead);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		BufferedReader rd = new BufferedReader(new InputStreamReader(
				conn.getInputStream()));
		String line;
		while ((line = rd.readLine()) != null) {
			result.append(line);
		}
		rd.close();
		return result.toString();
	}

	//http://stackoverflow.com/questions/326390/how-to-create-a-java-string-from-the-contents-of-a-file
	public static String getFileContents(String path) throws IOException {
		byte[] encoded = Files.readAllBytes(Paths.get(path));
		return new String(encoded, StandardCharsets.UTF_8);
	}
	
	public static void getAverageAndMax(String str) {
		
		String[] lines = str.split(System.getProperty("line.separator"));
		int sum = 0;
		int count = 0;
		int max = Integer.parseInt(lines[0]);
		for (int i = 0; i < lines.length; i++) {
			
			int n = Integer.parseInt(lines[i]);
			
			if (n > max) {
				max = n;
			}
			sum += n;
			count++;
		}
		
		int average = sum / count;
		
		System.out.println("The average is " + average);
		System.out.println("The max is " + max);
	}
}