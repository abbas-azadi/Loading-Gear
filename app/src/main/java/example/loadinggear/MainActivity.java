package example.loadinggear;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import info.androidramp.gearload.Loading;

public class MainActivity extends AppCompatActivity {

    Loading loading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loading = (Loading) findViewById(R.id.loading);

        loading.Start();

    }
}
