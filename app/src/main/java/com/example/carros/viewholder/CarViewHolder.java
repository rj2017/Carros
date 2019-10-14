package com.example.carros.viewholder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.carros.R;
import com.example.carros.entities.Car;

public class CarViewHolder extends RecyclerView.ViewHolder {

    private TextView mTextModel;

    public CarViewHolder(@NonNull View itemView) {
        super(itemView);

        this.mTextModel = (TextView) itemView.findViewById(R.id.Text_model);
    }

    public void bindData(Car car){
        this.mTextModel.setText(car.model);
    }
}
