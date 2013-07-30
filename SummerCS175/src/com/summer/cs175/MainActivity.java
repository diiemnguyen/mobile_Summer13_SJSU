package com.summer.cs175;

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	private Button button1;
	private Button button2;
	private Button button3;
	private Button button4;
	private Button button5;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		button1 = (Button) findViewById(R.id.btn_1);
        button1.setOnClickListener(new OnClickListener() {
        	@Override
            public void onClick(View v) {
        		selfDestruct1(v);
            }
        });
        
        button2 = (Button) findViewById(R.id.btn_2);
        button2.setOnClickListener(new OnClickListener() {
        	@Override
            public void onClick(View v) {
                // Perform action on click
            }
        });
        
        button3 = (Button) findViewById(R.id.btn_3);
        button3.setOnClickListener(new OnClickListener() {
        	@Override
            public void onClick(View v) {
                // Perform action on click
            }
        });
        
        button4 = (Button) findViewById(R.id.btn_4);
        button4.setOnClickListener(new OnClickListener() {
        	@Override
            public void onClick(View v) {
                // Perform action on click
            }
        });
        
        button5 = (Button) findViewById(R.id.btn_5);
        button5.setOnClickListener(new OnClickListener() {
        	@Override
            public void onClick(View v) {
                // Perform action on click
            }
        });
		
				
		
	}
	
	public void selfDestruct1(View view) {
		final LayoutInflater inflater = (LayoutInflater)this.getSystemService(Context.LAYOUT_INFLATER_SERVICE); 
		
		View pview = inflater.inflate(R.layout.cust_pop,(ViewGroup)findViewById(R.layout.activity_main));
		
        TextView text = (TextView) pview.findViewById(R.id.text);
		text.setText("\n                              QUESTION 1:\n\n        Do you remember what you dreamed \n        when you wake up?");
		text.setBackgroundResource(R.drawable.green_rect);

		PopupWindow pw = new PopupWindow(pview, 900, 1200, false);
        pw.showAtLocation(view, Gravity.CENTER,0,0);
        
		              //if onclick written here, it gives null pointer exception.
		            ImageButton img=(ImageButton)pview.findViewById(R.id.ibut_save);
		            img.setOnClickListener(new OnClickListener()
		            {
		                public void onClick(View v)
		                {
		                	Intent intent = new Intent(v.getContext(), MainActivity.class);
		                	startActivityForResult(intent, 0);
		                }
		            });
		
		
		
		
	 }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
