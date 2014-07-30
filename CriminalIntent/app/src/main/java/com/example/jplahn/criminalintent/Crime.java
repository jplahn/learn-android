package com.example.jplahn.criminalintent;

import java.util.UUID;

/**
 * Created by jplahn on 7/30/14.
 */
public class Crime {
    private UUID mId;
    private String mTitle;

    public Crime () {
        // Generate unique identifier
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setMTitle (String title) {
        mTitle = title;
    }

}
