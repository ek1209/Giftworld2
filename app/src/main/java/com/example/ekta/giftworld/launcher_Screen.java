package com.example.ekta.giftworld;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

public class launcher_Screen extends AppCompatActivity {
    private ViewFlipper mViewFlipper;
    private Context mContext;
    private float initialX;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher__screen);
        getSupportActionBar().hide();

        findViewById(R.id.login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(launcher_Screen.this,Login.class);
                startActivity(i);
                finish();
            }
        });
        findViewById(R.id.register).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(launcher_Screen.this,Rregister.class);
                startActivity(i1);
                finish();
            }
        });
        findViewById(R.id.skip).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(launcher_Screen.this,MainActivity.class);
                startActivity(i2);
                finish();
            }
        });
        mContext = this;
        mViewFlipper = (ViewFlipper) this.findViewById(R.id.view_flipper);

    }

    @Override
    public boolean onTouchEvent(MotionEvent touchevent) {
        switch (touchevent.getAction()) {
            case MotionEvent.ACTION_DOWN:
                initialX = touchevent.getX();
                break;
            case MotionEvent.ACTION_UP:
                float finalX = touchevent.getX();
                if (initialX > finalX) {
                    if (mViewFlipper.getDisplayedChild() == 1)
                        break;

                    mViewFlipper.setInAnimation(AnimationUtils.loadAnimation(mContext, R.anim.in_from_left));
                    mViewFlipper.setOutAnimation(AnimationUtils.loadAnimation(mContext, R.anim.out_from_left));

                    mViewFlipper.showNext();
                } else {
                    if (mViewFlipper.getDisplayedChild() == 0)
                        break;

                    mViewFlipper.setInAnimation(AnimationUtils.loadAnimation(mContext, R.anim.in_from_right));
                    mViewFlipper.setOutAnimation(AnimationUtils.loadAnimation(mContext, R.anim.out_from_right));

                    mViewFlipper.showPrevious();
                }
                break;
        }
        return false;
    }
}




