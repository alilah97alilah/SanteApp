package com.example.sante;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.sante.Adapter.MyOrdersAdapter;
import com.example.sante.Adapter.VaccineAdapter;

public class MyOrders extends AppCompatActivity {

    RecyclerView recyclerView;
    MyOrdersAdapter myOrdersAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_orders);

        recyclerView = (RecyclerView) findViewById(R.id.RecyclerMyOrders);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        myOrdersAdapter = new MyOrdersAdapter(this);
        recyclerView.setAdapter(myOrdersAdapter);
    }
}