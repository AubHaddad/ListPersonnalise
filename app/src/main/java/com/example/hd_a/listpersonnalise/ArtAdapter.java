package com.example.hd_a.listpersonnalise;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ArtAdapter extends ArrayAdapter<Article>{

    public ArtAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Article> objects) {
        super(context, R.layout.item_art, objects);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater =  LayoutInflater.from(getContext());
        convertView = inflater.inflate(R.layout.item_art, parent, false);
        TextView code = convertView.findViewById(R.id.code);
        TextView libelle = convertView.findViewById(R.id.libelle);
        TextView pu = convertView.findViewById(R.id.pu);
        TextView categorie = convertView.findViewById(R.id.categorie);
        Article article = getItem(position);

        code.setText(""+article.getCodeArticle());
        libelle.setText(""+article.getLibelle());
        pu.setText(""+article.getPu());
        categorie.setText(""+article.getCategorie());




        return convertView;
    }


}
