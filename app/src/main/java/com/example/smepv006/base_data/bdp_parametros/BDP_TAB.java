package com.example.smepv006.base_data.bdp_parametros;

public class BDP_TAB {

    public BDP_TAB() {
    }

    //todo: Tabla Tecnicos
    public static final String SQL_CREATE_TECNICOS =
            "CREATE TABLE " + BDP_SC.TecnicosEntry.TABLE_NAME + " (" +
                    BDP_SC.TecnicosEntry._ID + " INTEGER PRIMARY KEY," +
                    BDP_SC.TecnicosEntry.COLUMN_NAME_IDTECNICO + " TEXT," +
                    BDP_SC.TecnicosEntry.COLUMN_NAME_IDFUNCIONARIO+" TEXT,"+
                    BDP_SC.TecnicosEntry.COLUMN_NAME_SIGLASENTIDAD+" TEXT,"+
                    BDP_SC.TecnicosEntry.COLUMN_NAME_NOMBRE+" TEXT,"+
                    BDP_SC.TecnicosEntry.COLUMN_NAME_APELLIDO+" TEXT,"+
                    BDP_SC.TecnicosEntry.COLUMN_NAME_PASSWORD+" TEXT,"+
                    BDP_SC.TecnicosEntry.COLUMN_NAME_ESTADO+" TEXT,"+
                    BDP_SC.TecnicosEntry.COLUMN_NAME_DIACORTE+" TEXT)";

    public static final String SQL_DELETE_TECNICOS ="DROP TABLE IF EXISTS " + BDP_SC.TecnicosEntry.TABLE_NAME;
    public static final String SQL_QUERY_TECNICOS ="SELECT * FROM "+ BDP_SC.TecnicosEntry.TABLE_NAME;

    //TODO: TABLA IDSHEETPROYECT
    public static final String SQL_CREATE_IDSHEETPROYECT =
            "CREATE TABLE " + BDP_SC.IdSheetProyectEntry.TABLE_NAME + " (" +
                    BDP_SC.IdSheetProyectEntry._ID + " INTEGER PRIMARY KEY," +
                    BDP_SC.IdSheetProyectEntry.COLUMN_NAME_IDSHEETPROYECT + " TEXT)";

    public static final String SQL_DELETE_IDSHEETPROYECT ="DROP TABLE IF EXISTS " + BDP_SC.IdSheetProyectEntry.TABLE_NAME;
    public static final String SQL_QUERY_IDSHEETPROYECT ="SELECT * FROM "+ BDP_SC.IdSheetProyectEntry.TABLE_NAME;


    //todo: Tabla PROYECT
    public static final String SQL_CREATE_PROYECT =
            "CREATE TABLE " + BDP_SC.ProyectoEntry.TABLE_NAME + " (" +
                    BDP_SC.ProyectoEntry._ID + " INTEGER PRIMARY KEY," +
                    BDP_SC.ProyectoEntry.COLUMN_NAME_IDPROYECTO+ " TEXT," +
                    BDP_SC.ProyectoEntry.COLUMN_NAME_DESCRIPCION+" TEXT,"+
                    BDP_SC.ProyectoEntry.COLUMN_NAME_PRINCIPALOBJETIVO+" TEXT,"+
                    BDP_SC.ProyectoEntry.COLUMN_NAME_FECHADEINICIO+" TEXT)";

    public static final String SQL_DELETE_PROYECT ="DROP TABLE IF EXISTS " + BDP_SC.ProyectoEntry.TABLE_NAME;
    public static final String SQL_QUERY_PROYECT ="SELECT * FROM "+ BDP_SC.ProyectoEntry.TABLE_NAME;

    //todo: Tabla RESULT
    public static final String SQL_CREATE_RESULT =
            "CREATE TABLE " + BDP_SC.ResultadosEntry.TABLE_NAME + " (" +
                    BDP_SC.ResultadosEntry._ID + " INTEGER PRIMARY KEY," +
                    BDP_SC.ResultadosEntry.COLUMN_NAME_IDPRODUCTO+ " TEXT," +
                    BDP_SC.ResultadosEntry.COLUMN_NAME_DESCRIPCION+" TEXT)";

    public static final String SQL_DELETE_RESULT ="DROP TABLE IF EXISTS " + BDP_SC.ResultadosEntry.TABLE_NAME;
    public static final String SQL_QUERY_RESULT ="SELECT * FROM "+ BDP_SC.ResultadosEntry.TABLE_NAME;

