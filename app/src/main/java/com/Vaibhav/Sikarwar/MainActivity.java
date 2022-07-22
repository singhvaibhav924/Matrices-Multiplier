package com.Vaibhav.Sikarwar;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.graphics.drawable.*;
import android.view.ViewGroup.*;
import android.view.*;
import android.text.*;
import android.util.*;
import java.util.Arrays;
import android.content.*;

public class MainActivity extends Activity 
{
	Context ctx = this;
	
	int x1 = 3,x2 = 3,x3 = 3,y1 = 3,y2 = 3,y3 = 3;
	TextView t1,t2,t3,t4;
	TableLayout tb1,tb2,res;
	TextWatcher tw1,tw2,tw3,tw4 ;
	EditText[][] et1,et2,et3;
	Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.main);
		try {
			tb1 = (TableLayout)findViewById(R.id.tb1);
			tb2 = (TableLayout)findViewById(R.id.tb2);
			res = (TableLayout)findViewById(R.id.res);
		t1 = (TextView)findViewById(R.id.t1);
		t2 = (TextView)findViewById(R.id.t2);
		t3 = (TextView)findViewById(R.id.t3);
		t4 = (TextView)findViewById(R.id.t4);
		et1 = table.table1(3,3,this,tb1);
		et2 = table.table1(3,3,this,tb2);
		et3 = table.table1(3,3,this,res);
		b1 = (Button)findViewById(R.id.b1);
			tw1 = new TextWatcher() {
				@Override public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) { }
				@Override public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) { }
				@Override public void afterTextChanged(Editable editable) {
					try {
						x1 = Integer.parseInt(t1.getText().toString());
					} catch(Exception e) {
						x1 = 0;
					}
					x3 = x1;
					et1 = table.table1(x1,y1,ctx,tb1);
					et3 = table.table1(x3,y3,ctx,res);

				}
			};
			tw2 = new TextWatcher() {
				@Override public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) { }
				@Override public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) { }
				@Override public void afterTextChanged(Editable editable) {
					try {
						y1 = Integer.parseInt(t2.getText().toString());
					} catch(Exception e) {
						y1 = 0;
					}

						x2 = y1;
					    
						t3.removeTextChangedListener(tw3);
						t3.setText(""+x2);
						t3.addTextChangedListener(tw3);
						et1 = table.table1(x1,y1,ctx,tb1);
						et2 = table.table1(x2,y2,ctx,tb2);
					

				}
			};
			tw3 = new TextWatcher() {
				@Override public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) { }
				@Override public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) { }
				@Override public void afterTextChanged(Editable editable) {
					try {
						x2 = Integer.parseInt(t3.getText().toString());
					} catch(Exception e) {
						x2 = 0;
					}
					y1 = x2;
					
					t2.removeTextChangedListener(tw2);
					t2.setText(""+y1);
					t2.addTextChangedListener(tw2);
					et1 = table.table1(x1,y1,ctx,tb1);
					et2 = table.table1(x2,y2,ctx,tb2);

				}
			};
			tw4 = new TextWatcher() {
				@Override public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) { }
				@Override public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) { }
				@Override public void afterTextChanged(Editable editable) {
					try {
						y2 = Integer.parseInt(t4.getText().toString());
					} catch(Exception e) {
						y2 = 0;
					}
					y3 = y2;
					et2 = table.table1(x2,y2,ctx,tb2);
					et3 = table.table1(x3,y3,ctx,res);

				}
			};
			t1.addTextChangedListener(tw1);
			t2.addTextChangedListener(tw2);
			t3.addTextChangedListener(tw3);
			t4.addTextChangedListener(tw4);
		    b1.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					try {
					Cal.calc(et1,et2,et3,x1,y2,x2);
					} catch(Exception e) {
						Toast.makeText(ctx,e.getMessage(),Toast.LENGTH_LONG).show();
					}
				}
			});
		} catch(Exception e) {
			Toast.makeText(this,e.getMessage()+e.getCause(),Toast.LENGTH_LONG).show();
		}
    }
	
}
