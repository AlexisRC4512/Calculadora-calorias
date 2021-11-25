package com.example.calculadora_calorias;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import Persona.Hombre;
import Persona.Mujer;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button calcular=(Button)findViewById(R.id.btnCalcular);
        TextView resultado=(TextView)findViewById(R.id.txvRes);
        EditText sexo=(EditText)findViewById(R.id.edtSexo);
        EditText edad=(EditText)findViewById(R.id.edtAños);
        EditText altura=(EditText)findViewById(R.id.edtAltura);
        EditText actividad=(EditText)findViewById(R.id.edtActividad);
        EditText peso=(EditText)findViewById(R.id.edtPeso);

        calcular.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String sex,ac;
                int ed ,al;
                double pe;
                sex=sexo.getText().toString();
                ed = Integer.parseInt(edad.getText().toString());
                al=Integer.parseInt(altura.getText().toString());
                pe=Double.parseDouble(peso.getText().toString());
                ac=actividad.getText().toString();
                Hombre hombre1=new Hombre(ed,al,pe,ac);
                Mujer mujer1=new Mujer(ed,al,pe,ac);
                if (sex.toLowerCase().equals("hombre")){
                    resultado.setText("");
                    resultado.setText("Calorias diarias :"+hombre1.calculoCalorias());
                }else if (sex.toLowerCase().equals("mujer")){
                    resultado.setText("");
                    resultado.setText("Calorias diarias :"+mujer1.calculoCalorias());
                }else{
                    resultado.setText("");
                    resultado.setText("Error "+sex);
                }
            }
        });
    }
}