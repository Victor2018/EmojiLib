package org.victor.emojilib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

import org.victor.emoji.library.EmoticonPickerView;
import org.victor.emoji.library.IEmoticonSelectedListener;

public class MainActivity extends AppCompatActivity implements IEmoticonSelectedListener {

    private EmoticonPickerView mEpv;
    private EditText messageEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        messageEditText = (EditText) findViewById(R.id.messageEditText);
        mEpv = (EmoticonPickerView) findViewById(R.id.epv);
        mEpv.setWithSticker(true);//开启贴图功能
        mEpv.show(this);//显示表情视图并设置监听
        mEpv.attachEditText(messageEditText);//把EditText交给EmoticonPickerView控制
    }

    /**
     * 表情选择的监听
     * *************** IEmojiSelectedListener ***************
     */
    @Override
    public void onEmojiSelected(String key) {
    }

    //选择贴图
    @Override
    public void onStickerSelected(String catalog, String chartlet) {
        Log.i("LQR", "onStickerSelected, catalog =" + catalog
                + ", chartlet =" + chartlet);

    }
}