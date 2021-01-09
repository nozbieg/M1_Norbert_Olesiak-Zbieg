package com.nolesiak.springhttpclient.services;

import com.nolesiak.springhttpclient.countryinfoapi.domain.CountryInfo;

public interface CountryInfoApiService {
    CountryInfo[] getCountryInfo(String countryName);
}
