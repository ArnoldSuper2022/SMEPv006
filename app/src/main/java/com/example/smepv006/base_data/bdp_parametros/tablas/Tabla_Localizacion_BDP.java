package com.example.smepv006.base_data.bdp_parametros.tablas;

public class Tabla_Localizacion_BDP {
    private Integer id;
    private String DEPARTAMETO,MUNICIPIO,COMUNIDAD,RESPONSABLES;

    public Tabla_Localizacion_BDP(Integer id, String DEPARTAMETO, String MUNICIPIO, String COMUNIDAD, String RESPONSABLES) {
        this.id = id;
        this.DEPARTAMETO = DEPARTAMETO;
        this.MUNICIPIO = MUNICIPIO;
        this.COMUNIDAD = COMUNIDAD;
        this.RESPONSABLES = RESPONSABLES;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDEPARTAMETO() {
        return DEPARTAMETO;
    }

    public void setDEPARTAMETO(String DEPARTAMETO) {
        this.DEPARTAMETO = DEPARTAMETO;
    }

    public String getMUNICIPIO() {
        return MUNICIPIO;
    }

    public void setMUNICIPIO(String MUNICIPIO) {
        this.MUNICIPIO = MUNICIPIO;
    }

    public String getCOMUNIDAD() {
        return COMUNIDAD;
    }

    public void setCOMUNIDAD(String COMUNIDAD) {
        this.COMUNIDAD = COMUNIDAD;
    }

    public String getRESPONSABLES() {
        return RESPONSABLES;
    }

    public void setRESPONSABLES(String RESPONSABLES) {
        this.RESPONSABLES = RESPONSABLES;
    }
}
