package com.nolesiak.springhttpclient.countryinfoservices;

import com.nolesiak.springhttpclient.countryinfoapi.domain.CountryInfo;

public interface CountryInfoApiService {
    CountryInfo[] getCountryInfo(String countryName);
    CountryInfo[] getAllCountriesInfo();
}
