package com.techelevator.services;

import com.techelevator.model.CatPic;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.techelevator.model.CatFact;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

@Component
public class RestCatFactService implements CatFactService {
<<<<<<< HEAD


		private RestTemplate restTemplate = new RestTemplate();


		@Override
		public CatFact getFact() {
			 CatFact catFact = null;

			try {
				CatFact response =
						restTemplate.getForObject("https://cat-data.netlify.app/api/facts/random", CatFact.class);
				catFact = response;
			} catch (RestClientResponseException | ResourceAccessException e) {

			}
			return catFact;

		}

=======
	
	private RestTemplate restTemplate = new RestTemplate();
	@Override
	public CatFact getFact() {
		CatFact catFact = null;
		try
		{
			CatFact response =
					restTemplate.getForObject("https://cat-data.netlify.app/api/facts/random", CatFact.class);
			catFact = response;
		} catch (RestClientResponseException | ResourceAccessException e)
		{
		
		}
		return catFact;
		// TODO Auto-generated method stub
	}
	
>>>>>>> a4927c35f4f2d11b2f9adedee07a675dabd6e645

}
