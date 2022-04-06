package fr.dc.bdw1.recommendation;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import fr.dc.bdw1.recommendation.databinding.ActivityManteauBinding;


public class ManteauActivity extends AppCompatActivity {
    private ActivityManteauBinding ui;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manteau);

        ActivityManteauBinding ui = ActivityManteauBinding.inflate(getLayoutInflater());
        setContentView(ui.getRoot());

        ui.imageManteau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.zalando.fr/boss-hyde-standup-manteau-classique-dark-blue-bb122t0jp-k11.html";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }

}
