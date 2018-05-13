package id.onestep.hydron.View;

import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Transition;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import id.onestep.hydron.R;

public class Index extends AppCompatActivity {
    private Button login, signup;
    private RelativeLayout rellay1;
    private TextView title;
    Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            rellay1.setVisibility(View.VISIBLE);
            title.setVisibility(View.GONE);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            final Transition fade = getWindow().getEnterTransition();
            fade.addListener(new Transition.TransitionListener() {
                @Override
                public void onTransitionStart(Transition transition) {

                }

                @Override
                public void onTransitionEnd(Transition transition) {
                    rellay1.animate().scaleX(1f).scaleY(1f);
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                        fade.removeListener(this);
                    }
                }

                @Override
                public void onTransitionCancel(Transition transition) {

                }

                @Override
                public void onTransitionPause(Transition transition) {

                }

                @Override
                public void onTransitionResume(Transition transition) {

                }
            });
        }
        rellay1 = (RelativeLayout) findViewById(R.id.rellay1);
        title = (TextView) findViewById(R.id.onestep);
        handler.postDelayed(runnable, 2000);
        login = (Button) findViewById(R.id.btnLogin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Index.this, Login.class);
                startActivity(i);
            }
        });
        signup = (Button) findViewById(R.id.btnSignUp);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Index.this, SignUp.class);
                startActivity(i);
            }
        });
    }
}
