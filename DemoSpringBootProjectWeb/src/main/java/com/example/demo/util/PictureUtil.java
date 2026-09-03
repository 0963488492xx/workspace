package com.example.demo.util;

import java.util.Base64;

public class PictureUtil {

	
	public static String convertByteArrayToBase64(byte[] data) {
		Base64.Encoder encoder = Base64.getEncoder();
		String base64String = encoder.encodeToString(data);
		return base64String;
	}
}
