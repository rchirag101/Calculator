package com.example.chirag.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity  implements View.OnClickListener {

    Button[] btn = new Button[10];
    Button btnClr,btnBrack,btnMod,btnDiv,btnMul,
            btnMin,btnAdd,btnPlusMin,btnDot,btnEq;
    EditText txtNum=null;
    TextView lblMsg = null;
    Double num1,num2,result;
    String op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn[0] = findViewById(R.id.btn0);btn[1] = findViewById(R.id.btn1);
        btn[2] = findViewById(R.id.btn2);btn[3] = findViewById(R.id.btn3);
        btn[4] = findViewById(R.id.btn4);btn[5] = findViewById(R.id.btn5);
        btn[6] = findViewById(R.id.btn6);btn[7] = findViewById(R.id.btn7);
        btn[8] = findViewById(R.id.btn8);btn[9] = findViewById(R.id.btn9);

        for (int i = 0; i<10; i++){
            btn[i].setOnClickListener(this);
        }

        btnClr = findViewById(R.id.btnClr);     btnClr.setOnClickListener(this);
        btnBrack = findViewById(R.id.btnBrack); btnBrack.setOnClickListener(this);
        btnMod = findViewById(R.id.btnMod);     btnMod.setOnClickListener(this);
        btnDiv = findViewById(R.id.btnDiv);     btnDiv.setOnClickListener(this);
        btnMul = findViewById(R.id.btnMul);     btnMul.setOnClickListener(this);
        btnMin = findViewById(R.id.btnMin);     btnMin.setOnClickListener(this);
        btnAdd = findViewById(R.id.btnAdd);     btnAdd.setOnClickListener(this);
        btnPlusMin = findViewById(R.id.btnPlusMin);btnPlusMin.setOnClickListener(this);
        btnDot = findViewById(R.id.btnDot);     btnDot.setOnClickListener(this);
        btnEq = findViewById(R.id.btnEq);       btnEq.setOnClickListener(this);

        txtNum = findViewById(R.id.txtNum);
        txtNum.setText("0");
        //txtNum.setEnabled(false);
        lblMsg = findViewById(R.id.lblMsg);
    }

    @Override
    public void onClick(View view) {
        String etText = txtNum.getText().toString();

        switch (view.getId()){
            case R.id.btnClr:
                txtNum.setText("");
                lblMsg.setText("");
                break;
            //numbers
            case R.id.btn0:
                if (etText.equals("0"))
                    txtNum.setText(btn[0].getText());
                else
                    txtNum.setText(etText + "" + btn[0].getText());
                break;
            case R.id.btn1:
                if (etText.equals("0"))
                    txtNum.setText(btn[1].getText());
                else
                    txtNum.setText(etText + "" + btn[1].getText());
                break;
            case R.id.btn2:
                if (etText.equals("0"))
                    txtNum.setText(btn[2].getText());
                else
                    txtNum.setText(etText + "" + btn[2].getText());
                break;
            case R.id.btn3:
                if (etText.equals("0"))
                    txtNum.setText(btn[3].getText());
                else
                    txtNum.setText(etText + "" + btn[3].getText());
                break;
            case R.id.btn4:
                if (etText.equals("0"))
                    txtNum.setText(btn[4].getText());
                else
                    txtNum.setText(etText + "" + btn[4].getText());
                break;
            case R.id.btn5:
                if (etText.equals("0"))
                    txtNum.setText(btn[5].getText());
                else
                    txtNum.setText(etText + "" + btn[5].getText());
                break;
            case R.id.btn6:
                if (etText.equals("0"))
                    txtNum.setText(btn[6].getText());
                else
                    txtNum.setText(etText + "" + btn[6].getText());
                break;
            case R.id.btn7:
                if (etText.equals("0"))
                    txtNum.setText(btn[7].getText());
                else
                    txtNum.setText(etText + "" + btn[7].getText());
                break;
            case R.id.btn8:
                if (etText.equals("0"))
                    txtNum.setText(btn[8].getText());
                else
                    txtNum.setText(etText + "" + btn[8].getText());
                break;
            case R.id.btn9:
                if (etText.equals("0"))
                    txtNum.setText(btn[9].getText());
                else
                    txtNum.setText(etText + "" + btn[9].getText());
                break;

            //operations
            case R.id.btnAdd:
                num1 = Double.valueOf(etText);
                op = "+";
                txtNum.setText("");
                break;
            case R.id.btnMin:
                num1 = Double.valueOf(etText);
                op = "-";
                txtNum.setText("");
                break;
            case R.id.btnMul:
                num1 = Double.valueOf(etText);
                op = "*";
                txtNum.setText("");
                break;
            case R.id.btnDiv:
                num1 = Double.valueOf(etText);
                op = "/";
                txtNum.setText("");
                break;
            case R.id.btnMod:
                num1 = Double.valueOf(etText);
                op = "%";
                txtNum.setText("");
                break;
            //main logic
            case R.id.btnEq:
                num2 = Double.valueOf(txtNum.getText().toString());
                if(op.equals("+"))
                    result = num1 + num2;
                else if(op.equals("-"))
                    result = num1 - num2;
                else if(op.equals("*"))
                    result = num1 * num2;
                else if(op.equals("/"))
                    result = num1 / num2;
                else if(op.equals("%"))
                    result = num1 % num2;
                else{

                }
                lblMsg.setText(num1+" "+op+" "+num2+" = "+result);
                num1 = result;
                txtNum.setText(String.valueOf(result));
                break;
        }//end view.getId() switch
        txtNum.setSelection(txtNum.getText().length());
    }//End of onClick
}