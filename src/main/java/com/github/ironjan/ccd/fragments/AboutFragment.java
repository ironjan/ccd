package com.github.ironjan.ccd.fragments;

import android.text.method.*;
import android.widget.*;

import com.actionbarsherlock.app.*;
import com.github.ironjan.ccd.*;

import org.androidannotations.annotations.*;

@EFragment(R.layout.fragment_about)
public class AboutFragment extends SherlockFragment {

    @ViewById(android.R.id.content)
    @FromHtml(R.string.aboutTheApp)
    TextView content;

    @AfterViews
    void linkify() {
        content.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
