package br.com.IFPB.screenMatch;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.IFPB.screenMatch.models.DadosSeries;
import br.com.IFPB.screenMatch.services.ConsumoAPI;
import br.com.IFPB.screenMatch.services.ConverterDados;

@SpringBootApplication
public class ScreenMatchApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ScreenMatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		//System.out.println("Meu Primeiro Projeto SpringBoot");
		ConsumoAPI consumoAPI = new ConsumoAPI();
		var json = consumoAPI.obterDados("http://www.omdbapi.com/?i=tt3896198&apikey=8bf564d2");
		System.out.println(json);
		ConverterDados conversor = new ConverterDados();
		DadosSeries dados = conversor.ObterDados(json,DadosSeries.class);
		System.out.println(dados);


	}



}
