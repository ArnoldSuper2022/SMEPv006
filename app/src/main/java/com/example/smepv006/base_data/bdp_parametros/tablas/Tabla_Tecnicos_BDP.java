package com.example.smepv006.base_data.bdp_parametros.tablas;

public class Tabla_Tecnicos_BDP {
    private Integer id;
    private String idTecnico,idFuncionario,siglasEntidad,nombre,apellido,password,estado,diaCorte;

    public Tabla_Tecnicos_BDP(Integer id, String idTecnico, String idFuncionario, String siglasEntidad, String nombre, String apellido, String password, String estado, String diaCorte) {
        this.id = id;
        this.idTecnico = idTecnico;
        this.idFuncionario = idFuncionario;
        this.siglasEntidad = siglasEntidad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
        this.estado = estado;
        this.diaCorte = diaCorte;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdTecnico() {
        return idTecnico;
    }

    public void setIdTecnico(String idTecnico) {
        this.idTecnico = idTecnico;
    }

    public String getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(String idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getSiglasEntidad() {
        return siglasEntidad;
    }

    public void setSiglasEntidad(String siglasEntidad) {
        this.siglasEntidad = siglasEntidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDiaCorte() {
        return diaCorte;
    }

    public void setDiaCorte(String diaCorte) {
        this.diaCorte = diaCorte;
    }
}
