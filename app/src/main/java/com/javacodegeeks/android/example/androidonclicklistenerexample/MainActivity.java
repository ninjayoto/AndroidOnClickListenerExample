package com.javacodegeeks.android.example.androidonclicklistenerexample;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);

		/* Initializing a button using the anonymous class method, see commented code below
		* to see the XML onClick method , and the associated changes in the layout XML file
		* The XML method described at the bottom is not suitable when :
		* 1. We are using fragments
		* 2. When the code is complex and we want to separate it into it's own class
		*
		* otherwise the XML onClick method is preferrable*/

		Button button = (Button) findViewById(R.id.button1);

		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View view) {
				Toast.makeText(MainActivity.this, "Button Clicked",	Toast.LENGTH_SHORT).show();
			}

		});
		return true;
	}

}

/*
When using XML onClick, the code will change into this (look also for the changes in XML layout):

package com.javacodegeeks.android.example.androidonclicklistenerexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}


	//The method could be called anything (that corresponds to the name in the layout XML file) and pass view
	it is easier to type , these few lines than the Anonymous class method's larger code

	public void clickFunc(View view){
		Toast.makeText(MainActivity.this, "Button Clicked",	Toast.LENGTH_SHORT).show();
	}

}
 */
