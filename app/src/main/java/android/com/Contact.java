package android.com;

import androidx.appcompat.app.AppCompatActivity;

import android.com.skaitas.R;
import android.os.Bundle;

public class Contact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
