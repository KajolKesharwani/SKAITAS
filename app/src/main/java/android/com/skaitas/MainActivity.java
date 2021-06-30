package android.com.skaitas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.com.About;
import android.com.Career;
import android.com.Contact;
import android.com.Home;
import android.com.Services;
import android.com.Team;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {


        switch (item.getItemId()){
            case R.id.home:
                Intent intent1 = new Intent(this, Home.class);
                this.startActivity(intent1);
                return true;
            case R.id.srv:
                Intent intent2 = new Intent(this, Services.class);
                this.startActivity(intent2);
                return true;
            case R.id.tm:
                Intent intent3 = new Intent(this, Team.class);
                this.startActivity(intent3);
                return true;
            case R.id.abt:
                Intent intent4 = new Intent(this, About.class);
                this.startActivity(intent4);
                return true;
            case R.id.cr:
                Intent intent5 = new Intent(this, Career.class);
                this.startActivity(intent5);
                return true;
            case R.id.cn:
                Intent intent6 = new Intent(this, Contact.class);
                this.startActivity(intent6);
                return true;
             default:
                 return super.onOptionsItemSelected(item);







    }
    }

}
