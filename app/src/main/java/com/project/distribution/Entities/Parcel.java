package com.project.distribution.Entities;
import android.location.Address;
import android.location.Location;
import android.provider.ContactsContract;

import java.util.Date;

public class Parcel {

    private static int idnum=1;
    private int id;
    private ParcelKind p;
    private boolean isFragile;
    private Weight w;
    private Location location;
    private String name;
    private Address address;

    private ContactsContract.CommonDataKinds.Phone phone;
    private ContactsContract.CommonDataKinds.Email email;
    private ParcelStatus parcelStatus;
    private String deliverName;

    public Parcel(ParcelKind p, boolean isFragile, Weight w, Location location, String name, Address address,
                    ContactsContract.CommonDataKinds.Phone phone,
                  ContactsContract.CommonDataKinds.Email email, ParcelStatus parcelStatus, String deliverName) {
        id=idnum;
        idnum+=1;
        this.p = p;
        this.isFragile = isFragile;
        this.w = w;
        this.location = location;
        this.name = name;
        this.address = address;

        this.phone = phone;
        this.email = email;
        this.parcelStatus = parcelStatus;
        this.deliverName = deliverName;
    }


    public int getId() {
        return id;
    }

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
