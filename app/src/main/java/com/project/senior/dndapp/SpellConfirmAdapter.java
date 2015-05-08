package com.project.senior.dndapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * For spell book
 * Created by Ben on 4/18/2015.
 */
public class SpellConfirmAdapter extends ArrayAdapter<Spell> {

    public SpellConfirmAdapter(Context context, List<Spell> spells) {
        super(context, R.layout.spellbook_confirm_row, spells);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View view = inflater.inflate(R.layout.spellbook_confirm_row, parent, false);
        Spell singleSpell = getItem(position);
        TextView textView = (TextView) view.findViewById(R.id.new_char_spell_row_title);
        textView.setText(singleSpell.toString());

        return view;
    }

    public void clearAdapter() {
        this.clear();
        notifyDataSetChanged();
    }

    public String toString(){
        return "SpellConfirmAdapter";
    }
}
