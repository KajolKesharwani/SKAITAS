package android.com;

import androidx.appcompat.app.AppCompatActivity;

import android.com.skaitas.R;
import android.os.Bundle;

public class Services extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.services);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
