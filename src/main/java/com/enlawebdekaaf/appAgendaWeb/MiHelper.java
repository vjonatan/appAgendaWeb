package com.enlawebdekaaf.appAgendaWeb;

import org.apache.commons.codec.digest.DigestUtils;

public class MiHelper 
{
	public String encrypt (String texto){
		
		String key = "uhnskgilgkbmnk";
		
		String textoEncriptado = DigestUtils.sha512Hex(texto + key);
		
		return textoEncriptado;
				
	}
}
