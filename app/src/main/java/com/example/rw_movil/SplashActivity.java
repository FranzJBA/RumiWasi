package com.example.rw_movil;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import org.jetbrains.annotations.Nullable;

public class SplashActivity extends AppCompatActivity {

    private ImageView logo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        logo = (ImageView)findViewById(R.id.logo);

        Animation myanimation = AnimationUtils.loadAnimation(this,R.anim.splashanimation);
        logo.startAnimation(myanimation);
    }
}
