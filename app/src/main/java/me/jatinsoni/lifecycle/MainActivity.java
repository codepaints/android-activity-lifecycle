package me.jatinsoni.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // toast display message onCreate activity
        Toast.makeText(this, "onCreate: running now", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();

        // toast display message onStart activity
        Toast.makeText(this, "onStart: running now", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();

        // toast display message onResume activity
        Toast.makeText(this, "onResume: running now", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();

        // toast display message onPause activity
        Toast.makeText(this, "onPause: running now", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();

        // toast display message onStop activity
        Toast.makeText(this, "onStop: running now", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        // toast display message onDestroy activity
        Toast.makeText(this, "onDestroy: running now", Toast.LENGTH_SHORT).show();
    }
}
