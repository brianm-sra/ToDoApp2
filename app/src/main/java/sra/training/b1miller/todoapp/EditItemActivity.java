package sra.training.b1miller.todoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {

    int itemNumber;
    String itemText;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        itemText = getIntent().getStringExtra("itemText");
        itemNumber = getIntent().getIntExtra("itemNumber", 0);
        editText = (EditText) findViewById(R.id.editTextBox);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void saveEditedItem(View view) {
        Intent data = new Intent();
        data.putExtra("itemNumber", itemNumber);
        data.putExtra("modifiedItemText", editText.getText().toString());
        setResult(RESULT_OK, data);
        finish();
    }
}
