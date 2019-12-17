package com.module;

import java.io.Serializable;

public class ProvisioningModel implements Serializable {

    private String identityUrl;
    private String baseUrl;
    private String apiKey;
    private String serialNumber;

    public ProvisioningModel() {}

    public ProvisioningModel(String identityUrl, String baseUrl, String apiKey, String serialNumber) {
        this.identityUrl = identityUrl;
        this.baseUrl = baseUrl;
        this.apiKey = apiKey;
        this.serialNumber = serialNumber;
    }

    public String getIdentityUrl() {
        return identityUrl;
    }

    public void setIdentityUrl(String identityUrl) {
        this.identityUrl = identityUrl;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
