package br.com.jkavdev.listatelefonica.service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.jkavdev.listatelefonica.model.Contato;
import br.com.jkavdev.listatelefonica.model.Operadora;

@Service
public class ListaTelefonicaService {

	public List<Contato> contatos() {

		Operadora oi = new Operadora("oi", "14", "celular", 2);
		Operadora vivo = new Operadora("vivo", "15", "celular", 1);
		Operadora tim = new Operadora("tim", "41", "celular", 32);
		Operadora gvt = new Operadora("gvt", "25", "fixo", 1);
		Operadora embratel = new Operadora("embratel", "21", "fixo", 2);

		return Arrays.asList(new Contato("Bruno", "9999-2222", new Date(), oi),
				new Contato("Sandra", "9934-5554", new Date(), vivo),
				new Contato("Mariana", "9922-0468", new Date(), tim));
	}

	public List<Operadora> operadoras() {
		return Arrays.asList(new Operadora("oi", "14", "celular", 2), new Operadora("vivo", "15", "celular", 1),
				new Operadora("tim", "41", "celular", 32), new Operadora("gvt", "25", "fixo", 1));
	}

}
