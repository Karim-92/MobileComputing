package com.computing.mobile.karim.mobilecomputing;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

/**
 * Created by Karim.Ahmed on 3/14/2017.
 */

public class HomeActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.action_profile){
            Toast.makeText(HomeActivity.this, "Profile", Toast.LENGTH_LONG).show();
            startActivity(new Intent(HomeActivity.this, LoginActivity.class));
        }

        else if(id==R.id.action_logout){
            Toast.makeText(HomeActivity.this, "Logout", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(HomeActivity.this, MainActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }
}
