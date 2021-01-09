
package com.nolesiak.springhttpclient.countryinfoapi.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Getter
@Setter
public class RegionalBloc implements Serializable
{

    public String acronym;
    public String name;
    public List<Object> otherAcronyms = null;
    public List<Object> otherNames = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 2535730307579269324L;

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
