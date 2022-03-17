package sv.edu.udb.ejerciciortdatabase;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import sv.edu.udb.ejerciciortdatabase.datos.Persona;

public class AddPersonaActivity extends AppCompatActivity {
    EditText edtDUI, edtNombre, edtFechanac, edtGenero, edtPeso, edtAltura;
    String key="",nombre="",dui="",accion="",fechanac="", genero="",peso="",altura="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_persona);
        inicializar();

    }

    private void inicializar() {
        edtNombre = findViewById(R.id.edtNombre);
        edtDUI = findViewById(R.id.edtDUI);
        edtFechanac = findViewById(R.id.edtFechanac);
        edtGenero = findViewById(R.id.edtGenero);
        edtPeso = findViewById(R.id.edtPeso);
        edtAltura = findViewById(R.id.edtAltura);

        // Obtención de datos que envia actividad anterior
        Bundle datos = getIntent().getExtras();
        key = datos.getString("key");
        dui = datos.getString("dui");
        nombre=datos.getString("nombre");
        fechanac=datos.getString("fechanac");
        genero=datos.getString("genero");
        peso=datos.getString("peso");
        altura=datos.getString("altura");
        accion=datos.getString("accion");
        edtDUI.setText(dui);
        edtNombre.setText(nombre);
        edtFechanac.setText(fechanac);
        edtGenero.setText(genero);
        edtPeso.setText(peso);
        edtAltura.setText(altura);
    }

    public void guardar(View v){
        String nombre = edtNombre.getText().toString();
        String dui = edtDUI.getText().toString();
        String fechanac = edtFechanac.getText().toString();
        String genero = edtGenero.getText().toString();
        String peso = edtPeso.getText().toString();
        String altura = edtAltura.getText().toString();
        // Se forma objeto persona
        Persona persona = new Persona(dui,nombre,fechanac,genero,peso,altura);

        if (accion.equals("a")) { //Agregar usando push()
            PersonasActivity.refPersonas.push().setValue(persona);
        }
        else // Editar usando setValue
        {
            PersonasActivity.refPersonas.child(key).setValue(persona);
        }
        finish();
    }
    public void cancelar(View v){
        finish();
    }


}