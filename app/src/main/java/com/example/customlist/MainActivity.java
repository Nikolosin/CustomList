package com.example.customlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        List<ItemData> data = new ArrayList<>();
        data.add(new ItemData(getResources().getDrawable(R.drawable.calculator, getTheme()), getString(R.string.calculator),
                getString(R.string.calculator2)));
        data.add(new ItemData(getResources().getDrawable(R.drawable.check, getTheme()), getString(R.string.check),
                getString(R.string.check2)));
        data.add(new ItemData(getResources().getDrawable(R.drawable.color, getTheme()), getString(R.string.color),
                getString(R.string.color2)));
        data.add(new ItemData(getResources().getDrawable(R.drawable.list, getTheme()), getString(R.string.list),
                getString(R.string.list2)));

        SampleAdapter adapter = new SampleAdapter(this, data);

        ListView list = findViewById(R.id.list_sample);
        list.setAdapter(adapter);

    }
}
