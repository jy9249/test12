package com.example.administrator.ad21_05customviewrrr;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.zip.Inflater;

/**
 * Created by Administrator on 2017-12-22.
 */

public class ColorOptionView_ extends LinearLayout {
    private View value;
    private ImageView image;
    private TextView title;

    public ColorOptionView_(Context context) {
        super(context);
        init(context, null, 0);
    }

    public ColorOptionView_(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs, 0);
    }

    public ColorOptionView_(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs, defStyleAttr);
    }

    private void init(Context context, AttributeSet attrs, int defStyleAttr) {

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.ColorOptionView, defStyleAttr, 0);
        String titleText = a.getString(R.styleable.ColorOptionView_titleText);
        @SuppressLint("ResourceAsColor")
        int valueColor = a.getColor(R.styleable.ColorOptionView_valueColor, 0);
        a.recycle();  //재사용

        //LinearLayout 관련 속성 설정.
        setOrientation(LinearLayout.HORIZONTAL);
        setGravity(Gravity.CENTER);

        //inflation 하기.

        LayoutInflater inflater = LayoutInflater.from(context);
        inflater.inflate(R.layout.view_color_options, this, true);


        //0번째 자식에 값 설정
        title = (TextView) this.getChildAt(0);
        title.setText(titleText);

        //1번째 자식에 값 설정
        value = this.getChildAt(1);
        value.setBackgroundColor(valueColor);

        //2번째 자식설정
        image = (ImageView) this.getChildAt(2);

    }

    public void setValueColor(int color) {
        value.setBackgroundColor(color);


    }

    public void setImage(Drawable image) {


    }

    public void setImagaVisible(boolean visible) {

        image.setVisibility(visible ? View.VISIBLE : View.GONE);
    }

    public String getText() {

        return title.getText().toString();


    }
}


