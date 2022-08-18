package com.example.smepv006.base_data.bdp_parametros;

import android.database.sqlite.SQLiteDatabase;

import com.example.smepv006.base_data.bd_parametros.BD_INPUT;
import com.example.smepv006.base_data.bd_parametros.BD_OPERACIONES;
import com.example.smepv006.base_data.bd_parametros.MBD_MANEJADOR;
import com.example.smepv006.base_data.bdp_parametros.in_out.BDP_OUTPUT;

public class BDP_MBD extends MBD_MANEJADOR {

    private BD_INPUT bd_input;
    private BD_OPERACIONES bd_operaciones;


    public BDP_MBD(BD_INPUT bd_input, BD_OPERACIONES bd_operaciones) {
        super(bd_input, bd_operaciones);
        this.bd_input = bd_input;
        this.bd_operaciones = bd_operaciones;
    }



    public BDP_OUTPUT procesoDeConsulta(SQLiteDatabase sqLiteDatabase) {
       BDP_OUTPUT bdp_output = new BDP_OUTPUT();
        switch (bd_input.getID_OPERACION()){
            case 1:
                bdp_output.setAddDataInTable(AddData(sqLiteDatabase));
                break;
            case 2:
                bdp_output.setBdp_carga_output(new BDP_READ().getCarga(bd_input.getID_TABLA(),ReadData(sqLiteDatabase)));
                break;
            case 3:
                bdp_output.setDataInTable(DeleteDataInTable(sqLiteDatabase));
            default:
                bdp_output.setDataInTable(IsDataInTable(sqLiteDatabase));
        }
        return  bdp_output;
    }



}
