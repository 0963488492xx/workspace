package com.example.demo.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RssController {
	
	private String result;
	
	@GetMapping(path = "/rssreader.controller", produces = "applciation/xml;charset=UTF-8")
	@ResponseBody
	public String processRssAction() throws Exception {
		Thread t1 = new Thread() {
			public void run() {
				URI uri;
				try {
					uri = new URI("https://www.mohw.gov.tw/rss-16-1.html");
					URL url = uri.toURL();
					HttpURLConnection conn = (HttpURLConnection)url.openConnection();
					conn.setRequestMethod("GET");
					conn.setDoInput(true);
					conn.connect();
					
//					InputStream is1 = conn.getInputStream();
//					InputStreamReader isr1 = new InputStreamReader(is1);
//					BufferedReader br1 = new BufferedReader(isr1);
					
					BufferedReader br1 = new BufferedReader(new InputStreamReader(conn.getInputStream()));
					
					String data = "";
					result = "";
					while((data=br1.readLine())!=null) {
						result += data;
					}
					br1.close();
					conn.disconnect();				
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		};
		
		t1.start();
		t1.join();
		
		System.out.println("result:" + result);
		return result;
		
	}

}
