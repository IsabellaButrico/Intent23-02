package br.com.fiap.exemplo_de_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }


    public void abrir(View v){

        Intent it = new Intent(this, OtherActivity.class);
        /*it.putExtra("nome","Isabella");
        it.putExtra("idade", 18);
        it.putExtra("deficiente", false);*/


            Pessoa pessoa = new Pessoa();
        pessoa.setNome("Isabella");
        pessoa.setIdade(18);
        pessoa.setDeficiente(false);

        it.putExtra("Pessoa", pessoa);

        startActivity(it);
    }
}
