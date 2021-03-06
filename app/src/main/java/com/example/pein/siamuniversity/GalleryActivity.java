package com.example.pein.siamuniversity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GalleryActivity extends AppCompatActivity {

    ListView myListView;
    List<String> itemString=new ArrayList<String>();
    List <Object> itemImage=new ArrayList<Object>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        ArrayList<HashMap<String, Object>> listItem =new ArrayList<HashMap<String, Object>>();
        myListView = (ListView) findViewById(R.id.listView_Gallery);

        HashMap <String, Object> itemMap =new HashMap <String,Object>();
        itemMap.put("itemImage1",R.drawable.aboutus1);
        itemMap.put("itemString","Library" );
        itemMap.put("itemImage2",R.drawable.aboutus2);
        listItem.add(itemMap);

        itemMap =new HashMap <String,Object>();
        itemMap.put("itemImage1",R.drawable.aboutus1);
        itemMap.put("itemString","Computer Lab" );
        itemMap.put("itemImage2",R.drawable.aboutus2);
        listItem.add(itemMap);

        itemMap =new HashMap <String,Object>();
        itemMap.put("itemImage1",R.drawable.aboutus1);
        itemMap.put("itemString","Financial Lab" );
        itemMap.put("itemImage2",R.drawable.aboutus2);
        listItem.add(itemMap);

        itemMap =new HashMap <String,Object>();
        itemMap.put("itemImage1",R.drawable.aboutus1);
        itemMap.put("itemString","Maruary Library" );
        itemMap.put("itemImage2",R.drawable.aboutus2);
        listItem.add(itemMap);

        itemMap =new HashMap <String,Object>();
        itemMap.put("itemImage1",R.drawable.aboutus1);
        itemMap.put("itemString","Campus" );
        itemMap.put("itemImage2",R.drawable.aboutus2);
        listItem.add(itemMap);

        itemMap =new HashMap <String,Object>();
        itemMap.put("itemImage1",R.drawable.aboutus1);
        itemMap.put("itemString","Sports Complex" );
        itemMap.put("itemImage2",R.drawable.aboutus2);
        listItem.add(itemMap);

        itemMap =new HashMap <String,Object>();
        itemMap.put("itemImage1",R.drawable.aboutus1);
        itemMap.put("itemString","Food Court" );
        itemMap.put("itemImage2",R.drawable.aboutus2);
        listItem.add(itemMap);

        itemMap =new HashMap <String,Object>();
        itemMap.put("itemImage1",R.drawable.aboutus1);
        itemMap.put("itemString","Student Activity" );
        itemMap.put("itemImage2",R.drawable.aboutus2);
        listItem.add(itemMap);

        SimpleAdapter mySimpleAdapter = new SimpleAdapter(this,listItem,R.layout.aboutusitemlayout, new String[] { "itemImage1", "itemString" ,"itemImage2"},
                new int[] { R.id.imageView_aboutUsItem1, R.id.textView_aboutUsItem,R.id.imageView_aboutUsItem2 });

        myListView.setAdapter(mySimpleAdapter);
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3){
                Intent one=null;
                switch (arg2){
                    case 0:one=new Intent(GalleryActivity.this,Gallery_LibraryActivity.class);
                        break;
                    case 1:one=new Intent(GalleryActivity.this,Gallery_ComputerLabActivity.class);
                        break;
                    case 2:one=new Intent(GalleryActivity.this,Gallery_FinancialLabActivity.class);
                        break;
                    case 3:one=new Intent(GalleryActivity.this,Gallery_MaruaryLibraryActivity.class);
                        break;
                    case 4:one=new Intent(GalleryActivity.this,Gallery_CampusActivity.class);
                        break;
                    case 5:one=new Intent(GalleryActivity.this,Gallery_SportsComplexActivity.class);
                        break;
                    case 6:one=new Intent(GalleryActivity.this,Gallery_FoodCourtActivity.class);
                        break;
                    case 7:one=new Intent(GalleryActivity.this,Gallery_StudentActivityActivity.class);
                        break;
                }
                startActivity(one);
            }
        });
    }
}
