package com.example.sante;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.sante.Adapter.VaccineAdapter;

public class Vaccines extends AppCompatActivity {

    RecyclerView recyclerView;
    VaccineAdapter vaccineAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vaccines);

        recyclerView = (RecyclerView) findViewById(R.id.RecyclerViewVaccine);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        vaccineAdapter = new VaccineAdapter(this);
        recyclerView.setAdapter(vaccineAdapter);
    }
}