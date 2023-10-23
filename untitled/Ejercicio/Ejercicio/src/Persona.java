package Ejercicio.src;

import java.time.LocalDate;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private int nroTel;
    private int edad;
    private String direccion;
    private String pais;
    private int dni;
    private Fecha fechaNacimiento;
    private LocalDate fechaNac;
    private LocalDate nacimiento;

    public Persona(){
        nombre="Maria";
        apellido="Perez";
        edad=20;
        direccion="Albarellos 282";
    }
    public Persona(String nombre, String apellido, int edad, String direccion){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.direccion=direccion;
    }
    public Persona(String nombre, String apellido, int dni, String pais, int nroTel){
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni= dni;
        this.pais= pais;
        this.nroTel= nroTel;
    }
    public Persona(String nombre, String apellido, int nroTel){
        this.nombre=nombre;
        this.apellido=apellido;
        this.nroTel=nroTel;
    }
    public Persona(String nombre, String apellido, int dni, Fecha nacimiento, String direccion){
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.fechaNacimiento=nacimiento;
        this.direccion=direccion;
    }
    public Persona(String nombre, String apellido, int dni, LocalDate nacimiento, String direccion){
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.fechaNac=nacimiento;
        this.direccion=direccion;
    }
    public Persona(String nombre, String apellido, LocalDate nacimiento, int dni){
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.fechaNac=nacimiento;
    }
    public Persona(LocalDate nacimiento, String nombre){
        this.nombre=nombre;
        this.fechaNac=nacimiento;
    }
    public Persona(String nombre, String apellido, int nroTel, Fecha nacimiento){
        this.nombre=nombre;
        this.apellido=apellido;
        this.nroTel=nroTel;
        this.fechaNacimiento=nacimiento;

    }
    public Persona(String nombre, int dni, String apellido){
        this.nombre=nombre;
        this.dni=dni;
        this.apellido=apellido;
    }
    public Persona(String nombre, String apellido, Fecha nacimiento){
        this.nombre=nombre;
        this.apellido=apellido;
        this.fechaNacimiento=nacimiento;
    }

    public Persona(String nombre) {
        this.nombre=nombre;
    }

    public Persona(String nombre, String apellido) {
        this.nombre=nombre;
        this.apellido=apellido;
    }
    public Persona(String nombre, Fecha fechaNacimiento) {
        this.nombre=nombre;
        this.fechaNacimiento=fechaNacimiento;
    }
    public Persona(String nombre, String apellido, LocalDate nacimiento){
        this.nombre=nombre;
        this.apellido=apellido;
        this.nacimiento=nacimiento;
    }
    public Persona(String nombre, String apellido, int dni, LocalDate nacimiento){
        this.nombre=nombre;
        this.apellido=apellido;
        this.nacimiento=nacimiento;
        this.dni=dni;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public String getDireccion(){
        return direccion;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getNroTel() {
        return nroTel;
    }
    public void setNroTel(int nroTel) {
        this.nroTel = nroTel;
    }

    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String impresionDatos(){
        String nombre="Nombre: " + this.nombre;
        String edad="Edad: " + this.edad;
        String direccion="Direccion: " + this.direccion;
        String datos= nombre + " " + edad+ " " + direccion;
        return datos;
    }

}