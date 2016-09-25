package com.example.text4;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends Activity {
    private final static String NAME="product";
    private final static String CLAS="price";
    private final static String STUDENTID="configuration";


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] name={"姓名：张三","姓名：李四","姓名：青龙","姓名：白虎"};
        String[] clas={"班级：1班","班级：2班","班级：3班","班级：4班"};
        String[] Studentid={"学号：599","学号：600","学号：601","学号：602"};

        List<Map<String,Object>> items=new ArrayList<Map<String,Object>>();

        for(int i=0;i<name.length;i++) {
            Map<String,Object> item=new HashMap<String,Object>();
            item.put(NAME, name[i]);
            item.put(CLAS, clas[i]);
            item.put(STUDENTID, Studentid[i]);
            items.add(item);
        }

        SimpleAdapter adapter=new SimpleAdapter(this,items,R.layout.item,new String[]{NAME,CLAS,STUDENTID},new int[]{R.id.txtname,R.id.txtclas,R.id.txtstudentid});

        ListView list=(ListView)findViewById(R.id.list);

        list.setAdapter(adapter);
    }
}
