package com.example.smepv006.base_data.bdp_parametros.in_out;

import com.example.smepv006.base_data.bdp_parametros.tablas.Tabla_Actividades_BDP;
import com.example.smepv006.base_data.bdp_parametros.tablas.Tabla_DescripAct_BDP;
import com.example.smepv006.base_data.bdp_parametros.tablas.Tabla_IdSheetProyect_BDP;
import com.example.smepv006.base_data.bdp_parametros.tablas.Tabla_Indicadores_BDP;
import com.example.smepv006.base_data.bdp_parametros.tablas.Tabla_Localizacion_BDP;
import com.example.smepv006.base_data.bdp_parametros.tablas.Tabla_Proyecto_BDP;
import com.example.smepv006.base_data.bdp_parametros.tablas.Tabla_Resultados_BDP;
import com.example.smepv006.base_data.bdp_parametros.tablas.Tabla_Tecnicos_BDP;

import java.util.List;

public class BDP_CARGA_OUTPUT {

    private List<Tabla_Actividades_BDP> DATA_ACTIVIDADES;
    private List<Tabla_DescripAct_BDP> DATA_DESCRIPCION_ACT;
    private List<Tabla_IdSheetProyect_BDP> DATA_IDSHEETPROYECT;
    private List<Tabla_Indicadores_BDP> DATA_INDICADORES;
    private List<Tabla_Localizacion_BDP> DATA_LOCALIZACION;
    private List<Tabla_Proyecto_BDP> DATA_PROYECTO;
    private List<Tabla_Resultados_BDP> DATA_RESULTADOS;
    private List<Tabla_Tecnicos_BDP> DATA_TECNICOS;

    public BDP_CARGA_OUTPUT() {
    }

    public List<Tabla_Actividades_BDP> getDATA_ACTIVIDADES() {
        return DATA_ACTIVIDADES;
    }

    public void setDATA_ACTIVIDADES(List<Tabla_Actividades_BDP> DATA_ACTIVIDADES) {
        this.DATA_ACTIVIDADES = DATA_ACTIVIDADES;
    }

    public List<Tabla_DescripAct_BDP> getDATA_DESCRIPCION_ACT() {
        return DATA_DESCRIPCION_ACT;
    }

    public void setDATA_DESCRIPCION_ACT(List<Tabla_DescripAct_BDP> DATA_DESCRIPCION_ACT) {
        this.DATA_DESCRIPCION_ACT = DATA_DESCRIPCION_ACT;
    }

    public List<Tabla_IdSheetProyect_BDP> getDATA_IDSHEETPROYECT() {
        return DATA_IDSHEETPROYECT;
    }

    public void setDATA_IDSHEETPROYECT(List<Tabla_IdSheetProyect_BDP> DATA_IDSHEETPROYECT) {
        this.DATA_IDSHEETPROYECT = DATA_IDSHEETPROYECT;
    }

    public List<Tabla_Indicadores_BDP> getDATA_INDICADORES() {
        return DATA_INDICADORES;
    }

    public void setDATA_INDICADORES(List<Tabla_Indicadores_BDP> DATA_INDICADORES) {
        this.DATA_INDICADORES = DATA_INDICADORES;
    }

    public List<Tabla_Localizacion_BDP> getDATA_LOCALIZACION() {
        return DATA_LOCALIZACION;
    }

    public void setDATA_LOCALIZACION(List<Tabla_Localizacion_BDP> DATA_LOCALIZACION) {
        this.DATA_LOCALIZACION = DATA_LOCALIZACION;
    }

    public List<Tabla_Proyecto_BDP> getDATA_PROYECTO() {
        return DATA_PROYECTO;
    }

    public void setDATA_PROYECTO(List<Tabla_Proyecto_BDP> DATA_PROYECTO) {
        this.DATA_PROYECTO = DATA_PROYECTO;
    }

    public List<Tabla_Resultados_BDP> getDATA_RESULTADOS() {
        return DATA_RESULTADOS;
    }

    public void setDATA_RESULTADOS(List<Tabla_Resultados_BDP> DATA_RESULTADOS) {
        this.DATA_RESULTADOS = DATA_RESULTADOS;
    }

    public List<Tabla_Tecnicos_BDP> getDATA_TECNICOS() {
        return DATA_TECNICOS;
    }

    public void setDATA_TECNICOS(List<Tabla_Tecnicos_BDP> DATA_TECNICOS) {
        this.DATA_TECNICOS = DATA_TECNICOS;
    }
}
