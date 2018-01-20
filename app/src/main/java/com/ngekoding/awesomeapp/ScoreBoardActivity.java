package com.ngekoding.awesomeapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScoreBoardActivity extends AppCompatActivity {

    // 1. Deklarasi
    TextView skorA, skorB;
    Button btnA3, btnB3, btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_board);

        // 2. Bind view
        skorA = findViewById(R.id.skor_a);
        skorB = findViewById(R.id.skor_b);
        btnA3 = findViewById(R.id.btn_a_3);
        btnB3 = findViewById(R.id.btn_b_3);
        btnReset = findViewById(R.id.btn_reset);

        // 3. Reset skor
        skorA.setText("0");
        skorB.setText("0");

        // 4. Ketika btnA3 diklik
        btnA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int skorASekarang = Integer.valueOf(skorA.getText().toString());
                // Tambah nilai A dengan 3
                skorASekarang = skorASekarang + 3;
                // Update skor A
                skorA.setText(String.valueOf(skorASekarang));
            }
        });

        // 5. Ketika btnB3 diklik
        btnB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int skorBSekarang = Integer.valueOf(skorB.getText().toString());
                // Tambah nilai B dengan 3
                skorBSekarang = skorBSekarang + 3;
                // Update skor B
                skorB.setText(String.valueOf(skorBSekarang));
            }
        });

        // 6. Ketika btnReset diklik
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                skorA.setText("0");
                skorB.setText("0");
            }
        });
    }
}
