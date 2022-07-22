package com.Vaibhav.Sikarwar;
import android.widget.*;

public class Cal
{
	public static void calc(EditText[][] A,EditText[][] B,EditText[][] C,int r,int c,int y) {
		for(int i = 0;i<c;i++) {
			for(int j = 0;j<r;j++) {
				C[i][j].setText(""+0);
				for(int k = 0;k<y;k++) {
					
					C[i][j].setText(""+(Integer.parseInt(C[i][j].getText().toString())+((Integer.parseInt(A[i][k].getText().toString())*Integer.parseInt(B[k][j].getText().toString())))));
				}
			}
		}
	}
}
