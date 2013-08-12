package com.summer.cs175;

import android.os.Bundle;
import java.util.List;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
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
	
	private CheckBox checkedAnswer;
	private boolean check1,check2;
	private DatabaseHandler db;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// call to add question and answer to SQLite database
		addQuestionAnswer();
		
		
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
        
        /*
        
        CheckBox checkbox1 = (CheckBox) findViewById(R.id.check1_1);
        checkbox1.setOnCheckedChangeListener(new OnCheckedChangeListener(){
	        public void onCheckedChanged(CompoundButton arg0, boolean isChecked) {
		         check1=isChecked;
	
	        }
        });

        CheckBox checkbox2 = (CheckBox) findViewById(R.id.check1_2);
        checkbox2.setOnCheckedChangeListener(new OnCheckedChangeListener(){
	       public void onCheckedChanged(CompoundButton arg0, boolean isChecked) {
		        check2=isChecked;
	
	       }
        }); 
        
        */
        
      //store boolean only once when you leave the activity
        /*
        Editor editor = getSharedPreferences("syllabus", 0).edit();
        editor.putBoolean("cbx1_ischecked", check1);
        editor.putBoolean("cbx2_ischecked", check2);
        editor.commit();
        
        SharedPreferences prefs = getSharedPreferences("syllabus", 0);
        checkbox1.setChecked(prefs.getBoolean("cbx1_ischecked" ,false));
        checkbox2.setChecked(prefs.getBoolean("cbx2_ischecked" ,false));
       */
		
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
            	
            	/*
            	StringBuffer responseText = new StringBuffer();
        	    responseText.append("The following were selected...\n");
        	 
        	    ArrayList<Country> countryList = dataAdapter.countryList;
        	    for(int i=0;i<countryList.size();i++)
        	    {
	        	     Country country = countryList.get(i);
	        	     if(country.isSelected())
	        	     {
	        	    	 responseText.append("\n" + country.getName());
	        	     }
        	    }
        	 
        	    Toast.makeText(getApplicationContext(),
        	      responseText, Toast.LENGTH_LONG).show();
            	
            	*/
            	
            	
            	
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
	
	
	public void addQuestionAnswer(){
		db = new DatabaseHandler(this);
        
        /**
         * CRUD Operations
         * */
        // Inserting Contacts
        Log.d("Insert: ", "Inserting .."); 
        db.addContact(new Answer("Q1a", "Mobile OS"));        
        db.addContact(new Answer("Q1b", "Mac Apple OS"));
        db.addContact(new Answer("Q1c", "MS windows"));
        db.addContact(new Answer("Q1d", "Cygwin"));
        
        db.addContact(new Answer("Q2a", "Andy Rubin"));
        db.addContact(new Answer("Q2b", "Steve Jobs"));
        db.addContact(new Answer("Q2c", "Bill Gates"));
        db.addContact(new Answer("Q2d", "Larry Ellison"));
        
        db.addContact(new Answer("Q3a", "Apple"));
        db.addContact(new Answer("Q3b", "Oracle"));
        db.addContact(new Answer("Q3c", "ATT"));
        db.addContact(new Answer("Q3d", "Splint"));
       
        db.addContact(new Answer("Q4a", "Open Source"));
        db.addContact(new Answer("Q4b", "Java Language"));
        db.addContact(new Answer("Q4c", "Access to Internet"));
        db.addContact(new Answer("Q4d", "Easy to use"));
        
        db.addContact(new Answer("Q5a", "Activity class"));
        db.addContact(new Answer("Q5b", "assets folder"));
        db.addContact(new Answer("Q5c", "R.java"));
        db.addContact(new Answer("Q5d", "drawable.*"));
        
        // Reading all contacts
        Log.d("Reading: ", "Reading all answers.."); 
        List<Answer> answers = db.getAllAnswers();       
        
        for (Answer cn : answers) {
        	String log = "Id: "+cn.getID()+" ,Question: " + cn.getQuestion() + " ,Answer: " + cn.getAnswer();
                // Writing Answers to log
			Log.d("Question: ", log);
		}
		
		
		
	}
	
	

}
