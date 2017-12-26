package com.example.administrator.ad21_05customviewrrr;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Administrator on 2017-12-22.
 */

public class PersonView extends RelativeLayout {

    ImageView image_select, image_check, image_photo;
    TextView text_name, text_age;

    public PersonView(Context context) {
        super(context);
        init(context, null, 0);
    }

    public PersonView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs, 0);
    }

    public PersonView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs, defStyleAttr);
    }

    private void init(Context context, AttributeSet attrs, int defStyleAttr) {
        //inflation 하기
        LayoutInflater inflater = LayoutInflater.from(context);
        inflater.inflate(R.layout.view_person, this, true);


        //안에서 찾기.

        text_name = this.findViewById(R.id.text_name);
        text_age = this.findViewById(R.id.text_age);
        image_photo = this.findViewById(R.id.image_photo);
        image_check = this.findViewById(R.id.image_check);
        image_select = this.findViewById(R.id.image_select);

        //customView 속성값 가져오기 디자인에서
        if (attrs != null) {
            TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.PersonView, defStyleAttr, 0);
            String name = ta.getString(R.styleable.PersonView_name);
            int age = ta.getInt(R.styleable.PersonView_age, 0);
            Drawable photo = ta.getDrawable(R.styleable.PersonView_photo);
            ta.recycle();  //styleable의 재사용


            text_name.setText(name);
            text_age.setText(age + "");
            image_photo.setImageDrawable(photo);

        }


    }
}
