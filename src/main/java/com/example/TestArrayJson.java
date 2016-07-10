package com.example;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import com.google.gson.Gson;

public class TestArrayJson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ---------------------------------------------- TESTE 3 Trabalhando
		 * com um array de strings ---------------------------------------------
		 */

		// instancia um novo JSONObject
		JSONObject my_obj = new JSONObject();

		// preenche o objeto
		my_obj.put("titulo", "JSON x XML: a Batalha Final");
		my_obj.put("ano", 2012);

		// cria um JSONArray e preenche com valores string
		JSONArray my_genres = new JSONArray();

		my_genres.put("aventura");
		my_genres.put("ação");
		my_genres.put("ficção");

		// insere o array no JSONObject com o rótulo "generos"
		my_obj.put("generos", my_genres);

		// serializa para uma string e imprime
		String json_string = my_obj.toString();
		//System.out.println(json_string);
		objectToJson();

	}

	public Pax loadUserFromJSONGson(String jsonString) {
		Gson gson = new Gson();
		Pax pax = gson.fromJson(jsonString, Pax.class);
		return pax;
	}

	private static void objectToJson() {
		
		FilterRefund fr = new FilterRefund();
		//fr.setRefundlist(new ArrayList<>());
		fr.setCod(0);
		fr.setMsg("consulta realizada com sucesso");
		fr.setTotalfound(50);
		for(int i =1 ; i <50 ; i++){
		
		
		Pax pax = new Pax();
		pax.setName("zezinho");
		pax.setLastname("testador");
		pax.setCanal("SAC");
		pax.setCodstatus("fafda");
		pax.setDatesoli("12/12/2012");
		pax.setDescstatus("teste");
		pax.setNumra("1321323");
		pax.setNumticket("fdafa1212");
		
		pax.setFrom(new Origin());
		
		pax.getFrom().setAeroporto("congonhas");
		pax.getFrom().setCidade("são paulo");
		pax.getFrom().setData("12/12/2016");
		pax.getFrom().setHora("12:12");
		pax.getFrom().setVoo(String.valueOf(1*4));
		
		pax.setTo(new Destino());
		pax.getTo().setAeroporto("guarulhos");
		pax.getTo().setCidade("rio de janeiro");
		pax.getTo().setData("12/12/2017");
		pax.getTo().setHora("14:20");
		pax.getTo().setVoo(String.valueOf(1*5));
		
	
		
		
		fr.refundlist.put("pax:"+i, pax);
	
		
		
		}
		
		Gson gson = new Gson();
		String userJSONString = gson.toJson(fr);
		

        System.out.println(userJSONString);
	
	}

}
