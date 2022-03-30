package fr.dc.bdw1.recommendation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CheckBox c1 = this.findViewById(R.id.checkBox);
        CheckBox c2 = this.findViewById(R.id.checkBox2);
        CheckBox c3 = this.findViewById(R.id.checkBox3);


        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}