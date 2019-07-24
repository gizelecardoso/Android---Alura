package br.com.alura.agenda;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Toast nao e muito utilizado
        // Toast.makeText(this, "Gizele Correia", Toast.LENGTH_LONG).show();

        //podemos aplicar atraves da classe TestView
        //porem nao e muito usual colocar tanta responsabilidade na Activity
        //precisamos criar um arquivo especifico para isso no RES.
        //TextView aluno = new TextView(this);
        //aluno.setText("Gizele Correia");

        setContentView(R.layout.activity_main);

        List<String> alunos = new ArrayList<>(Arrays.asList("Gizele", "Maria", "Joao"));

        //TextView primeiroAluno = findViewById(R.id.textView);
        //TextView segundoAluno = findViewById(R.id.textView2);
        //TextView terceiroAluno = findViewById(R.id.textView3);

        //primeiroAluno.setText(alunos.get(0));
        //segundoAluno.setText(alunos.get(1));
        //terceiroAluno.setText(alunos.get(2));

        ListView listaDeAlunos = findViewById(R.id.activity_main_lista_de_alunos);
        listaDeAlunos.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alunos));

    }
}
