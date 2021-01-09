package com.nolesiak.springhttpclient.services;

import com.nolesiak.springhttpclient.api.domain.CountryInfo;

public interface ApiService {
    CountryInfo[] getCountryInfo(String countryName);
}
