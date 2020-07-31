package GraphicUserInterface;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entity.Departamento;

public class DepartamentoListController implements Initializable {
	
	
	//componentes da tela
	@FXML
	private TableView<Departamento> tableViewDepartament;
	@FXML
	private TableColumn<Departamento, Integer> tableColumnId;
	@FXML
	private TableColumn<Departamento, String> tableColumnNome;
	@FXML
	private Button btCadastro;
	
	//funções dos componentes
	@FXML
	private void onBtCadastroAction() {
		System.out.println("onBtCadastroAction");
	}
	
	
	
	@Override
	public void initialize(URL uri, ResourceBundle rb) {
		// TODO Auto-generated method stub
		initializeNodes();
	}
	
	private void initializeNodes() {
		//referenciando os atributos da classe
		tableColumnId.setCellValueFactory(new PropertyValueFactory<>("id"));
		tableColumnNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
		
		//para fazer o tamanho da tabela acompanhar a janela do s.o
		Stage stage = (Stage) Main.getMainScene().getWindow();
		tableViewDepartament.prefHeightProperty().bind(stage.heightProperty());
	}

}
