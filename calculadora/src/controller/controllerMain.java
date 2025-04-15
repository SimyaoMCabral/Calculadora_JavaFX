package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class controllerMain {

    @FXML
    private Button bt1;

    @FXML
    private Button bt0;

    @FXML
    private Button bt2;

    @FXML
    private Button bt3;

    @FXML
    private Button bt4;

    @FXML
    private Button bt5;

    @FXML
    private Button bt6;

    @FXML
    private Button bt7;

    @FXML
    private Button bt8;

    @FXML
    private Button bt9;

    @FXML
    private Button btLimpar;

    @FXML
    private Label btconta;

    @FXML
    private Button btdivisao;

    @FXML
    private Button btigual;

    @FXML
    private Button btmultiplicacao;

    @FXML
    private Label btresultado;

    @FXML
    private Button btsoma;

    @FXML
    private Button btsubtracao;
    String val1 = "";
    String val2 = "";
    String operacao = "";
    
    @FXML
    private Button btExcluir;

    @FXML
    void actionExcluir(ActionEvent event) {

    	if(val2.equals("")) {
    		
    		String aux = btconta.getText();
    		
    		String excluir = ""+aux.charAt(aux.length()-1);
    		
    		val1 = val1.replace(excluir, "");
    		aux=aux.replace(excluir, "");
    		btconta.setText(aux);
    		btresultado.setText("");
    	}else if(operacao.equals("+") || operacao.equals("-") || operacao.equals("X") || operacao.equals("÷")) {
    		String aux = btconta.getText();
    		char excluir = aux.charAt(aux.length()-1);
    		char aux2 = 0;
    		aux = aux.replace(excluir, aux2);
    		btconta.setText(aux);
    		operacao = "";
    		btresultado.setText("");

    	}else {
    		String aux = btconta.getText();
    		String excluir = ""+ aux.charAt(aux.length()-1);
    		val2 = val2.replace(excluir, "");
    		aux = aux.replace(excluir, "");
    		btconta.setText(excluir);
    		btresultado.setText("");

    	}
    	
    	
    }

    
    @FXML
    void Limpar(ActionEvent event) {
     btconta.setText("");
     btresultado.setText("");
     val1 = "";
     val2 = "";
     operacao = "";
    }

    @FXML
    void dvisao(ActionEvent event) {
    	operacao = "÷";
    	btconta.setText(btconta.getText() + "÷");
    }

    @FXML
    void igual(ActionEvent event) {
    System.out.println(val1);
    	btconta.setText(btconta.getText() + "=");
    	if(val2.equals("")) {
    		btconta.setText("Erro! digite um segundo numero!");
    	}else if(val1.equals("")){
    		btconta.setText("Erro! digite um numero!");

    	}else {
    	switch(operacao){
    	case "+":
    	int valor1 = Integer.parseInt(val1);
        int valor2 = Integer.parseInt(val2);
    	int resultado = valor1 + valor2;
    	btresultado.setText(""+resultado);
    	break;
    	case "-":
        	 valor1 = Integer.parseInt(val1);
        	 valor2 = Integer.parseInt(val2);
        	 resultado = valor1 - valor2;
        	 btresultado.setText(""+resultado);
        	 break;
    	case "÷":
        	double valor3 = Double.parseDouble(val1);
        	double valor4 = Double.parseDouble(val2);
        	double resultado1 = valor3/valor4;
        	
        	if(valor3 == 0) {
        		btconta.setText("Erro. O Numero Não Pode Dividir Por 0");
        	}else if(valor4 == 0 ) {
        		btconta.setText("Erro. O Numero Não Pode Dividir Por 0");
        	}else{
        		btresultado.setText(""+resultado1);
        	}
        	break;
    	case "X":
    		valor1 = Integer.parseInt(val1);
    		valor2 = Integer.parseInt(val2);
       	 resultado = valor1 * valor2;
       	 btresultado.setText(""+resultado);
       	 break;
    	}
    	}
    }

    @FXML
    void multiplicacao(ActionEvent event) {
    	operacao = "X";
    	btconta.setText(btconta.getText() + "X");
    }

    @FXML
    void numero0(ActionEvent event) {
    	if(operacao.equals("")){
    		val1 = val1 + "0";
    		btconta.setText(btconta.getText() + "0");
    	}else {
    		val2 = val2 + "0";
    		btconta.setText(btconta.getText() + "0");

    	}
    }

    @FXML
    void numero1(ActionEvent event) {
    	if(operacao.equals("")){
    		val1 = val1 + "1";
    		btconta.setText(btconta.getText() + "1");
    	}else {
    		val2 = val2 + "1";
    		btconta.setText(btconta.getText() + "1");

    	}
    }

    @FXML
    void numero2(ActionEvent event) {
    	if(operacao.equals("")){
    		val1 = val1 + "2";
    		btconta.setText(btconta.getText() + "2");
    	}else {
    		val2 = val2 + "2";
    		btconta.setText(btconta.getText() + "2");

    	}
    }

    @FXML
    void numero3(ActionEvent event) {
    	if(operacao.equals("")){
    		val1 = val1 + "3";
    		btconta.setText(btconta.getText() + "3");
    	}else {
    		val2 = val2 + "3";
    		btconta.setText(btconta.getText() + "3");

    	}
    }

    @FXML
    void numero4(ActionEvent event) {
    	if(operacao.equals("")){
    		val1 = val1 + "4";
    		btconta.setText(btconta.getText() + "4");
    	}else {
    		val2 = val2 + "4";
    		btconta.setText(btconta.getText() + "4");

    	}
    }

    @FXML
    void numero5(ActionEvent event) {
    	if(operacao.equals("")){
    		val1 = val1 + "5";
    		btconta.setText(btconta.getText() + "5");
    	}else {
    		val2 = val2 + "5";
    		btconta.setText(btconta.getText() + "5");

    	}
    }

    @FXML
    void numero6(ActionEvent event) {
    	if(operacao.equals("")){
    		val1 = val1 + "6";
    		btconta.setText(btconta.getText() + "6");
    	}else {
    		val2 = val2 + "6";
    		btconta.setText(btconta.getText() + "6");

    	}
    }

    @FXML
    void numero7(ActionEvent event) {
    	if(operacao.equals("")){
    		val1 = val1 + "7";
    		btconta.setText(btconta.getText() + "7");
    	}else {
    		val2 = val2 + "7";
    		btconta.setText(btconta.getText() + "7");

    	}
    }

    @FXML
    void numero8(ActionEvent event) {
    	if(operacao.equals("")){
    		val1 = val1 + "8";
    		btconta.setText(btconta.getText() + "8");
    	}else {
    		val2 = val2 + "8";
    		btconta.setText(btconta.getText() + "8");

    	}
    }

    @FXML
    void numero9(ActionEvent event) {
    	if(operacao.equals("")){
    		val1 = val1 + "9";
    		btconta.setText(btconta.getText() + "9");
    	}else {
    		val2 = val2 + "9";
    		btconta.setText(btconta.getText() + "9");

    	}
    }

    @FXML
    void soma(ActionEvent event) {
    	operacao = "+";
    	btconta.setText(btconta.getText() + "+");
    }

    @FXML
    void subtracao(ActionEvent event) {
    	operacao = "-";
    	btconta.setText(btconta.getText() + "-");
    }

}