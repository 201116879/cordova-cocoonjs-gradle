package com.kanhan.ywca;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;

        SQLiteDatabase db = YWCADataBase.getInstance(this).getWritableDatabase();

        Button playGameOne = (Button)findViewById(R.id.playGameOne);
        TextView nativeText = (TextView) findViewById(R.id.textView);
        playGameOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (context,YWCA.class);
                i.putExtra(YWCA.STAGE_ID,1);
                startActivity(i);
            }
        });

        Button playGameTwo = (Button)findViewById(R.id.playGameTwo);
        playGameTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (context,YWCA.class);
                i.putExtra(YWCA.STAGE_ID,2);
                startActivity(i);
            }
        });
        Button playGameThree = (Button)findViewById(R.id.playGameThree);
        playGameThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (context,YWCA.class);
                i.putExtra(YWCA.STAGE_ID,3);
                startActivity(i);
            }
        });
        Button playGameFour = (Button)findViewById(R.id.playGameFour);
        playGameFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (context,YWCA.class);
                i.putExtra(YWCA.STAGE_ID,4);
                startActivity(i);
            }
        });
    }

}
