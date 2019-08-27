package hasan.i.sohag.tourmate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    private ImageView logoIV;
    private TextView logoTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        init();

        Animation logoAanimation = AnimationUtils.loadAnimation(this,R.anim.logo_transition);
        logoIV.startAnimation(logoAanimation);
        logoTV.startAnimation(logoAanimation);

        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(new Intent(SplashActivity.this,LoginActivity.class));
                finish();

            }
        },4000);
    }
    private void init() {

        logoIV = findViewById(R.id.logoIV);
        logoTV = findViewById(R.id.logoTV);
    }
}
