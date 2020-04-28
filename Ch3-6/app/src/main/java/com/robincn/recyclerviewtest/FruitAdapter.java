package com.robincn.recyclerviewtest;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.ViewHolder> {
    private List<com.robincn.listview.Fruit> mFruitList;

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView fruitImage;
        TextView fruitName;
        public ViewHolder(View view) {
            super(view);
            fruitImage = (ImageView) view.findViewById(R.id.fruit_image);
            fruitName = (TextView) view.findViewById(R.id.fruit_name);
        }
    }
}

public FruitAdapter(List<com.robincn.listview.Fruit> fruitList) {
    mFruitList = fruitList;
}

