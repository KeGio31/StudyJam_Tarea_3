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
    private int swOper=0;

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
    num2 = Double.parseDouble(tViewRes.getText().toString());
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
}

    public void suma(View view)
    {
        operador="+";
        onClickOperacionCapturaNumero1(view);
    }
    public void resta(View view)
    {
        operador="-";
        onClickOperacionCapturaNumero1(view);
    }
    public void multi(View view)
    {
        operador="*";
        onClickOperacionCapturaNumero1(view);
    }
    public void dividir(View view)
    {
        operador="/";
        onClickOperacionCapturaNumero1(view);
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
    }

    public void uno(View view)
    {
        tViewRes.setText(tViewRes.getText() + "1");
    }
    public void dos(View view)
    {
        tViewRes.setText(tViewRes.getText() + "2");
    }
    public void tres(View view)
    {
        tViewRes.setText(tViewRes.getText() + "3");
    }
    public void cuatro(View view)
    {
        tViewRes.setText(tViewRes.getText() + "4");
    }
    public void cinco(View view)
    {
        tViewRes.setText(tViewRes.getText() + "5");
    }
    public void seis(View view)
    {
        tViewRes.setText(tViewRes.getText() + "6");
    }
    public void siete(View view)
    {
        tViewRes.setText(tViewRes.getText() + "7");
    }
    public void ocho(View view)
    {
        tViewRes.setText(tViewRes.getText() + "8");
    }
    public void nueve(View view)
    {
        tViewRes.setText(tViewRes.getText() + "9");
    }
    public void cero(View view)
    {
        tViewRes.setText(tViewRes.getText() + "0");
    }
    public void coma(View view)
    {
        tViewRes.setText(tViewRes.getText() + ".");
    }


}
