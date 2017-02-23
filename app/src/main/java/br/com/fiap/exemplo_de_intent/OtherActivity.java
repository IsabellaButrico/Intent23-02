package br.com.fiap.exemplo_de_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class OtherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);


        /*pegar dados da intent*/
        Intent it = getIntent();

        Pessoa pessoa = (Pessoa)it.getSerializableExtra("pessoa");
       /* String nome = it.getStringExtra("nome");
        int idade = it.getIntExtra("idade",0);
        boolean deficiente = it.getBooleanExtra("deficiente",false);*/


        TextView txtNome = (TextView) findViewById(R.id.txtNome);
        txtNome.setText(pessoa.getNome());

        TextView txtIdade = (TextView) findViewById(R.id.txtIdade);
        txtIdade.setText("idade" + pessoa.getIdade());

      /*  TextView txtDeficiente = (TextView) findViewById(R.id.txDeficiente);
        txtDeficiente.setText("Deficiente" + deficiente);*/

            String strDeficiente = (pessoa.isDeficiente()) ? "A pessoa possui defiência:" :
                    "A pessoa não possui deficiência";

        TextView txtDeficiente = (TextView) findViewById(R.id.txDeficiente);
        txtDeficiente.setText(strDeficiente);



    }



}
