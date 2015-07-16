package com.njupt.zhb.calculator;
import android.os.Bundle;
import android.R.bool;
import android.R.integer;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.*;
import android.view.View.OnClickListener;
public class MainActivity extends Activity {
	
    Button btn_num1;
    Button btn_num2;
    Button btn_num3;
    Button btn_num4;
    Button btn_num5;
    Button btn_num6;
    Button btn_num7;
    Button btn_num8;
    Button btn_num9;
    Button btn_num0;
    Button btnEqu;
    Button btnAdd;
    Button btnSub;
    Button btnMul;
    Button btnDiv;
    Button btnPoint;
    Button btnAbout;
    OnClickListener listener0=null;
    OnClickListener listener1=null;
    OnClickListener listener2=null;
    OnClickListener listener3=null;
    OnClickListener listener4=null;
    OnClickListener listener5=null;
    OnClickListener listener6=null;
    OnClickListener listener7=null;
    OnClickListener listener8=null;
    OnClickListener listener9=null;
    OnClickListener listenerEqu=null;
    OnClickListener listenerAdd=null;
    OnClickListener listenerSub=null;
    OnClickListener listenerMul=null;
    OnClickListener listenerDiv=null;
    OnClickListener listenerPoint=null;
    OnClickListener listenerAbout=null;
    CharSequence input_text=null;
    EditText displayText;
    TextView textview1;
    
