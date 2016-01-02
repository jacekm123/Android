package com.example.zakladki_zasobow;

import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;


public class MainAktivityZakladkiZasobow extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        TabHost tabHost = getTabHost();

        TabHost.TabSpec zdjeciaspec = tabHost.newTabSpec("Photos");
        // selector ikon zdefiniowany w drawables
        zdjeciaspec.setIndicator("", getResources().getDrawable(R.drawable.icon_photos_tab));
        Intent zdjeciaIntent = new Intent(this, MojeZdjeciaAktivity.class);
        zdjeciaspec.setContent(zdjeciaIntent);
        tabHost.addTab(zdjeciaspec);

        TabHost.TabSpec piosenkispec = tabHost.newTabSpec("Songs");
        // selector ikon zdefiniowany w drawables
        piosenkispec.setIndicator("", getResources().getDrawable(R.drawable.icon_songs_tab));
        Intent piosenkiIntent = new Intent(this, MojePiosenkiAktivity.class);
        piosenkispec.setContent(piosenkiIntent);
        tabHost.addTab(piosenkispec);

        TabHost.TabSpec videospec = tabHost.newTabSpec("Video");
        // selector ikon zdefiniowany w drawables
        videospec.setIndicator("", getResources().getDrawable(R.drawable.icon_videos_tab));
        Intent videoIntent = new Intent(this, MojeVideoAktivity.class);
        videospec.setContent(videoIntent);
        tabHost.addTab(videospec);
    }



}
