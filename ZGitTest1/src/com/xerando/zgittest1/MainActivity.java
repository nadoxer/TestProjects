package com.xerando.zgittest1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity
{

	// Histoire de cr�er un conflict
	// 17/02 20:02
	// 17/02 18h47
	// 17/02 17h50

	@Override
	protected void onCreate( Bundle savedInstanceState )
	{
		super.onCreate( savedInstanceState );
		setContentView( R.layout.activity_main );
	}

	@Override
	public boolean onCreateOptionsMenu( Menu menu )
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate( R.menu.main, menu );
		return true;
	}
	
	public String caca()
	{
		String strCaca = "cacaLancelot";
		return strCaca;
	}

}
