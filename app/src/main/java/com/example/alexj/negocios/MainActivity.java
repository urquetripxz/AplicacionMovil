package com.example.alexj.negocios;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends ActionBarActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* LLamada a actividades, metodo onclick implementado en el activity_main.xml*/


    public void openActivityEventos(View view) {
// Do something in response to button
        Intent intent = new Intent(this, Perfil.class);
        startActivity(intent);
    }

    public void openActivityPerfil(View view) {
// Do something in response to button
        Intent intent = new Intent(this, Eventos.class);
        startActivity(intent);
    }


}
