package soft.museum.com.museum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.content.Intent;





public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_bar_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent();
                intent.setClass(Splash.this,
                        Home.class);

                Splash.this.startActivity(intent);
                Splash.this.finish();
            }
        }, 2000);
    }
}
