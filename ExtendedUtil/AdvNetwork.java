package ExtendedUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public final class AdvNetwork {
	public String getHTML(String url) throws IOException {
		URL Url = null;
		URLConnection Cnt = null;
		BufferedReader Br = null;
		try {Url = new URL(url);} catch (MalformedURLException e) {
			System.err.println("'" + url + "' is not a valid url address.");
			e.printStackTrace();
		}
		try {Cnt = Url.openConnection();} catch (IOException e) {
			e.printStackTrace();
		}
		try {Br = new BufferedReader(new InputStreamReader(Cnt.getInputStream()));} catch (IOException e) {
			e.printStackTrace();
		}
		String content;
		
		while((content = Br.readLine()) != null){}
        Br.close();
        
        return content;
	}
}
