package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.example.myapplication.DAO.IPersonDAO;
import com.example.myapplication.DAO.PersonDAOData;
import com.example.myapplication.DTO.Person;

public class RegisterPersonActivity extends AppCompatActivity {

    Button register_person;
    EditText name, last_name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_person);

        final IPersonDAO personDAOData = new PersonDAOData();

        register_person = findViewById(R.id.register);
        register_person.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        name = findViewById(R.id.name);
                        last_name = findViewById(R.id.last_name);

                        Person person = new Person(name.getText().toString(), last_name.getText().toString(), Color.BLUE);

                        personDAOData.addPerson(person);

                        Toast.makeText(getApplicationContext(), "Affichage ok", Toast.LENGTH_LONG).show();
                        Intent activityChangeIntent = new Intent(RegisterPersonActivity.this, MainActivity.class);
                        RegisterPersonActivity.this.startActivity(activityChangeIntent);
                    }
                });
    }
}
