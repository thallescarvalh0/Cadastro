package br.edu.ifsp.scl.sdm.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import br.edu.ifsp.scl.sdm.cadastro.model.Formulario;

public class MainActivity extends AppCompatActivity {

    private EditText edtNomeCompleto;
    private EditText edtTelefone;
    private EditText edtEmail;
    private EditText edtCidade;
    private Spinner spUF;
    private CheckBox ckIngressaLista;
    private RadioButton rbSexo;
    private Button btnLimpar;
    private Button btnSalvar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNomeCompleto = findViewById(R.id.edtNome);
        edtTelefone = findViewById(R.id.edtTelefone);
        edtEmail = findViewById(R.id.edtEmail);
        edtCidade =  findViewById(R.id.edtCidade);
        ckIngressaLista = findViewById(R.id.ckIngressaLista);
        spUF =  findViewById(R.id.spinUF);
        rbSexo = findViewById(R.id.rbMasculino);
        btnLimpar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);
        //((TextView) spUF.getSelectedItem()).getText();
        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Formulario form = new Formulario();
                


            }
        });

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}