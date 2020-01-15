package com.example.addtocard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        addtocardListData[] myListData= new addtocardListData[]{
                new addtocardListData("DJ ABC","Pune","","",R.drawable.slider1),
                new addtocardListData("DJ ABC","Pune","","",R.drawable.slider1),
                new addtocardListData("DJ ABC","Pune","","",R.drawable.slider1),

        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.djparty_recycler_view);
        addtocardListAdapter adapter = new addtocardListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }
}
