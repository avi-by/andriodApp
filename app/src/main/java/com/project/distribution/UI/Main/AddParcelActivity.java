package com.project.distribution.UI.Main;

import androidx.appcompat.app.AppCompatActivity;

import android.location.Location;
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
        final EditText weight=(EditText) findViewById(R.id.weight);
        EditText phone = (EditText) findViewById(R.id.phone);
        Button button = (Button) findViewById(R.id.add_button);
        final EditText email = (EditText) findViewById(R.id.email);
        final EditText name = (EditText) findViewById(R.id.name);
        final EditText address = (EditText) findViewById(R.id.address);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO check the input of the add parcel

                Parcel p = new Parcel((String)spinner.getSelectedItem(),fragile.isChecked(),Float.parseFloat(weight.getText().toString()), Location,
                        name.getText().toString(),address.getText().toString(),email.getText().toString());
            }
        });
    }
}
