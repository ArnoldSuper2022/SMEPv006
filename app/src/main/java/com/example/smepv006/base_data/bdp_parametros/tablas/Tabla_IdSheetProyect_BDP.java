package com.example.smepv006.base_data.bdp_parametros.tablas;

public class Tabla_IdSheetProyect_BDP {
    private Integer id;
    private String idSheetProyect;

    public Tabla_IdSheetProyect_BDP(Integer id, String idSheetProyect) {
        this.id = id;
        this.idSheetProyect = idSheetProyect;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdSheetProyect() {
        return idSheetProyect;
    }

    public void setIdSheetProyect(String idSheetProyect) {
        this.idSheetProyect = idSheetProyect;
    }
}
