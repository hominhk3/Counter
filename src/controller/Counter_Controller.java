/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import java.util.HashMap;
import java.util.Map;
import view.Main;

/**
 *
 * @author dell
 */

import model.Counter_Model;

public class Counter_Controller {

    private Counter_Model model;

    public Counter_Controller(Counter_Model model) {
        this.model = model;
    }

    public void analyzeContent(String content) {
        model.analyze(content);
    }
}
