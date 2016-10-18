package ca.team2706.scouting.androidcrashcourse;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.media.Image;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TheWallActivity extends AppCompatActivity {

    ImageView imgKim;
    ImageView imgIdk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_wall);

        imgKim = (ImageView)findViewById(R.id.imageKim);
        imgIdk = (ImageView)findViewById(R.id.imageIdk);
    }

    public void onClickCoolButton(View view) {
        Paint paint = new Paint();
        paint.setDither(true);
        imgKim.setLayerPaint(paint);
    }
}
