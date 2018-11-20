package com.example.joangabrielchornetmachi.ejemplo_fragmentsynavigation.Fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.joangabrielchornetmachi.ejemplo_fragmentsynavigation.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CameraFragment extends Fragment {

    private TextView resultado;
    private Button Aceptar;
    private EditText n1, n2;
    private Context context;



    public CameraFragment() {
        // Required empty public constructor
        context=getActivity();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView= inflater.inflate(R.layout.fragment_camera, container, false);
        resultado=rootView.findViewById(R.id.txtResultado);
        n1=rootView.findViewById(R.id.txtNumero1);
        n2=rootView.findViewById(R.id.txtNumero2);
        Aceptar=rootView.findViewById(R.id.btnAceptar);


        Aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1=(Integer.parseInt(n1.getText().toString()));
                int num2=(Integer.parseInt(n2.getText().toString()));
                resultado.setText(""+(num1+num2));
            }
        });
        return rootView;


    }

}
