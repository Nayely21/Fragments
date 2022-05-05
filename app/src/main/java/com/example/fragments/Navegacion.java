package com.example.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Navegacion extends Fragment {
    private View view;
    Button btn_ir;
    WebView wv;
    EditText txtweb;

    public Navegacion() {
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_navegacion, container, false);

        btn_ir = (Button) view.findViewById(R.id.btn_ir);
        txtweb = (EditText)view.findViewById(R.id.txtWeb);
        wv =(WebView)view.findViewById(R.id.wv);

        btn_ir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wv.setWebViewClient(new WebViewClient());
                wv.loadUrl("http://" + txtweb.getText().toString());
            }});

        return view;
    }
}