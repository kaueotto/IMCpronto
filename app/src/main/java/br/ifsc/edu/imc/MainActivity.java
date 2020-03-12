package br.ifsc.edu.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    EditText txtPeso,txtAltura;
    ImageView ImageResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtPeso = (EditText)findViewById(R.id.txtPeso);
        txtAltura = (EditText)findViewById(R.id.txtAltura);
        ImageResultado = (ImageView)findViewById(R.id.ImageResultado);
    }

    public void CalcularIMC(View view) {
        float peso=0,altura=0,imc=0;
        peso=Float.parseFloat(txtPeso.getText().toString());
        altura=Float.parseFloat((txtAltura.getText()).toString());
        imc=peso/(altura*altura);
        if(imc<18.5){
            ImageResultado.setImageResource(R.drawable.abaixopeso);
        } else if ((imc>=18.6)&&(imc<=24.9)){
            ImageResultado.setImageResource(R.drawable.normal);
        } else if((imc>=25.0)&&(imc<=29.9)){
            ImageResultado.setImageResource(R.drawable.sobrepeso);
        } else if((imc>=30.0)&&(imc<=34.9)){
            ImageResultado.setImageResource(R.drawable.obesidade1);
        }else if((imc>=35.0)&&(imc<=34.9)){
            ImageResultado.setImageResource(R.drawable.obesidade2);
        } else if (imc>40){
            ImageResultado.setImageResource(R.drawable.obesidade3);
        }

    }
}
