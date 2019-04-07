package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ListView;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
   /* SwipeRefreshLayout srlIndicador;
    ListView lista;
    Adapter adaptador;*/
   TextInputEditText tiFullName;
   TextInputEditText tiPhoneNumber;
   TextInputEditText tiEmail;
   TextInputEditText tiDescription;
   DatePicker dpBirthDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tiFullName = (TextInputEditText) findViewById(R.id.tiFullName);
        tiPhoneNumber = (TextInputEditText) findViewById(R.id.tiPhoneNumber);
        tiEmail = (TextInputEditText) findViewById(R.id.tiEmail);
        tiDescription = (TextInputEditText) findViewById(R.id.tiDescription);
        dpBirthDate = (DatePicker) findViewById(R.id.dpBirthDate);

        Log.i("LOLOLOLOL", tiFullName.getText().toString());

        nextButton();

        /*boton();

        srlIndicador = (SwipeRefreshLayout) findViewById(R.id.srlIndicador);
        lista = (ListView) findViewById(R.id.lista);

        String[] etiquetas = getResources().getStringArray(R.array.listaEtiquetas);

        lista.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, etiquetas));
        srlIndicador.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {

            }
        });*/

    }

    public void nextButton() {
        Button nextButton = (Button) findViewById(R.id.nextButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ConfirmDataActivity.class);
                intent.putExtra("fullName", tiFullName.getText().toString());
                intent.putExtra("phoneNumber", tiPhoneNumber.getText().toString());
                intent.putExtra("email", tiEmail.getText().toString());
                intent.putExtra("description", tiDescription.getText().toString());
                intent.putExtra("birthDateDay", dpBirthDate.getDayOfMonth());
                intent.putExtra("birthDateMonth", dpBirthDate.getMonth());
                intent.putExtra("birthDateYear", dpBirthDate.getYear());
                startActivity(intent);
            }
        });
    }

    /*public void boton() {
        FloatingActionButton miFab = (FloatingActionButton) findViewById(R.id.fabLol);
        miFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                                    //getResources().getString(R.string.NombreVariable)
                Snackbar.make(view, "lol", Snackbar.LENGTH_SHORT)
                        .setAction("Acción", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Log.i("Lololol", "Mensaje LOL");
                            }
                        })
                        .show();
            }
        });
    }*/
}
