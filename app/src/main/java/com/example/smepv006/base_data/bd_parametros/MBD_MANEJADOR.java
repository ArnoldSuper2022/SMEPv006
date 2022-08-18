package com.example.smepv006.base_data.bd_parametros;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.List;

public abstract class MBD_MANEJADOR {
    private BD_INPUT bd_input;
    private BD_OPERACIONES bd_operaciones;


    public MBD_MANEJADOR(BD_INPUT bd_input, BD_OPERACIONES bd_operaciones) {
        this.bd_input = bd_input;
        this.bd_operaciones = bd_operaciones;
    }


    public Boolean IS_READABLE_SQL(){
        return (bd_input.getID_OPERACION()==2)||(bd_input.getID_OPERACION()==3);
    }

    public Boolean AddData(SQLiteDatabase sqLiteDatabase){
        sqLiteDatabase.insert(bd_operaciones.getTABLE_NAME(),null,bd_input.getCvDATA());
        return true;
    }
    //Clase para modificar
    public Cursor ReadData(SQLiteDatabase sqLiteDatabase){
        return sqLiteDatabase.rawQuery(bd_operaciones.getSQL_QUERY(),null);
    }

    public Boolean IsDataInTable(SQLiteDatabase sqLiteDatabase){
        Cursor cursor =  sqLiteDatabase.rawQuery(bd_operaciones.getSQL_QUERY(),null);
        Boolean isDataInTable;
        if(cursor.moveToFirst()){
            isDataInTable = true;
        }else{
            isDataInTable =false;
        }
        return isDataInTable;
    }

    public Boolean DeleteDataInTable(SQLiteDatabase sqLiteDatabase){

        if(sqLiteDatabase !=null) {
            sqLiteDatabase.execSQL(bd_operaciones.getSQL_DELETE());
            sqLiteDatabase.execSQL(bd_operaciones.getSQL_CREATE());
            return true;
        }else{
            return false;
        }
    }




}
