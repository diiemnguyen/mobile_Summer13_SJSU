package com.summer.cs175;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioSelection extends Activity {

//	Inside activity “onCreate()” method, attach a click listener on button.
 	  private RadioGroup radioSexGroup;
	  private RadioButton radioSexButton;
	  private Button btnDisplay;
	 
	  @Override
	  public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.radio_item);
	 
		addListenerOnButton();
	 
	  }
	 
	  public void addListenerOnButton() {
	 
		RadioGroup radioChoiceGroup = (RadioGroup) findViewById(R.id.radioChoice);
		btnDisplay = (Button) findViewById(R.id.btnDisplay);
	 
		btnDisplay.setOnClickListener(new OnClickListener() {
	 
			@Override
			public void onClick(View v) {
	 
			        // get selected radio button from radioGroup
				int selectedId = radioSexGroup.getCheckedRadioButtonId();
	 
				// find the radiobutton by returned id
			        radioSexButton = (RadioButton) findViewById(selectedId);
	 
				Toast.makeText(MyAndroidAppActivity.this,
					radioSexButton.getText(), Toast.LENGTH_SHORT).show();
	 
			}
	 
		});
	 
	  }
	}

