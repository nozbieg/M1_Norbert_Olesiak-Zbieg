
package com.nolesiak.springhttpclient.api.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Currency implements Serializable
{

    public String code;
    public String name;
    public String symbol;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 8550958523678251459L;

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
