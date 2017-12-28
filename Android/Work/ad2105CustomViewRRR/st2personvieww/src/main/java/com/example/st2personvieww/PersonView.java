package com.example.st2personvieww;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Administrator on 2017-12-26.
 */
//ㄱ.extends RelatioveLayout 해주고 오버라이딩 받기
public class PersonView extends RelativeLayout {

    ImageView image_check, ImagePhoto = null;
    TextView TextAge, TextName;
    private PersonData person = null;


    public PersonView(Context context) {
        super(context);
        init(context, null, 0);
    }

    public PersonView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, null, 0);
    }

    public PersonView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs, defStyleAttr);
    }

    private void init(Context context, AttributeSet attrs, int defStyleAttr) {
        //ㄴ.레이아웃관련된 속성설정
        //없음
        //ㄷ.커스텀뷰 디자인 xml파일 inflation하기 (inflation이란 xml을 자바 인스턴스로 바꾸는 것
        LayoutInflater.from(context).inflate(R.layout.view_person, this, true);
        //this는 자기자신.
        //위젯찾기
        // attr_person.xml-> view_person.xml 과정
        image_check = findViewById(R.id.image_check);
        ImagePhoto = findViewById(R.id.image_photo);
        TextAge = findViewById(R.id.text_age);
        TextName = findViewById(R.id.text_name);


        //ㄹ.커스텀뷰 디자인에서 attrs로 정의한 속성값 가져오기
        // view_person.xml ->person으로 가는 과정
        if (attrs != null) {
            //ta라는 인스턴스 생성 그안에 personview 속성 모두 넣기
            TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.PersonView, defStyleAttr, 0);

            //app:myname에서 설정한 속성 값을 가져와서 ta에다가 넣고 그것을 name이라고 하고 그값을 textnamedp 넣는더ㅏ.
            String name = ta.getString(R.styleable.PersonView_my_name);
            TextName.setText(name);


            //app:age에서 설정한 속성 값을 가져와서 ta에다가 넣고 그것을 age라고 한다.
            int age = ta.getInt(R.styleable.PersonView_my_age, -1);
            TextAge.setText(age);

            //app:photo에서 설정한 속성 값을 가져와서 ta에다가 넣고 그것을 photo라고 한다.
            Drawable photo = ta.getDrawable(R.styleable.PersonView_my_photo);
            ImagePhoto.setImageDrawable(photo);

            ta.recycle(); //재사용을 위해서 반드시 호출



            person = new PersonData(name, age, photo);


        }

        ImagePhoto.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ImageClickListener != null) {
                    //컨테이너 위젯으로 이벤트 발생
                    //부모로 이벤트 발생시킴 상위로 클릭발생했다고 알려줌
                    ImageClickListener.OnImageClick (PersonView.this, person);
                }
            }
        });


    }


    //인터페이스정의 위에서 person으로 만든것을 PersonData라는 메서드 안에 들어간다.

    //인터페이스선언

    public interface OnImageClickLinstener {

        public void OnImageClick(PersonView view, PersonData person);

    }


    OnImageClickLinstener ImageClickListener;

    public void setOnImageClickListener(OnImageClickLinstener linstener) {
        this.ImageClickListener = linstener;
    }


}

