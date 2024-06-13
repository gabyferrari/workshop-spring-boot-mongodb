package com.gabyferrari.workshopmongo.resources.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class URL {

	//static para nao precisar instanciar o obj
	public static String decodeParam(String text) { //metodo para decodificar parametro de URL por ex "bom%20dia"
		try {
			return URLDecoder.decode(text, "UTF-8");
		} catch (UnsupportedEncodingException e) { //se der problema quando tentar decodificar, irá retornar a String vazia
			return "";
		}
	}
	
	public static Date convertDate(String textDate, Date defaultValue) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		try {
			return sdf.parse(textDate);
		} catch (ParseException e) {
			return defaultValue;
		}
	}
}
