package mydd2017.com.m2xandroidtest;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

/**
 * Created by Hang on 8/11/2017.
 */

public class GuidesActivity extends ManagerActivity{

        @Override
        protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guides);
            //cardView.setCardBackgroundColor(Color.RED);

            ((TextView) findViewById(R.id.GoButton1)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),WelcomeActivty.class);
                    startActivity(intent);
                }
            });

            ((TextView) findViewById(R.id.GoButton2)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),StressActivity.class);
                    startActivity(intent);
                }
            });
            ((TextView) findViewById(R.id.GoButton3)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),ExerciseActivity.class);
                    startActivity(intent);
                }
            });


                }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.guides:
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}


