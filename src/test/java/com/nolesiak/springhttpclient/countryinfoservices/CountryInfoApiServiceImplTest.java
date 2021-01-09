package com.nolesiak.springhttpclient.countryinfoservices;

import com.nolesiak.springhttpclient.countryinfoapi.domain.CountryInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class CountryInfoApiServiceImplTest {

    @Autowired
    CountryInfoApiService apiService;

    @Test
    public void testGetCountryInfo() throws Exception{
        CountryInfo[] countryInfos = apiService.getCountryInfo("Poland");

        Assertions.assertEquals(1,countryInfos.length);
    }

    @Test
    public void  testGetAllCountriesInfo() throws Exception{
        CountryInfo[] countryInfos = apiService.getAllCountriesInfo();

        Assertions.assertEquals(250,countryInfos.length);
    }
}
