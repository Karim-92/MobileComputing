package com.computing.mobile.karim.mobilecomputing;

import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Karim.Ahmed on 3/14/2017.
 */

public class ArticlesAdapter extends RecyclerView.Adapter<ArticlesAdapter.MyViewHolder> {

    private List<Article> articlesList;
    public TextView title, content, img;

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.article_item_layout, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Article article =articlesList.get(position);
        holder.titleTV.setText(article.getTitle());
        holder.contentTV.setText(article.getContent());
        //holder.imgIV.setImageURI("");

    }

    @Override
    public int getItemCount() {
        return articlesList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView titleTV, contentTV;
        ImageView imgIV;

        public MyViewHolder(View itemView) {
            super(itemView);
            titleTV=(TextView) itemView.findViewById(R.id.title);
            contentTV=(TextView) itemView.findViewById(R.id.content);
            imgIV=(ImageView) itemView.findViewById(R.id.img);

        }
    }
}