    //todo: Tabla INDICADORES
    public static final String SQL_CREATE_INDICADORES =
            "CREATE TABLE " + BDP_SC.IndicadoresEntry.TABLE_NAME + " (" +
                    BDP_SC.IndicadoresEntry._ID + " INTEGER PRIMARY KEY," +
                    BDP_SC.IndicadoresEntry.COLUMN_NAME_IDPRODUCTO + " TEXT," +
                    BDP_SC.IndicadoresEntry.COLUMN_NAME_CODIGOINDICADOR+" TEXT,"+
                    BDP_SC.IndicadoresEntry.COLUMN_NAME_TIPOINDICADOR+" TEXT,"+
                    BDP_SC.IndicadoresEntry.COLUMN_NAME_IDINDICADOR+" TEXT,"+
                    BDP_SC.IndicadoresEntry.COLUMN_NAME_INDICADOR+" TEXT,"+
                    BDP_SC.IndicadoresEntry.COLUMN_NAME_META+" TEXT,"+
                    BDP_SC.IndicadoresEntry.COLUMN_NAME_UNIDAD+" TEXT)";

    public static final String SQL_DELETE_INDICADORES ="DROP TABLE IF EXISTS " + BDP_SC.IndicadoresEntry.TABLE_NAME;
    public static final String SQL_QUERY_INDICADORES ="SELECT * FROM "+ BDP_SC.IndicadoresEntry.TABLE_NAME;

    //todo: Tabla ACTIVIDADES
    public static final String SQL_CREATE_ACTIVIDADES =
            "CREATE TABLE " + BDP_SC.ActividadesEntry.TABLE_NAME + " (" +
                    BDP_SC.ActividadesEntry._ID + " INTEGER PRIMARY KEY," +
                    BDP_SC.ActividadesEntry.COLUMN_NAME_IDPRODUCTO + " TEXT," +
                    BDP_SC.ActividadesEntry.COLUMN_NAME_IDINDICADOR+" TEXT,"+
                    BDP_SC.ActividadesEntry.COLUMN_NAME_IDACTIVIDAD+" TEXT,"+
                    BDP_SC.ActividadesEntry.COLUMN_NAME_ACTIVIDAD+" TEXT,"+
                    BDP_SC.ActividadesEntry.COLUMN_NAME_FECHASTART+" TEXT,"+
                    BDP_SC.ActividadesEntry.COLUMN_NAME_FECHAEND+" TEXT,"+
                    BDP_SC.ActividadesEntry.COLUMN_NAME_RESPONSABLES+" TEXT)";

    public static final String SQL_DELETE_ACTIVIDADES ="DROP TABLE IF EXISTS " + BDP_SC.ActividadesEntry.TABLE_NAME;
    public static final String SQL_QUERY_ACTIVIDADES ="SELECT * FROM "+ BDP_SC.ActividadesEntry.TABLE_NAME;

    //todo: Tabla DESCRIPCION
    public static final String SQL_CREATE_DESCRIPCION =
            "CREATE TABLE " + BDP_SC.DescripActEntry.TABLE_NAME + " (" +
                    BDP_SC.DescripActEntry._ID + " INTEGER PRIMARY KEY," +
                    BDP_SC.DescripActEntry.COLUMN_NAME_IDPRODUCTO + " TEXT," +
                    BDP_SC.DescripActEntry.COLUMN_NAME_IDINDICADOR+" TEXT,"+
                    BDP_SC.DescripActEntry.COLUMN_NAME_IDACTIVIDAD+" TEXT,"+
                    BDP_SC.DescripActEntry.COLUMN_NAME_DESCRIPCION+" TEXT)";

    public static final String SQL_DELETE_DESCRIPCION ="DROP TABLE IF EXISTS " + BDP_SC.DescripActEntry.TABLE_NAME;
    public static final String SQL_QUERY_DESCRIPCION ="SELECT * FROM "+ BDP_SC.DescripActEntry.TABLE_NAME;

    //todo: Tabla LOCALIZACION
    public static final String SQL_CREATE_LOCALIZACION =
            "CREATE TABLE " + BDP_SC.LocalizacionEntry.TABLE_NAME + " (" +
                    BDP_SC.LocalizacionEntry._ID + " INTEGER PRIMARY KEY," +
                    BDP_SC.LocalizacionEntry.COLUMN_NAME_DEPARTAMENTO + " TEXT," +
                    BDP_SC.LocalizacionEntry.COLUMN_NAME_MUNICIPIO+" TEXT,"+
                    BDP_SC.LocalizacionEntry.COLUMN_NAME_COMUNIDAD+" TEXT,"+
                    BDP_SC.LocalizacionEntry.COLUMN_NAME_RESPONSABLES+" TEXT)";

    public static final String SQL_DELETE_LOCALIZACION ="DROP TABLE IF EXISTS " + BDP_SC.LocalizacionEntry.TABLE_NAME;
    public static final String SQL_QUERY_LOCALIZACION ="SELECT * FROM "+ BDP_SC.LocalizacionEntry.TABLE_NAME;
}
