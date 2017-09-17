package com.complexity.moinkhan.stackscardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.wenchao.cardstack.CardStack;

import static android.R.attr.src;

public class MainActivity extends AppCompatActivity implements CardStack.CardEventListener {

    private CardStack cardStack;
    private CardAdapter cardAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initimages();

        cardStack = (CardStack) findViewById(R.id.card_stack);
        cardStack.setContentResource(R.layout.card_layout);
        cardStack.setStackMargin(20);
        cardStack.setAdapter(cardAdapter);
        cardStack.setListener(this);
    }

    private void initimages() {
        cardAdapter = new CardAdapter(getApplicationContext(),0);


    }

    @Override
    public boolean swipeEnd(int i, float v) {
        return (v>300)?true:false;
    }

    @Override
    public boolean swipeStart(int i, float v) {
        return false;
    }

    @Override
    public boolean swipeContinue(int i, float v, float v1) {
        return false;
    }

    @Override
    public void discarded(int i, int i1) {

    }

    @Override
    public void topCardTapped() {

    }
}
