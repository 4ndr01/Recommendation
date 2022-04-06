package fr.dc.bdw1.recommendation;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import fr.dc.bdw1.recommendation.databinding.ActivityAccessoireBinding;
import fr.dc.bdw1.recommendation.databinding.ActivityManteauBinding;

public class AccessoireActivity extends AppCompatActivity {
    private ActivityManteauBinding ui;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accessoire);


        ActivityAccessoireBinding ui = ActivityAccessoireBinding.inflate(getLayoutInflater());
        setContentView(ui.getRoot());

        ui.nike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.zalando.fr/nike-sportswear-casquette-obsidian-ni154q005-k11.html";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }

}



