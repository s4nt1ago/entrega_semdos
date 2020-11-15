package com.s4nt1.entregasemanados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DetalleContacto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_contacto);

        Bundle extras = getIntent().getExtras();

        TextView name = (TextView) findViewById(R.id.detalle_name);
        TextView tel = (TextView) findViewById(R.id.detalle_tel);
        TextView email = (TextView) findViewById(R.id.detalle_email);
        TextView date = (TextView) findViewById(R.id.detalle_date);
        Button edic = (Button) findViewById(R.id.btn_editar);


        name.setText(extras.getString("name"));
        tel.setText(extras.getString("tel"));
        email.setText(extras.getString("email"));
        date.setText(extras.getString("data_picker"));

        edic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView name = (TextView) findViewById(R.id.detalle_name);
                TextView tel = (TextView) findViewById(R.id.detalle_tel);
                TextView email = (TextView) findViewById(R.id.detalle_email);
                TextView date = (TextView) findViewById(R.id.detalle_date);
                Intent intent = new Intent(DetalleContacto.this, MainActivity.class);

                intent.putExtra("name", name.getText().toString());
                intent.putExtra("tel", tel.getText().toString());
                intent.putExtra("email", email.getText().toString());
                startActivity(intent);

            }
        });

    }
}