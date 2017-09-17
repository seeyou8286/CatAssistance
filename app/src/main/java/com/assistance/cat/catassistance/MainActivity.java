package com.assistance.cat.catassistance;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnPlay;

    private SoundPool soundPool;//声明一个SoundPool
    private int soundID;//创建某个声音对应的音频ID

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPlay = (Button) findViewById(R.id.voice_button);
        btnPlay.setOnClickListener(this);
        initSound();
    }

    private void initSound() {
        soundPool = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
        soundID = soundPool.load(this, R.raw.litttlecat, 1);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.voice_button:
                playSound();
                break;
        }
    }


    private void playSound() {
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
