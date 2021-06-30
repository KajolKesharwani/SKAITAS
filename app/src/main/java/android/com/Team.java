package android.com;

import androidx.appcompat.app.AppCompatActivity;

import android.com.skaitas.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Team extends AppCompatActivity {
    private Button Advisors;
    private Button Team;
    private Button Consultants;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.team);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Advisors = (Button) findViewById(R.id.button1);
        Advisors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAdvisors();
            }

        });

        Team = (Button) findViewById(R.id.button2);
        Team.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTeam();
            }


        });

        Consultants = (Button) findViewById(R.id.button3);
        Consultants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openConsultants();
            }


        });

    }
    public void openAdvisors() {
        Intent Intent = new Intent(Team.this, Advisors.class);
        startActivity(Intent);
    }

    public void openTeam() {
        Intent Intent = new Intent(Team.this, Teams.class);
        startActivity(Intent);
    }

    public void openConsultants() {
        Intent Intent = new Intent(Team.this, Consultants.class);
        startActivity(Intent);
    }



    }
