package com.example.sante.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sante.R;

public class MyOrdersAdapter extends RecyclerView.Adapter<MyOrderAdapterViewHolder>{


    Context context;

    public MyOrdersAdapter(Context context) {
        this.context = context;
    }

    @Override
    public MyOrderAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ordered_vaccines_layout,parent,false);
        return new MyOrderAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyOrderAdapterViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}

class MyOrderAdapterViewHolder extends RecyclerView.ViewHolder{

    TextView textViewFarmAddress,textViewPricePerAcre,textViewTotalAcres,textViewAdType,textViewPostedDate;
    ImageView imageViewFarmImage;
    ImageButton imageButtonDelete;
    CardView cardView;
    public MyOrderAdapterViewHolder(@NonNull View itemView) {
        super(itemView);
        textViewFarmAddress=itemView.findViewById(R.id.txtTitle);
        textViewPricePerAcre=itemView.findViewById(R.id.txtdetail);
        textViewTotalAcres=itemView.findViewById(R.id.txtPrice);

        cardView=itemView.findViewById(R.id.cvVaccine);
    }
}