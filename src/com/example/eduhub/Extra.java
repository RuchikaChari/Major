package com.example.eduhub;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Extra extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_extra);
		
		 Button btn_hm = (Button) findViewById(R.id.btnHome);
		 btn_hm.setOnClickListener(new View.OnClickListener() {
	         
		        @Override
		        public void onClick(View view) {
		            // Launching News Feed Screen
		            Intent i = new Intent(getApplicationContext(), MainActivity.class);
		            startActivity(i);
		        }
		    });
		 
		 Button btn_new = (Button) findViewById(R.id.btnNew);
		 btn_new.setOnClickListener(new View.OnClickListener() {
	         
		        @Override
		        public void onClick(View view) {
		            // Launching News Feed Screen
		            Intent i = new Intent(getApplicationContext(), NoteActivity.class);
		            startActivity(i);
		        }
		    });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.extra, menu);
		return true;
	}

}
