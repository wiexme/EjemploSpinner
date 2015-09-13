package ejemplo.spinner.proyecto.com;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;

public class SpinnerEjemplo extends AppCompatActivity implements ActionBar.OnNavigationListener{

    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_ejemplo);

        texto = (TextView)findViewById(R.id.texto);

        ActionBar actionBar = getSupportActionBar();

        //Crear un Spinner
        SpinnerAdapter adapter = ArrayAdapter.createFromResource(this,R.array.lista,android.R.layout.simple_spinner_dropdown_item);
        actionBar.setListNavigationCallbacks(adapter,this);

        //Mostrar el Spinner
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_spinner_ejemplo, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(int itemPosition, long itemId) {
        switch (itemPosition){
            case 0://lunes
                texto.setText("Opción seleccionada:\n\nLunes");
                break;
            case 1://martes
                texto.setText("Opción seleccionada:\n\nMartes");
                break;
            case 2://miercoles
                texto.setText("Opción seleccionada:\n\nMiercoles");
                break;
            case 3://jueves
                texto.setText("Opción seleccionada:\n\nJueves");
                break;
            case 4://viernes
                texto.setText("Opción seleccionada:\n\nViernes");
                break;
            case 5://sabado
                texto.setText("Opción seleccionada:\n\nSabado");
                break;
            case 6://domingo
                texto.setText("Opción seleccionada:\n\nDomingo");
                break;

        }
        return false;
    }
}
