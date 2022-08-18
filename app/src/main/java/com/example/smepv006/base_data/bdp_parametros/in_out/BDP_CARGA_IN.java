package com.example.smepv006.base_data.bdp_parametros.in_out;

import android.content.ContentValues;
import android.database.Cursor;

import com.example.smepv006.base_data.bdp_parametros.BDP_SC;

import java.util.ArrayList;
import java.util.List;

public class BDP_CARGA_IN {

    public BDP_CARGA_IN() {
    }


    //TODO: DATOS ENTRADA Y SALIDA TECNICOS
    public ContentValues valuesTecnico(String idTecnico,
                                       String idFuncionario,
                                       String siglasEntidad,
                                       String nombre,
                                       String apellido,
                                       String password,
                                       String estado,
                                       String diaCorte){
        ContentValues values = new ContentValues();
        values.put(BDP_SC.TecnicosEntry.COLUMN_NAME_IDTECNICO,idTecnico);
        values.put(BDP_SC.TecnicosEntry.COLUMN_NAME_IDFUNCIONARIO,idFuncionario);
        values.put(BDP_SC.TecnicosEntry.COLUMN_NAME_SIGLASENTIDAD,siglasEntidad);
        values.put(BDP_SC.TecnicosEntry.COLUMN_NAME_NOMBRE,nombre);
        values.put(BDP_SC.TecnicosEntry.COLUMN_NAME_APELLIDO,apellido);
        values.put(BDP_SC.TecnicosEntry.COLUMN_NAME_PASSWORD,password);
        values.put(BDP_SC.TecnicosEntry.COLUMN_NAME_ESTADO,estado);
        values.put(BDP_SC.TecnicosEntry.COLUMN_NAME_DIACORTE,diaCorte);
        return values;
    }


    //TODO: DATOS ENTRADA Y SALIDA IDSHEETPROYECT
    public ContentValues values_DSHEETPROYECT(String idSheetProyect){
        ContentValues values = new ContentValues();
        values.put(BDP_SC.IdSheetProyectEntry.COLUMN_NAME_IDSHEETPROYECT,idSheetProyect);
        return values;
    }

    //************************************
    //TODO: DATOS ENTRADA Y SALIDA PROTECTO
    public ContentValues valuesPROYECTO(String idProyecto, String descripcion, String principalObjetivo, String fechaInicioProyecto){
        ContentValues values = new ContentValues();
        values.put(BDP_SC.ProyectoEntry.COLUMN_NAME_IDPROYECTO,idProyecto);
        values.put(BDP_SC.ProyectoEntry.COLUMN_NAME_DESCRIPCION,descripcion);
        values.put(BDP_SC.ProyectoEntry.COLUMN_NAME_PRINCIPALOBJETIVO,principalObjetivo);
        values.put(BDP_SC.ProyectoEntry.COLUMN_NAME_FECHADEINICIO,fechaInicioProyecto);
        return values;
    }

    //************************************
    //TODO: DATOS ENTRADA Y SALIDA RESULT
    public ContentValues values_RESULT(String idProducto, String descripcion){
        ContentValues values = new ContentValues();
        values.put(BDP_SC.ResultadosEntry.COLUMN_NAME_IDPRODUCTO,idProducto);
        values.put(BDP_SC.ResultadosEntry.COLUMN_NAME_DESCRIPCION,descripcion);
        return values;
    }

    //************************************
    //TODO: DATOS ENTRADA Y SALIDA INDICADORES
    public ContentValues values_INDICADORES(String idProducto, String codigoIndicador, String tipoIndicador, String idIndicador, String indicador, String meta, String unidad){
        ContentValues values = new ContentValues();
        values.put(BDP_SC.IndicadoresEntry.COLUMN_NAME_IDPRODUCTO,idProducto);
        values.put(BDP_SC.IndicadoresEntry.COLUMN_NAME_CODIGOINDICADOR,codigoIndicador);
        values.put(BDP_SC.IndicadoresEntry.COLUMN_NAME_TIPOINDICADOR,tipoIndicador);
        values.put(BDP_SC.IndicadoresEntry.COLUMN_NAME_IDINDICADOR,idIndicador);
        values.put(BDP_SC.IndicadoresEntry.COLUMN_NAME_INDICADOR,indicador);
        values.put(BDP_SC.IndicadoresEntry.COLUMN_NAME_META,meta);
        values.put(BDP_SC.IndicadoresEntry.COLUMN_NAME_UNIDAD,unidad);
        return values;
    }
    //************************************
    //TODO: DATOS ENTRADA Y SALIDA ACTIVIDADES
    public ContentValues values_ACTIVIDADES(String idProducto, String idIndicador, String idActividad, String actividad, String fechaStart, String fechaEnd, String idResponsables){
        ContentValues values = new ContentValues();
        values.put(BDP_SC.ActividadesEntry.COLUMN_NAME_IDPRODUCTO,idProducto);
        values.put(BDP_SC.ActividadesEntry.COLUMN_NAME_IDINDICADOR,idIndicador);
        values.put(BDP_SC.ActividadesEntry.COLUMN_NAME_IDACTIVIDAD,idActividad);
        values.put(BDP_SC.ActividadesEntry.COLUMN_NAME_ACTIVIDAD,actividad);
        values.put(BDP_SC.ActividadesEntry.COLUMN_NAME_FECHASTART,fechaStart);
        values.put(BDP_SC.ActividadesEntry.COLUMN_NAME_FECHAEND,fechaEnd);
        values.put(BDP_SC.ActividadesEntry.COLUMN_NAME_RESPONSABLES,idResponsables);
        return values;
    }

    //************************************
    //TODO: DATOS ENTRADA Y SALIDA DESCRIPCIONACT
    public ContentValues values_DESCRIPCIONACT(String idProducto, String idIndicador, String idActiviad, String descripcion){
        ContentValues values = new ContentValues();
        values.put(BDP_SC.DescripActEntry.COLUMN_NAME_IDPRODUCTO,idProducto);
        values.put(BDP_SC.DescripActEntry.COLUMN_NAME_IDINDICADOR,idIndicador);
        values.put(BDP_SC.DescripActEntry.COLUMN_NAME_IDACTIVIDAD,idActiviad);
        values.put(BDP_SC.DescripActEntry.COLUMN_NAME_DESCRIPCION,descripcion);
        return values;
    }

    //************************************
    //TODO: DATOS ENTRADA Y SALIDA LOCALIZACION
    public ContentValues values_LOCALIZACION(String DEPARTAMETO, String MUNICIPIO, String COMUNIDAD, String RESPONSABLES){
        ContentValues values = new ContentValues();
        values.put(BDP_SC.LocalizacionEntry.COLUMN_NAME_DEPARTAMENTO,DEPARTAMETO);
        values.put(BDP_SC.LocalizacionEntry.COLUMN_NAME_MUNICIPIO,MUNICIPIO);
        values.put(BDP_SC.LocalizacionEntry.COLUMN_NAME_COMUNIDAD,COMUNIDAD);
        values.put(BDP_SC.LocalizacionEntry.COLUMN_NAME_RESPONSABLES,RESPONSABLES);
        return values;
    }

}
