package com.example.myapplication.Teacher;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


import com.example.myapplication.LocalStorage.Shared.UsersShared;
import com.example.myapplication.MainActivity;
import com.example.myapplication.R;
import com.example.myapplication.StartActivity;

public class TeacherMainActivity extends AppCompatActivity {


    private  Button  dailyClassroutine,teachersButton;
   Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_main);


        toolbar=findViewById(R.id.teacher_main_ToolbarId);
        setSupportActionBar(toolbar);
        this.setTitle("");

        dailyClassroutine=findViewById(R.id.teacher_MainRoutineButton);
        teachersButton=findViewById(R.id.teacher_MainTeachersButton);

        dailyClassroutine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    startActivity(new Intent(TeacherMainActivity.this,TeacherDailyRoutineActivity.class));
            }
        });
    teachersButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(TeacherMainActivity.this,AllTeacherActivity.class));

        }
    });




    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()==R.id.main_logoutmenubuttonid){
            UsersShared shared=new UsersShared(TeacherMainActivity.this) ;
            shared.saveUserdata("","","","","","","","","","","");
            startActivity(new Intent(TeacherMainActivity.this, StartActivity.class));
        }


        return super.onOptionsItemSelected(item);
    }



}