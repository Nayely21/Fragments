package com.example.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


public class calcu extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    private View view;
    //declarar variables
    TextView proceso, resultado;
    Button cero, uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, resta, suma, multiplicacion, division, punto, porcentaje, borrar, parend, masmenos, igual, borraruno, pareni, cuadrado, raiz;


    public calcu() {
        // Required empty public constructor
    }

    public static calcu newInstance(String param1, String param2) {
        calcu fragment = new calcu();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_calcu, container, false);

        proceso=(TextView)view.findViewById (R.id.txtProceso);
        resultado=(TextView)view.findViewById (R.id.txtResultado);

        suma=(Button)view.findViewById(R.id.btnSuma);
        resta=(Button)view.findViewById (R.id.btnRestar);
        multiplicacion=(Button)view.findViewById (R.id.btnMultiplicar);
        division=(Button)view.findViewById (R.id.btnDivision);
        punto=(Button)view.findViewById (R.id.btnPunto);
        porcentaje=(Button)view.findViewById (R.id.btnPorcentaje);
        parend=(Button)view.findViewById (R.id.btnParenD);
        pareni=(Button)view.findViewById (R.id.btnParenI);
        cero=(Button)view.findViewById (R.id.btnCero);
        uno=(Button)view.findViewById (R.id.btnUno);
        dos=(Button)view.findViewById (R.id.btnDos);
        tres=(Button)view.findViewById (R.id.btnTres);
        cuatro=(Button)view.findViewById (R.id.btnCuatro);
        cinco=(Button)view.findViewById (R.id.btnCinco);
        seis=(Button)view.findViewById (R.id.btnSeis);
        siete=(Button)view.findViewById (R.id.btnSiete);
        ocho=(Button)view.findViewById (R.id.btnOcho);
        nueve=(Button)view.findViewById (R.id.btnNueve);
        borrar=(Button)view.findViewById (R.id.btnBorrar);
        masmenos=(Button)view.findViewById (R.id.btnMasMenos);
        igual=(Button)view.findViewById (R.id.igual);
        borraruno=(Button)view.findViewById (R.id.btnBorrarUno);
        cuadrado=(Button)view.findViewById (R.id.btnCuadrado);
        raiz=(Button)view.findViewById (R.id.btnRaiz);


        cero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String procesof = proceso.getText().toString();
                proceso.setText(procesof+"0");
            }
        });
        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String procesof = proceso.getText().toString();
                proceso.setText(procesof+"1");
            }
        });
        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String procesof = proceso.getText().toString();
                proceso.setText(procesof+"2");
            }
        });
        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String procesof = proceso.getText().toString();
                proceso.setText(procesof+"3");
            }
        });
        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String procesof = proceso.getText().toString();
                proceso.setText(procesof+"4");
            }
        });
        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String procesof = proceso.getText().toString();
                proceso.setText(procesof+"5");
            }
        });
        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String procesof = proceso.getText().toString();
                proceso.setText(procesof+"6");
            }
        });
        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String procesof = proceso.getText().toString();
                proceso.setText(procesof+"7");
            }
        });
        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String procesof = proceso.getText().toString();
                proceso.setText(procesof+"8");
            }
        });
        nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String procesof = proceso.getText().toString();
                proceso.setText(procesof+"9");
            }
        });

        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String procesof = proceso.getText().toString();
                proceso.setText(procesof+"+");
            }
        });
        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String procesof = proceso.getText().toString();
                proceso.setText(procesof+"-");
            }
        });
        multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String procesof = proceso.getText().toString();
                proceso.setText(procesof+"x");
            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String procesof = proceso.getText().toString();
                proceso.setText(procesof+"/");
            }
        });

        punto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String procesof = proceso.getText().toString();
                proceso.setText(procesof+".");
            }
        });
        porcentaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String procesof = proceso.getText().toString();
                proceso.setText(procesof+"%");
            }
        });

        pareni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String procesof = proceso.getText().toString();
                proceso.setText(procesof+"(");
            }
        });

        parend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String procesof = proceso.getText().toString();
                proceso.setText(procesof+")");
            }
        });

        masmenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String procesof = proceso.getText().toString();
                proceso.setText("-"+procesof);
            }
        });

        cuadrado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double procesof = Double.parseDouble(proceso.getText().toString());
                Double respuesta = Math.pow(procesof,2);
                String respuesta2 = String.valueOf(respuesta);
                proceso.setText(respuesta2);
            }
        });

        raiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double procesof = Double.parseDouble(proceso.getText().toString());
                Double respuesta = Math.sqrt(procesof);
                String respuesta2 = String.valueOf(respuesta);
                proceso.setText(respuesta2);
            }
        });

        borrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                proceso.setText("");
                resultado.setText("");
            }
        });

        borraruno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String delete = proceso.getText().toString();
                if (delete.length()>=1){
                    delete=delete.substring(0,delete.length()-1);
                    proceso.setText(delete);
                }
                else if (delete.length()<1){
                    proceso.setText("");
                }
            }
        });

        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String procesof = proceso.getText().toString();
                procesof = procesof.replaceAll("x","*");
                procesof = procesof.replaceAll("%","/100");
                ScriptEngineManager manager = new ScriptEngineManager();
                ScriptEngine engine = manager.getEngineByName("js");
                try {
                    resultado.setText(engine.eval(procesof).toString());
                } catch (ScriptException e) {
                    e.printStackTrace();
                }
            }
        });
        return view;
    }
}