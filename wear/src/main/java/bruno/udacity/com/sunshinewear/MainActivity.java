package bruno.udacity.com.sunshinewear;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.wearable.view.WatchViewStub;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView tvDate;
    private TextView tvMinTemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final WatchViewStub stub = (WatchViewStub) findViewById(R.id.watch_view_stub);
        stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
            @Override
            public void onLayoutInflated(WatchViewStub stub) {
                tvDate = (TextView) stub.findViewById(R.id.tv_date);
                tvMinTemp = (TextView) stub.findViewById(R.id.tv_min_temperature);
                tvDate.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.white_transparent));
                tvMinTemp.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.white_transparent));
            }
        });

    }
}
