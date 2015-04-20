package com.project.senior.dndapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

/**
 * For spell book
 * Created by Ben on 4/18/2015.
 */
public class spellAdapter extends ArrayAdapter<Spell> {

    public spellAdapter(Context context, List<Spell> spells) {
        super(context, R.layout.spellbook_row, spells);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View view = inflater.inflate(R.layout.spellbook_row, parent, false);

        Spell singleSpell = getItem(position);
        TextView textView = (TextView) view.findViewById(R.id.spell_row_title);

        textView.setText(singleSpell.toString());
        return view;
    }
}