package com.example.sante.Adapter;

import android.content.Context;
import android.content.Intent;
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

public class VaccineAdapter extends RecyclerView.Adapter<VaccineAdapterViewHolder>{


    Context context;

    public VaccineAdapter(Context context) {
        this.context = context;
    }

    @Override
    public VaccineAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.vaccines_layout,parent,false);
        return new VaccineAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VaccineAdapterViewHolder holder, int position) {

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,OrderVaccine.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return 10;
    }
}

class VaccineAdapterViewHolder extends RecyclerView.ViewHolder{

    TextView textViewFarmAddress,textViewPricePerAcre,textViewTotalAcres,textViewAdType;
    ImageView imageViewFarmImage;
    ImageButton imageButtonDelete;
    CardView cardView;
    public VaccineAdapterViewHolder(@NonNull View itemView) {
        super(itemView);
        textViewFarmAddress=itemView.findViewById(R.id.txtTitle);
        textViewPricePerAcre=itemView.findViewById(R.id.txtdetail);
        textViewTotalAcres=itemView.findViewById(R.id.txtPrice);

        cardView=itemView.findViewById(R.id.cvVaccine);
    }
}