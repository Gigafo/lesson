package com.example.p0031firstproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements
        GestureDetector.OnGestureListener,
GestureDetector.OnDoubleTapListener{
    private TextView txt;
    private GestureDetectorCompat gd;
    private AutoCompleteTextView actv;
    private String[] cars = new String[]{
      "Saab",
      "Volvo",
      "Bmv",
      "Audi",
      "Ford",
            "Porshe",
            "Mercedes-Benz",
            "Mazda"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = (TextView)findViewById(R.id.field);
        gd = new GestureDetectorCompat(this,this);
        gd.setOnDoubleTapListener(this);

        actv = (AutoCompleteTextView)findViewById(R.id.complate);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.select_dialog_item,cars);
        actv.setThreshold(1);
        actv.setAdapter(adapter);
     }

     @Override
     public boolean onTouchEvent(MotionEvent event){
        gd.onTouchEvent(event);
        return super.onTouchEvent(event);
     }
    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        txt.setText("onLongPress :" + motionEvent.toString());

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        return false;
    }
}
