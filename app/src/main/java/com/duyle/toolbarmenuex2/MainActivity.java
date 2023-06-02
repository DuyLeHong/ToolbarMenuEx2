package com.duyle.toolbarmenuex2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("Trang chủ");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#FF9800")));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        } else if (item.getItemId() == R.id.menu_new_game) {
            Toast.makeText(this, "New Game", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.menu_leader_board) {
            Toast.makeText(this, "Xem diem cao", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.menu_history) {
            Toast.makeText(this, "Lich su choi game", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.menu_help) {
            Toast.makeText(this, "Tro giup", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}