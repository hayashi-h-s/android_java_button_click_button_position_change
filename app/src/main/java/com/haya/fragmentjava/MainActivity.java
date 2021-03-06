package com.haya.fragmentjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

//    private Button in_fragment_button;
//    private Button fragment_add_button;
//    private FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

    private FragmentManager fragmentManager;
    private Fragment fragment = new MainFragment();

    private FrameLayout buttonFrame;
    private Button buttonUpBt;
    private Button buttonFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //要素の取得
        buttonFrame = findViewById(R.id.buttonFrame);

        // 画像がない時だけ、表示する
        fragmentManager = getSupportFragmentManager();




//        // コードからFragmentを追加
//
//        in_fragment_button = findViewById(R.id.in_fragment_button);
//        fragment_add_button = findViewById(R.id.fragment_add_button);;
//
//        // Fragmentを作成します
//        MainFragment fragment = new MainFragment();
//        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//        transaction.add(R.id.container, fragment);
//        transaction.commit();
//        // 他にも、よく使う操作で、replace removeといったメソッドがあります
//        // メソッドの1つ目の引数は対象のViewGroupのID、2つ目の引数は追加するfragment
//        transaction.add(R.id.container, MainFragment.createInstance("hoge", Color.RED));
//
//        fragment_add_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                transaction.add(R.id.container, MainFragment.createInstance("hoge", Color.GREEN));
//            }
//        });
//
//
//        // 最後にcommitを使用することで変更を反映します
//        transaction.commit();
    }


    public void addFragmentButton(View view) {

    }

    // ボタンを押すと、四角のボタンが上がる処理
    public void onClickButtonUp(View view) {

//        buttonFrame.layout(400, 600, 400 + buttonFrame.getWidth(), 600 + buttonFrame.getHeight());

        //フラグメントを作成する処理
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.contents,fragment );
        transaction.addToBackStack(null);
        transaction.commit();

        buttonFrame.layout(400, 600, 400 + buttonFrame.getWidth(), 600 + buttonFrame.getHeight());
    }

    public void onClickButtonLayout(View view) {
        buttonFrame.layout(100, 300, 100 + buttonFrame.getWidth(), 300 + buttonFrame.getHeight());
    }

    // フラグメントを削除するボタン
//    public void deleteFragmentButton(View view) {
//        FragmentTransaction transaction = fragmentManager.beginTransaction();
//        transaction.remove(fragment);
//        transaction.addToBackStack(null);
//        transaction.commit();
//    }

//    public void onClickAddFragment(View view) {
//        MainFragment fragment = new MainFragment();
//        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//        transaction.add(R.id.container, fragment);
//        transaction.addToBackStack(null);
//        transaction.commit();
//    }
}