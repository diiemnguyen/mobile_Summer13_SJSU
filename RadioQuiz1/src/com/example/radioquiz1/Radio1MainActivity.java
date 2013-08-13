package com.example.radioquiz1;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import android.view.Menu;

public class Radio1MainActivity extends Activity {

		    @Override
		    protected void onCreate(Bundle savedInstanceState) {
		        super.onCreate(savedInstanceState);
		        setContentView(R.layout.radio1_main);
		    }
		    // Event handler for radio buttons 
		    public void onRadioButtonClicked(View view) {
		        // Is the button now checked?
		        boolean checked = ((RadioButton) view).isChecked();
		        // Check which radio button was clicked
		        
		        switch(view.getId()) {
		        case R.id.Andy_Rubin:
		            if (checked)
		                Toast.makeText(this, "Correct answer !", Toast.LENGTH_LONG).show();
		            break;
		        case R.id.Steve_Jobs:
		            if (checked)
		                Toast.makeText(this, "Wrong answer, try again", Toast.LENGTH_LONG).show();
		            break;
		    
		       case R.id.Bill_Gates:
		            if (checked)
		                Toast.makeText(this, "Wrong Answer, try again", Toast.LENGTH_LONG).show();
		            break;
		        case R.id.Larry_Ellison:
		            if (checked)
		                Toast.makeText(this, "Wrong answer, try again", Toast.LENGTH_LONG).show();
		            break;
		        } 
		        
		 //     Intent in = new Intent(Radio1MainActivity.this, RaioMainActivity.class);
		 //     startActivity(in);
	   
		    }
 }

