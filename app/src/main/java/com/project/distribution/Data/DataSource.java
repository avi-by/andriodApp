package com.project.distribution.Data;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.project.distribution.Entities.Parcel;

import java.util.ArrayList;
import java.util.List;

public class DataSource {
    private static ArrayList<Parcel> parcelList= new ArrayList<Parcel>() ;

    public static ArrayList<Parcel> getParcelList(){return parcelList;}
    public static void addParcel(Parcel p){
        parcelList.add(p);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("parcels");

        myRef.push().setValue(p);
    }
}
