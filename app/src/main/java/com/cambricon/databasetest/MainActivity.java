package com.cambricon.databasetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.cambricon.databasetest.bean.ClassificationImage;
import com.cambricon.databasetest.bean.DetectionImage;
import com.cambricon.databasetest.db.ClassificationDB;
import com.cambricon.databasetest.db.CommDB;
import com.cambricon.databasetest.db.DetectionDB;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private CommDB dbHelper;
    private Button classification_btn;
    private Button detection_btn;
    private ClassificationDB cfdb;
    private DetectionDB dtdb;

    private ArrayList<ClassificationImage> cflist=new ArrayList<>();
    private ArrayList<DetectionImage> dtlist=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dbHelper=new CommDB(this);
        dbHelper.open();
        classification_btn=findViewById(R.id.classification_btn);
        detection_btn=findViewById(R.id.detection_btn);
        classification_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cfdb=new ClassificationDB(MainActivity.this);
                cfdb.open();
                cfdb.addClassification("kkkk","234","899","test");
                cfdb.addClassification("www","234","899","test");
                cflist=cfdb.fetchAll();
                for(int i=0;i<cflist.size();i++){
                    Log.d("huangyaling","i="+i);
                    Log.i("huangyaling",i+"cflist:"+cflist.get(i).getName()+" size="+cflist.size());
                }
            }
        });

        detection_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dtdb=new DetectionDB(MainActivity.this);
                dtdb.open();
                dtdb.addDetection("bbbb","hhjkl","hhhkas","yyeh","gghhl");
                dtdb.addDetection("llll","hhjkl","hhhkas","yyeh","gghhl");
                dtlist=dtdb.fetchAll();
                for(int j=0;j<dtlist.size();j++){
                    Log.d("huangyaling","j="+j);
                    Log.i("huangyaling",j+"dtlist:"+dtlist.get(j).getName()+" size="+dtlist.size());
                }
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(cfdb!=null){
            cfdb.close();
        }
        if(dtdb!=null){
            dtdb.close();
        }
    }
}
