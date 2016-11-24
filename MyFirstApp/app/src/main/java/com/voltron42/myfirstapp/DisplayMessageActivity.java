package com.voltron42.myfirstapp;
import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import com.voltron42.myfirstapp.*;

public class DisplayMessageActivity extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_message);

		Intent intent = getIntent();
		String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
		TextView textView = new TextView(this);
		textView.setTextSize(40);
		textView.setText(message);

		ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_message);
		layout.addView(textView);
	}
}
