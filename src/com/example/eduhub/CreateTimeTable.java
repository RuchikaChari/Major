package com.example.eduhub;

import java.io.FileOutputStream;
import java.io.IOException;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TableRow.LayoutParams;


public class CreateTimeTable extends Activity {
	public static int a,b;
	Context con=this;
	public int m,n,prod;
	public final static String SAVETT="SAVETT.txt";
	public static String str1="null";
	public static String str2="\t";
	public static String str3="\n";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_create_time_table);
		// Get the message from the intent
	    int j;
		Intent intent = getIntent();
	    String message = intent.getStringExtra(NewTT.EXTRA_MESSAGE);
	    String message2 = intent.getStringExtra(NewTT.INPUT_SERVICE);
	    int lec = Integer.parseInt(message2);
	    int day =  Integer.parseInt(message);
	    Button bt = new Button(this);
	    a=lec; b=day;
	    m =lec+1;
	    n =day+1;
	    prod=m*n;
	    
	    ScrollView sv = new ScrollView(this);
	    sv.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT));
	    TableLayout ll=new TableLayout(this);
	    HorizontalScrollView hsv = new HorizontalScrollView(this);
	    int t=0;
	    if(day==1) 
	       {for(int i=-1;i<=lec;i++) 
		     {  TableRow trow=new TableRow(this);
                 if(i==-1)
		        	{   EditText tv1=new EditText(this);
		                EditText tv2=new EditText(this);
		                tv1.setText("  TIME  ");
		                tv1.setId(t);
		                tv1.setEnabled(false); 
		                tv1.setFocusable(false);
		                t++;
		                tv1.setTextSize(30);
		                tv1.setBackgroundResource(R.drawable.cell_shape);
		                trow.addView(tv1);
		                tv2.setText("  MONDAY  ");
		                tv2.setTextSize(30);
		                tv2.setId(t);
		                tv2.setEnabled(false); 
		                tv2.setFocusable(false);
		                t++;
		                tv2.setBackgroundResource(R.drawable.cell_shape);
		                trow.addView(tv2);
		             }
                 
                 else if (i==lec)
                 {
                	 
                	 bt.setText("SAVE");
                	 bt.setTextSize(30);
                	 trow.addView(bt);
                	 
                 }
                 
                 else 
		            {EditText e1=new EditText(this);
		              e1.setInputType(InputType.TYPE_DATETIME_VARIATION_TIME);
		              e1.setId(t);
		              e1.setTextSize(30);
		              t++;
		              e1.setBackgroundResource(R.drawable.cell_shape);
		              trow.addView(e1);
		              EditText e2=new EditText(this);
		              e2.setId(t);
		              t++;
		              e2.setTextSize(30);
		              e2.setBackgroundResource(R.drawable.cell_shape);
		              trow.addView(e2);		              
		           }
                 
		        
		        ll.addView(trow);
		        View v = new View(this);
		        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, 5);
		        v.setLayoutParams(params);
		        v.setBackgroundColor(getResources().getColor(android.R.color.transparent));
		        ll.addView(v);
		    }
	       }
	    
	    else if(day==2) 
	       {for(int i=-1;i<=lec;i++) 
		     {
		        TableRow trow=new TableRow(this);
				 if(i==-1)
		        	{
		        		EditText tv1=new EditText(this);
		                EditText tv2=new EditText(this);
		                EditText tv3=new EditText(this);
		                tv1.setText("  TIME  ");
		                tv1.setId(t);
		                t++;
		                tv1.setTextSize(30);
		                tv1.setBackgroundResource(R.drawable.cell_shape);
		                tv1.setEnabled(false); 
		                tv1.setFocusable(false);
		                trow.addView(tv1);
		                tv2.setText("  MONDAY  ");
		                tv2.setId(t);
		                tv2.setEnabled(false); 
		                tv2.setFocusable(false);
		                t++;
		                tv2.setTextSize(30);
		                tv2.setBackgroundResource(R.drawable.cell_shape);
		                trow.addView(tv2);
		                tv3.setText("  TUESDAY  ");
		                tv3.setId(t);
		                t++;
		                tv3.setEnabled(false); 
		                tv3.setFocusable(false);
		                tv3.setTextSize(30);
		                tv3.setBackgroundResource(R.drawable.cell_shape);
		                trow.addView(tv3);
		             }
				 
                 else if (i==lec)
                 {
                	 bt.setText("SAVE");
                	 bt.setTextSize(30);
                	 trow.addView(bt);
                	 
                 }
                 
				 else
		            {EditText e1=new EditText(this);
		              e1.setId(t);
		              t++;
		              e1.setTextSize(30);
		              e1.setBackgroundResource(R.drawable.cell_shape);
		              trow.addView(e1);
		              EditText e2=new EditText(this);
		              e2.setId(t);
		              t++;
		              e2.setTextSize(30);
		              e2.setBackgroundResource(R.drawable.cell_shape);
		              trow.addView(e2);
		              EditText e3=new EditText(this);
		              e3.setId(t);
		              t++;
		              e3.setTextSize(30);
		              e3.setBackgroundResource(R.drawable.cell_shape);
		              trow.addView(e3);
		            }
		        ll.addView(trow);
		        View v = new View(this);
		        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, 5);
		        v.setLayoutParams(params);
		        v.setBackgroundColor(getResources().getColor(android.R.color.transparent));
		        ll.addView(v);
		    }
	       }	

	    
	    else if(day==3) 
	       {for(int i=-1;i<=lec;i++) 
		     {
		        TableRow trow=new TableRow(this);

		        	if(i==-1)
		        	{
		        		EditText tv1=new EditText(this);
		                EditText tv2=new EditText(this);
		                EditText tv3=new EditText(this);
		                EditText tv4=new EditText(this);
		                tv1.setText("  TIME  ");
		                tv1.setId(t);
		                t++;
		                tv1.setEnabled(false); 
		                tv1.setFocusable(false);
		                tv1.setTextSize(30);
		                tv1.setBackgroundResource(R.drawable.cell_shape);
		                trow.addView(tv1);
		                tv2.setText("  MONDAY  ");
		                tv2.setId(t);
		                t++;
		                tv2.setTextSize(30);
		                tv2.setEnabled(false); 
		                tv2.setFocusable(false);
		                
		                tv2.setBackgroundResource(R.drawable.cell_shape);
		                trow.addView(tv2);
		                tv3.setText("  TUESDAY  ");
		                tv3.setId(t);
		                t++;
		                tv3.setTextSize(30);
		                tv3.setBackgroundResource(R.drawable.cell_shape);
		                tv3.setEnabled(false); 
		                tv3.setFocusable(false);
		                
		                trow.addView(tv3);
		                tv4.setText("  WEDNESDAY  ");
		                tv4.setId(t);
		                t++;
		                tv4.setEnabled(false); 
		                tv4.setFocusable(false);
		                
		                tv4.setTextSize(30);
		                tv4.setBackgroundResource(R.drawable.cell_shape);
		                trow.addView(tv4);
		                }
		        	 
	                 else if (i==lec)
	                 {
	                	 bt.setText("SAVE");
	                	 bt.setTextSize(30);
	                	 trow.addView(bt);
	                	 
	                 }
	                 
		        	else
		        	{
		        		EditText e1=new EditText(this);
			              e1.setId(t);
			              t++;
			              e1.setTextSize(30);
			              e1.setBackgroundResource(R.drawable.cell_shape);
			              trow.addView(e1);
			              EditText e2=new EditText(this);
			              e2.setId(t);
			              e2.setTextSize(30);
			              t++;
			              e2.setBackgroundResource(R.drawable.cell_shape);
			              trow.addView(e2);
			              EditText e3=new EditText(this);
			              e3.setId(t);
			              t++;
			              e3.setTextSize(30);
			              e3.setBackgroundResource(R.drawable.cell_shape);
			              trow.addView(e3);
			              EditText e4=new EditText(this);
			              e4.setId(t);
			              t++;
			              e4.setTextSize(30);
			              e4.setBackgroundResource(R.drawable.cell_shape);
			              trow.addView(e4);    
		        	}
		        ll.addView(trow);
		        View v = new View(this);
		        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, 5);
		        v.setLayoutParams(params);
		        v.setBackgroundColor(getResources().getColor(android.R.color.transparent));
		        ll.addView(v);
		    }
	       }
	    
	    else if(day==4) 
	       {for(int i=-1;i<=lec;i++) 
		     {
		        TableRow trow=new TableRow(this);

		        if(i==-1)
		        	 {
		        		EditText tv1=new EditText(this);
		                EditText tv2=new EditText(this);
		                EditText tv3=new EditText(this);
		                EditText tv4=new EditText(this);
		                EditText tv5=new EditText(this);
		                tv1.setText("  TIME  ");
		                tv1.setTextSize(30);
		                tv1.setId(t);
		                tv1.setEnabled(false); 
		                tv1.setFocusable(false);
		                t++;
		                tv1.setBackgroundResource(R.drawable.cell_shape);
		                trow.addView(tv1);
		                tv2.setText("  MONDAY  ");
		                tv2.setId(t);
		                tv2.setEnabled(false); 
		                tv2.setFocusable(false);
		                
		                t++;
		                tv2.setTextSize(30);
		                tv2.setBackgroundResource(R.drawable.cell_shape);
		                trow.addView(tv2);
		                tv3.setText("  TUESDAY  ");
		                tv3.setId(t);
		                tv3.setEnabled(false); 
		                tv1.setFocusable(false);
		                t++;
		                tv3.setTextSize(30);
		                tv3.setBackgroundResource(R.drawable.cell_shape);
		                trow.addView(tv3);
		                tv4.setText("  WEDNESDAY  ");
		                tv4.setId(t);
		                t++;
		                tv4.setEnabled(false); 
		                tv4.setFocusable(false);
		                tv4.setTextSize(30);
		                tv4.setBackgroundResource(R.drawable.cell_shape);
		                trow.addView(tv4);
		                tv5.setText("  THURSDAY  ");
		                tv5.setTextSize(30);
		                tv5.setId(t);
		                tv5.setEnabled(false); 
		                tv5.setFocusable(false);
		                t++;
		                tv5.setBackgroundResource(R.drawable.cell_shape);
		                trow.addView(tv5);
		                }
		        
                else if (i==lec)
                {
               	 bt.setText("SAVE");
               	 bt.setTextSize(30);
               	 trow.addView(bt);
               	 
                }
                
		        else
		            { EditText e1=new EditText(this);
		              e1.setId(t);
		              t++;
		              e1.setTextSize(30);
		              e1.setBackgroundResource(R.drawable.cell_shape);
		              trow.addView(e1);
		              EditText e2=new EditText(this);
		              e2.setTextSize(30);
		              e2.setId(t);
		              t++;
		              e2.setBackgroundResource(R.drawable.cell_shape);
		              trow.addView(e2);
		              EditText e3=new EditText(this);
		              e3.setTextSize(30);
		              e3.setId(t);
		              t++;
		              e3.setBackgroundResource(R.drawable.cell_shape);
		              trow.addView(e3);
		              EditText e4=new EditText(this);
		              e4.setId(t);
		              e4.setTextSize(30);
		              t++;
		              e4.setBackgroundResource(R.drawable.cell_shape);
		              trow.addView(e4);
		        	  EditText e5=new EditText(this);
		              e5.setId(t);
		              e5.setTextSize(30);
		              t++;
		              e5.setBackgroundResource(R.drawable.cell_shape);
		              trow.addView(e5);                
		        }
		        ll.addView(trow);
		        View v = new View(this);
		        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, 5);
		        v.setLayoutParams(params);
		        v.setBackgroundColor(getResources().getColor(android.R.color.transparent));
		        ll.addView(v);
		    }
	       }
	    
	    else if(day==5) 
	       {for(int i=-1;i<=lec;i++) 
		     {
		        TableRow trow=new TableRow(this);
		        	if(i==-1)
		        	{
		        		EditText tv1=new EditText(this);
		                EditText tv2=new EditText(this);
		                EditText tv3=new EditText(this);
		                EditText tv4=new EditText(this);
		                EditText tv5=new EditText(this);
		                EditText tv6=new EditText(this);
		                tv1.setText("  TIME  ");
		                tv1.setTextSize(30);
		                tv1.setEnabled(false); 
		                tv1.setFocusable(false);
		                tv1.setId(t);
		                t++;
		                tv1.setBackgroundResource(R.drawable.cell_shape);
		                trow.addView(tv1);
		                tv2.setText("  MONDAY  ");
		                tv2.setEnabled(false); 
		                tv2.setFocusable(false);
		                tv2.setId(t);
		                t++;
		                tv2.setTextSize(30);
		                tv2.setBackgroundResource(R.drawable.cell_shape);
		                trow.addView(tv2);
		                tv3.setText("  TUESDAY  ");
		                tv3.setTextSize(30);
		                tv3.setEnabled(false); 
		                tv3.setFocusable(false);
		                tv3.setId(t);
		                t++;
		                tv3.setBackgroundResource(R.drawable.cell_shape);
		                trow.addView(tv3);
		                tv4.setText("  WEDNESDAY  ");
		                tv4.setId(t);
		                tv4.setEnabled(false); 
		                tv4.setFocusable(false);
		                
		                t++;
		                tv4.setTextSize(30);
		                tv4.setBackgroundResource(R.drawable.cell_shape);
		                trow.addView(tv4);
		                tv5.setText("  THURSDAY  ");
		                tv5.setId(t);
		                t++;
		                tv5.setEnabled(false); 
		                tv5.setFocusable(false);
		                
		                tv5.setTextSize(30);
		                tv5.setBackgroundResource(R.drawable.cell_shape);
		                trow.addView(tv5);
		                tv6.setText("  FRIDAY  ");
		                tv6.setTextSize(30);
		                tv6.setId(t);
		                tv6.setEnabled(false); 
		                tv6.setFocusable(false);
		                
		                t++;
		                tv6.setBackgroundResource(R.drawable.cell_shape);
		                trow.addView(tv6);
		              }
		        	
		        	 
	                 else if (i==lec)
	                 {
	                	 bt.setText("SAVE");
	                	 bt.setTextSize(30);
	                	 trow.addView(bt);
	                	 
	                 }
	                 
		        else
		         { EditText e1=new EditText(this);
	              e1.setId(t);
	              t++;
	              e1.setTextSize(30);
	              e1.setBackgroundResource(R.drawable.cell_shape);
	              trow.addView(e1);
	              EditText e2=new EditText(this);
	              e2.setId(t);
	              e2.setTextSize(30);
	              t++;
	              e2.setBackgroundResource(R.drawable.cell_shape);
	              trow.addView(e2);
	              EditText e3=new EditText(this);
	              e3.setId(t);
	              e3.setTextSize(30);
	              t++;
	              e3.setBackgroundResource(R.drawable.cell_shape);
	              trow.addView(e3);
	              EditText e4=new EditText(this);
	              e4.setTextSize(30);
	              e4.setId(t);
	              t++;
	              e4.setBackgroundResource(R.drawable.cell_shape);
	              trow.addView(e4);
	        	  EditText e5=new EditText(this);
	              e5.setId(t);
	              e5.setTextSize(30);
	              t++;
	              e5.setBackgroundResource(R.drawable.cell_shape);
	              trow.addView(e5);
	              EditText e6=new EditText(this);
	              e6.setId(t);
	              t++;
	              e6.setTextSize(30);
	              e6.setBackgroundResource(R.drawable.cell_shape);
	              trow.addView(e6);
	             
		         }
		        ll.addView(trow);
		        View v = new View(this);
		        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, 5);
		        v.setLayoutParams(params);
		        v.setBackgroundColor(getResources().getColor(android.R.color.transparent));
		        ll.addView(v);
		    }
	       }
	    
	    else if(day==6) 
       {for(int i=-1;i<=lec;i++) 
	     {
	        TableRow trow=new TableRow(this);

	        	if(i==-1)
	        	{
	        		EditText tv1=new EditText(this);
	        		EditText tv2=new EditText(this);
	                EditText tv3=new EditText(this);
	                EditText tv4=new EditText(this);
	                EditText tv5=new EditText(this);
	                EditText tv6=new EditText(this);
	                EditText tv7=new EditText(this);
	                tv1.setText("  TIME  ");
	                tv1.setEnabled(false); 
	                tv1.setFocusable(false);
	                
	                tv1.setId(t);
	                t++;
	                tv1.setTextSize(30);
	                tv1.setBackgroundResource(R.drawable.cell_shape);
	                trow.addView(tv1);
	                tv2.setText("  MONDAY  ");
	                tv2.setId(t);
	                tv2.setEnabled(false); 
	                tv2.setFocusable(false);
	                
	                t++;
	                tv2.setTextSize(30);
	                tv2.setBackgroundResource(R.drawable.cell_shape);
	                trow.addView(tv2);
	                tv3.setText("  TUESDAY  ");
	                tv3.setId(t);
	                tv3.setEnabled(false); 
	                tv3.setFocusable(false);
	                
	                t++;
	                tv3.setTextSize(30);
	                tv3.setBackgroundResource(R.drawable.cell_shape);
	                trow.addView(tv3);
	                tv4.setText("  WEDNESDAY  ");
	                tv4.setId(t);
	                tv4.setEnabled(false); 
	                tv4.setFocusable(false);
	                
	                t++;
	                tv4.setTextSize(30);
	                tv4.setBackgroundResource(R.drawable.cell_shape);
	                trow.addView(tv4);
	                tv5.setText("  THURSDAY  ");
	                tv5.setId(102);
	                tv5.setEnabled(false); 
	                tv5.setFocusable(false);
	                
	                tv5.setTextSize(30);
	                tv5.setBackgroundResource(R.drawable.cell_shape);
	                trow.addView(tv5);
	                tv6.setText("  FRIDAY  ");
	                tv6.setId(t);
	                t++;
	                tv6.setEnabled(false); 
	                tv6.setFocusable(false);
	                
	                tv6.setTextSize(30);
	                tv6.setBackgroundResource(R.drawable.cell_shape);
	                trow.addView(tv6);
	                tv7.setText("  SATURDAY  ");
	                tv7.setTextSize(30);
	                tv7.setId(t);
	                tv7.setEnabled(false); 
	                tv7.setFocusable(false);
	                
	                t++;
	                tv7.setBackgroundResource(R.drawable.cell_shape);
	                trow.addView(tv7);
	            }
	        	
	        	 
                else if (i==lec)
                {
               	 bt.setText("SAVE");
               	 bt.setTextSize(30);
               	 trow.addView(bt);
               	 
                }
                
	       else	
	       {  EditText e1=new EditText(this);
              e1.setId(t);
              t++;
              e1.setTextSize(30);
              e1.setBackgroundResource(R.drawable.cell_shape);
              trow.addView(e1);
              EditText e2=new EditText(this);
              e2.setId(t);
              e2.setTextSize(30);
              t++;
              e2.setBackgroundResource(R.drawable.cell_shape);
              trow.addView(e2);
              EditText e3=new EditText(this);
              e3.setTextSize(30);
              e3.setId(t);
              t++;
              e3.setBackgroundResource(R.drawable.cell_shape);
              trow.addView(e3);
              EditText e4=new EditText(this);
              e4.setId(t);
              e4.setTextSize(30);
              t++;
              e4.setBackgroundResource(R.drawable.cell_shape);
              trow.addView(e4);
              EditText e5=new EditText(this);
              e5.setTextSize(30);
              e5.setId(t);
              t++;
              e5.setBackgroundResource(R.drawable.cell_shape);
              trow.addView(e5);
              EditText e6=new EditText(this);
              e6.setTextSize(30);
              e6.setId(t);
              t++;
              e6.setBackgroundResource(R.drawable.cell_shape);
              trow.addView(e6);
              EditText e7=new EditText(this);
              e7.setId(t);
              e7.setTextSize(30);
              t++;
              e7.setBackgroundResource(R.drawable.cell_shape);
              trow.addView(e7);
              
	       }
	        ll.addView(trow);
	        View v = new View(this);
	        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, 5);
	        v.setLayoutParams(params);
	        v.setBackgroundColor(getResources().getColor(android.R.color.transparent));
	        ll.addView(v);
	    }
       }
	    
	    
	    hsv.addView(ll);
	    sv.addView(hsv);
	    sv.setBackgroundResource(R.drawable.blackboard);
	    setContentView(sv);
	    
	    bt.setOnClickListener(new View.OnClickListener() 
	    {   public void onClick(View view) 
	        {  int t=0;
	         try
              { FileOutputStream fos = openFileOutput(SAVETT,Context.MODE_PRIVATE);
    		    while(prod>0)
	            {    if(t%n==0)
	            	  {    		
	            		EditText editText = (EditText) findViewById(t);
	            		str1= editText.getText().toString();
	            		fos.write(str1.getBytes());
	            		fos.write("\t".getBytes());
	            		t++;
	            	  }
	            	
	            	else
	            	{     		
	            		EditText editText = (EditText) findViewById(t);
	            		str1= editText.getText().toString();
	            		fos.write(str1.getBytes());
	            		
	            		fos.write("\t".getBytes());
	            		t++;
	                }         	
	              prod--;
	              }	
	              fos.close();
	            }
	         catch( IOException e)
     		{
     			e.printStackTrace();
     		}
	        
	         Intent i = new Intent(getApplicationContext(), MainActivity.class);
	         i.addFlags(i.FLAG_ACTIVITY_CLEAR_TOP);
	         startActivity(i);

	         
	        }
	    }); }

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.create_time_table, menu);
		return true;
	}

}
