package com.miramicodigo.studyjam_ii_views_ii;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

private int cont=0;
    private TextView tViewRes;
    private double num1;
    private double num2;
    private double res;
    private String operador;
    private int swNum=0;
    private int swComa=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        tViewRes=(TextView)findViewById(R.id.tvResultado);
        tViewRes.setText("");
    }

public void mostrar(View view){
    if(swNum==1){ num2 = Double.parseDouble(tViewRes.getText().toString());
    if(operador.equals("+"))
    {
        res= num1+num2;
    }
    else if(operador.equals("-"))
    {
        res= num1-num2;
    }
    else if(operador.equals("*"))
    {
        res= num1*num2;
    }
    else if(operador.equals("/"))
    {
        res= num1/num2;
    }
    tViewRes.setText(res+"");
}}

    public void suma(View view)
    {if(swNum==1){
        operador="+";
        onClickOperacionCapturaNumero1(view);
    swComa=0;}
    }
    public void resta(View view)
    {if(swNum==1){
        operador="-";
        onClickOperacionCapturaNumero1(view);
        swComa=0;}
    }
    public void multi(View view)
    {if(swNum==1){
        operador="*";
        onClickOperacionCapturaNumero1(view);
        swComa=0;
    }
    }
    public void dividir(View view)
    {if(swNum==1){
        operador="/";
        onClickOperacionCapturaNumero1(view);
        swComa=0;}
    }

    public void onClickOperacionCapturaNumero1(View view)
    {
        num1 = Double.parseDouble(tViewRes.getText().toString());
        tViewRes.setText("");
    }

    public void ce(View view)
    {
        num1=0.0;
        num2=0.0;
        tViewRes.setText("");
        swNum=0;
        swComa=0;
    }

    public void uno(View view)
    {
        tViewRes.setText(tViewRes.getText() + "1");
        swNum=1;
    }
    public void dos(View view)
    {
        tViewRes.setText(tViewRes.getText() + "2");
        swNum=1;
    }
    public void tres(View view)
    {
        tViewRes.setText(tViewRes.getText() + "3");
        swNum=1;
    }
    public void cuatro(View view)
    {
        tViewRes.setText(tViewRes.getText() + "4");
        swNum=1;
    }
    public void cinco(View view)
    {
        tViewRes.setText(tViewRes.getText() + "5");
        swNum=1;
    }
    public void seis(View view)
    {
        tViewRes.setText(tViewRes.getText() + "6");
        swNum=1;
    }
    public void siete(View view)
    {
        tViewRes.setText(tViewRes.getText() + "7");
        swNum=1;
    }
    public void ocho(View view)
    {
        tViewRes.setText(tViewRes.getText() + "8");
        swNum=1;
    }
    public void nueve(View view)
    {
        tViewRes.setText(tViewRes.getText() + "9");
        swNum=1;
    }
    public void cero(View view)
    {
        tViewRes.setText(tViewRes.getText() + "0");
        swNum=1;
    }
    public void coma(View view)
    {if (swComa==0){
        tViewRes.setText(tViewRes.getText() + ".");
        swNum=1;
    swComa=1;}
    }


}
