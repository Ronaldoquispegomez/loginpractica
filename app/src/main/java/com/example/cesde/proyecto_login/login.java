package com.example.cesde.proyecto_login;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class login extends AppCompatActivity {


    EditText etNombre;
    EditText etPass;
    Button btnCosulta;
    Button btnCancelar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        etNombre = (EditText) findViewById(R.id.et_nombre);
        etPass = (EditText) findViewById(R.id.et_pass);
        btnCosulta = (Button) findViewById(R.id.btn_muestra);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action",Snackbar.LENGTH_LONG)
                        .setAction( "Action", null).show();
            }
        });
    }

    public  void mostrarMensaje(View view){
        String user = "Ronaldo";
        String pass = "Diego";

        String usuario= etNombre.getText().toString();
        String contraseña = etPass.getText().toString();

        switch (view.getId()){
            case(R.id.btn_muestra):
                if (usuario.equals(user) && contraseña.equals(pass)){
                    Intent irVentana = new Intent( this, Error.class);
                    irVentana.putExtra("usuario_01",user);
                    irVentana.putExtra("contraseña_01",pass);
                    startActivity(irVentana);
                }else{
                    Intent irVentana = new Intent(this,Error.class);
                    startActivity(irVentana);
                }
                break;
            case(R.id.btn_Cancelar):
                    etNombre.setText(null);
                    etPass.setText(null);
                    break;


        }
    }
}