package com.project.distribution.Entities;
import android.location.Address;
import android.location.Location;
import android.provider.ContactsContract;

import java.util.Date;

import andriod.location.Location;

public class Parcel {

    private ParcelKind p;
    private boolean isFragile;
    private Weight w;
    private Location location;
    private String name;
    private Address address;
    private Date sendDate;
    private Date incomeDate;
    private ContactsContract.CommonDataKinds.Phone phone;
    private ContactsContract.CommonDataKinds.Email email;
    private ParcelStatus parcelStatus;
    private String deliverName;

    public ParcelKind getP() {
        return p;
    }

    public void setP(ParcelKind p) {
        this.p = p;
    }

    public boolean isFragile() {
        return isFragile;
    }

    public void setFragile(boolean fragile) {
        isFragile = fragile;
    }

    public Weight getW() {
        return w;
    }

    public void setW(Weight w) {
        this.w = w;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public Date getIncomeDate() {
        return incomeDate;
    }

    public void setIncomeDate(Date incomeDate) {
        this.incomeDate = incomeDate;
    }

    public ContactsContract.CommonDataKinds.Phone getPhone() {
        return phone;
    }

    public void setPhone(ContactsContract.CommonDataKinds.Phone phone) {
        this.phone = phone;
    }

    public ContactsContract.CommonDataKinds.Email getEmail() {
        return email;
    }

    public void setEmail(ContactsContract.CommonDataKinds.Email email) {
        this.email = email;
    }

    public ParcelStatus getParcelStatus() {
        return parcelStatus;
    }

    public void setParcelStatus(ParcelStatus parcelStatus) {
        this.parcelStatus = parcelStatus;
    }

    public String getDeliverName() {
        return deliverName;
    }

    public void setDeliverName(String deliverName) {
        this.deliverName = deliverName;
    }

    enum Weight {
        LESS_THEN_500_G,LESS_THEN_KG,LESS_THEN_5_KG,LESS_THEN_20_KG;
    }

    enum ParcelKind {
        ENVELOPE,LITTEL_PARCEL,BIG_PARCEL;
    }

    enum ParcelStatus {
        WAIT,HAVE_DELIVER,ON_WAY,ACCEPT;
    }
}
