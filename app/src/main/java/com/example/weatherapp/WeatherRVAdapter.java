package com.example.weatherapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class WeatherRVAdapter extends RecyclerView.Adapter<WeatherRVAdapter.VierHolder>{

    private Context context;
    private ArrayList<WeatherRVModal> weatherRVModalArrayList;

    public WeatherRVAdapter(Context context, ArrayList<WeatherRVModal> weatherRVModalArrayList) {
        this.context = context;
        this.weatherRVModalArrayList = weatherRVModalArrayList;
    }

    @NonNull
    @Override
    public WeatherRVAdapter.VierHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.weather_rv_item,parent,false);
        return new VierHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WeatherRVAdapter.VierHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return weatherRVModalArrayList.size();
    }

    public class VierHolder extends RecyclerView.ViewHolder{
        private TextView windTV, temperatureTV, timeTV;
        private 
        public VierHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
