package com.computing.mobile.karim.mobilecomputing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ArticleActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Article> articles;
    private RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);
    }
}
