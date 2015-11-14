package com.example.sagi.rememberthetahini;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class TaskListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_list);

        String[] mylist = {"Mock task 1","Mock task 2","Mock task 3","Mock task 4","Mock task 5","Mock task 6","Mock task 7","Mock task 8",
                "Mock task 9","Mock task 10", "Mock task 11","Mock task 12","Mock task 13","Mock task 14","Mock task 15","Mock task 16","Mock task 17",
                "Mock task 18","Mock task 19","Mock task 20",};
        ListAdapter my_list_adapter = new ArrayAdapter<String>(this , android.R.layout.simple_list_item_1 , mylist);
        ListView sagisList = (ListView) findViewById(R.id.sagisList);
        sagisList.setAdapter(my_list_adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_task_list, menu);
        return true;
    }

    public void add_task(View view)
    {
        Intent intent = new Intent(this, TaskCreateActivity.class);
        startActivity(intent);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}