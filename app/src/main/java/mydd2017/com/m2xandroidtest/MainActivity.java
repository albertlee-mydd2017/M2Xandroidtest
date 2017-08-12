package mydd2017.com.m2xandroidtest;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends ManagerActivity{

    public static MainActivity instance;
    private TextView tvHRV, tvHeartRate, tvTemperature, tvHealthStatus;

    public static MainActivity getInstance() {
//        if (instance == null) {
//            instance = new MainActivity();
//        }

        return instance;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvHRV = (TextView) findViewById(R.id.tvHRV);
        tvHeartRate = (TextView) findViewById(R.id.tvHeartRate);
        tvTemperature = (TextView) findViewById(R.id.tvTemperature);
        tvHealthStatus = (TextView) findViewById(R.id.tvHealStatus);
        tvHealthStatus.setText("Unknown Reading");

        instance = this;
    }

    public void refreshData(final int HRV, final int temp, final int maxHeartRate, final int minHeartRate, final double avgHeartRate) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if (tvHRV.isShown()) {
                    tvHRV.setText("" + HRV + " HRV");
                }

                if (tvTemperature.isShown()) {
                    tvTemperature.setText("" + temp + "°C");
                }

                if (tvHeartRate.isShown()) {
                    tvHeartRate.setText("Avg. " + String.format("%.2f", avgHeartRate) + " /min"
                            + "\nMax. " + maxHeartRate + " /min"
                            + "\nMin. " + minHeartRate + " /min");
                }

                if (tvHealthStatus.isShown()) {
                    tvHealthStatus.setText("You are healthy!");
                }
            }
        });

    }

    public TextView getTvHRV() {
        return tvHRV;
    }

    public TextView getTvHeartRate() {
        return tvHeartRate;
    }

    public TextView getTvTemperature() {
        return tvTemperature;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (id)
        {
            case R.id.dashboard: return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

