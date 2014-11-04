package com.example.login;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
	
	EditText username;
	EditText Pass;
	TextView err;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button log = (Button)findViewById(R.id.log);
		username = (EditText) findViewById(R.id.editText1);
		Pass = (EditText) findViewById(R.id.editText2);
		
			log.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				validacion();
			}
		});
		
	}
	
	private void validacion()
	{
		String user = "admin", pass="admin";
		String getName = username.getText().toString();
		String getPassword = Pass.getText().toString();
		
		if(user.equals(getName) && pass.equals(getPassword))
		{
			Toast toast1 = Toast.makeText(getApplicationContext(), "correcto", Toast.LENGTH_SHORT);
			toast1.show();
			
		}else{
			Toast toast2 = Toast.makeText(getApplicationContext(), "Incorrecto vuelve a intentar", Toast.LENGTH_SHORT);
			toast2.show();;
		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
		
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
