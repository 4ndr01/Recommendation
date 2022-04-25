package fr.dc.bdw1.recommendation;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import fr.dc.bdw1.recommendation.databinding.ActivityTshirtBinding;

public class TshirtActivity extends AppCompatActivity {
    public static final String CURRENT_URL = "Current_URL";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tshirt);

        ActivityTshirtBinding ui = ActivityTshirtBinding.inflate(getLayoutInflater());
        setContentView(ui.getRoot());


        ui.thommy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.zalando.fr/tommy-jeans-classic-c-neck-t-shirt-basique-twilight-navy-tob22o09i-k11.html";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }

}
