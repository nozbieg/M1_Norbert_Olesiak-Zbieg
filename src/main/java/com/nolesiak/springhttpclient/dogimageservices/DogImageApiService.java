package com.nolesiak.springhttpclient.dogimageservices;

import com.nolesiak.springhttpclient.dogimageapi.domain.DogImage;
import com.nolesiak.springhttpclient.dogimageapi.domain.DogImageByBreed;

public interface DogImageApiService {
    DogImage getDogImage();
    DogImageByBreed getDogImagesByBreed(String breed);

}
