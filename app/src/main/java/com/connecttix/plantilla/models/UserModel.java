package com.connecttix.plantilla.models;

public class UserModel {

    public static int id;
    public static String name;
    public static String apellido;
    public static boolean activo;

    public UserModel() {
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        UserModel.id = id;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        UserModel.name = name;
    }

    public static String getApellido() {
        return apellido;
    }

    public static void setApellido(String apellido) {
        UserModel.apellido = apellido;
    }

    public static boolean isActivo() {
        return activo;
    }

    public static void setActivo(boolean activo) {
        UserModel.activo = activo;
    }
}
