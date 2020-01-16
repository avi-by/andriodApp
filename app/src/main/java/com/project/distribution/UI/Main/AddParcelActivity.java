package com.project.distribution.UI.Main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.project.distribution.Data.DataSource;
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
        final EditText phone = (EditText) findViewById(R.id.phone);
        Button button = (Button) findViewById(R.id.add_button);
        final EditText email = (EditText) findViewById(R.id.email);
        final EditText name = (EditText) findViewById(R.id.name);
        final EditText address = (EditText) findViewById(R.id.address);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO check the input of the add parcel
                Location l =new Location("");
                l.setLatitude(31.765739);
                l.setLongitude(35.191110);
                try {
                    Parcel p = new Parcel((String)spinner.getSelectedItem(),fragile.isChecked(),Float.parseFloat(weight.getText().toString()), l,
                            name.getText().toString(),address.getText().toString(),phone.getText().toString(),email.getText().toString(), Parcel.ParcelStatus.WAIT);
                    DataSource.addParcel(p);
                    Snackbar.make(v, R.string.add_parcel, Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                    Intent myIntent = new Intent(AddParcelActivity.this , MainActivity.class);
                    startActivity(myIntent);
                }catch (Exception e){
                    Snackbar.make(v, R.string.error_add_parcel, Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }

            }
        });
    }
}
