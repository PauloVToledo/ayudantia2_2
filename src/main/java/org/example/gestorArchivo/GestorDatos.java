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
                // Suponiendo que cada línea contiene información para crear un empleado
                // Debes analizar y dividir la línea según el formato de tus datos.
                // Por ejemplo, si estás guardando los datos en formato CSV:
                // String[] partes = linea.split(",");
                // Luego, crea el empleado y agrégalo a la lista.
                // empleados.add(new Empleado(partes[0], Double.parseDouble(partes[1])));
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo " + nombreArchivo);
            e.printStackTrace();
        }

        return empleados;
    }
}
