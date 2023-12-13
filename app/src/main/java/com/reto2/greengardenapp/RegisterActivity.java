package com.reto2.greengardenapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText editTextName = findViewById(R.id.inputRegName);
        final EditText editTextLastName = findViewById(R.id.inputRegLastName);
        final EditText editTextEmail = findViewById(R.id.inputRegMail);
        final EditText editTextPassword = findViewById(R.id.inputRegPassword);
        final EditText editTextConfirmPassword = findViewById(R.id.inputRepRegPassword);
        Button buttonRegister = findViewById(R.id.btnRecRegister);

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para registrar al usuario
                // Puedes verificar los campos y la coincidencia de las contraseñas
                // Si la validación es exitosa, muestra un mensaje de éxito
                Toast.makeText(RegisterActivity.this, "Registro exitoso", Toast.LENGTH_SHORT).show();
            }
        });
    }
}