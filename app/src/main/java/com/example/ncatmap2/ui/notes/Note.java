package com.example.ncatmap2.ui.notes;

import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseClassName;
import com.parse.ParseUser;

@ParseClassName("Note")
public class Note extends ParseObject {

    public static final String KEY_TEXT = "textOfNote";
    public static final String KEY_IMAGE = "image";
    public static final String KEY_USER = "user";

    public String getKeyText() {
        return getString(KEY_TEXT);
    }

    public void setKeyText(String text) {
        put(KEY_TEXT, text);
    }

    public ParseFile getImage() {
        return getParseFile(KEY_IMAGE);
    }

    public void setKeyImage(ParseFile parseFile) {
        put(KEY_IMAGE, parseFile);
    }

    public ParseUser getUser() {
        return getParseUser(KEY_USER);
    }

    public void setKeyUser(ParseUser user) {
        put(KEY_USER,user);
    }
}
