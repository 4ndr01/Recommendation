package fr.dc.bdw1.recommendation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import fr.dc.bdw1.recommendation.databinding.ActivityMainBinding;

public class TshirtActivity extends AppCompatActivity {
    private ActivityMainBinding ui;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        ui = ActivityMainBinding.inflate(getLayoutInflater());
//        setContentView(ui.getRoot());

        ImageButton img1 = this.findViewById(R.id.thommy);
//        img1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String url = "https://digital-campus.fr";
//            }
//        });
//    }

    }}
