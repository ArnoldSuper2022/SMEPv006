package com.example.smepv006.base_data.bd_parametros;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.smepv006.base_data.bdp_parametros.in_out.BDP_CARGA_OUT;
import com.example.smepv006.base_data.bdp_parametros.in_out.BDP_IN;
import com.example.smepv006.base_data.bdp_parametros.in_out.BDP_OUT;

import java.net.PortUnreachableException;
import java.util.List;

public class MBD_manejadordeLaBaseDeDatos {
    public MBD_manejadordeLaBaseDeDatos() {
    }

    public void EXEC_SQL(SQLiteDatabase sqLiteDatabase, List<String> listaTab){
        for(String tab:listaTab){
            sqLiteDatabase.execSQL(tab);
        }
    }

    public Boolean configuracionSQL(BD_INPUT bd_INPUT){
        return (bd_INPUT.getID_OPERACION() ==2)||(bd_INPUT.getID_OPERACION()==3);

    }

    public BD_OUTPUT AddData(BD_INPUT bd_input,BD_PARAMETROS bd_parametros,SQLiteDatabase sq){
        sq.insert(bd_parametros.getTABLE_NAME(),null, bd_input.getCvDATA());
        return new BD_OUTPUT(true);
    }
    //Modificar
    public BD_OUTPUT ReadData(BD_INPUT bd_input,BD_PARAMETROS bd_parametros,SQLiteDatabase sq){
        BD_CARGA_OUT bd_carga_out = new BD_CARGA_OUT();
        return new BD_OUTPUT(true,bd_carga_out);
    }

    public BD_OUTPUT IsDataInTable(BD_PARAMETROS bd_parametros,SQLiteDatabase sq){
        Cursor cursor =  sq.rawQuery(bd_parametros.getSQL_QUERY(),null);
        Boolean isDataInTable;
        if(cursor.moveToFirst()){
            isDataInTable = true;
        }else{
            isDataInTable =false;
        }
        return new BD_OUTPUT(true,isDataInTable);
    }

    public BD_OUTPUT DeleteDataInTable(BD_PARAMETROS bd_parametros,SQLiteDatabase sq){
        if(sq !=null) {
            sq.execSQL(bd_parametros.getSQL_DELETE());
            sq.execSQL(bd_parametros.getSQL_CREATE());
        }
        return new BD_OUTPUT(true);
    }




}
