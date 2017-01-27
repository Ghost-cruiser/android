package fr.android.td2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Blue Project";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_relative);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button btnSubmit = (Button) findViewById(R.id.button);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText txtLogin = (EditText) findViewById(R.id.editText);
                if (txtLogin.getText().toString().isEmpty()) {
                    txtLogin.setError("Veuillez rentrer un user");
                    return;
                }
                Intent intentPicker = new Intent(MainActivity.this, PickerActivity.class);
                startActivity(intentPicker);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                Intent intentGallery = new Intent(MainActivity.this, GalleryAndroidActivity.class);
                startActivity(intentGallery);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onResume() {
        Log.i(TAG,"Main Activity Resume");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.w(TAG,"Main Activity Pause");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.d(TAG,"Main Activity Stop");
        super.onStop();
    }

    @Override
    public void onDestroy() {
        Log.e(TAG,"Main Activity Destroy");
        super.onDestroy();
    }
}
