package com.duolaning.memoryminder;

import android.animation.ValueAnimator;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class WelcomeActivity extends AppCompatActivity {

    LottieAnimationView animationView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        animationView = findViewById(R.id.animation_view);
        animationView.setMinAndMaxFrame(0, 98);
//        animationView.setRepeatCount(0);

        // Custom animation speed or duration.
//        final ValueAnimator animator = ValueAnimator.ofFloat(0f, 0.5f);
//        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
//            @Override
//            public void onAnimationUpdate(ValueAnimator animation) {
//                animationView.setProgress(animator.getAnimatedFraction());
//            }
//        });
//        animator.start();
    }
}
