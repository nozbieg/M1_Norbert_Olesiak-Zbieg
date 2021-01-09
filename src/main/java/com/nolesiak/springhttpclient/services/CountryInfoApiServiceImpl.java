package com.nolesiak.springhttpclient.services;

import com.nolesiak.springhttpclient.countryinfoapi.domain.CountryInfo;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CountryInfoApiServiceImpl implements CountryInfoApiService {

    private RestTemplate restTemplate;

    public CountryInfoApiServiceImpl(RestTemplate restTemplate){
        this.restTemplate = restTemplate;

    }

    @Override
    public CountryInfo[] getCountryInfo(String countryName) {

        CountryInfo[] countryInfos = restTemplate.getForObject
                                    ("https://restcountries.eu/rest/v2/name/" + countryName, CountryInfo[].class);
        return countryInfos;
    }
}
