package com.example.smepv006.base_data.bd_parametros;

import android.database.sqlite.SQLiteDatabase;

import java.util.List;

public class MBD_INIT {
    public MBD_INIT() {
    }
    public void EXEC_SQL(SQLiteDatabase sqLiteDatabase, List<String> listaTab){
        for(String tab:listaTab){
            sqLiteDatabase.execSQL(tab);
        }
    }
}
