package com.example.tarea1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.example.tarea1.R;
import com.example.tarea1.ShowDescription;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class MainActivity extends Activity implements OnItemClickListener {
	List<String> tiendas = new ArrayList<String>();
	public final static String TIENDA = "tienda";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ListView list = (ListView) findViewById(R.id.list);
		Button btnimagen = (Button)findViewById(R.id.imagenbtn);
		tiendas.add("Tienda de Lego");
		tiendas.add("Tienda de Libros");
		tiendas.add("Tienda de Zapatos");
		tiendas.add("Tienda de Ropa");
		tiendas.add("Tienda de Vinos");
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tiendas);        
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);
      
        btnimagen.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        Intent i = new Intent(getApplicationContext(),Imagen.class);
                        startActivity(i);
                    }
                });

 
	}

	/*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }*/
	
/*	public void enviarmensaje(View view) 
	{
	    Intent intent = new Intent(getApplicationContext(), Imagen.class);
	    startActivity(intent);
	}*/
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		/*  Button img = (Button) findViewById(R.id.button1);     


	        img.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View v) {
	                // TODO Auto-generated method stub
	            	 Intent intent = new Intent(getApplicationContext(), Imagen.class);
	                 startActivity(intent);
	            }
	        });*/
	}
	

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
        try {
            Intent intent = new Intent(getApplicationContext(), ShowDescription.class);
            intent.putExtra(ShowDescription.QUERY, Integer.toString(arg2));
            startActivity(intent);
        } catch (ClassCastException e) {
            Log.e("TAG","Clase incorrecta " + Log.getStackTraceString(e));        
        }  
	}

}
