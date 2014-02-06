package com.example.eduhub;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class NoteActivity extends Activity {

	public final static String SAVEDTEXT="SAVEDTEXT.txt";
	public static String str="null";

	private EditText txtEditor;

	@SuppressLint("NewApi")
	@Override

	public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_note);

	txtEditor=(EditText)findViewById(R.id.textbox);

	try {

	InputStream in = openFileInput(SAVEDTEXT);

	if (in != null) {

	InputStreamReader tmp=new InputStreamReader(in);

	BufferedReader reader=new BufferedReader(tmp);

	String str;

	StringBuilder buf=new StringBuilder();

	while ((str = reader.readLine()) != null) {

	buf.append(str+"n");

	}

	in.close();


	txtEditor.setText(buf.toString());


	}

	}

	catch (java.io.FileNotFoundException e) {



	}

	catch (Throwable t) {

	Toast

	.makeText(this, "Exception: "+t.toString(), Toast.LENGTH_LONG)

	.show();


	}

	}



	public void saveClicked(View v) {

	try {

	OutputStreamWriter out=

	new OutputStreamWriter(openFileOutput(SAVEDTEXT, 0));

	out.write(txtEditor.getText().toString());

	out.close();

	Toast

	.makeText(this, "The contents are saved in the file.", Toast.LENGTH_LONG)

	.show();

	}

	catch (Throwable t) {

	Toast

	.makeText(this, "Exception: "+t.toString(), Toast.LENGTH_LONG)

	.show();

	}

	}

	public void onClicked(View v)
	{
	}
	}
