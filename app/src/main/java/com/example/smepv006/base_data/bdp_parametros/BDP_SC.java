package com.example.smepv006.base_data.bdp_parametros;

import android.provider.BaseColumns;

public class BDP_SC {

    public BDP_SC() {
    }

    public static class TecnicosEntry implements BaseColumns {
        public static final String TABLE_NAME = "table1";
        public static final String COLUMN_NAME_IDTECNICO = "IDTECNICO_T";
        public static final String COLUMN_NAME_IDFUNCIONARIO = "IDFUNCIONARIO_T";
        public static final String COLUMN_NAME_SIGLASENTIDAD = "SIGLASENTIDAD_T";
        public static final String COLUMN_NAME_NOMBRE = "NOMBRE_T";
        public static final String COLUMN_NAME_APELLIDO = "APELLIDO_T";
        public static final String COLUMN_NAME_PASSWORD = "PASSWORD_T";
        public static final String COLUMN_NAME_ESTADO = "ESTADO_T";
        public static final String COLUMN_NAME_DIACORTE = "DIACORTE_T";
    }

    public static class IdSheetProyectEntry implements BaseColumns{
        public static final String TABLE_NAME = "table2";
        public static final String COLUMN_NAME_IDSHEETPROYECT = "IDSHEETPROYECT";
    }

    public static class ProyectoEntry implements BaseColumns{
        public static final String TABLE_NAME = "table3";
        public static final String COLUMN_NAME_IDPROYECTO = "IDPROYECTO_P";
        public static final String COLUMN_NAME_DESCRIPCION = "DESCRIPCION_P";
        public static final String COLUMN_NAME_PRINCIPALOBJETIVO = "PRINOBJETIVO_P";
        public static final String COLUMN_NAME_FECHADEINICIO = "FECHASTART_P";
    }
    public static class ResultadosEntry implements BaseColumns{
        public static final String TABLE_NAME = "table4";
        public static final String COLUMN_NAME_IDPRODUCTO = "IDPRODUCTO_R";
        public static final String COLUMN_NAME_DESCRIPCION = "DESCRIPCION_R";
    }

    public static class IndicadoresEntry implements BaseColumns{
        public static final String TABLE_NAME = "tabla5";
        public static final String COLUMN_NAME_IDPRODUCTO = "IDPRODUCTO_I";
        public static final String COLUMN_NAME_CODIGOINDICADOR = "CODIGOINDICADOR_I";
        public static final String COLUMN_NAME_TIPOINDICADOR = "TIPOINDICADOR_I";
        public static final String COLUMN_NAME_IDINDICADOR = "IDINDICADOR_I";
        public static final String COLUMN_NAME_INDICADOR = "INDICADOR_I";
        public static final String COLUMN_NAME_META = "META_I";
        public static final String COLUMN_NAME_UNIDAD = "UNIDAD_I";
    }

    public static class ActividadesEntry implements BaseColumns{
        public static final String TABLE_NAME = "table6";
        public static final String COLUMN_NAME_IDPRODUCTO = "IDPRODUCTO_A";
        public static final String COLUMN_NAME_IDINDICADOR = "IDINDICADOR_A";
        public static final String COLUMN_NAME_IDACTIVIDAD = "IDACTIVIDAD_A";
        public static final String COLUMN_NAME_ACTIVIDAD = "ACTIVIDAD_A";
        public static final String COLUMN_NAME_FECHASTART = "FECHASTART_A";
        public static final String COLUMN_NAME_FECHAEND = "FECHAEND_A";
        public static final String COLUMN_NAME_RESPONSABLES = "RESPONSABLES_A";
    }
    public static class DescripActEntry implements BaseColumns{
        public static final String TABLE_NAME = "table7";
        public static final String COLUMN_NAME_IDPRODUCTO = "IDPRODUCTO_DA";
        public static final String COLUMN_NAME_IDINDICADOR = "IDINDICADOR_DA";
        public static final String COLUMN_NAME_IDACTIVIDAD = "IDACTIVIDAD_DA";
        public static final String COLUMN_NAME_DESCRIPCION = "DESCRIPCION_DA";
    }

    public static class LocalizacionEntry implements BaseColumns{
        public static final String TABLE_NAME = "table8";
        public static final String COLUMN_NAME_DEPARTAMENTO = "DEPARTAMENTO_L";
        public static final String COLUMN_NAME_MUNICIPIO = "MUNICIPIO_L";
        public static final String COLUMN_NAME_COMUNIDAD = "COMUNIDAD_L";
        public static final String COLUMN_NAME_RESPONSABLES = "RESPONSABLES_L";
    }
}
