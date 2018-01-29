package com.fracisco.eletromagnetinterativo.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fracisco.eletromagnetinterativo.R;

/**
 * Created by Moises on 29/01/2018.
 */

public class OndasGerais extends Fragment {

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.ondas_gerais,container,false);

        return view;
    }
}
