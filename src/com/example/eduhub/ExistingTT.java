package com.example.eduhub;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableRow.LayoutParams;

public class ExistingTT extends Activity {
	@Override
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_existing_tt);
		 
		
		ScrollView sv = new ScrollView(this);
		    sv.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT));
		    TableLayout ll=new TableLayout(this);
		    HorizontalScrollView hsv = new HorizontalScrollView(this);
		    int t=100;
		    int l=100;
		    int day= CreateTimeTable.b;
		    int lec= CreateTimeTable.a;
		    String inputString = "abc";
		    int i=0;
		    
		    
		    
		    try {
		        BufferedReader inputReader = new BufferedReader(new InputStreamReader(
		                openFileInput("SAVETT.txt")));
		        
		        StringBuffer stringBuffer = new StringBuffer();                
		        while ((inputString = inputReader.readLine()) != null) {
		            stringBuffer.append(inputString + "\n");
		            //EditText txt = (EditText) findViewById(R.id.temp);
		            //txt.setText(inputString);
		        }
		        } catch (IOException e) {
		        e.printStackTrace();
		    }
		    
		   System.out.println(inputString);
		    
		    
		   /*StringTokenizer tokenizer = new StringTokenizer(inputString);
	       String[] arr = new String[tokenizer.countTokens()];
	       while(tokenizer.hasMoreElements())
	       {
	    	  arr[i]= tokenizer.nextToken();
	    	  i++;
	       }
	       i=0;
	       while(i<arr.length)
	       { System.out.println(arr[i]+"\n");
	         i++;
	       }
	       */
		   
		    
		   /* 
		    if(day==1) 
		       {for(int i=0;i<=lec;i++) 
			     {  TableRow trow=new TableRow(this);
	                 if(i==0)
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
	                  
	                 else 
			            { 
	                	  	                	   
	                	  EditText e1=new EditText(this);
			              e1.setInputType(InputType.TYPE_DATETIME_VARIATION_TIME);
			              e1.setId(t);
			              e1.setTextSize(30);
			              e1.setEnabled(false);
			              e1.setFocusable(false);
			              t++;
			              e1.setBackgroundResource(R.drawable.cell_shape);
			              EditText e2=new EditText(this);
			              e2.setId(t);
			              t++;
			              e2.setTextSize(30);
			              e2.setBackgroundResource(R.drawable.cell_shape);
			              e2.setEnabled(false);
			              e2.setFocusable(false);
			              
			              temp=inputString.split("\\t");
			              for(int o=0;o<temp.length;o++)
			              {
			            	  EditText tt = (EditText) findViewById(l);
			            	  tt.setText(temp[0]);
			            	  l++;
			              }
			              
			            
			              trow.addView(e1);
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
		       {for(int i=0;i<=lec;i++) 
			     {
			        TableRow trow=new TableRow(this);
					 if(i==0)
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
					
					 else
			            {EditText e1=new EditText(this);
			              e1.setId(t);
			              t++;
			              e1.setTextSize(30);
			              e1.setBackgroundResource(R.drawable.cell_shape);
			              e1.setEnabled(false);
			              e1.setFocusable(false);
			              EditText e2=new EditText(this);
			              e2.setId(t);
			              t++;
			              e2.setTextSize(30);
			              e2.setBackgroundResource(R.drawable.cell_shape);
			              e2.setEnabled(false);
			              e2.setFocusable(false);
			              EditText e3=new EditText(this);
			              e3.setId(t);
			              t++;
			              e3.setTextSize(30);
			              e3.setEnabled(false);
			              e3.setFocusable(false);
			              e3.setBackgroundResource(R.drawable.cell_shape);
			              
			              temp=inputString.split("\\t");
			              for(int o=0;o<temp.length;o++)
			              {
			            	  EditText tt = (EditText) findViewById(l);
			            	  tt.setText(temp[0]);
			            	  l++;
			              }
			              
			              trow.addView(e1);
			              trow.addView(e2);
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
		       {for(int i=0;i<=lec;i++) 
			     {
			        TableRow trow=new TableRow(this);

			        	if(i==0)
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
			        	 
		                 
			        	else
			        	{
			        		EditText e1=new EditText(this);
				              e1.setId(t);
				              t++;
				              e1.setEnabled(false);
				              e1.setFocusable(false);
				              e1.setTextSize(30);
				              e1.setBackgroundResource(R.drawable.cell_shape);
				              EditText e2=new EditText(this);
				              e2.setId(t);
				              e2.setTextSize(30);
				              t++;
				              e2.setEnabled(false);
				              e2.setFocusable(false);
				              e2.setBackgroundResource(R.drawable.cell_shape);
				              EditText e3=new EditText(this);
				              e3.setId(t);
				              t++;
				              e3.setEnabled(false);
				              e3.setFocusable(false);
				              e3.setTextSize(30);
				              e3.setBackgroundResource(R.drawable.cell_shape);
				              
				              EditText e4=new EditText(this);
				              e4.setId(t);
				              t++;
				              e4.setEnabled(false);
				              e4.setFocusable(false);
				              e4.setTextSize(30);
				              e4.setBackgroundResource(R.drawable.cell_shape);
				              
				              temp=inputString.split("\\t");
				              for(int o=0;o<temp.length;o++)
				              {
				            	  EditText tt = (EditText) findViewById(l);
				            	  tt.setText(temp[0]);
				            	  l++;
				              }
				              
				              trow.addView(e1);
				              trow.addView(e2);
				              trow.addView(e3);
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
		       {for(int i=0;i<=lec;i++) 
			     {
			        TableRow trow=new TableRow(this);

			        if(i==0)
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
			        
	                
			        else
			            { EditText e1=new EditText(this);
			              e1.setId(t);
			              t++;
			              e1.setTextSize(30);
			              e1.setBackgroundResource(R.drawable.cell_shape);
			              e1.setEnabled(false);
			              e1.setFocusable(false);
			              EditText e2=new EditText(this);
			              e2.setTextSize(30);
			              e2.setEnabled(false);
			              e2.setFocusable(false);
			              e2.setId(t);
			              t++;
			              e2.setBackgroundResource(R.drawable.cell_shape);
			              EditText e3=new EditText(this);
			              e3.setEnabled(false);
			              e3.setFocusable(false);
			              e3.setTextSize(30);
			              e3.setId(t);
			              t++;
			              e3.setBackgroundResource(R.drawable.cell_shape);
			              EditText e4=new EditText(this);
			              e4.setId(t);
			              e4.setTextSize(30);
			              e4.setEnabled(false);
			              e4.setFocusable(false);
			              t++;
			              e4.setBackgroundResource(R.drawable.cell_shape);
			              EditText e5=new EditText(this);
			              e5.setId(t);
			              e5.setEnabled(false);
			              e5.setFocusable(false);
			              e5.setTextSize(30);
			              t++;
			              e5.setBackgroundResource(R.drawable.cell_shape);
			              
			              temp=inputString.split("\\t");
			              for(int o=0;o<temp.length;o++)
			              {
			            	  EditText tt = (EditText) findViewById(l);
			            	  tt.setText(temp[0]);
			            	  l++;
			              }
			              
			              trow.addView(e1);
			              trow.addView(e2);
			              trow.addView(e3);
			              trow.addView(e4);
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
		       {for(int i=0;i<=lec;i++) 
			     {
			        TableRow trow=new TableRow(this);
			        	if(i==0)
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
			        	 
			        else
			         { EditText e1=new EditText(this);
		              e1.setId(t);
		              t++;
		              e1.setTextSize(30);
		              e1.setEnabled(false);
		              e1.setFocusable(false);
		              e1.setBackgroundResource(R.drawable.cell_shape);
		              EditText e2=new EditText(this);
		              e2.setId(t);
		              e2.setEnabled(false);
		              e2.setFocusable(false);
		              e2.setTextSize(30);
		              t++;
		              e2.setBackgroundResource(R.drawable.cell_shape);
		              EditText e3=new EditText(this);
		              e3.setId(t);
		              e3.setTextSize(30);
		              e3.setEnabled(false);
		              e3.setFocusable(false);
		              t++;
		              e3.setBackgroundResource(R.drawable.cell_shape);
		              EditText e4=new EditText(this);
		              e4.setTextSize(30);
		              e4.setEnabled(false);
		              e4.setFocusable(false);
		              e4.setId(t);
		              t++;
		              e4.setBackgroundResource(R.drawable.cell_shape);
		              EditText e5=new EditText(this);
		              e5.setId(t);
		              e5.setTextSize(30);
		              e5.setEnabled(false);
		              e5.setFocusable(false);
		              t++;
		              e5.setBackgroundResource(R.drawable.cell_shape);
		              EditText e6=new EditText(this);
		              e6.setId(t);
		              t++;
		              e6.setEnabled(false);
		              e6.setFocusable(false);
		              e6.setTextSize(30);
		              e6.setBackgroundResource(R.drawable.cell_shape);
		              
		              
		                temp=inputString.split("\\t");
			              for(int o=0;o<temp.length;o++)
			              {
			            	  EditText tt = (EditText) findViewById(l);
			            	  tt.setText(temp[0]);
			            	  l++;
			              }
		                
		              
			              trow.addView(e1);
			              trow.addView(e2);
			              trow.addView(e3);
			              trow.addView(e4);
			        	  trow.addView(e5);
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
	       {for(int i=0;i<=lec;i++) 
		     {
		        TableRow trow=new TableRow(this);

		        	if(i==0)
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
	                
		       else	
		       {  EditText e1=new EditText(this);
	              e1.setId(t);
	              t++;
	              e1.setTextSize(30);
	              e1.setBackgroundResource(R.drawable.cell_shape);
	              e1.setEnabled(false);
	              e1.setFocusable(false);
	              trow.addView(e1);
	              EditText e2=new EditText(this);
	              e2.setId(t);
	              e2.setTextSize(30);
	              t++;
	              e2.setEnabled(false);
	              e2.setFocusable(false);
	              e2.setBackgroundResource(R.drawable.cell_shape);
	              trow.addView(e2);
	              EditText e3=new EditText(this);
	              e3.setTextSize(30);
	              e3.setId(t);
	              e3.setEnabled(false);
	              e3.setFocusable(false);
	              t++;
	              e3.setBackgroundResource(R.drawable.cell_shape);
	              trow.addView(e3);
	              EditText e4=new EditText(this);
	              e4.setId(t);
	              e4.setTextSize(30);
	              e4.setEnabled(false);
	              e4.setFocusable(false);
	              t++;
	              e4.setBackgroundResource(R.drawable.cell_shape);
	              trow.addView(e4);
	              EditText e5=new EditText(this);
	              e5.setTextSize(30);
	              e5.setId(t);
	              e5.setEnabled(false);
	              e5.setFocusable(false);
	              t++;
	              e5.setBackgroundResource(R.drawable.cell_shape);
	              trow.addView(e5);
	              EditText e6=new EditText(this);
	              e6.setTextSize(30);
	              e6.setId(t);
	              e6.setEnabled(false);
	              e6.setFocusable(false);
	              t++;
	              e6.setBackgroundResource(R.drawable.cell_shape);
	              trow.addView(e6);
	              EditText e7=new EditText(this);
	              e7.setId(t);
	              e7.setTextSize(30);
	              e7.setEnabled(false);
	              e7.setFocusable(false);
	              t++;
	              e7.setBackgroundResource(R.drawable.cell_shape);
	              
	              temp=inputString.split("\\t");
	              for(int o=0;o<temp.length;o++)
	              {
	            	  EditText tt = (EditText) findViewById(l);
	            	  tt.setText(temp[0]);
	            	  l++;
	              }
	              
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
		    setContentView(sv);  */
		} 

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.existing_tt, menu);
		return true;
	}

}
