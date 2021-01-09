
package com.nolesiak.springhttpclient.countryinfoapi.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
@Getter
@Setter
public class Translations implements Serializable
{

    public String de;
    public String es;
    public String fr;
    public String ja;
    public String it;
    public String br;
    public String pt;
    public String nl;
    public String hr;
    public String fa;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 463245518710542895L;

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
