package com.leve.gamelauncher;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(24, 24, 24, 24);
        layout.setBackgroundColor(Color.rgb(18, 18, 28));

        TextView titulo = new TextView(this);
        titulo.setText("MEU GAME LAUNCHER");
        titulo.setTextColor(Color.WHITE);
        titulo.setTextSize(26);
        titulo.setGravity(Gravity.CENTER);

        TextView mensagem = new TextView(this);
        mensagem.setText("Seus jogos em um só lugar!");
        mensagem.setTextColor(Color.LTGRAY);
        mensagem.setTextSize(16);
        mensagem.setGravity(Gravity.CENTER);
        mensagem.setPadding(0, 24, 0, 0);

        layout.addView(titulo);
        layout.addView(mensagem);

        setContentView(layout);
    }
}
