package com.example.camilq.combinaciontys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ToggleButton toggleButton;
    Spinner spinner;
    List list = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = (Spinner) findViewById(R.id.spinner);

        toggleButton = (ToggleButton) findViewById(R.id.toggle);
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b == true){
                    list.clear();
                    list.add("Jhonny");
                    list.add("Mauricio");
                    list.add("Juan Pablo");
                    list.add("Andres Felipe");
                    list.add("Diego");
                    list.add("Isabel");
                    list.add("Camilo");
                    list.add("Juan Camilo");
                    list.add("Diego Andres");
                    list.add("Edward");
                    list.add("David");
                    list.add("Johana");
                    list.add("Erika");
                    list.add("Juan Gabriel");
                    list.add("Jhonatan");
                    list.add("Hector");


                }else{
                    list.clear();
                    list.add("Ospina");
                    list.add("Zuluaga");
                    list.add("Ocampo");
                    list.add("Montoya");
                    list.add("Londoño");
                    list.add("Zapata");
                    list.add("Quintero");
                    list.add("Salinas");
                    list.add("Londoño");
                    list.add("Salazar");
                    list.add("Montoya");
                    list.add("Tangarife");
                    list.add("Garcia");
                    list.add("Herrera");
                    list.add("Alzate");
                    list.add("Alzate");
                }
            }

        });

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, String.valueOf(spinner.getSelectedItem()),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



    }
}
