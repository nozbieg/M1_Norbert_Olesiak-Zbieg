package com.nolesiak.springhttpclient.dogimageservices;


import com.nolesiak.springhttpclient.dogimageapi.domain.DogImage;

import com.nolesiak.springhttpclient.dogimageapi.domain.DogImageByBreed;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.util.Assert;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class DogImageApiServiceImplTest {

    @Autowired
    DogImageApiService apiService;

    @Test
    public void testGetDogImage() throws Exception{
        DogImage dogImage = apiService.getDogImage();
        Assert.notNull(dogImage);
    }

    @Test
    public void testGetDogImagesByBreed() throws Exception{
        DogImageByBreed dogImages = apiService.getDogImagesByBreed("akita");
        Assertions.assertEquals(9,dogImages.message.length);
    }
}
