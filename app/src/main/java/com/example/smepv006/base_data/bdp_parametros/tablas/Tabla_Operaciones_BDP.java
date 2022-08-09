package com.example.smepv006.base_data.bdp_parametros.tablas;

public class Tabla_Operaciones_BDP {

    private String TABLE_NAME;
    private String SQL_QUERY;
    private String SQL_CREATE;
    private String SQL_DELETE;

    public Tabla_Operaciones_BDP(String TABLE_NAME, String SQL_QUERY, String SQL_CREATE, String SQL_DELETE) {
        this.TABLE_NAME = TABLE_NAME;
        this.SQL_QUERY = SQL_QUERY;
        this.SQL_CREATE = SQL_CREATE;
        this.SQL_DELETE = SQL_DELETE;
    }

    public String getTABLE_NAME() {
        return TABLE_NAME;
    }

    public void setTABLE_NAME(String TABLE_NAME) {
        this.TABLE_NAME = TABLE_NAME;
    }

    public String getSQL_QUERY() {
        return SQL_QUERY;
    }

    public void setSQL_QUERY(String SQL_QUERY) {
        this.SQL_QUERY = SQL_QUERY;
    }

    public String getSQL_CREATE() {
        return SQL_CREATE;
    }

    public void setSQL_CREATE(String SQL_CREATE) {
        this.SQL_CREATE = SQL_CREATE;
    }

    public String getSQL_DELETE() {
        return SQL_DELETE;
    }

    public void setSQL_DELETE(String SQL_DELETE) {
        this.SQL_DELETE = SQL_DELETE;
    }
}
