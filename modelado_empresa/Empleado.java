package modelado_empresa;

public class Empleado {

    private int idEmpleado;
    private String nombreEmpleado;
    private String correoEmpleado;
    private String empresaPertenece;
    private String rolEmpleado;


    public Empleado(int idEmpleado, String nombreEmpleado, String correoEmpleado, String empresaPertenece, String rolEmpleado) {
        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.correoEmpleado = correoEmpleado;
        this.empresaPertenece = empresaPertenece;
        this.rolEmpleado = rolEmpleado;
    }

    public String getidEmpleado() {
        return idEmpleado;
    }

    public void setidEmpleado(String nombreEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    public String getEmpresaPertenece() {
        return empresaPertenece;
    }

    public void setEmpresaPertenece(String empresaPertenece) {
        this.empresaPertenece = empresaPertenece;
    }

    public String getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }
}
