package com.example.aula_26_10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    protected ListView listLocais;

    private String[] localidades = {"Goiânia", "Goiás", "Pirenópoli", "Caldas Novas",
                                    "Corumbá", "Valparaiso", "Anápolis", "Hidrolândia",
                                    "Senador Canedo", "Trindade", "Inhumas", "Aparecida de Goiânia",
                                "Morrinhos", "Abadia de Goiás", "Ceres", "Guapó", "Rio Verde"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listLocais = findViewById(R.id.listLocal);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(), android.R.layout.simple_list_item_1,
                android.R.id.text1,localidades );
        listLocais.setAdapter(adaptador);

        listLocais.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String valorSelecionado = listLocais.getItemAtPosition(i).toString();
                Toast.makeText(getApplicationContext(),valorSelecionado,Toast.LENGTH_SHORT).show();
            }
        });
    }

}