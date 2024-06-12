package com.gabyferrari.workshopmongo.resources.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class URL {

	//static para nao precisar instanciar o obj
	public static String decodeParam(String text) { //metodo para decodificar parametro de URL por ex "bom%20dia"
		try {
			return URLDecoder.decode(text, "UTF-8");
		} catch (UnsupportedEncodingException e) { //se der problema quando tentar decodificar, irá retornar a String vazia
			return "";
		}
	}
}
