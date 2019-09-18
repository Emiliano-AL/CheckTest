package mx.com.emiliano.checktest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import mx.com.emiliano.checktest.ui.SubsidiaryFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fragmentContainer, new SubsidiaryFragment())
                .commit();
    }
}
