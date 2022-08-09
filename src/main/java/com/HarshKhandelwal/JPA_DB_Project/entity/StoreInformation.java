package com.HarshKhandelwal.JPA_DB_Project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StoreInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer storeID;
    private String storeName;
    private String storeDetails;
    private String storePhoneNumber;

    public StoreInformation() {
    }

    public StoreInformation(String storeName, String storeDetails, String storePhoneNumber) {
        this.storeName = storeName;
        this.storeDetails = storeDetails;
        this.storePhoneNumber = storePhoneNumber;
    }

    @Override
    public String toString() {
        return "StoreInformation{" +
                "storeID=" + storeID +
                ", storeName='" + storeName + '\'' +
                ", storeDetails='" + storeDetails + '\'' +
                ", storePhoneNumber='" + storePhoneNumber + '\'' +
                '}';
    }

    public Integer getStoreID() {
        return storeID;
    }

    public void setStoreID(Integer storeID) {
        this.storeID = storeID;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreDetails() {
        return storeDetails;
    }

    public void setStoreDetails(String storeDetails) {
        this.storeDetails = storeDetails;
    }

    public String getStorePhoneNumber() {
        return storePhoneNumber;
    }

    public void setStorePhoneNumber(String storePhoneNumber) {
        this.storePhoneNumber = storePhoneNumber;
    }
}
