package com.example.joangabrielchornetmachi.ejemplo_fragmentsynavigation.Fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.joangabrielchornetmachi.ejemplo_fragmentsynavigation.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ManageFragment extends Fragment {

    private ImageView imagenManage;
    private Button btnManage;
    private TextView txtManage;

    private Context context;


    public ManageFragment() {
        // Required empty public constructor
        context=getActivity();
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView= inflater.inflate(R.layout.fragment_manage, container, false);
        //todo el codigo necesario para que el fragment funcione
        imagenManage=rootView.findViewById(R.id.IvImagen);
        btnManage=rootView.findViewById(R.id.btnManage);
        txtManage=rootView.findViewById(R.id.txtManage);

        btnManage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Hola mundo", Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
    }

}
