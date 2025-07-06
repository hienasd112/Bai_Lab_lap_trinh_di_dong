package com.example.demobai3.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.demobai3.R;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ImageViewHolder> {

    private Context context;
    private int[] imageData;

    public ImageAdapter(Context context, int[] imageData) {
        this.context = context;
        this.imageData = imageData;
    }

    @Override
    public ImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Tạo view cho mỗi item trong RecyclerView
        View view = LayoutInflater.from(context).inflate(R.layout.item_image, parent, false);
        return new ImageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ImageViewHolder holder, int position) {
        // Gán hình ảnh vào ImageView
        holder.imageView.setImageResource(imageData[position]);
    }

    @Override
    public int getItemCount() {
        return imageData.length;
    }

    // ViewHolder để chứa mỗi item (hình ảnh)
    public static class ImageViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;

        public ImageViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}
