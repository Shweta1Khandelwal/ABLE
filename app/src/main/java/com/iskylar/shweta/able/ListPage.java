package com.iskylar.shweta.able;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ListPage extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_page);

    }
    @Override
    public void onBackPressed() {
        finishAffinity();

    }
}
