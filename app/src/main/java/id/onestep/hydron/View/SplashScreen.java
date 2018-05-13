package id.onestep.hydron.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.JsonReader;

import com.airbnb.lottie.LottieAnimationView;

import java.io.StringReader;

import id.onestep.hydron.R;

public class SplashScreen extends AppCompatActivity {
//    private LottieAnimationView animationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
//        animationView = (LottieAnimationView) findViewById(R.id.animationView);
//        JsonReader jsonReader = new JsonReader(new StringReader(animationView.toString()));
//        animationView.setAnimation(jsonReader);
//        animationView.playAnimation();
//        Thread splash = new Thread(){
//            public void run(){
//                try {
//                    sleep(2000);
//                } catch (InterruptedException a){
//                    a.printStackTrace();
//                } finally {
//                    startActivity(new Intent(SplashScreen.this, Index.class));
//                    finish();
//                }
//            }
//        };
//        splash.start();

    }
}
