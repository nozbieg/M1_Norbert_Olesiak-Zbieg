
package com.nolesiak.springhttpclient.countryinfoapi.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Language implements Serializable
{

    public String iso6391;
    public String iso6392;
    public String name;
    public String nativeName;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -4384490929028580382L;

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
