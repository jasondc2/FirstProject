package com.example.jason.scripturereference;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class displayScripture extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_scripture);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtBook = (TextView) findViewById(R.id.txtBook);
        TextView txtChapter = (TextView) findViewById(R.id.txtChapter);
        TextView txtVerse = (TextView) findViewById(R.id.txtVerse);
        Button btnClose = (Button) findViewById(R.id.btnClose);

        Intent i = getIntent();

        String book = i.getStringExtra("book");
        String chapter = i.getStringExtra("chapter");
        String verse = i.getStringExtra("verse");
        Log.e("Second Screen", book + "." + chapter + "." + verse);

        txtBook.setText(book + " ");
        txtChapter.setText(chapter + ": ");
        txtVerse.setText(verse);

        btnClose.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {

                finish();
            }
        });


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
