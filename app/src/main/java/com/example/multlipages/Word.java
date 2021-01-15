package com.example.multlipages;

public class Word {
    private String mDefaultTranslation;
    private String mspanishTranslation;
    private int mAudioResourceId;
    private int mImageResourceId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;
    public Word(String defaultTranslation,String spanishTranslation,int audioResourceId)
    {
        mDefaultTranslation=defaultTranslation;
        mspanishTranslation = spanishTranslation;
        mAudioResourceId = audioResourceId;
    }
    public Word(String defaultTranslation,String spanishTranslation,int imageResourceId,int audioResourceId)
    {
        mDefaultTranslation=defaultTranslation;
        mspanishTranslation = spanishTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }
    public String getmDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getmspanishTranslation() {
        return mspanishTranslation;
    }
    public int getmImageResourceId(){
        return mImageResourceId;
    }
    public int getmAudioResourceId(){
        return mAudioResourceId;
    }
    public boolean hasImage(){
        if(mImageResourceId==NO_IMAGE_PROVIDED)
            return false;
        else
            return true;
    }
}
