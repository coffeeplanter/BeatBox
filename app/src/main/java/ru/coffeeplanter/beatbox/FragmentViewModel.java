package ru.coffeeplanter.beatbox;

import android.databinding.BaseObservable;
import android.databinding.ObservableField;
import android.widget.SeekBar;

import java.text.MessageFormat;

public class FragmentViewModel extends BaseObservable {

    public ObservableField<String> mPlaybackSpeedRate = new ObservableField<>("Playback Speed: 100 %");
    private BeatBox mBeatBox;

    public FragmentViewModel(BeatBox beatBox) {
        if (beatBox != null) {
            mBeatBox = beatBox;
        }
    }

    public void onPlaybackSpeedRateChanged(SeekBar seekBar, int progress, boolean fromUser) {
        mPlaybackSpeedRate.set(MessageFormat.format("Playback Speed: {0} %", progress + 20));
        mBeatBox.setPlaybackSpeedRate((progress + 20.0f) / 100);
    }

}
