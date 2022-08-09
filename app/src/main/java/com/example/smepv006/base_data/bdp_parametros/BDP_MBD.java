package com.example.smepv006.base_data.bdp_parametros;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.smepv006.base_data.bd_parametros.BD_INPUT;
import com.example.smepv006.base_data.bd_parametros.BD_OUTPUT;
import com.example.smepv006.base_data.bd_parametros.BD_PARAMETROS;
import com.example.smepv006.base_data.bd_parametros.MBD_manejadordeLaBaseDeDatos;
import com.example.smepv006.base_data.bdp_parametros.in_out.BDP_CARGA_OUT;
import com.example.smepv006.base_data.bdp_parametros.in_out.BDP_IN;
import com.example.smepv006.base_data.bdp_parametros.in_out.BDP_OUT;
import com.example.smepv006.base_data.bdp_parametros.tablas.Tabla_Actividades_BDP;
import com.example.smepv006.base_data.bdp_parametros.tablas.Tabla_Operaciones_BDP;

public class BDP_MBD extends MBD_manejadordeLaBaseDeDatos{

    public BDP_MBD() {
    }
    public void CrearTabla(SQLiteDatabase sqLiteDatabase){
        EXEC_SQL(sqLiteDatabase,new BDP_PTAB().getListaTablasCrear());
    }
    public void ActualizarTabla(SQLiteDatabase sqLiteDatabase){
        EXEC_SQL(sqLiteDatabase,new BDP_PTAB().getListaTablasActualizar());
    }

    public Boolean isReadebleSQLite(BD_INPUT bd_input){
        return (bd_input.getID_OPERACION() ==2)||(bd_input.getID_OPERACION()==3);
    }

    public BD_OUTPUT procesoDeConsulta(BD_INPUT bd_input, SQLiteDatabase sq){
        BD_PARAMETROS bd_parametros = new BDP_PTAB().establecerParametrosDeTabla(bd_input.getID_TABLA());
        switch (bd_input.getID_OPERACION()){
            case 1:
                return AddData(bd_input,bd_parametros,sq);

            case 2:
                return ReadData(bd_input,bd_parametros,sq);

            case 3:
                return IsDataInTable(bd_parametros,sq);

            default:
                return DeleteDataInTable(bd_parametros,sq);
        }
    }

}
