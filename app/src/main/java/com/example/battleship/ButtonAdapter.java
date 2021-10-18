package com.example.battleship;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;

import java.net.ContentHandler;

public class ButtonAdapter extends BaseAdapter {
    private Context mContext;

    //grabs context for later use
    public ButtonAdapter(Context c){
        mContext = c;
    }

    //total number of things in adapter
    public int getCount(){
        return filenames.length;
    }
    //needed for structure
    public Object getItem(int position) {
        return null;
    }
    //needed for structure
    public long getItemId(int position){
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
    }

    Button btn;
    if (convertView == null){
        btn = new Button(mContext);
        btn.setlayoutParams(new GridView.LayoutParams(100,55));
        btn.setPadding(8,8,8,8);
    }
    else {
        btn - (Button) convertView
    }
    exus


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_adapter);
    }
}