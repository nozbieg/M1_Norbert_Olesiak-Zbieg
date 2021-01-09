package com.nolesiak.springhttpclient.dogimageservices;

import com.nolesiak.springhttpclient.dogimageapi.domain.DogImage;
import com.nolesiak.springhttpclient.dogimageapi.domain.DogImageByBreed;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DogImageApiServiceImpl implements DogImageApiService {

    private RestTemplate restTemplate;

    public DogImageApiServiceImpl(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }
    @Override
    public DogImage getDogImage(){
        DogImage dogImage = restTemplate.getForObject("https://dog.ceo/api/breeds/image/random", DogImage.class);
        return  dogImage;
    }

    @Override
    public DogImageByBreed getDogImagesByBreed(String breed){
        DogImageByBreed dogImages = restTemplate.getForObject
                                    ("https://dog.ceo/api/breed/"+breed+"/images", DogImageByBreed.class);
        return dogImages;
    }
}
