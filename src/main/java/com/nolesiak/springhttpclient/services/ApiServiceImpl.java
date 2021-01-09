package com.nolesiak.springhttpclient.services;

import com.nolesiak.springhttpclient.api.domain.CountryInfo;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiServiceImpl implements ApiService {

    private RestTemplate restTemplate;

    public ApiServiceImpl(RestTemplate restTemplate){
        this.restTemplate = restTemplate;

    }

    @Override
    public CountryInfo[] getCountryInfo(String countryName) {

        CountryInfo[] countryInfos = restTemplate.getForObject
                                    ("https://restcountries.eu/rest/v2/name/" + countryName, CountryInfo[].class);
        return countryInfos;
    }
}
