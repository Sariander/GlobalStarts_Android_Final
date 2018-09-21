package ds.gcme.com.globalstart.GlobalStart;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import ds.gcme.com.globalstart.R;
import ds.gcme.com.globalstart.Util;


/**
 * Created by bengeos on 5/3/17.
 */

public class GlobalStartActivity extends AppCompatActivity {
    private Button btnNext;
    private Context myContext;

    private CollapsingToolbarLayout collapsingToolbarLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.global_start_activity);
        setSupportActionBar((Toolbar) findViewById(R.id.global_start_toolbar));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        collapsingToolbarLayout = findViewById(R.id.global_start_collapsing_toolbar);
        collapsingToolbarLayout.setTitle("");
        getSupportActionBar().setTitle("");

        myContext = this;

        btnNext = (Button) findViewById(R.id.btn_next);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GlobalStartActivity.this,GodsHeartActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TOP);
                myContext.startActivity(intent);
            }
        });
    }
}
