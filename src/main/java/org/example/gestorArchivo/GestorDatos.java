package org.example.gestorArchivo;

import org.example.gestionEmpleados.Empleado;
import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GestorDatos {


    private String datos;

    public void guardarEmpleados(@NotNull List<Empleado> empleados, String nombreArchivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (Empleado empleado : empleados) {
                String linea = empleado.toString();
                writer.write(linea);
                writer.newLine();
            }
            System.out.println("Empleados guardados exitosamente en " + nombreArchivo);
        } catch (IOException e) {
            System.err.println("Error al guardar los empleados en el archivo " + nombreArchivo);
            e.printStackTrace();
        }
    }

    public List<Empleado> leerEmpleados(String nombreArchivo) {
        List<Empleado> empleados = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(",");
                empleados.add(new Empleado(partes[0], Double.parseDouble(partes[1])) {
                    @Override
                    public String getTipo() {
                        return null;
                    }

                    @Override
                    public boolean calcularSalario() {
                        return false;
                    }
                });
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo " + nombreArchivo);
            e.printStackTrace();
        }

        return empleados;
    }

}
