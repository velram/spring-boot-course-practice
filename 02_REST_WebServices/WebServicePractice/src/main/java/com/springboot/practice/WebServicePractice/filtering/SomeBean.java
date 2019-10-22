package com.springboot.practice.WebServicePractice.filtering;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//To ignore multiple properties at a time use @JsonIgnoreProperties
@JsonIgnoreProperties(value = {"kafkaClientPassword", "userSecurityCode"})
public class SomeBean {

    private String id;
    private String name;
    //To ignore single property at a time use @JsonIgnoreProperties
    @JsonIgnore
    private String encryptionKey;

    private String kafkaClientPassword;
    private String userSecurityCode;

    public SomeBean(String id, String name, String encryptionKey, String kafkaClientPassword, String userSecurityCode) {
        this.id = id;
        this.name = name;
        this.encryptionKey = encryptionKey;
        this.kafkaClientPassword = kafkaClientPassword;
        this.userSecurityCode = userSecurityCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEncryptionKey() {
        return encryptionKey;
    }

    public void setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    public String getKafkaClientPassword() {
        return kafkaClientPassword;
    }

    public void setKafkaClientPassword(String kafkaClientPassword) {
        this.kafkaClientPassword = kafkaClientPassword;
    }

    public String getUserSecurityCode() {
        return userSecurityCode;
    }

    public void setUserSecurityCode(String userSecurityCode) {
        this.userSecurityCode = userSecurityCode;
    }
}