    double num1=0;
    double num2=0;
    double result=0;
    int CalType=0;
    boolean EquBtnDownFlag=false;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("¼ÆËãÆ÷");
        displayText=(EditText)findViewById(R.id.EditText1);
        displayText.setText(null);
        textview1=(TextView)findViewById(R.id.TextView1);
        btn_num0=(Button)findViewById(R.id.BtnNum0);
        btn_num1=(Button)findViewById(R.id.BtnNum1);
        btn_num2=(Button)findViewById(R.id.BtnNum2);
        btn_num3=(Button)findViewById(R.id.BtnNum3);
        btn_num4=(Button)findViewById(R.id.BtnNum4);
        btn_num5=(Button)findViewById(R.id.BtnNum5);
        btn_num6=(Button)findViewById(R.id.BtnNum6);
        btn_num7=(Button)findViewById(R.id.BtnNum7);
        btn_num8=(Button)findViewById(R.id.BtnNum8);
        btn_num9=(Button)findViewById(R.id.BtnNum9);
        btnAdd=(Button)findViewById(R.id.BtnAdd);
        btnSub=(Button)findViewById(R.id.BtnSubtract);
        btnMul=(Button)findViewById(R.id.BtnMul);
        btnDiv=(Button)findViewById(R.id.BtnDivide);
        btnPoint=(Button)findViewById(R.id.BtnNumPoint);
        btnEqu=(Button)findViewById(R.id.BtnEqual);
        listener0= new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (EquBtnDownFlag) {
					displayText.setText(null);
					EquBtnDownFlag=false;
				}
				CharSequence temp=displayText.getText();
				String myString=temp.toString();
				myString+="0";
                displayText.setText(myString);
			}
		};
        listener1= new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (EquBtnDownFlag) {
					displayText.setText(null);
					EquBtnDownFlag=false;
				}
				CharSequence temp=displayText.getText();
				String myString=temp.toString();
				myString+="1";
                displayText.setText(myString);
			}
		};
        listener2= new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (EquBtnDownFlag) {
					displayText.setText(null);
					EquBtnDownFlag=false;
				}
				CharSequence temp=displayText.getText();
				String myString=temp.toString();
				myString+="2";
                displayText.setText(myString);
			}
		};
        listener3= new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (EquBtnDownFlag) {
					displayText.setText(null);
					EquBtnDownFlag=false;
				}
				CharSequence temp=displayText.getText();
				String myString=temp.toString();
				myString+="3";
                displayText.setText(myString);
			}
		};
        listener4= new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (EquBtnDownFlag) {
					displayText.setText(null);
					EquBtnDownFlag=false;
				}
				CharSequence temp=displayText.getText();
				String myString=temp.toString();
				myString+="4";
                displayText.setText(myString);
			}
		};
        listener5= new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (EquBtnDownFlag) {
					displayText.setText(null);
					EquBtnDownFlag=false;
				}
				CharSequence temp=displayText.getText();
				String myString=temp.toString();
				myString+="5";
                displayText.setText(myString);
			}
		};
        listener6= new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (EquBtnDownFlag) {
					displayText.setText(null);
					EquBtnDownFlag=false;
				}
				CharSequence temp=displayText.getText();
				String myString=temp.toString();
				myString+="6";
                displayText.setText(myString);
			}
		};
        listener7= new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (EquBtnDownFlag) {
					displayText.setText(null);
					EquBtnDownFlag=false;
				}
				CharSequence temp=displayText.getText();
				String myString=temp.toString();
				myString+="7";
                displayText.setText(myString);
			}
		};
        listener8= new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (EquBtnDownFlag) {
					displayText.setText(null);
					EquBtnDownFlag=false;
				}
				CharSequence temp=displayText.getText();
				String myString=temp.toString();
				myString+="8";
                displayText.setText(myString);
			}
		};
        listener9= new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (EquBtnDownFlag) {
					displayText.setText(null);
					EquBtnDownFlag=false;
				}
				CharSequence temp=displayText.getText();
				String myString=temp.toString();
				myString+="9";
                displayText.setText(myString);
			}
		};
        listenerPoint= new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (EquBtnDownFlag) {
					displayText.setText(null);
					EquBtnDownFlag=false;
				}
				CharSequence temp=displayText.getText();
				String myString=temp.toString();
				myString+=".";
                displayText.setText(myString);
			}
		};
        listenerAdd= new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				CharSequence temp=displayText.getText();
				if (temp.equals(null)) {
					return;
				}
				String myString=temp.toString();
				num1=Double.parseDouble(myString);
				CalType=1;
                displayText.setText(null);
			}
		};
        listenerSub= new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				CharSequence temp=displayText.getText();
				if (temp.equals(null)) {
					return;
				}
				String myString=temp.toString();
				num1=Double.parseDouble(myString);
				CalType=2;
                displayText.setText(null);
			}
		};
        listenerMul= new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				CharSequence temp=displayText.getText();
				if (temp.equals(null)) {
					return;
				}
				String myString=temp.toString();
				num1=Double.parseDouble(myString);
				CalType=3;
                displayText.setText(null);
			}
		};
        listenerDiv= new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				CharSequence temp=displayText.getText();
				if (temp.equals(null)) {
					return;
				}
				String myString=temp.toString();
				num1=Double.parseDouble(myString);
				CalType=4;
                displayText.setText(null);
			}
		};
        listenerEqu= new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				CharSequence temp=displayText.getText();
				if (temp.equals(null)) {
					return;
				}
				String myString=temp.toString();
				num2=Double.parseDouble(myString);
				switch(CalType)
				{
				case 0:
					result=num2;
					break;
				case 1:
					result=num1+num2;
					break;
				case 2:
					result=num1-num2;
					break;
				case 3:
					result=num1*num2;
					break;
				case 4:
					result=num1/num2;
					break;
			    default:
			    	result=0;
						break;
				}
				String temp_result=String.valueOf(result);
                displayText.setText(temp_result);
                EquBtnDownFlag=true;
			}
		};

		btn_num0.setOnClickListener(listener0);
		btn_num1.setOnClickListener(listener1);
		btn_num2.setOnClickListener(listener2);
		btn_num3.setOnClickListener(listener3);
		btn_num4.setOnClickListener(listener4);
		btn_num5.setOnClickListener(listener5);
		btn_num6.setOnClickListener(listener6);
		btn_num7.setOnClickListener(listener7);
		btn_num8.setOnClickListener(listener8);
		btn_num9.setOnClickListener(listener9);
		btnPoint.setOnClickListener(listenerPoint);
		btnAdd.setOnClickListener(listenerAdd);
		btnSub.setOnClickListener(listenerSub);
		btnMul.setOnClickListener(listenerMul);
		btnDiv.setOnClickListener(listenerDiv);
		btnEqu.setOnClickListener(listenerEqu);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
