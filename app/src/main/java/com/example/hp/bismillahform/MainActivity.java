package com.example.hp.bismillahform;

import android.annotation.SuppressLint;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button;
        final EditText edittext_nama;
        final RadioGroup radiogroup_kelamin;
        final CheckBox checkbox_hobi_browsing, checkbox_hobi_coding, checkbox_hobi_membaca, checkbox_hobi_renang;
        final StringBuffer[] pilih_hobi = new StringBuffer[1];

        button = (Button) findViewById(R.id.button);
        edittext_nama = (EditText) findViewById(R.id.edittext_nama);
        radiogroup_kelamin = (RadioGroup) findViewById(R.id.radiogroup_kelamin);
        checkbox_hobi_browsing = (CheckBox) findViewById(R.id.checkbox_hobi_browsing);
        checkbox_hobi_coding = (CheckBox) findViewById(R.id.checkbox_hobi_coding);
        checkbox_hobi_membaca = (CheckBox) findViewById(R.id.checkbox_hobi_membaca);
        checkbox_hobi_renang = (CheckBox) findViewById(R.id.checkbox_hobi_renang);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer kelamin = radiogroup_kelamin.getCheckedRadioButtonId();
                RadioButton radiobutton_kelamin = (RadioButton) findViewById(kelamin);
                Toast.makeText(getApplicationContext(),"data telah terkirim", Toast.LENGTH_LONG).show();

                pilih_hobi[0] = new StringBuffer();

                pilih_hobi[0].append("Browsing : ").append(checkbox_hobi_browsing.isChecked());
                pilih_hobi[0].append("nCoding : ").append(checkbox_hobi_coding.isChecked());
                pilih_hobi[0].append("nMembaca : ").append(checkbox_hobi_membaca.isChecked());
                pilih_hobi[0].append("nRenang : ").append(checkbox_hobi_renang.isChecked());

                if (checkbox_hobi_browsing.isChecked()) {
                    pilih_hobi[0].append("n Browsing");
                }
                if (checkbox_hobi_coding.isChecked()) {
                    pilih_hobi[0].append("n Coding");
                }
                if (checkbox_hobi_membaca.isChecked()) {
                    pilih_hobi[0].append("n Membaca");
                }
                if (checkbox_hobi_renang.isChecked()) {
                    pilih_hobi[0].append("n Renang");
                }

                Toast.makeText(getApplicationContext(), edittext_nama.getText() + "nn" + radiobutton_kelamin.getText() + "n" + pilih_hobi[0].toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}

