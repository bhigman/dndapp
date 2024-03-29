package com.project.senior.dndapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MenuActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button charButton = (Button) findViewById(R.id.new_char_button);
        charButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, NewCharActivity.class);
                startActivity(intent);
            }
        });

        Button dieRollerButton = (Button) findViewById(R.id.die_roller_button);
        dieRollerButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, DieRollerActivity.class);
                startActivity(intent);
            }
        });

        Button spellbookButton = (Button) findViewById(R.id.spellbook_button);
        spellbookButton.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, SpellBookActivity.class);
                startActivity(intent);
            }
        });

        Button savedChar = (Button) findViewById(R.id.saved_char_button);
        savedChar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, SavedCharacterActivity.class);
                startActivity(intent);
            }
        });

        Button newCreature = (Button) findViewById(R.id.new_creature_button);
        newCreature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, CreatureGeneratorActivity.class);
                startActivity(intent);
            }
        });

        Button savedCreature = (Button) findViewById(R.id.saved_creature_button);
        savedCreature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, SavedCreatureActivity.class);
                startActivity(intent);
            }
        });

    }
}
