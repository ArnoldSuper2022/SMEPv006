package com.example.smepv006.base_data.bdp_parametros;

import android.database.Cursor;

import com.example.smepv006.base_data.bdp_parametros.in_out.BDP_CARGA_OUT;
import com.example.smepv006.base_data.bdp_parametros.tablas.Tabla_Actividades_BDP;
import com.example.smepv006.base_data.bdp_parametros.tablas.Tabla_DescripAct_BDP;
import com.example.smepv006.base_data.bdp_parametros.tablas.Tabla_IdSheetProyect_BDP;
import com.example.smepv006.base_data.bdp_parametros.tablas.Tabla_Indicadores_BDP;
import com.example.smepv006.base_data.bdp_parametros.tablas.Tabla_Localizacion_BDP;
import com.example.smepv006.base_data.bdp_parametros.tablas.Tabla_Proyecto_BDP;
import com.example.smepv006.base_data.bdp_parametros.tablas.Tabla_Resultados_BDP;
import com.example.smepv006.base_data.bdp_parametros.tablas.Tabla_Tecnicos_BDP;

import java.util.ArrayList;
import java.util.List;

public class BDP_RTAB {
    public BDP_RTAB() {
    }
    public BDP_CARGA_OUT leerDatosDeTabla(int ID_TABLA, Cursor cursor){
        BDP_CARGA_OUT bdp_carga_out = new BDP_CARGA_OUT();
        switch (ID_TABLA){
            case 1:
                leerDatosTecnicos(cursor,bdp_carga_out);
                break;
            case 2:
                leerIdSheetProyect(cursor,bdp_carga_out);
                break;
            case 3:
                leerProyecto(cursor,bdp_carga_out);
                break;
            case 4:
                leerResult(cursor,bdp_carga_out);
                break;
            case 5:
                leerIndicadores(cursor,bdp_carga_out);
                break;
            case 6:
                leerActividades(cursor,bdp_carga_out);
                break;
            case 7:
                leerDescripcionACT(cursor,bdp_carga_out);
                break;
            default:
                leerLocalizacion(cursor,bdp_carga_out);

        }
        return bdp_carga_out;
    }

    private void leerDatosTecnicos(Cursor cursor, BDP_CARGA_OUT bdp_carga_out){
        List<Tabla_Tecnicos_BDP> datos = new ArrayList<>();
        if(cursor.moveToFirst()){
            do{
                datos.add(new Tabla_Tecnicos_BDP(cursor.getInt(0),
                        cursor.getString(1),
                        cursor.getString(2),
                        cursor.getString(3),
                        cursor.getString(4),
                        cursor.getString(5),
                        cursor.getString(6),
                        cursor.getString(7),
                        cursor.getString(8)));

            }while(cursor.moveToNext());
        }
        bdp_carga_out.setDATA_TECNICOS(datos);
    }

    private void leerIdSheetProyect(Cursor cursor, BDP_CARGA_OUT bdp_carga_out){
        List<Tabla_IdSheetProyect_BDP> datos = new ArrayList<>();

        if(cursor.moveToFirst()){
            do{
                datos.add(new Tabla_IdSheetProyect_BDP(cursor.getInt(0),
                        cursor.getString(1)));
            }while(cursor.moveToNext());
        }
        bdp_carga_out.setDATA_IDSHEETPROYECT(datos);

    }

    private void leerProyecto(Cursor cursor, BDP_CARGA_OUT bdp_carga_out){
        List<Tabla_Proyecto_BDP> datos = new ArrayList<>();

        if(cursor.moveToFirst()){
            do{
                datos.add(new Tabla_Proyecto_BDP(cursor.getInt(0),
                        cursor.getString(1),
                        cursor.getString(2),
                        cursor.getString(3),
                        cursor.getString(4)));

            }while(cursor.moveToNext());
        }
        bdp_carga_out.setDATA_PROYECTO(datos);
    }

    private void leerResult(Cursor cursor, BDP_CARGA_OUT bdp_carga_out){
        List<Tabla_Resultados_BDP> datos = new ArrayList<>();

        if(cursor.moveToFirst()){
            do{
                datos.add(new Tabla_Resultados_BDP(cursor.getInt(0),
                        cursor.getString(1),
                        cursor.getString(2)));
            }while(cursor.moveToNext());
        }
        bdp_carga_out.setDATA_RESULTADOS(datos);

    }

    private void leerIndicadores(Cursor cursor, BDP_CARGA_OUT bdp_carga_out){
        List<Tabla_Indicadores_BDP> datos = new ArrayList<>();

        if(cursor.moveToFirst()){
            do{
                datos.add(new Tabla_Indicadores_BDP(cursor.getInt(0),
                        cursor.getString(1),
                        cursor.getString(2),
                        cursor.getString(3),
                        cursor.getString(4),
                        cursor.getString(5),
                        cursor.getString(6),
                        cursor.getString(7)));
            }while(cursor.moveToNext());
        }
        bdp_carga_out.setDATA_INDICADORES(datos);

    }

    private void leerActividades(Cursor cursor, BDP_CARGA_OUT bdp_carga_out){
        List<Tabla_Actividades_BDP> datos = new ArrayList<>();

        if(cursor.moveToFirst()){
            do{
                datos.add(new Tabla_Actividades_BDP(cursor.getInt(0),
                        cursor.getString(1),
                        cursor.getString(2),
                        cursor.getString(3),
                        cursor.getString(4),
                        cursor.getString(5),
                        cursor.getString(6),
                        cursor.getString(7)));
            }while(cursor.moveToNext());
        }
        bdp_carga_out.setDATA_ACTIVIDADES(datos);
    }

    private void leerDescripcionACT(Cursor cursor, BDP_CARGA_OUT bdp_carga_out){
        List<Tabla_DescripAct_BDP> datos = new ArrayList<>();

        if(cursor.moveToFirst()){
            do{
                datos.add(new Tabla_DescripAct_BDP(cursor.getInt(0),
                        cursor.getString(1),
                        cursor.getString(2),
                        cursor.getString(3),
                        cursor.getString(4)));
            }while(cursor.moveToNext());
        }
        bdp_carga_out.setDATA_DESCRIPCION_ACT(datos);
    }

    private void leerLocalizacion(Cursor cursor, BDP_CARGA_OUT bdp_carga_out){
        List<Tabla_Localizacion_BDP> datos = new ArrayList<>();

        if(cursor.moveToFirst()){
            do{
                datos.add(new Tabla_Localizacion_BDP(cursor.getInt(0),
                        cursor.getString(1),
                        cursor.getString(2),
                        cursor.getString(3),
                        cursor.getString(4)));
            }while(cursor.moveToNext());
        }
        bdp_carga_out.setDATA_LOCALIZACION(datos);
    }



}
