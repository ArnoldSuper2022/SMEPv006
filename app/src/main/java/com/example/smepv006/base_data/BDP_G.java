package com.example.smepv006.base_data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.smepv006.base_data.bd_parametros.BD_INPUT;
import com.example.smepv006.base_data.bd_parametros.BD_OUTPUT;
import com.example.smepv006.base_data.bdp_parametros.BDP_MBD;
import com.example.smepv006.base_data.bdp_parametros.in_out.BDP_OUT;

public class BDP_G extends SQLiteOpenHelper {


    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Smep_bdp.db";

    public BDP_G(Context context) {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        new BDP_MBD().CrearTabla(sqLiteDatabase);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        new BDP_MBD().ActualizarTabla(sqLiteDatabase);
        onCreate(sqLiteDatabase);
    }

    public BD_OUTPUT gestionDeConsulta_BDP_G_P3(BD_INPUT bd_INPUT){
        BDP_MBD bdp_mbd = new BDP_MBD();
        if(bdp_mbd.isReadebleSQLite(bd_INPUT)){
            return bdp_mbd.procesoDeConsulta(bd_INPUT,getReadableDatabase());
        }else{
            return bdp_mbd.procesoDeConsulta(bd_INPUT,getWritableDatabase());
        }
    }


}
