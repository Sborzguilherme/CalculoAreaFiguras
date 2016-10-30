package com.example.guilhermesborz.calculoareafiguras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class TrianguloActivity extends AppCompatActivity {

    EditText edAlturaT;
    EditText edBaseT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);

        edAlturaT = (EditText) findViewById(R.id.edAlturaT);
        edBaseT = (EditText) findViewById(R.id.edBaseT);
    }

    public void cliqueAvancarTriangulo(View origemDoClique){

        Intent abridor = new Intent(this.getApplicationContext(), ResultadoFinalActivity.class);
        String codigo = "Triângulo";

        String valorAltura = edAlturaT.getText().toString();
        String valorBase = edBaseT.getText().toString();

        Float altura = Float.parseFloat(valorAltura);
        Float base = Float.parseFloat(valorBase);

        Float resultado = (altura * base)/2;

        abridor.putExtra("Resultado",resultado);
        abridor.putExtra("Codigo",codigo);

        startActivity(abridor);
        finish();

    }
}
