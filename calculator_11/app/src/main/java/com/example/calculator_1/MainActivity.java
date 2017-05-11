package com.example.calculator_1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,num0,num1,num2,num3,num4,num5,num6,
	               num7,num8,num9,dot,bt1,bt2,bt3,bt4;
    private EditText editText;//显示输入的数字
    private String opt = "+";//操作符
    private double n1 = 0.0, n2 = 0.0;//两个操作数
    private TextView textView;//显示算式
    
    private OnClickListener lisenter = new OnClickListener(){

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			editText = (EditText)findViewById(R.id.Text);
            textView = (TextView) findViewById(R.id.textview);
            String s = editText.getText().toString();//获取字符串
            Button btn =(Button)v;
            try{
    
            switch(btn.getId())
            {
                case R.id.num1://1
                {                                    
                    String str = editText.getText().toString();
                    editText.setText(str + 1);
                    str = editText.getText().toString();
                    textView.setText(str);                
                    break;
                }
                case R.id.plus://+
                {
                    String str = editText.getText().toString();
                    n1 = Double.parseDouble(str);
                    opt = "+";                    
                    textView.setText(n1 + opt);
                    editText.setText("");
                    break;
                }
                case R.id.num2://2
                {                    
                    String str = editText.getText().toString();
                    editText.setText(str + 2);    
                    str = editText.getText().toString();
                    textView.setText(str);                
                    break;
                }
                case R.id.equ://操作符=
                {                    
                    if(opt == "+")
                    {                        
                        String str = editText.getText().toString();
                        n2 = Double.parseDouble(str);
                        textView.setText(n1 + opt + n2 + "=");
                        editText.setText((n1 + n2) + "");
                    }
                    else if(opt == "-")
                    {
                        String str = editText.getText().toString();
                        n2 = Double.parseDouble(str);
                        textView.setText(n1 + opt + n2 + "=");
                        editText.setText((n1 - n2) + "");
                    }
                    else if(opt == "×")
                    {
                        String str = editText.getText().toString();
                        n2 = Double.parseDouble(str);
                        textView.setText(n1 + opt + n2 + "=");
                        editText.setText((n1 * n2) + "");
                    }
                    else if(opt == "÷")
                    {
                        String str = editText.getText().toString();
                        n2 = Double.parseDouble(str);
                        if(n2 == 0)
                        {
                            editText.setText("");
                            textView.setText("除数不能为0");
                            break;
                        }                        
                        else
                        {
                            textView.setText(n1 + opt + n2 + "=");
                            editText.setText((n1 / n2) + "");
                        }
                    }
    
                    break;
                }
                case R.id.num3://3
                {                    
                    editText.setText(editText.getText().toString() + 3);
                    String str = editText.getText().toString();
                    textView.setText(str);    
                    break;
                }
                case R.id.num4://4
                {
                    editText.setText(editText.getText().toString() + 4);
                    String str = editText.getText().toString();
                    textView.setText(str);
                    break;
                }
                case R.id.num5://5
                {
                    editText.setText(editText.getText().toString() + 5);
                    String str = editText.getText().toString();
                    textView.setText(str);
                    break;
                }
                case R.id.num6://6
                {
                    editText.setText(editText.getText().toString() + 6);
                    String str = editText.getText().toString();
                    textView.setText(str);
                    break;
                }
                case R.id.num7://7
                {
                    editText.setText(editText.getText().toString() + 7);
                    String str = editText.getText().toString();
                    textView.setText(str);
                    break;
                }
                case R.id.num8://8
                {
                    editText.setText(editText.getText().toString() + 8);    
                    String str = editText.getText().toString();
                    textView.setText(str);
                    break;
                }
                case R.id.num9://9
                {
                    editText.setText(editText.getText().toString() + 9);
                    String str = editText.getText().toString();
                    textView.setText(str);
                    break;
                }
                case R.id.num0://0
                {                    
                    textView.setText(n1 + opt + 10);
                    editText.setText(editText.getText().toString() + 0);
                    String str = editText.getText().toString();
                    textView.setText(str);
                    break;
                }
                case R.id.dot://.
                {
                    String str = editText.getText().toString();
                    if(str.indexOf(".") != -1) //判断字符串中是否已经包含了小数点，如果有就什么也不做
                    {
                        
                    } 
                    else //如果没有小数点 
                    {        
                        if(str.equals("0"))//如果开始为0，
                            editText.setText(("0" + ".").toString());
                        else if(str.equals(""))//如果初时显示为空，就什么也不做
                        {    
                            
                        }
                        else
                            editText.setText(str + ".");
                    }
                    break;
                }
                case R.id.division://操作符 /
                {                
                    String str = editText.getText().toString();
                    n1 = Double.parseDouble(str);
                    opt = "÷";    
                    editText.setText("");
                    textView.setText(n1 + opt);
                    break;
                }
                case R.id.multiply://操作符*
                {        
                    String str = editText.getText().toString();
                    n1 = Double.parseDouble(str);
                    opt = "×";    
                    editText.setText("");
                    textView.setText(n1 + opt);
                    break;
                }
                case R.id.minus://操作符-
                {                    
                    String str = editText.getText().toString();
                    n1 = Double.parseDouble(str);
                    opt = "-";    
                    editText.setText("");    
                    textView.setText(n1 + opt);
                    break;
                }
                
              
                case R.id.tonone://C
                {
                    String str =editText.getText().toString();
                    if(str.length() > 0)
                        editText.setText("");
                    break;
                }
                case R.id.delete://<-    
                {
                    String str =editText.getText().toString();
                    if(str.length() > 0)
                        editText.setText(str.substring(0, str.length() - 1));
                    break;
                }
                case R.id.bt1://sin
                {
                    String str = editText.getText().toString();
                    n1 = Double.parseDouble(str);
                    editText.setText(Math.sin(n1) + "");
                    textView.setText("sin"+n1);
                    break;
                }
                case R.id.bt2://cos
                {
                    String str = editText.getText().toString();
                    n1 = Double.parseDouble(str);
                    editText.setText(Math.cos(n1) + "");
                    textView.setText( "cos"+n1);
                    break;
                }
                case R.id.bt3://genhao
                {
                    String str = editText.getText().toString();
                    n1 = Double.parseDouble(str);
                    editText.setText(Math.sqrt(n1) + "");
                    textView.setText(n1 + "√");
                    break;
                }
                case R.id.bt4://^
                {
                    String str = editText.getText().toString();
                 
                    n1 = Double.parseDouble(str);
                    
                    editText.setText(Math.pow(n1, 2.0) + "");
                    textView.setText(n1 + "^2");
                    break;
                }
                    
            }
            }catch(Exception e){}    
        } 
		
    	
    };
        
       
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		
		 btn1= (Button)findViewById(R.id.delete);
		 btn2 = (Button)findViewById(R.id.plus);
		 btn3 = (Button)findViewById(R.id.minus);
		 btn4 = (Button)findViewById(R.id.multiply);
		 btn5 = (Button)findViewById(R.id.division);
		 btn6 = (Button)findViewById(R.id.equ);
		 btn7 = (Button)findViewById(R.id.tonone);
		
		//num 数字按钮
		 num0 = (Button)findViewById(R.id.num0);
		 num1 = (Button)findViewById(R.id.num1);
		 num2 = (Button)findViewById(R.id.num2);
		 num3 = (Button)findViewById(R.id.num3);
		 num4 = (Button)findViewById(R.id.num4);
	     num5 = (Button)findViewById(R.id.num5);
		 num6 = (Button)findViewById(R.id.num6);
		 num7 = (Button)findViewById(R.id.num7);
		 num8 = (Button)findViewById(R.id.num8);
		 num9 = (Button)findViewById(R.id.num9);
		 dot = (Button)findViewById(R.id.dot);
		 
		 bt1 = (Button)findViewById(R.id.bt1);
		 bt2 = (Button)findViewById(R.id.bt2);
		 bt3 = (Button)findViewById(R.id.bt3);
		 bt4 = (Button)findViewById(R.id.bt4);
		 
		 
		 
		    btn1.setOnClickListener(lisenter);
	        btn2.setOnClickListener(lisenter);
	        btn3.setOnClickListener(lisenter);
	        btn4.setOnClickListener(lisenter);
	        btn5.setOnClickListener(lisenter);
	        btn6.setOnClickListener(lisenter);
	        btn7.setOnClickListener(lisenter);
	        num0.setOnClickListener(lisenter);
	        num1.setOnClickListener(lisenter);
	        num2.setOnClickListener(lisenter);
	        num3.setOnClickListener(lisenter);
	        num4.setOnClickListener(lisenter);
	        num5.setOnClickListener(lisenter);
	        num6.setOnClickListener(lisenter);
	        num7.setOnClickListener(lisenter);
	        num8.setOnClickListener(lisenter);
	        num9.setOnClickListener(lisenter);
	        dot.setOnClickListener(lisenter);
	        bt1.setOnClickListener(lisenter);
	        bt2.setOnClickListener(lisenter);
	        bt3.setOnClickListener(lisenter);
	        bt4.setOnClickListener(lisenter);
	        
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
