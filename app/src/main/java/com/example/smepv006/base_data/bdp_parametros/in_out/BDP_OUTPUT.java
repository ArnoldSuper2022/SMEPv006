package com.example.smepv006.base_data.bdp_parametros.in_out;

import com.example.smepv006.base_data.bdp_parametros.BDP_READ;
import com.example.smepv006.base_data.bdp_parametros.tablas.Tabla_Actividades_BDP;
import com.example.smepv006.base_data.bdp_parametros.tablas.Tabla_DescripAct_BDP;
import com.example.smepv006.base_data.bdp_parametros.tablas.Tabla_IdSheetProyect_BDP;
import com.example.smepv006.base_data.bdp_parametros.tablas.Tabla_Indicadores_BDP;
import com.example.smepv006.base_data.bdp_parametros.tablas.Tabla_Localizacion_BDP;
import com.example.smepv006.base_data.bdp_parametros.tablas.Tabla_Proyecto_BDP;
import com.example.smepv006.base_data.bdp_parametros.tablas.Tabla_Resultados_BDP;
import com.example.smepv006.base_data.bdp_parametros.tablas.Tabla_Tecnicos_BDP;

import java.util.List;

public class BDP_OUTPUT {

    private Boolean isDataInTable;
    private Boolean isDeletedData;
    private Boolean isAddDataInTable;
    private BDP_CARGA_OUTPUT bdp_carga_output;

    public BDP_OUTPUT() {
    }

    public BDP_CARGA_OUTPUT getBdp_carga_output() {
        return bdp_carga_output;
    }

    public void setBdp_carga_output(BDP_CARGA_OUTPUT bdp_carga_output) {
        this.bdp_carga_output = bdp_carga_output;
    }

    public Boolean getDataInTable() {
        return isDataInTable;
    }

    public void setDataInTable(Boolean dataInTable) {
        isDataInTable = dataInTable;
    }

    public Boolean getDeletedData() {
        return isDeletedData;
    }

    public void setDeletedData(Boolean deletedData) {
        isDeletedData = deletedData;
    }

    public Boolean getAddDataInTable() {
        return isAddDataInTable;
    }

    public void setAddDataInTable(Boolean addDataInTable) {
        isAddDataInTable = addDataInTable;
    }
}
