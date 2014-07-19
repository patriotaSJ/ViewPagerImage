package com.elpoeta.viewpagerimage2;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Fragmentos extends Fragment {
    /**
     Agregue "color"
     */
    private static final String ARG_SECTION_NUMBER = "section_number";
    private static final String BACKGROUND_COLOR = "color";
    private static final String IMAGEVIEW = "image";

    private int section_number;
    private int color;
    private int image;

    public static Fragmentos newInstance(int sectionNumber, int color, int image) {

        Fragmentos fragment = new Fragmentos();   //instanciamos un nuevo fragment

        Bundle args = new Bundle();                                 //guardamos los parametros
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        args.putInt(BACKGROUND_COLOR, color); //agrego ademas el color de fondo
        args.putInt(IMAGEVIEW, image);
        fragment.setArguments(args);
        fragment.setRetainInstance(true);     //agrego para que no se pierda los valores de la instancia
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //cuando crea una instancia de tipo PlaceholderFragment
        //si lo enviamos parametros, guarda esos
        //si no le envio nada, toma el color gris y un número aleatroio
        if(getArguments() != null){
            this.section_number = getArguments().getInt(ARG_SECTION_NUMBER);
            this.color = getArguments().getInt(BACKGROUND_COLOR);
            this.image = getArguments().getInt(IMAGEVIEW);
        }
        else{
            this.color = Color.GRAY;
            this.section_number = (int)(Math.random() * 5);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_my, container, false);

        TextView tv_section = (TextView) rootView.findViewById(R.id.tv_section_label);
        tv_section.setText("" + section_number);

        rootView.setBackgroundColor(this.color);

        ImageView frg_image = (ImageView) rootView.findViewById(R.id.frg_imageView);
        frg_image.setImageResource(image);

        return rootView;
    }
}

