package com.techelevator.services;

<<<<<<< HEAD
import org.jboss.logging.BasicLogger;
=======
>>>>>>> a4927c35f4f2d11b2f9adedee07a675dabd6e645
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.techelevator.model.CatPic;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
=======
>>>>>>> a4927c35f4f2d11b2f9adedee07a675dabd6e645
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

@Component
public class RestCatPicService implements CatPicService {
<<<<<<< HEAD
    private RestTemplate restTemplate = new RestTemplate();


    @Override
    public CatPic getPic() {
        CatPic catPic = null;

        try {
            CatPic response =
                    restTemplate.getForObject("https://cat-data.netlify.app/api/pictures/random", CatPic.class);
            catPic = response;
        } catch (RestClientResponseException | ResourceAccessException e) {

        }
        return catPic;

    }
=======
	private RestTemplate restTemplate = new RestTemplate();
	@Override
	public CatPic getPic() {
		CatPic response = null;
		try
		{
			response =
					restTemplate.getForObject("https://cat-data.netlify.app/api/pictures/random",  CatPic.class);
		} catch (RestClientResponseException | ResourceAccessException e)
		{
		
		}
		return response;
		// TODO Auto-generated method stub
	}
	

>>>>>>> a4927c35f4f2d11b2f9adedee07a675dabd6e645

}	
