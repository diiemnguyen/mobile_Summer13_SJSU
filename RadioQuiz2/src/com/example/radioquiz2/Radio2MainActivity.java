package com.example.radioquiz2 ;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class Radio2MainActivity extends Activity {
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radio2_main);
    }
		 /** Another way to handle Event handler for radio buttons 
			public void onRadioButtonClick(View v) {
		    	    RadioButton button = (RadioButton) v;
		    	//    Toast.makeText(Radio2MainActivity.this, button.getText() + " was chosen.",
		    	//        Toast.LENGTH_SHORT).show();
		    	 Toast.makeText(this, "Your answer is correct !", Toast.LENGTH_LONG).show();
		   		}
		 **/  	
    	
  public void onRadioButtonClicked(View view) { 	
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
   
        // Check which radio button was clicked
        switch(view.getId()) {
        case R.id.Mobile_OS:
            if (checked)
             //   Toast.makeText(this, "Your answer is correct !", Toast.LENGTH_LONG).show();
            Toast.makeText(getApplicationContext(), "Your answer is correct!", Toast.LENGTH_SHORT).show();
            break;
        case R.id.Mac_OS:
            if (checked)
                Toast.makeText(this, "Wrong answer, Try again", Toast.LENGTH_LONG).show();
            break;
            
        case R.id.Cygwin:
            if (checked)
                Toast.makeText(this, "Wrong answer, Try again", Toast.LENGTH_LONG).show();
            break;  
        case R.id.MS_Win:
            if (checked)
                Toast.makeText(this, "Wrong answer, Try again", Toast.LENGTH_LONG).show();
            break;     
        }

    // Intent in = new Intent(Radio1MainActivity.this, RaioMainActivity.class);
    // startActivity(in);
	}
    
}