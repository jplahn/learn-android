package com.example.jplahn.geoquiz;

/**
 * Created by jplahn on 7/23/14.
 */
public class TrueFalse {
    private int mQuestion;
    private boolean mTrueQuestion;
    private boolean mCheated;

    public TrueFalse (int question, boolean trueQuestion, boolean cheated) {
        mQuestion = question;
        mTrueQuestion = trueQuestion;
        mCheated = cheated;
    }

    public int getQuestion() {
        return mQuestion;
    }

    public void setQuestion(int question) {
        mQuestion = question;
    }

    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }

    public void setTrueQuestion(boolean trueQuestion) {
        mTrueQuestion = trueQuestion;
    }

    public boolean isCheatedQuestion() {
        return mCheated;
    }

    public void setCheatedQuestion(Boolean bool) {
        mCheated = bool;
    }
}