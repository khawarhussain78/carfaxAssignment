package com.example.carfaxassignment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.carfaxassignment.beans.Listing;
import com.squareup.picasso.Picasso;

public class DetailedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailed_view);
        TextView year, make, model, trim, price, milage, location, extColor, intColor, style, type, transmission, engine, fuel;
        ImageView carImage;
        Button call;

            year = findViewById(R.id.year);
            make = findViewById(R.id.make);
            model = findViewById(R.id.model);
            trim = findViewById(R.id.trim);
            price = findViewById(R.id.price);
            milage = findViewById(R.id.mileage);
            location = findViewById(R.id.location);
            extColor = findViewById(R.id.ext_color);
            intColor = findViewById(R.id.int_color);
            style = findViewById(R.id.body_style);
            type = findViewById(R.id.driver_type);
            transmission = findViewById(R.id.transmission);
            engine = findViewById(R.id.engine);
            fuel = findViewById(R.id.fuel);
            carImage = findViewById(R.id.carImage);
            call = findViewById(R.id.call);

            Listing carListing = (Listing) getIntent().getSerializableExtra("carDetail");

        if(carListing.getYear()!=null)
            year.setText(carListing.getYear().toString());
        if(carListing.getMake()!=null)
            make.setText(carListing.getMake());
        if(carListing.getModel()!=null)
            model.setText(carListing.getModel());
        if(carListing.getTrim()!=null)
            trim.setText(carListing.getTrim());
        if(carListing.getCurrentPrice()!=null)
            price.setText("$" +carListing.getCurrentPrice().toString());
        if(carListing.getMileage()!=null)
            milage.setText(carListing.getMileage().toString() +" Miles");
        if(carListing.getDealer()!=null && carListing.getDealer().getCity()!=null && carListing.getDealer().getState()!=null  )
            location.setText(carListing.getDealer().getCity()+" ,"+carListing.getDealer().getState());

        Picasso.get().load(carListing.getImages().getFirstPhoto().getMedium()).into(carImage);
        if(carListing.getExteriorColor()!=null)
            extColor.setText(carListing.getExteriorColor().toString());
        if(carListing.getInteriorColor()!=null)
            intColor.setText(carListing.getInteriorColor().toString());
        if(carListing.getDrivetype()!=null)
            style.setText(carListing.getDrivetype().toString());
        if(carListing.getBodytype()!=null)
            type.setText(carListing.getBodytype().toString());
        if(carListing.getTransmission()!=null)
            transmission.setText(carListing.getTransmission().toString());
        if(carListing.getEngine()!=null)
            engine.setText(carListing.getEngine().toString());
        if(carListing.getFuel()!=null)
            fuel.setText(carListing.getFuel().toString());


        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                callIntent.setData(Uri.parse("tel:" + carListing.getDealer().getPhone()));//change the number
                startActivity(callIntent);
            }
        });

    }
}