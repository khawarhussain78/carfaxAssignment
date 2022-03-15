package com.example.carfaxassignment;
import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.carfaxassignment.beans.Listing;
import com.squareup.picasso.Picasso;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder> {
    List<Listing> carListing;
    Context context;

    public PostAdapter(Context context, List<Listing> carListing) {
        this.carListing = carListing;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rowitem, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        if(carListing.get(position).getYear()!=null)
            holder.year.setText(carListing.get(position).getYear().toString());
        if(carListing.get(position).getMake()!=null)
            holder.make.setText(carListing.get(position).getMake());
        if(carListing.get(position).getModel()!=null)
            holder.model.setText(carListing.get(position).getModel());
        if(carListing.get(position).getTrim()!=null)
            holder.trim.setText(carListing.get(position).getTrim());
        if(carListing.get(position).getCurrentPrice()!=null)
            holder.price.setText("$ " +carListing.get(position).getCurrentPrice().toString());
        if(carListing.get(position).getMileage()!=null)
            holder.milage.setText(carListing.get(position).getMileage().toString() + " Miles");
        if(carListing.get(position).getDealer()!=null && carListing.get(position).getDealer().getCity()!=null && carListing.get(position).getDealer().getState()!=null  )
            holder.location.setText(carListing.get(position).getDealer().getCity()+" ,"+carListing.get(position).getDealer().getState());

        Picasso.get().load(carListing.get(position).getImages().getFirstPhoto().getMedium()).into(holder.carImage);

        holder.mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailedActivity.class);
                intent.putExtra("carDetail", carListing.get(position));
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });

        holder.call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                callIntent.setData(Uri.parse("tel:" + carListing.get(position).getDealer().getPhone()));//change the number
                context.startActivity(callIntent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return carListing.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView year, make, model, trim, price, milage, location;
        ImageView carImage;
        LinearLayout mainLayout;
        Button call;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            year = itemView.findViewById(R.id.year);
            make = itemView.findViewById(R.id.make);
            model = itemView.findViewById(R.id.model);
            trim = itemView.findViewById(R.id.trim);
            price = itemView.findViewById(R.id.price);
            milage = itemView.findViewById(R.id.mileage);
            location = itemView.findViewById(R.id.location);
            carImage = itemView.findViewById(R.id.carImage);
            mainLayout = itemView.findViewById(R.id.mainLayout);
            call = itemView.findViewById(R.id.call);
        }

    }
}
