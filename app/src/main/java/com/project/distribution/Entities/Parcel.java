package com.project.distribution.Entities;
import android.location.Address;
import android.location.Location;
import android.provider.ContactsContract;

import java.util.Date;
import java.util.WeakHashMap;

public class Parcel {

    private static int idnum=1;
    private int id;
    private ParcelKind p;
    private boolean isFragile;
    private Weight w;
    private Location location;
    private String name;
    private String address;
    private String phone;
    private String email;
    private ParcelStatus parcelStatus;

    public Parcel(String pkind, boolean isFragile, float w, Location location, String name, String address,
                  String phone,
                  String email, ParcelStatus parcelStatus) {
        id=idnum;
        idnum+=1;

        this.isFragile = isFragile;
        if (w<0.5)
            this.w=Weight.LESS_THEN_500_G;
        if (w<1&&w>=0.5)
            this.w= Weight.LESS_THEN_KG;
        if (w<5&&w>=1)
            this.w=Weight.LESS_THEN_5_KG;
        if (w>=5)
            this.w=Weight.LESS_THEN_20_KG;

        this.location = location;
        this.name = name;
        this.address = address;


        switch (pkind){
            case "envelope":
                p= Parcel.ParcelKind.ENVELOPE;
                break;
            case "littel parcel":
                p=Parcel.ParcelKind.LITTEL_PARCEL;
                break;
            case "big parcel":
                p=Parcel.ParcelKind.BIG_PARCEL;
                break;
        }

        this.phone = phone;
        this.email = email;
        this.parcelStatus = parcelStatus;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ParcelStatus getParcelStatus() {
        return parcelStatus;
    }

    public void setParcelStatus(ParcelStatus parcelStatus) {
        this.parcelStatus = parcelStatus;
    }




    public enum Weight {
        LESS_THEN_500_G,LESS_THEN_KG,LESS_THEN_5_KG,LESS_THEN_20_KG;
    }

    public enum ParcelKind {
        ENVELOPE,LITTEL_PARCEL,BIG_PARCEL;
    }

    public enum ParcelStatus {
        WAIT,HAVE_DELIVER,ON_WAY,ACCEPT;
    }
}
