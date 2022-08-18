package com.example.smepv006.base_data.bdp_parametros;

import com.example.smepv006.base_data.bd_parametros.BD_OPERACIONES;

import java.util.ArrayList;
import java.util.List;

public class BDP_CONFIG {


    public BDP_CONFIG() {
    }

    public List<String> getListaTablasCrear(){
        List<String> listaTablas = new ArrayList<>();
        listaTablas.add(BDP_TAB.SQL_CREATE_TECNICOS);
        listaTablas.add(BDP_TAB.SQL_CREATE_IDSHEETPROYECT);
        listaTablas.add(BDP_TAB.SQL_CREATE_PROYECT);
        listaTablas.add(BDP_TAB.SQL_CREATE_RESULT);
        listaTablas.add(BDP_TAB.SQL_CREATE_INDICADORES);
        listaTablas.add(BDP_TAB.SQL_CREATE_ACTIVIDADES);
        listaTablas.add(BDP_TAB.SQL_CREATE_DESCRIPCION);
        listaTablas.add(BDP_TAB.SQL_CREATE_LOCALIZACION);
        return listaTablas;
    }

    public List<String> getListaTablasActualizar(){
        List<String> listaTablas = new ArrayList<>();
        listaTablas.add(BDP_TAB.SQL_DELETE_TECNICOS);
        listaTablas.add(BDP_TAB.SQL_DELETE_IDSHEETPROYECT);
        listaTablas.add(BDP_TAB.SQL_DELETE_PROYECT);
        listaTablas.add(BDP_TAB.SQL_DELETE_RESULT);
        listaTablas.add(BDP_TAB.SQL_DELETE_INDICADORES);
        listaTablas.add(BDP_TAB.SQL_DELETE_ACTIVIDADES);
        listaTablas.add(BDP_TAB.SQL_DELETE_DESCRIPCION);
        listaTablas.add(BDP_TAB.SQL_DELETE_LOCALIZACION);
        return listaTablas;
    }

    public BD_OPERACIONES establecerOperaciones(int ID_TABLA){
        switch (ID_TABLA){
            case 1:
                return new BD_OPERACIONES(BDP_TAB.SQL_CREATE_TECNICOS,
                                                            BDP_TAB.SQL_QUERY_TECNICOS,
                                                            BDP_TAB.SQL_CREATE_TECNICOS,
                                                            BDP_TAB.SQL_DELETE_TECNICOS);
            case 2:
                return new BD_OPERACIONES(BDP_TAB.SQL_CREATE_IDSHEETPROYECT,
                                                            BDP_TAB.SQL_QUERY_IDSHEETPROYECT,
                                                            BDP_TAB.SQL_CREATE_IDSHEETPROYECT,
                                                            BDP_TAB.SQL_DELETE_IDSHEETPROYECT);
            case 3:
                return new BD_OPERACIONES(BDP_TAB.SQL_CREATE_PROYECT,
                                                            BDP_TAB.SQL_QUERY_PROYECT,
                                                            BDP_TAB.SQL_CREATE_PROYECT,
                                                            BDP_TAB.SQL_DELETE_PROYECT);
            case 4:
                return new BD_OPERACIONES(BDP_TAB.SQL_CREATE_RESULT,
                                                            BDP_TAB.SQL_QUERY_RESULT,
                                                            BDP_TAB.SQL_CREATE_RESULT,
                                                            BDP_TAB.SQL_DELETE_RESULT);
            case 5:
                return new BD_OPERACIONES(BDP_TAB.SQL_CREATE_INDICADORES,
                                                            BDP_TAB.SQL_QUERY_INDICADORES,
                                                            BDP_TAB.SQL_CREATE_INDICADORES,
                                                            BDP_TAB.SQL_DELETE_INDICADORES);
            case 6:
                return new BD_OPERACIONES(BDP_TAB.SQL_CREATE_ACTIVIDADES,
                                                            BDP_TAB.SQL_QUERY_ACTIVIDADES,
                                                            BDP_TAB.SQL_CREATE_ACTIVIDADES,
                                                            BDP_TAB.SQL_DELETE_ACTIVIDADES);
            case 7:
                return new BD_OPERACIONES(BDP_TAB.SQL_CREATE_DESCRIPCION,
                                                            BDP_TAB.SQL_QUERY_DESCRIPCION,
                                                            BDP_TAB.SQL_CREATE_DESCRIPCION,
                                                            BDP_TAB.SQL_DELETE_DESCRIPCION);
            default:
                return new BD_OPERACIONES(BDP_TAB.SQL_CREATE_LOCALIZACION,
                                                            BDP_TAB.SQL_QUERY_LOCALIZACION,
                                                            BDP_TAB.SQL_CREATE_LOCALIZACION,
                                                            BDP_TAB.SQL_DELETE_LOCALIZACION);
        }

    }

}
