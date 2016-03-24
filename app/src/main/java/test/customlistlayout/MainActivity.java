package test.customlistlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] resId = { R.drawable.a
                , R.drawable.b, R.drawable.c
                , R.drawable.d, R.drawable.e
                , R.drawable.f, R.drawable.g, R.drawable.g };

        String[] list = { "Home", "Best Nearby", "Coupon"
                , "Profile", "History", "Setting", "About"
                , "Sign Out" };

        CustomAdapter adapter = new CustomAdapter(getApplicationContext(), list, resId);

        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) { }
        });

    }
}
