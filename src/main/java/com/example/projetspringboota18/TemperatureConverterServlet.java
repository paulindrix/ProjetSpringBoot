package com.example.projetspringboota18;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet("/temperatureConverter")
public class TemperatureConverterServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Récupérer la température en degrés Celsius depuis le formulaire HTML
        double temperatureCelsius = Double.parseDouble(request.getParameter("celsius"));

        // Convertir en degrés Fahrenheit en appelant la méthode de conversion
        double temperatureFahrenheit = convertirEnFahrenheit(temperatureCelsius);

        // Passer le résultat à la page JSP
        request.setAttribute("result", temperatureFahrenheit);

        // Rediriger vers la page JSP
        request.getRequestDispatcher("/WEB-INF/jsp/result.jsp").forward(request, response);
    }

    private double convertirEnFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
