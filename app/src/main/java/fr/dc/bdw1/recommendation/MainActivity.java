package fr.dc.bdw1.recommendation;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import fr.dc.bdw1.recommendation.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    public static final String url = "URL";
    private ActivityMainBinding ui;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        ui= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(ui.getRoot());


        ActivityResultLauncher<Intent> tshirtActivityResultLauncher = this.registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult result) {
                        switch (result.getResultCode()) {
                            case RESULT_CANCELED:
                                break;

                            case RESULT_OK: {


                            }
                        }
                        Log.d("Mainactivity", String.valueOf(result.getResultCode()));
                    }
                }
        );
        ui.img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, TshirtActivity.class);

                tshirtActivityResultLauncher.launch(i);

            }
        });

    }


}