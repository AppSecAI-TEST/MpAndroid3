package com.liuguilin.mpandroidchartsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    //列表
    private GridView mGridView;
    //数据源
    private String[] mStr = {"线形图", "双重轴线形图"};
    //适配器
    private ArrayAdapter<String> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    //初始化View
    private void initView() {
        mGridView = (GridView) findViewById(R.id.mGridView);
        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mStr);
        mGridView.setAdapter(mAdapter);
        //设置点击
        mGridView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                startActivity(new Intent(this, LineChartActivity.class));
                break;
        }
    }
}
