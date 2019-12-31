package com.project.distribution.UI.Main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

import com.project.distribution.Entities.Parcel;
import com.project.distribution.R;

public class AddParcelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_parcel);
        final Spinner spinner = (Spinner) findViewById(R.id.parcelType);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.parcelType, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        final CheckBox fragile =  (CheckBox) findViewById(R.id.fragile);
        EditText phone = (EditText) findViewById(R.id.phone);
        Button button = (Button) findViewById(R.id.add_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: somthing more flex for the the enums
                //TODO check the input of the add parcell
                Parcel.ParcelKind parcelKind;
                switch ((String)spinner.getSelectedItem()){
                    case "envelope":
                        parcelKind= Parcel.ParcelKind.ENVELOPE;
                        break;
                    case "littel parcel":
                        parcelKind=Parcel.ParcelKind.LITTEL_PARCEL;
                        break;
                    case "big parcel":
                        parcelKind=Parcel.ParcelKind.BIG_PARCEL;
                        break;
                }
                Parcel p = new Parcel(parcelKind,fragile.isChecked())
            }
        });
    }
}
