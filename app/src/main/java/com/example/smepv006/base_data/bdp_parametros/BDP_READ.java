package com.example.smepv006.base_data.bdp_parametros;

import android.database.Cursor;

import com.example.smepv006.base_data.bdp_parametros.in_out.BDP_CARGA_OUTPUT;
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

public class BDP_READ {
    private Cursor cursor;

    public BDP_READ() {
    }

    public BDP_CARGA_OUTPUT getCarga(int ID_TABLA, Cursor cursor){
        this.cursor = cursor;
       BDP_CARGA_OUTPUT bdp_carga_output = new BDP_CARGA_OUTPUT();
        switch (ID_TABLA){
            case 1:
                 leerDatosTecnicos(bdp_carga_output);
                 break;
            case 2:
                leerIdSheetProyect(bdp_carga_output);
                break;
            case 3:
                leerProyecto(bdp_carga_output);
                break;
            case 4:
                leerResult(bdp_carga_output);
                break;
            case 5:
                leerIndicadores(bdp_carga_output);
                break;
            case 6:
                leerActividades(bdp_carga_output);
                break;
            case 7:
                leerDescripcionACT(bdp_carga_output);
                break;
            default:
                leerLocalizacion(bdp_carga_output);
        }
        return  bdp_carga_output;
    }

    private void leerDatosTecnicos(BDP_CARGA_OUTPUT bdp_carga_output){
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
        bdp_carga_output.setDATA_TECNICOS(datos);
    }

    private void leerIdSheetProyect(BDP_CARGA_OUTPUT bdp_carga_output){
        List<Tabla_IdSheetProyect_BDP> datos = new ArrayList<>();

        if(cursor.moveToFirst()){
            do{
                datos.add(new Tabla_IdSheetProyect_BDP(cursor.getInt(0),
                        cursor.getString(1)));
            }while(cursor.moveToNext());
        }
        bdp_carga_output.setDATA_IDSHEETPROYECT(datos);
    }

    private  void leerProyecto(BDP_CARGA_OUTPUT bdp_carga_output){
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
        bdp_carga_output.setDATA_PROYECTO(datos);
    }

    private void leerResult(BDP_CARGA_OUTPUT bdp_carga_output){
        List<Tabla_Resultados_BDP> datos = new ArrayList<>();

        if(cursor.moveToFirst()){
            do{
                datos.add(new Tabla_Resultados_BDP(cursor.getInt(0),
                        cursor.getString(1),
                        cursor.getString(2)));
            }while(cursor.moveToNext());
        }
        bdp_carga_output.setDATA_RESULTADOS(datos);
    }

    private void leerIndicadores(BDP_CARGA_OUTPUT bdp_carga_output){
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
        bdp_carga_output.setDATA_INDICADORES(datos);
    }

    private void leerActividades(BDP_CARGA_OUTPUT bdp_carga_output){
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
        bdp_carga_output.setDATA_ACTIVIDADES(datos);
    }

    private void leerDescripcionACT(BDP_CARGA_OUTPUT bdp_carga_output){
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
        bdp_carga_output.setDATA_DESCRIPCION_ACT(datos);
    }

    private void leerLocalizacion(BDP_CARGA_OUTPUT bdp_carga_output){
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
        bdp_carga_output.setDATA_LOCALIZACION(datos);
    }



}
