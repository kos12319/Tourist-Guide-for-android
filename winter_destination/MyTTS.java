package com.example.winter_destination;

import android.content.Context;
import android.speech.tts.TextToSpeech;

import java.util.Locale;

public class MyTTS {
    private TextToSpeech tts;
    private TextToSpeech.OnInitListener initListener = new TextToSpeech.OnInitListener() {
        @Override
        public void onInit(int status) {
 //          Mr Alepis, status is not successful, so speak is not bound to tts engine
            System.out.println(status);
            if (status == TextToSpeech.SUCCESS){
                tts.setLanguage(Locale.forLanguageTag("en"));


            }
        }
    };

    public MyTTS(Context context){
        tts = new TextToSpeech(context, initListener);
    }
    public void speak(String message){
        tts.speak(message, TextToSpeech.QUEUE_ADD,null,null);
    }


}


