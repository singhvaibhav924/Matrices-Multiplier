package com.Vaibhav.Sikarwar;
import android.graphics.drawable.*;
import android.view.View.*;
import android.os.*;
import android.app.*;
import android.view.*;
import android.text.*;
import android.util.*;
import android.widget.*;
import android.content.*;
import java.util.*;
public class table
{
	static TableLayout tb1,tb2;
	
	public static EditText[][] table1(int x,int y,Context ctx,TableLayout tb11) {
		EditText[][] et = new EditText[x][y];
		tb1 = tb11;
		tb1.removeAllViewsInLayout();
		for(int i = 0;i<x;i++) {
			TableRow tr1 = new TableRow(ctx);
			
			for(int j = 0;j<y;j++) {

				EditText tv1 = new EditText(ctx);
				
				
				tv1.setEms(1);
				
				tv1.setBackgroundResource(R.drawable.order);
				
				tv1.setSingleLine();
				
				tv1.setGravity(Gravity.CENTER);
				
				tv1.setTextSize(17);
				tv1.setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL);
				tv1.setHeight((int) (TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 44, ctx.getResources().getDisplayMetrics())));
				tv1.setWidth((int) (TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 44, ctx.getResources().getDisplayMetrics())));
				
				tr1.addView(tv1);
				et[i][j] = tv1;

			}
			tb1.addView(tr1);
			
		}
		
		//return copy(et,x,y);
		return et;
	}
	public static EditText[][] copy(EditText[][]et,int x,int y) {
		EditText [][] etn = new EditText[x][y];
		for(int i = 0;i<x;i++) {
			for(int j = 0;j<y;j++) {
				etn[i][j] = et[i][j];
			}
		}
		return etn;
	}
}
