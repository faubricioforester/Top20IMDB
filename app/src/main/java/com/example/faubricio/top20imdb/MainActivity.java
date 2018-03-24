package com.example.faubricio.top20imdb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    int MOVIE_LIST_LENGTH = 20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            Document doc = Jsoup.connect("http://www.imdb.com/list/ls064079588/").get();

            Elements movieName = doc.select(".lister-list .lister-item");
            Elements stars= doc.select("");
            Elements metascores= doc.select("");
            Elements image= doc.select("");



        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
