/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petrichor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author Gareth
 */
public class ChartGroup {

    final static int TEMP = 0;
    final static int HUMIDITY = 1;
    final static int LIGHT = 2;
    final static int MOISTURE = 3;

    public XYSeries temperatureSeries;
    public XYSeriesCollection temperatureCollection;
    public XYSeries humiditySeries;
    public XYSeriesCollection humidityCollection;
    public XYSeries lightSeries;
    public XYSeriesCollection lightCollection;
    public XYSeries moistureSeries;
    public XYSeriesCollection moistureCollection;
    public JFreeChart temperatureChart;
    public JFreeChart humidityChart;
    public JFreeChart lightChart;
    public JFreeChart moistureChart;
    public ChartPanel temperaturePanel;
    public ChartPanel humidityPanel;
    public ChartPanel lightPanel;
    public ChartPanel moisturePanel;

    /**
     * An object made to store and process all the necessary information for four sets of graphs (temperature, humidity, light, and soil moisture)
     *
     * @param fileName The name of the file where the sensor readings are stored as a string
     */
    public ChartGroup(String fileName) {
        try {
            temperatureSeries = new XYSeries("Temperature Readings (°C)");
            humiditySeries = new XYSeries("Humidity Readings(%)");
            lightSeries = new XYSeries("Light Readings(%)");
            moistureSeries = new XYSeries("Moisture Readings(%)");
            HashMap<Integer, String> charts = new HashMap<>();
            charts.put(0, "Temperature");
            charts.put(1, "Humidity");
            charts.put(2, "Light");
            charts.put(3, "Moisture");
            BufferedReader scanner = new BufferedReader(new FileReader(fileName));
            for (int j = 0; j < 60; j++) {
                if (scanner.ready()) {
                    String in = scanner.readLine();
                    StringTokenizer split = new StringTokenizer(in, " ");
                    temperatureSeries.add(j, Double.parseDouble(split.nextToken()));
                    humiditySeries.add(j, Double.parseDouble(split.nextToken()));
                    lightSeries.add(j, Double.parseDouble(split.nextToken()));
                    moistureSeries.add(j, Double.parseDouble(split.nextToken()));
                } else {
                    j = 60;
                }
            }
            scanner.close();
            temperatureCollection = new XYSeriesCollection(temperatureSeries);
            humidityCollection = new XYSeriesCollection(humiditySeries);
            lightCollection = new XYSeriesCollection(lightSeries);
            moistureCollection = new XYSeriesCollection(moistureSeries);
            temperatureChart = ChartFactory.createXYLineChart("Temperature", "Time (Minutes)", "Temperature(°C)", temperatureCollection);
            humidityChart = ChartFactory.createXYLineChart("Humidity", "Time (Minutes)", "Humidity(%)", humidityCollection);
            lightChart = ChartFactory.createXYLineChart("Light", "Time (Minutes)", "Light(%)", lightCollection);
            moistureChart = ChartFactory.createXYLineChart("Moisture", "Time (Minutes)", "Moisture(%)", moistureCollection);
            temperaturePanel = new ChartPanel(temperatureChart);
            humidityPanel = new ChartPanel(humidityChart);
            lightPanel = new ChartPanel(lightChart);
            moisturePanel = new ChartPanel(moistureChart);
        } catch (IOException ex) {

        }
    }

    /**
     * Returns a the chartPanel based on which of the class's constants are parsed through
     *
     * @param which Which panel to be selected (using the classes static constants)
     * @return The chartPanel matching the corresponding constant
     */
    public ChartPanel getChart(int which) {
        switch (which) {
            case 0:
                return temperaturePanel;
            case 1:
                return humidityPanel;
            case 2:
                return lightPanel;
            case 3:
                return moisturePanel;
            default:
                return moisturePanel;
        }
    }

    /**
     * Adds a single XY pair to a single graph selected using one of this class's constants
     *
     * @param type The graph being targeted (using the classes static constants)
     * @param x The single X coordinate as an integer
     * @param y The single Y coordinate as an integer
     */
    public void addPoint(int type, int x, int y) {
        switch (type) {
            case 0:
                temperatureSeries.add(x, y);
                break;
            case 1:
                humiditySeries.add(x, y);
                break;
            case 2:
                lightSeries.add(x, y);
                break;
            case 3:
                moistureSeries.add(x, y);
                break;
        }
    }

    /**
     * Adds an array of XY pairs to a single graph selected using one of this class's constants
     *
     * @param type The graph being targeted
     * @param x The array of X coordinates in parallel the the array of Y coordinates as integers
     * @param y The array of Y coordinates in parallel the the array of X coordinates as integers
     */
    public void massAdd(int type, int[] x, int[] y) {
        if (x.length == y.length) {
            int length = x.length;
            switch (type) {
                case 0:
                    for (int i = 0; i < length; i++) {
                        temperatureSeries.add(x[i], y[i]);
                    }
                    break;
                case 1:
                    for (int i = 0; i < length; i++) {
                        humiditySeries.add(x[i], y[i]);
                    }
                    break;
                case 2:
                    for (int i = 0; i < length; i++) {
                        lightSeries.add(x[i], y[i]);
                    }
                    break;
                case 3:
                    for (int i = 0; i < length; i++) {
                        moistureSeries.add(x[i], y[i]);
                    }
                    break;
            }
        }
    }

    /**
     * Takes in two 2D, four by n length arrays and adds them all to the arrays in the order of temp, humidity, light and moisture
     *
     * @param x A 2D array with all the x points as integers
     * @param y A 2D array with all the Y points as integers
     */
    public void massAdd(int[][] x, int[][] y) {
        if (x.length == y.length && x.length == 4) {
            for (int i = 0; i < 4; i++) {
                if (x[i].length == y[i].length) {
                    int length = x[i].length;
                    switch (i) {
                        case 0:
                            for (int j = 0; j < length; j++) {
                                temperatureSeries.add(x[i][j], y[i][j]);
                            }
                            break;
                        case 1:
                            for (int j = 0; j < length; j++) {
                                humiditySeries.add(x[i][j], y[i][j]);
                            }
                            break;
                        case 2:
                            for (int j = 0; j < length; j++) {
                                lightSeries.add(x[i][j], y[i][j]);
                            }
                            break;
                        case 3:
                            for (int j = 0; j < length; j++) {
                                moistureSeries.add(x[i][j], y[i][j]);
                            }
                            break;
                    }
                }
            }
        }
    }
}
