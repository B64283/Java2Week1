package com.example.matthewdarke.java2week1;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

//create object
       // MyFragment Frag = new MyFragment();

//ADD FRAGMENT TO ACTIVITY
        FragmentManager manager=getFragmentManager();

//begin transaction
        FragmentTransaction transaction=manager.beginTransaction();

//add object to id with string TAG like keyvaluepairs can use key
        //transaction.add(R.id.my_layout,Frag, "VivsFragment");

//finally commit the transaction
        transaction.commit();
    }















    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
