package com.assistance.cat.catassistance;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnPlay1;
    private Button btnPlay2;
    private Button btnPlay3;
    private Button btnPlay4;
    private Button btnPlay5;
    private Button btnPlay6;
    private Button btnPlay7;
    private Button btnPlay8;
    private Button btnPlay9;
    private Button btnPlay10;
    private Button btnPlay11;
    private Button btnPlay12;


    private SoundPool soundPool;//声明一个SoundPool
    private int littleCat;
    private int hungry;
    private int lookingfor;
    private int catching_rat;
    private int lovely;
    private int male_love;
    private int snore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPlay1 = (Button) findViewById(R.id.button1);
        btnPlay1.setOnClickListener(this);
        btnPlay2 = (Button) findViewById(R.id.button2);
        btnPlay2.setOnClickListener(this);
        btnPlay3 = (Button) findViewById(R.id.button3);
        btnPlay3.setOnClickListener(this);
        btnPlay4 = (Button) findViewById(R.id.button4);
        btnPlay4.setOnClickListener(this);
        btnPlay5 = (Button) findViewById(R.id.button5);
        btnPlay5.setOnClickListener(this);
        btnPlay6 = (Button) findViewById(R.id.button6);
        btnPlay6.setOnClickListener(this);
        btnPlay7 = (Button) findViewById(R.id.button7);
        btnPlay7.setOnClickListener(this);
        btnPlay8 = (Button) findViewById(R.id.button8);
        btnPlay8.setOnClickListener(this);
        btnPlay9 = (Button) findViewById(R.id.button9);
        btnPlay9.setOnClickListener(this);
        btnPlay10 = (Button) findViewById(R.id.button10);
        btnPlay10.setOnClickListener(this);
        btnPlay11 = (Button) findViewById(R.id.button11);
        btnPlay11.setOnClickListener(this);
        btnPlay12 = (Button) findViewById(R.id.button12);
        btnPlay12.setOnClickListener(this);
        initSound();
    }

    private void initSound() {
        soundPool = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
        littleCat = soundPool.load(this, R.raw.litttlecat, 1);
        hungry = soundPool.load(this, R.raw.hungry, 1);
        lookingfor = soundPool.load(this, R.raw.lookingfor, 1);
        catching_rat = soundPool.load(this, R.raw.catching_rat, 1);
        lovely = soundPool.load(this, R.raw.lovely, 1);
        male_love = soundPool.load(this, R.raw.male_love, 1);
        snore = soundPool.load(this, R.raw.snore, 1);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                playSound(littleCat);
                break;
            case R.id.button2:
                playSound(lookingfor);
                break;
            case R.id.button3:
                playSound(snore);
                break;
            case R.id.button4:
                playSound(male_love);
                break;
            case R.id.button5:
                playSound(lovely);
                break;
            case R.id.button6:
                playSound(snore);
                break;
            case R.id.button7:
                playSound(littleCat);
                break;
            case R.id.button8:
                playSound(catching_rat);
                break;
            case R.id.button9:
                playSound(lookingfor);
                break;
            case R.id.button10:
                playSound(catching_rat);
                break;
            case R.id.button11:
                playSound(lovely);
                break;
            case R.id.button12:
                playSound(lookingfor);
                break;
        }
    }


    private void playSound(int soundID) {
        soundPool.play(
                soundID,
                0.5f,   //左耳道音量【0~1】
                0.5f,   //右耳道音量【0~1】
                0,     //播放优先级【0表示最低优先级】
                0,     //循环模式【0表示循环一次，-1表示一直循环，其他表示数字+1表示当前数字对应的循环次数】
                1     //播放速度【1是正常，范围从0~2】
        );
    }

}
