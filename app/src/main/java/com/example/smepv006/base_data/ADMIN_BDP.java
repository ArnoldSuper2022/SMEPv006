package com.example.smepv006.base_data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.smepv006.base_data.bd_parametros.BD_INPUT;
import com.example.smepv006.base_data.bd_parametros.BD_OPERACIONES;
import com.example.smepv006.base_data.bd_parametros.MBD_INIT;
import com.example.smepv006.base_data.bdp_parametros.BDP_CONFIG;
import com.example.smepv006.base_data.bdp_parametros.BDP_MBD;
import com.example.smepv006.base_data.bdp_parametros.in_out.BDP_OUTPUT;

public class ADMIN_BDP extends SQLiteOpenHelper {


    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Smep_bdp.db";

    public ADMIN_BDP(Context context) {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        new MBD_INIT().EXEC_SQL(sqLiteDatabase,new BDP_CONFIG().getListaTablasCrear());
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        new MBD_INIT().EXEC_SQL(sqLiteDatabase,new BDP_CONFIG().getListaTablasActualizar());
        onCreate(sqLiteDatabase);
    }

    public BDP_OUTPUT gestionDeConsulta_BDP_G_P3(BD_INPUT bd_INPUT){
        BD_OPERACIONES bd_operaciones = new BDP_CONFIG().establecerOperaciones(bd_INPUT.getID_TABLA());
        BDP_MBD bdp_mbd = new BDP_MBD(bd_INPUT,bd_operaciones);
        if(bdp_mbd.IS_READABLE_SQL()){
            return bdp_mbd.procesoDeConsulta(getReadableDatabase());
        }else{
            return bdp_mbd.procesoDeConsulta(getWritableDatabase());
        }
    }


}
