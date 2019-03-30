package kr.hs.dgsw.b1nd.bottomsheet.sample;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import kr.hs.dgsw.b1nd.bottomsheet.B1ndBottomSheetDialogFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        new B1ndBottomSheetDialogFragment()
                .setProfileImageResource(android.R.drawable.sym_def_app_icon, getResources())
                .setSubIconImageResource(android.R.drawable.ic_lock_power_off, getResources())
                .setName("Ji O Kim")
                .setEmail("kimjioh0927@gmail.com")
                .setTemper("ANDROID")
                .show(getSupportFragmentManager(), "bottom");
    }
}
