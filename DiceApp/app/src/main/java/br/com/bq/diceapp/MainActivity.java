package br.com.bq.diceapp;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;

import br.com.bq.diceapp.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButtonListenerMethod();
    }
    public void myButtonListenerMethod(){
        Button botao = findViewById(R.id.botaoRolarDado);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand = new Random();
                int resultadoRand = rand.nextInt(6) + 1;
                TextView textoRetorno = findViewById(R.id.resultadoDado);
                textoRetorno.setText("Resultado: " + Integer.toString(resultadoRand));
                ImageView imagemDado = findViewById(R.id.imagemDado);
                switch (resultadoRand){
                    case 1:
                        imagemDado.setImageResource(R.drawable.f1);
                        break;
                    case 2:
                        imagemDado.setImageResource(R.drawable.f2);
                        break;
                    case 3:
                        imagemDado.setImageResource(R.drawable.f3);
                        break;
                    case 4:
                        imagemDado.setImageResource(R.drawable.f4);
                        break;
                    case 5:
                        imagemDado.setImageResource(R.drawable.f5);
                        break;
                    case 6:
                        imagemDado.setImageResource(R.drawable.f6);
                        break;
                }
            }
        });
    }
}