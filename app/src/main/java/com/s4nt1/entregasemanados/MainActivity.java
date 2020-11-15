package com.s4nt1.entregasemanados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_next = (Button) findViewById(R.id.btn_next);
        EditText name = (EditText) findViewById(R.id.form_name);
        EditText email = (EditText) findViewById(R.id.form_email);
        EditText tel = (EditText) findViewById(R.id.form_tel);

        Bundle extras = getIntent().getExtras();
        name.setText(extras.getString("name"));
        tel.setText(extras.getString("tel"));
        email.setText(extras.getString("email"));

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetalleContacto.class);
                EditText name = (EditText) findViewById(R.id.form_name);
                EditText tel = (EditText) findViewById(R.id.form_tel);
                EditText email = (EditText) findViewById(R.id.form_email);
                EditText desc = (EditText) findViewById(R.id.form_desc);
                DatePicker data_picker = (DatePicker) findViewById(R.id.form_dp);

                intent.putExtra("name",name.getText().toString());
                intent.putExtra("tel",tel.getText().toString());
                intent.putExtra("email",email.getText().toString());
                intent.putExtra("desc",desc.getText().toString());
                intent.putExtra("data_picker",data_picker.getDayOfMonth()+"/"+data_picker.getMonth()+"/"+data_picker.getYear());
                startActivity(intent);
            }
        });
    }
}