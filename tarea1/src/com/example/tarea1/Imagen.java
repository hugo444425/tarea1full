package com.example.tarea1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Imagen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_imagen);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.imagen, menu);
		return true;
	}

}
