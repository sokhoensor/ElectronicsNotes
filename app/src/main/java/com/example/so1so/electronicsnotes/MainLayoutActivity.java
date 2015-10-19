package com.example.so1so.electronicsnotes;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainLayoutActivity extends AppCompatActivity
{
    ListAdapter lstAdapter;
    ArrayAdapter<CharSequence> dataAdapter;
    ListView listViewMenu;
    String[] mainMenuList = {"Resistor", "Capacitor", "Inductor", "Transformer", "Transistor BJ", "Transistor MOS", "Transistor J",
            "Integrated circuit IC", "Logic", "TRIAC", "Micro-controler", "Micro-processor", "DC circuit", "AC circuit",
            "Thermodynamics", "Refrigeration", "VLSI", "555 Timer"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        dataAdapter = ArrayAdapter.createFromResource(this, R.array.main_menu, android.R.layout.simple_list_item_1);
        listViewMenu = (ListView) findViewById(R.id.lv_layout);
        lstAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mainMenuList);
        listViewMenu.setAdapter(dataAdapter);
    }
}
