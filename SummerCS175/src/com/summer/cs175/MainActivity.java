package com.summer.cs175;

import android.os.Bundle;
import android.app.Activity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final Button button1 = (Button) findViewById(R.id.btn_1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	selfDestruct1(v);
            }
        });
        
        final Button button2 = (Button) findViewById(R.id.btn_2);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
            }
        });
        
        final Button button3 = (Button) findViewById(R.id.btn_3);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
            }
        });
        
        final Button button4 = (Button) findViewById(R.id.btn_4);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
            }
        });
        
        final Button button5 = (Button) findViewById(R.id.btn_5);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
            }
        });
		
				
		
	}
	
	public void selfDestruct1(View view) {
		LayoutInflater inflater = getLayoutInflater();
		View layout = inflater.inflate(R.layout.cust_pop,
		                               (ViewGroup)findViewById(R.id.toast_layout_root));

		TextView text = (TextView) layout.findViewById(R.id.text);
		text.setText("Excellent !!!");
		text.setBackgroundResource(R.drawable.green_rect);
		Toast toast = new Toast(getApplicationContext());
		toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
		toast.setDuration(Toast.LENGTH_SHORT);
		toast.setView(layout);
		toast.show();
		
		/*View popupView = inflater.inflate(R.layout.cust_pop,(ViewGroup)findViewById(R.id.toast_layout_root));  
		final PopupWindow popupWindow = new PopupWindow(popupView, 200, 265, true);*/
	 }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
