package com.summer.cs175;

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
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
        		selfDestruct2(v);
            }
        });
        
        button3 = (Button) findViewById(R.id.btn_3);
        button3.setOnClickListener(new OnClickListener() {
        	@Override
            public void onClick(View v) {
        		selfDestruct3(v);
            }
        });
        
        button4 = (Button) findViewById(R.id.btn_4);
        button4.setOnClickListener(new OnClickListener() {
        	@Override
            public void onClick(View v) {
        		selfDestruct4(v);
            }
        });
        
        button5 = (Button) findViewById(R.id.btn_5);
        button5.setOnClickListener(new OnClickListener() {
        	@Override
            public void onClick(View v) {
        		selfDestruct5(v);
            }
        });
		
	}
	
	public void selfDestruct1(View view) {
		final LayoutInflater inflater = (LayoutInflater)this.getSystemService(Context.LAYOUT_INFLATER_SERVICE); 
		
		View pview = inflater.inflate(R.layout.cust_pop,(ViewGroup)findViewById(R.layout.activity_main));
		
		PopupWindow pw = new PopupWindow(pview, 500, 700, false);
        pw.showAtLocation(view, Gravity.CENTER,0,-120);
        
        //if onclick written here, it gives null pointer exception.
        Button save = (Button)pview.findViewById(R.id.btn_save);
        save.setOnClickListener(new OnClickListener()
        {
        	@Override
            public void onClick(View v)
            {
            	Intent intent = new Intent(v.getContext(), MainActivity.class);
            	startActivityForResult(intent, 0);
            }
        });
        
        Button cancel = (Button)pview.findViewById(R.id.btn_cancel);
        cancel.setOnClickListener(new OnClickListener()
        {
        	@Override
            public void onClick(View v)
            {
            	Intent intent = new Intent(v.getContext(), MainActivity.class);
            	startActivityForResult(intent, 0);
            }
        });
	 }
	
	public void selfDestruct2(View view) {
		final LayoutInflater inflater = (LayoutInflater)this.getSystemService(Context.LAYOUT_INFLATER_SERVICE); 
		
		View pview = inflater.inflate(R.layout.cust_pop2,(ViewGroup)findViewById(R.layout.activity_main));
		
		PopupWindow pw = new PopupWindow(pview, 500, 700, false);
        pw.showAtLocation(view, Gravity.CENTER,0,-120);
        
	    //if onclick written here, it gives null pointer exception.
	    Button save = (Button)pview.findViewById(R.id.btn_save);
	    save.setOnClickListener(new OnClickListener()
	    {
	    	@Override
	        public void onClick(View v)
	        {
	        	Intent intent = new Intent(v.getContext(), MainActivity.class);
	        	startActivityForResult(intent, 0);
	        }
	    });
	    
	    Button cancel = (Button)pview.findViewById(R.id.btn_cancel);
	    cancel.setOnClickListener(new OnClickListener()
	    {
	    	@Override
	        public void onClick(View v)
	        {
	        	Intent intent = new Intent(v.getContext(), MainActivity.class);
	        	startActivityForResult(intent, 0);
	        }
	    });
	 }
	
	public void selfDestruct3(View view) {
		final LayoutInflater inflater = (LayoutInflater)this.getSystemService(Context.LAYOUT_INFLATER_SERVICE); 
		
		View pview = inflater.inflate(R.layout.cust_pop3,(ViewGroup)findViewById(R.layout.activity_main));
		
		PopupWindow pw = new PopupWindow(pview, 500, 700, false);
        pw.showAtLocation(view, Gravity.CENTER,0,-120);
        
        //if onclick written here, it gives null pointer exception.
        Button save = (Button)pview.findViewById(R.id.btn_save);
        save.setOnClickListener(new OnClickListener()
        {
        	@Override
            public void onClick(View v)
            {
            	Intent intent = new Intent(v.getContext(), MainActivity.class);
            	startActivityForResult(intent, 0);
            }
        });
        
        Button cancel = (Button)pview.findViewById(R.id.btn_cancel);
        cancel.setOnClickListener(new OnClickListener()
        {
        	@Override
            public void onClick(View v)
            {
            	Intent intent = new Intent(v.getContext(), MainActivity.class);
            	startActivityForResult(intent, 0);
            }
        });
	 }

	public void selfDestruct4(View view) {
		final LayoutInflater inflater = (LayoutInflater)this.getSystemService(Context.LAYOUT_INFLATER_SERVICE); 
		
		View pview = inflater.inflate(R.layout.cust_pop4,(ViewGroup)findViewById(R.layout.activity_main));
		
		PopupWindow pw = new PopupWindow(pview, 507, 700, false);
        pw.showAtLocation(view, Gravity.CENTER,0,-120);
        
        //if onclick written here, it gives null pointer exception.
        Button save = (Button)pview.findViewById(R.id.btn_save);
        save.setOnClickListener(new OnClickListener()
        {
        	@Override
            public void onClick(View v)
            {
            	Intent intent = new Intent(v.getContext(), MainActivity.class);
            	startActivityForResult(intent, 0);
            }
        });
        
        Button cancel = (Button)pview.findViewById(R.id.btn_cancel);
        cancel.setOnClickListener(new OnClickListener()
        {
        	@Override
            public void onClick(View v)
            {
            	Intent intent = new Intent(v.getContext(), MainActivity.class);
            	startActivityForResult(intent, 0);
            }
        });
	}
	
	public void selfDestruct5(View view) {
		final LayoutInflater inflater = (LayoutInflater)this.getSystemService(Context.LAYOUT_INFLATER_SERVICE); 
		
		View pview = inflater.inflate(R.layout.cust_pop5,(ViewGroup)findViewById(R.layout.activity_main));
		
		PopupWindow pw = new PopupWindow(pview, 500, 700, false);
        pw.showAtLocation(view, Gravity.CENTER,0,-120);
        
        //if onclick written here, it gives null pointer exception.
        Button save = (Button)pview.findViewById(R.id.btn_save);
        save.setOnClickListener(new OnClickListener()
        {
        	@Override
            public void onClick(View v)
            {
            	Intent intent = new Intent(v.getContext(), MainActivity.class);
            	startActivityForResult(intent, 0);
            }
        });
        
        Button cancel = (Button)pview.findViewById(R.id.btn_cancel);
        cancel.setOnClickListener(new OnClickListener()
        {
        	@Override
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
