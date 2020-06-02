/*
 * SANTIAGO RODAS RODRIGUEZ
 * PROYECTO PERSONAL
 * JUEGO TRIQUI
 */

package application;

import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Juego;
import model.Jugador;

public class Controladora {
	
	static int numero = 2;
		
	// ----------------------------------------------------------------------------
	
	private Juego juego;
	
	// ----------------------------------------------------------------------------
	
	public Controladora() {
		
		juego = new Juego();
				
	}
	
	// ----------------------------------------------------------------------------
	
	@FXML
	private TextField jugador1;

	@FXML
	private TextField jugador2;

	@FXML
	private Button botonIniciar;
	
	// ----------------------------------------------------------------------------
	
	@FXML
    private Label texto;
	
	@FXML
    private Button b1;

    @FXML
    private Button b2;

    @FXML
    private Button b3;

    @FXML
    private Button b4;

    @FXML
    private Button b5;

    @FXML
    private Button b6;

    @FXML
    private Button b7;

    @FXML
    private Button b8;

    @FXML
    private Button b9;

    @FXML
    private Button botonReinicio;
    
    @FXML
    private Button botonResultados;
    
    // ----------------------------------------------------------------------------
    
    @FXML
    private Button nuevob;

    @FXML
    private Button partidab;
    
    @FXML
    private TableView<Jugador> tabla;

    @FXML
    private TableColumn<Jugador, String> nombre;

    @FXML
    private TableColumn<Jugador, Integer> partidas;
	
	// ----------------------------------------------------------------------------

	@FXML
	public void iniciar(ActionEvent event) throws IOException {
		
		try {
			
			String nombre1 = jugador1.getText();
			
			String nombre2 = jugador2.getText();
			
			if(nombre1.isEmpty() == false && nombre2.isEmpty() == false) {
				
				juego.getJugadores().add(new Jugador(nombre1, 0));
				
				juego.getJugadores().add(new Jugador(nombre2, 0));
				
				
			} else {
				
				throw new NullPointerException("Diligenciar todos los datos");
				
			}
			
			// ******************************************
			
			Node source = (Node) event.getSource();
	    	
	        Stage stage = (Stage) source.getScene().getWindow();
	        
	        stage.close();
	        
	        // ******************************************
	    	
	    	Stage primaryStage = new Stage();
	    	
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("pantalla2.fxml"));

			fxmlLoader.setController(this);
			
			Parent root = fxmlLoader.load();
			
			Scene scene = new Scene(root);
			
			primaryStage.setScene(scene);
			
			primaryStage.setTitle("Triqui");
			
			primaryStage.show();
			
			// ******************************************
			
			botonReinicio.setDisable(true);
			
			botonResultados.setDisable(true);
			
			// ******************************************
			
			if(numero % 2 == 0) {
				
				texto.setText(juego.getJugadores().get(0).getNombre());
				
			} else {
				
				texto.setText(juego.getJugadores().get(1).getNombre());
				
			}
			
			// ******************************************
			
		} catch(NullPointerException e1) {
			
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Informacion importante");
			alert.setHeaderText(null);
			alert.setContentText("Por favor digite los datos correspondientes");

			alert.showAndWait();
			
		}
		
	}
	
	// ----------------------------------------------------------------------------
	
	@FXML
    public void uno(ActionEvent event) {
		
		b1.setDisable(true);
		
		numero ++;

		if(numero % 2 == 0) {
			
			texto.setText(juego.getJugadores().get(0).getNombre());
			
			b1.setText("O");
			
		} else {
			
			texto.setText(juego.getJugadores().get(1).getNombre());
			
			b1.setText("X");
			
		}
		
		// ******************************************
		
		if(b1.getText() == b2.getText() && b1.getText() == b3.getText()) {
								
			b1.setDisable(true);
			b2.setDisable(true);
			b3.setDisable(true);
			b4.setDisable(true);
			b5.setDisable(true);
			b6.setDisable(true);
			b7.setDisable(true);
			b8.setDisable(true);
			b9.setDisable(true);
					
			botonReinicio.setDisable(false);
			botonResultados.setDisable(false);
			
			if(b1.getText() == "X") {
				
				juego.getJugadores().get(0).setPartidas(juego.getJugadores().get(0).getPartidas() + 1);
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Felicitaciones");
				alert.setHeaderText(null);
				alert.setContentText(juego.getJugadores().get(0).getNombre() + ", fuiste el ganador");

				alert.showAndWait();
				
			} else {
				
				juego.getJugadores().get(1).setPartidas(juego.getJugadores().get(1).getPartidas() + 1);
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Felicitaciones");
				alert.setHeaderText(null);
				alert.setContentText(juego.getJugadores().get(1).getNombre() + ", fuiste el ganador");

				alert.showAndWait();
				
			}
							
		}
		
		// ******************************************
		
		if(b1.getText() == b4.getText() && b1.getText() == b7.getText()) {
						
			b1.setDisable(true);
			b2.setDisable(true);
			b3.setDisable(true);
			b4.setDisable(true);
			b5.setDisable(true);
			b6.setDisable(true);
			b7.setDisable(true);
			b8.setDisable(true);
			b9.setDisable(true);
					
			botonReinicio.setDisable(false);
			botonResultados.setDisable(false);
			
			if(b1.getText() == "X") {
				
				juego.getJugadores().get(0).setPartidas(juego.getJugadores().get(0).getPartidas() + 1);
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Felicitaciones");
				alert.setHeaderText(null);
				alert.setContentText(juego.getJugadores().get(0).getNombre() + ", fuiste el ganador");

				alert.showAndWait();
				
			} else {
				
				juego.getJugadores().get(1).setPartidas(juego.getJugadores().get(1).getPartidas() + 1);
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Felicitaciones");
				alert.setHeaderText(null);
				alert.setContentText(juego.getJugadores().get(1).getNombre() + ", fuiste el ganador");

				alert.showAndWait();
				
			}
			
		}
		
		// ******************************************
		
		if(b1.getText() == b5.getText() && b1.getText() == b9.getText()) {
			
			b1.setDisable(true);
			b2.setDisable(true);
			b3.setDisable(true);
			b4.setDisable(true);
			b5.setDisable(true);
			b6.setDisable(true);
			b7.setDisable(true);
			b8.setDisable(true);
			b9.setDisable(true);
					
			botonReinicio.setDisable(false);
			botonResultados.setDisable(false);
			
			if(b1.getText() == "X") {
				
				juego.getJugadores().get(0).setPartidas(juego.getJugadores().get(0).getPartidas() + 1);
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Felicitaciones");
				alert.setHeaderText(null);
				alert.setContentText(juego.getJugadores().get(0).getNombre() + ", fuiste el ganador");

				alert.showAndWait();
				
			} else {
				
				juego.getJugadores().get(1).setPartidas(juego.getJugadores().get(1).getPartidas() + 1);
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Felicitaciones");
				alert.setHeaderText(null);
				alert.setContentText(juego.getJugadores().get(1).getNombre() + ", fuiste el ganador");

				alert.showAndWait();
				
			}
			
		}
		
		// ******************************************
		
		if(b1.isDisable() && b2.isDisable() && b3.isDisable()) {
			
			if(b4.isDisable() && b5.isDisable() && b6.isDisable()) {
				
				if(b7.isDisable() && b8.isDisable() && b9.isDisable()) {
					
					if(botonReinicio.isDisable() && botonResultados.isDisable()) {
						
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setTitle("Resultado");
						alert.setHeaderText(null);
						alert.setContentText("Empate");

						alert.showAndWait();
						
						botonReinicio.setDisable(false);
						botonResultados.setDisable(false);
						
					}
					
				}
				
			}
			
		}
				
    }
	
	// ----------------------------------------------------------------------------
	
	@FXML
    public void dos(ActionEvent event) {
		
		b2.setDisable(true);
		
		numero ++;
		
		if(numero % 2 == 0) {
			
			texto.setText(juego.getJugadores().get(0).getNombre());
			
			b2.setText("O");
			
		} else {
			
			texto.setText(juego.getJugadores().get(1).getNombre());
			
			b2.setText("X");
			
		}
		
		// ******************************************
		
		if(b1.getText() == b2.getText() && b1.getText() == b3.getText()) {
										
			b1.setDisable(true);
			b2.setDisable(true);
			b3.setDisable(true);
			b4.setDisable(true);
			b5.setDisable(true);
			b6.setDisable(true);
			b7.setDisable(true);
			b8.setDisable(true);
			b9.setDisable(true);
							
			botonReinicio.setDisable(false);
			botonResultados.setDisable(false);
			
			if(b2.getText() == "X") {
				
				juego.getJugadores().get(0).setPartidas(juego.getJugadores().get(0).getPartidas() + 1);
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Felicitaciones");
				alert.setHeaderText(null);
				alert.setContentText(juego.getJugadores().get(0).getNombre() + ", fuiste el ganador");

				alert.showAndWait();
				
			} else {
				
				juego.getJugadores().get(1).setPartidas(juego.getJugadores().get(1).getPartidas() + 1);
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Felicitaciones");
				alert.setHeaderText(null);
				alert.setContentText(juego.getJugadores().get(1).getNombre() + ", fuiste el ganador");

				alert.showAndWait();
				
			}
									
		}
		
		// ******************************************
		
		if(b2.getText() == b5.getText() && b2.getText() == b8.getText()) {
						
			b1.setDisable(true);
			b2.setDisable(true);
			b3.setDisable(true);
			b4.setDisable(true);
			b5.setDisable(true);
			b6.setDisable(true);
			b7.setDisable(true);
			b8.setDisable(true);
			b9.setDisable(true);
							
			botonReinicio.setDisable(false);
			botonResultados.setDisable(false);
			
			if(b2.getText() == "X") {
				
				juego.getJugadores().get(0).setPartidas(juego.getJugadores().get(0).getPartidas() + 1);
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Felicitaciones");
				alert.setHeaderText(null);
				alert.setContentText(juego.getJugadores().get(0).getNombre() + ", fuiste el ganador");

				alert.showAndWait();
				
			} else {
				
				juego.getJugadores().get(1).setPartidas(juego.getJugadores().get(1).getPartidas() + 1);
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Felicitaciones");
				alert.setHeaderText(null);
				alert.setContentText(juego.getJugadores().get(1).getNombre() + ", fuiste el ganador");

				alert.showAndWait();
				
			}
			
		}
		
		// ******************************************
		
		if(b1.isDisable() && b2.isDisable() && b3.isDisable()) {
			
			if(b4.isDisable() && b5.isDisable() && b6.isDisable()) {
				
				if(b7.isDisable() && b8.isDisable() && b9.isDisable()) {
					
					if(botonReinicio.isDisable() && botonResultados.isDisable()) {
						
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setTitle("Resultado");
						alert.setHeaderText(null);
						alert.setContentText("Empate");

						alert.showAndWait();
						
						botonReinicio.setDisable(false);
						botonResultados.setDisable(false);
						
					}
					
				}
				
			}
			
		}
				
    }
	
	// ----------------------------------------------------------------------------
	
	@FXML
    public void tres(ActionEvent event) {
		
		b3.setDisable(true);
		
		numero ++;

		if(numero % 2 == 0) {
			
			texto.setText(juego.getJugadores().get(0).getNombre());
			
			b3.setText("O");
			
		} else {
			
			texto.setText(juego.getJugadores().get(1).getNombre());
			
			b3.setText("X");
			
		}
		
		// ******************************************
		
		if(b1.getText() == b2.getText() && b1.getText() == b3.getText()) {
										
			b1.setDisable(true);
			b2.setDisable(true);
			b3.setDisable(true);
			b4.setDisable(true);
			b5.setDisable(true);
			b6.setDisable(true);
			b7.setDisable(true);
			b8.setDisable(true);
			b9.setDisable(true);
							
			botonReinicio.setDisable(false);
			botonResultados.setDisable(false);
			
			if(b3.getText() == "X") {
				
				juego.getJugadores().get(0).setPartidas(juego.getJugadores().get(0).getPartidas() + 1);
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Felicitaciones");
				alert.setHeaderText(null);
				alert.setContentText(juego.getJugadores().get(0).getNombre() + ", fuiste el ganador");

				alert.showAndWait();
				
			} else {
				
				juego.getJugadores().get(1).setPartidas(juego.getJugadores().get(1).getPartidas() + 1);
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Felicitaciones");
				alert.setHeaderText(null);
				alert.setContentText(juego.getJugadores().get(1).getNombre() + ", fuiste el ganador");

				alert.showAndWait();
				
			}
									
		}
		
		// ******************************************
		
		if(b3.getText() == b6.getText() && b3.getText() == b9.getText()) {
						
			b1.setDisable(true);
			b2.setDisable(true);
			b3.setDisable(true);
			b4.setDisable(true);
			b5.setDisable(true);
			b6.setDisable(true);
			b7.setDisable(true);
			b8.setDisable(true);
			b9.setDisable(true);
							
			botonReinicio.setDisable(false);
			botonResultados.setDisable(false);
			
			if(b3.getText() == "X") {
				
				juego.getJugadores().get(0).setPartidas(juego.getJugadores().get(0).getPartidas() + 1);
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Felicitaciones");
				alert.setHeaderText(null);
				alert.setContentText(juego.getJugadores().get(0).getNombre() + ", fuiste el ganador");

				alert.showAndWait();
				
			} else {
				
				juego.getJugadores().get(1).setPartidas(juego.getJugadores().get(1).getPartidas() + 1);
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Felicitaciones");
				alert.setHeaderText(null);
				alert.setContentText(juego.getJugadores().get(1).getNombre() + ", fuiste el ganador");

				alert.showAndWait();
				
			}
			
		}

		// ******************************************
		
		if(b3.getText() == b5.getText() && b3.getText() == b7.getText()) {
						
			b1.setDisable(true);
			b2.setDisable(true);
			b3.setDisable(true);
			b4.setDisable(true);
			b5.setDisable(true);
			b6.setDisable(true);
			b7.setDisable(true);
			b8.setDisable(true);
			b9.setDisable(true);
							
			botonReinicio.setDisable(false);
			botonResultados.setDisable(false);
			
			if(b3.getText() == "X") {
				
				juego.getJugadores().get(0).setPartidas(juego.getJugadores().get(0).getPartidas() + 1);
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Felicitaciones");
				alert.setHeaderText(null);
				alert.setContentText(juego.getJugadores().get(0).getNombre() + ", fuiste el ganador");

				alert.showAndWait();
				
			} else {
				
				juego.getJugadores().get(1).setPartidas(juego.getJugadores().get(1).getPartidas() + 1);
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Felicitaciones");
				alert.setHeaderText(null);
				alert.setContentText(juego.getJugadores().get(1).getNombre() + ", fuiste el ganador");

				alert.showAndWait();
				
			}
			
		}
		
		// ******************************************
		
		if(b1.isDisable() && b2.isDisable() && b3.isDisable()) {
			
			if(b4.isDisable() && b5.isDisable() && b6.isDisable()) {
				
				if(b7.isDisable() && b8.isDisable() && b9.isDisable()) {
					
					if(botonReinicio.isDisable() && botonResultados.isDisable()) {
						
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setTitle("Resultado");
						alert.setHeaderText(null);
						alert.setContentText("Empate");

						alert.showAndWait();
						
						botonReinicio.setDisable(false);
						botonResultados.setDisable(false);
						
					}
					
				}
				
			}
			
		}
				
    }
	
	// ----------------------------------------------------------------------------
	
	@FXML
    public void cuatro(ActionEvent event) {
		
		b4.setDisable(true);
		
		numero ++;

		if(numero % 2 == 0) {
			
			texto.setText(juego.getJugadores().get(0).getNombre());
			
			b4.setText("O");
			
		} else {
			
			texto.setText(juego.getJugadores().get(1).getNombre());
			
			b4.setText("X");
			
		}
		
		// ******************************************
		
		if(b4.getText() == b5.getText() && b4.getText() == b6.getText()) {
						
			b1.setDisable(true);
			b2.setDisable(true);
			b3.setDisable(true);
			b4.setDisable(true);
			b5.setDisable(true);
			b6.setDisable(true);
			b7.setDisable(true);
			b8.setDisable(true);
			b9.setDisable(true);
					
			botonReinicio.setDisable(false);
			botonResultados.setDisable(false);
			
			if(b4.getText() == "X") {
				
				juego.getJugadores().get(0).setPartidas(juego.getJugadores().get(0).getPartidas() + 1);
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Felicitaciones");
				alert.setHeaderText(null);
				alert.setContentText(juego.getJugadores().get(0).getNombre() + ", fuiste el ganador");

				alert.showAndWait();
				
			} else {
				
				juego.getJugadores().get(1).setPartidas(juego.getJugadores().get(1).getPartidas() + 1);
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Felicitaciones");
				alert.setHeaderText(null);
				alert.setContentText(juego.getJugadores().get(1).getNombre() + ", fuiste el ganador");

				alert.showAndWait();
				
			}
			
		}
		
		// ******************************************
		
		if(b1.getText() == b4.getText() && b1.getText() == b7.getText()) {
						
			b1.setDisable(true);
			b2.setDisable(true);
			b3.setDisable(true);
			b4.setDisable(true);
			b5.setDisable(true);
			b6.setDisable(true);
			b7.setDisable(true);
			b8.setDisable(true);
			b9.setDisable(true);
					
			botonReinicio.setDisable(false);
			botonResultados.setDisable(false);
			
			if(b4.getText() == "X") {
				
				juego.getJugadores().get(0).setPartidas(juego.getJugadores().get(0).getPartidas() + 1);
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Felicitaciones");
				alert.setHeaderText(null);
				alert.setContentText(juego.getJugadores().get(0).getNombre() + ", fuiste el ganador");

				alert.showAndWait();
				
			} else {
				
				juego.getJugadores().get(1).setPartidas(juego.getJugadores().get(1).getPartidas() + 1);
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Felicitaciones");
				alert.setHeaderText(null);
				alert.setContentText(juego.getJugadores().get(1).getNombre() + ", fuiste el ganador");

				alert.showAndWait();
				
			}
			
		}
		
		// ******************************************
		
		if(b1.isDisable() && b2.isDisable() && b3.isDisable()) {
			
			if(b4.isDisable() && b5.isDisable() && b6.isDisable()) {
				
				if(b7.isDisable() && b8.isDisable() && b9.isDisable()) {
					
					if(botonReinicio.isDisable() && botonResultados.isDisable()) {
						
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setTitle("Resultado");
						alert.setHeaderText(null);
						alert.setContentText("Empate");

						alert.showAndWait();
						
						botonReinicio.setDisable(false);
						botonResultados.setDisable(false);
						
					}
					
				}
				
			}
			
		}
		
    }
	
	// ----------------------------------------------------------------------------
	
	@FXML
    public void cinco(ActionEvent event) {
		
		b5.setDisable(true);
		
		numero ++;

		if(numero % 2 == 0) {
			
			texto.setText(juego.getJugadores().get(0).getNombre());
			
			b5.setText("O");
			
		} else {
			
			texto.setText(juego.getJugadores().get(1).getNombre());
			
			b5.setText("X");
			
		}
		
		// ******************************************
		
		if(b4.getText() == b5.getText() && b4.getText() == b6.getText()) {
								
			b1.setDisable(true);
			b2.setDisable(true);
			b3.setDisable(true);
			b4.setDisable(true);
			b5.setDisable(true);
			b6.setDisable(true);
			b7.setDisable(true);
			b8.setDisable(true);
			b9.setDisable(true);
							
			botonReinicio.setDisable(false);
			botonResultados.setDisable(false);
			
			if(b5.getText() == "X") {
				
				juego.getJugadores().get(0).setPartidas(juego.getJugadores().get(0).getPartidas() + 1);
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Felicitaciones");
				alert.setHeaderText(null);
				alert.setContentText(juego.getJugadores().get(0).getNombre() + ", fuiste el ganador");

				alert.showAndWait();
				
			} else {
				
				juego.getJugadores().get(1).setPartidas(juego.getJugadores().get(1).getPartidas() + 1);
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Felicitaciones");
				alert.setHeaderText(null);
				alert.setContentText(juego.getJugadores().get(1).getNombre() + ", fuiste el ganador");

				alert.showAndWait();
				
			}
					
		}
		
		// ******************************************
		
		if(b2.getText() == b5.getText() && b2.getText() == b8.getText()) {
						
			b1.setDisable(true);
			b2.setDisable(true);
			b3.setDisable(true);
			b4.setDisable(true);
			b5.setDisable(true);
			b6.setDisable(true);
			b7.setDisable(true);
			b8.setDisable(true);
			b9.setDisable(true);
							
			botonReinicio.setDisable(false);
			botonResultados.setDisable(false);
			
			if(b5.getText() == "X") {
				
				juego.getJugadores().get(0).setPartidas(juego.getJugadores().get(0).getPartidas() + 1);
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Felicitaciones");
				alert.setHeaderText(null);
				alert.setContentText(juego.getJugadores().get(0).getNombre() + ", fuiste el ganador");

				alert.showAndWait();
				
			} else {
				
				juego.getJugadores().get(1).setPartidas(juego.getJugadores().get(1).getPartidas() + 1);
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Felicitaciones");
				alert.setHeaderText(null);
				alert.setContentText(juego.getJugadores().get(1).getNombre() + ", fuiste el ganador");

				alert.showAndWait();
				
			}
			
		}
		
		// ******************************************
		
		if(b1.getText() == b5.getText() && b1.getText() == b9.getText()) {
								
			b1.setDisable(true);
			b2.setDisable(true);
			b3.setDisable(true);
			b4.setDisable(true);
			b5.setDisable(true);
			b6.setDisable(true);
			b7.setDisable(true);
			b8.setDisable(true);
			b9.setDisable(true);
							
			botonReinicio.setDisable(false);
			botonResultados.setDisable(false);
			
			if(b5.getText() == "X") {
				
				juego.getJugadores().get(0).setPartidas(juego.getJugadores().get(0).getPartidas() + 1);
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Felicitaciones");
				alert.setHeaderText(null);
				alert.setContentText(juego.getJugadores().get(0).getNombre() + ", fuiste el ganador");

				alert.showAndWait();
				
			} else {
				
				juego.getJugadores().get(1).setPartidas(juego.getJugadores().get(1).getPartidas() + 1);
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Felicitaciones");
				alert.setHeaderText(null);
				alert.setContentText(juego.getJugadores().get(1).getNombre() + ", fuiste el ganador");

				alert.showAndWait();
				
			}
					
		}
		
		// ******************************************
		
		if(b3.getText() == b5.getText() && b3.getText() == b7.getText()) {
								
			b1.setDisable(true);
			b2.setDisable(true);
			b3.setDisable(true);
			b4.setDisable(true);
			b5.setDisable(true);
			b6.setDisable(true);
			b7.setDisable(true);
			b8.setDisable(true);
			b9.setDisable(true);
									
			botonReinicio.setDisable(false);
			botonResultados.setDisable(false);
			
			if(b5.getText() == "X") {
				
				juego.getJugadores().get(0).setPartidas(juego.getJugadores().get(0).getPartidas() + 1);
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Felicitaciones");
				alert.setHeaderText(null);
				alert.setContentText(juego.getJugadores().get(0).getNombre() + ", fuiste el ganador");

				alert.showAndWait();
				
			} else {
				
				juego.getJugadores().get(1).setPartidas(juego.getJugadores().get(1).getPartidas() + 1);
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Felicitaciones");
				alert.setHeaderText(null);
				alert.setContentText(juego.getJugadores().get(1).getNombre() + ", fuiste el ganador");

				alert.showAndWait();
				
			}
					
		}
		
		// ******************************************
		
		if(b1.isDisable() && b2.isDisable() && b3.isDisable()) {
			
			if(b4.isDisable() && b5.isDisable() && b6.isDisable()) {
				
				if(b7.isDisable() && b8.isDisable() && b9.isDisable()) {
					
					if(botonReinicio.isDisable() && botonResultados.isDisable()) {
						
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setTitle("Resultado");
						alert.setHeaderText(null);
						alert.setContentText("Empate");

						alert.showAndWait();
						
						botonReinicio.setDisable(false);
						botonResultados.setDisable(false);
						
					}
					
				}
				
			}
			
		}
		
    }
	
	// ----------------------------------------------------------------------------
	
	@FXML
    public void seis(ActionEvent event) {
		
		b6.setDisable(true);
		
		numero ++;

		if(numero % 2 == 0) {
			
			texto.setText(juego.getJugadores().get(0).getNombre());
			
			b6.setText("O");
			
		} else {
			
			texto.setText(juego.getJugadores().get(1).getNombre());
			
			b6.setText("X");
			
		}
		
		// ******************************************
		
		if(b4.getText() == b5.getText() && b4.getText() == b6.getText()) {
								
			b1.setDisable(true);
			b2.setDisable(true);
			b3.setDisable(true);
			b4.setDisable(true);
			b5.setDisable(true);
			b6.setDisable(true);
			b7.setDisable(true);
			b8.setDisable(true);
			b9.setDisable(true);
									
			botonReinicio.setDisable(false);
			botonResultados.setDisable(false);
			
			if(b6.getText() == "X") {
				
				juego.getJugadores().get(0).setPartidas(juego.getJugadores().get(0).getPartidas() + 1);
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Felicitaciones");
				alert.setHeaderText(null);
				alert.setContentText(juego.getJugadores().get(0).getNombre() + ", fuiste el ganador");

				alert.showAndWait();
				
			} else {
				
				juego.getJugadores().get(1).setPartidas(juego.getJugadores().get(1).getPartidas() + 1);
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Felicitaciones");
				alert.setHeaderText(null);
				alert.setContentText(juego.getJugadores().get(1).getNombre() + ", fuiste el ganador");

				alert.showAndWait();
				
			}
							
		}
		
		// ******************************************
		
		if(b3.getText() == b6.getText() && b3.getText() == b9.getText()) {
						
			b1.setDisable(true);
			b2.setDisable(true);
			b3.setDisable(true);
			b4.setDisable(true);
			b5.setDisable(true);
			b6.setDisable(true);
			b7.setDisable(true);
			b8.setDisable(true);
			b9.setDisable(true);
							
			botonReinicio.setDisable(false);
			botonResultados.setDisable(false);
			
			if(b6.getText() == "X") {
				
				juego.getJugadores().get(0).setPartidas(juego.getJugadores().get(0).getPartidas() + 1);
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Felicitaciones");
				alert.setHeaderText(null);
				alert.setContentText(juego.getJugadores().get(0).getNombre() + ", fuiste el ganador");

				alert.showAndWait();
				
			} else {
				
				juego.getJugadores().get(1).setPartidas(juego.getJugadores().get(1).getPartidas() + 1);
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Felicitaciones");
				alert.setHeaderText(null);
				alert.setContentText(juego.getJugadores().get(1).getNombre() + ", fuiste el ganador");

				alert.showAndWait();
				
			}
			
		}
		
		// ******************************************
		
		if(b1.isDisable() && b2.isDisable() && b3.isDisable()) {
			
			if(b4.isDisable() && b5.isDisable() && b6.isDisable()) {
				
				if(b7.isDisable() && b8.isDisable() && b9.isDisable()) {
					
					if(botonReinicio.isDisable() && botonResultados.isDisable()) {
						
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setTitle("Resultado");
						alert.setHeaderText(null);
						alert.setContentText("Empate");

						alert.showAndWait();
						
						botonReinicio.setDisable(false);
						botonResultados.setDisable(false);
						
					}
					
				}
				
			}
			
		}
		
    }
	
	// ----------------------------------------------------------------------------
	
	@FXML
    public void siete(ActionEvent event) {
		
		b7.setDisable(true);
		
		numero ++;

		if(numero % 2 == 0) {
			
			texto.setText(juego.getJugadores().get(0).getNombre());
			
			b7.setText("O");
			
		} else {
			
			texto.setText(juego.getJugadores().get(1).getNombre());
			
			b7.setText("X");
			
		}
		
		// ******************************************
		
		if(b7.getText() == b8.getText() && b7.getText() == b9.getText()) {
			
			b1.setDisable(true);
			b2.setDisable(true);
			b3.setDisable(true);
			b4.setDisable(true);
			b5.setDisable(true);
			b6.setDisable(true);
			b7.setDisable(true);
			b8.setDisable(true);
			b9.setDisable(true);
					
			botonReinicio.setDisable(false);
			botonResultados.setDisable(false);
			
			if(b7.getText() == "X") {
				
				juego.getJugadores().get(0).setPartidas(juego.getJugadores().get(0).getPartidas() + 1);
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Felicitaciones");
				alert.setHeaderText(null);
				alert.setContentText(juego.getJugadores().get(0).getNombre() + ", fuiste el ganador");

				alert.showAndWait();
				
			} else {
				
				juego.getJugadores().get(1).setPartidas(juego.getJugadores().get(1).getPartidas() + 1);
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Felicitaciones");
				alert.setHeaderText(null);
				alert.setContentText(juego.getJugadores().get(1).getNombre() + ", fuiste el ganador");

				alert.showAndWait();
				
			}
			
		}
		
		// ******************************************
		
		if(b1.getText() == b4.getText() && b1.getText() == b7.getText()) {
						
			b1.setDisable(true);
			b2.setDisable(true);
			b3.setDisable(true);
			b4.setDisable(true);
			b5.setDisable(true);
			b6.setDisable(true);
			b7.setDisable(true);
			b8.setDisable(true);
			b9.setDisable(true);
					
			botonReinicio.setDisable(false);
			botonResultados.setDisable(false);
			
			if(b7.getText() == "X") {
				
				juego.getJugadores().get(0).setPartidas(juego.getJugadores().get(0).getPartidas() + 1);
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Felicitaciones");
				alert.setHeaderText(null);
				alert.setContentText(juego.getJugadores().get(0).getNombre() + ", fuiste el ganador");

				alert.showAndWait();
				
			} else {
				
				juego.getJugadores().get(1).setPartidas(juego.getJugadores().get(1).getPartidas() + 1);
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Felicitaciones");
				alert.setHeaderText(null);
				alert.setContentText(juego.getJugadores().get(1).getNombre() + ", fuiste el ganador");

				alert.showAndWait();
				
			}
			
		}
		
		// ******************************************
		
		if(b3.getText() == b5.getText() && b3.getText() == b7.getText()) {
								
			b1.setDisable(true);
			b2.setDisable(true);
			b3.setDisable(true);
			b4.setDisable(true);
			b5.setDisable(true);
			b6.setDisable(true);
			b7.setDisable(true);
			b8.setDisable(true);
			b9.setDisable(true);
									
			botonReinicio.setDisable(false);
			botonResultados.setDisable(false);
			
			if(b7.getText() == "X") {
				
				juego.getJugadores().get(0).setPartidas(juego.getJugadores().get(0).getPartidas() + 1);
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Felicitaciones");
				alert.setHeaderText(null);
				alert.setContentText(juego.getJugadores().get(0).getNombre() + ", fuiste el ganador");

				alert.showAndWait();
				
			} else {
				
				juego.getJugadores().get(1).setPartidas(juego.getJugadores().get(1).getPartidas() + 1);
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Felicitaciones");
				alert.setHeaderText(null);
				alert.setContentText(juego.getJugadores().get(1).getNombre() + ", fuiste el ganador");

				alert.showAndWait();
				
			}
					
		}
		
		// ******************************************
		
		if(b1.isDisable() && b2.isDisable() && b3.isDisable()) {
			
			if(b4.isDisable() && b5.isDisable() && b6.isDisable()) {
				
				if(b7.isDisable() && b8.isDisable() && b9.isDisable()) {
					
					if(botonReinicio.isDisable() && botonResultados.isDisable()) {
						
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setTitle("Resultado");
						alert.setHeaderText(null);
						alert.setContentText("Empate");

						alert.showAndWait();
						
						botonReinicio.setDisable(false);
						botonResultados.setDisable(false);
						
					}
					
				}
				
			}
			
		}
		
    }
	
	// ----------------------------------------------------------------------------
	
	@FXML
    public void ocho(ActionEvent event) {
		
		b8.setDisable(true);
		
		numero ++;

		if(numero % 2 == 0) {
			
			texto.setText(juego.getJugadores().get(0).getNombre());
			
			b8.setText("O");
			
		} else {
			
			texto.setText(juego.getJugadores().get(1).getNombre());
			
			b8.setText("X");
			
		}
		
		// ******************************************
		
		if(b7.getText() == b8.getText() && b7.getText() == b9.getText()) {
						
			b1.setDisable(true);
			b2.setDisable(true);
			b3.setDisable(true);
			b4.setDisable(true);
			b5.setDisable(true);
			b6.setDisable(true);
			b7.setDisable(true);
			b8.setDisable(true);
			b9.setDisable(true);
					
			botonReinicio.setDisable(false);
			botonResultados.setDisable(false);
			
			if(b8.getText() == "X") {
				
				juego.getJugadores().get(0).setPartidas(juego.getJugadores().get(0).getPartidas() + 1);
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Felicitaciones");
				alert.setHeaderText(null);
				alert.setContentText(juego.getJugadores().get(0).getNombre() + ", fuiste el ganador");

				alert.showAndWait();
				
			} else {
				
				juego.getJugadores().get(1).setPartidas(juego.getJugadores().get(1).getPartidas() + 1);
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Felicitaciones");
				alert.setHeaderText(null);
				alert.setContentText(juego.getJugadores().get(1).getNombre() + ", fuiste el ganador");

				alert.showAndWait();
				
			}
			
		}
		
		// ******************************************
		
		if(b2.getText() == b5.getText() && b2.getText() == b8.getText()) {
						
			b1.setDisable(true);
			b2.setDisable(true);
			b3.setDisable(true);
			b4.setDisable(true);
			b5.setDisable(true);
			b6.setDisable(true);
			b7.setDisable(true);
			b8.setDisable(true);
			b9.setDisable(true);
							
			botonReinicio.setDisable(false);
			botonResultados.setDisable(false);
			
			if(b8.getText() == "X") {
				
				juego.getJugadores().get(0).setPartidas(juego.getJugadores().get(0).getPartidas() + 1);
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Felicitaciones");
				alert.setHeaderText(null);
				alert.setContentText(juego.getJugadores().get(0).getNombre() + ", fuiste el ganador");

				alert.showAndWait();
				
			} else {
				
				juego.getJugadores().get(1).setPartidas(juego.getJugadores().get(1).getPartidas() + 1);
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Felicitaciones");
				alert.setHeaderText(null);
				alert.setContentText(juego.getJugadores().get(1).getNombre() + ", fuiste el ganador");

				alert.showAndWait();
				
			}
			
		}
		
		// ******************************************
		
		if(b1.isDisable() && b2.isDisable() && b3.isDisable()) {
			
			if(b4.isDisable() && b5.isDisable() && b6.isDisable()) {
				
				if(b7.isDisable() && b8.isDisable() && b9.isDisable()) {
					
					if(botonReinicio.isDisable() && botonResultados.isDisable()) {
						
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setTitle("Resultado");
						alert.setHeaderText(null);
						alert.setContentText("Empate");

						alert.showAndWait();
						
						botonReinicio.setDisable(false);
						botonResultados.setDisable(false);
						
					}
					
				}
				
			}
			
		}

    }
	
	// ----------------------------------------------------------------------------

    @FXML
    public void nueve(ActionEvent event) {
    	
    	b9.setDisable(true);
    	
    	numero ++;

		if(numero % 2 == 0) {
			
			texto.setText(juego.getJugadores().get(0).getNombre());
			
			b9.setText("O");
			
		} else {
			
			texto.setText(juego.getJugadores().get(1).getNombre());
			
			b9.setText("X");
			
		}
		
		// ******************************************
		
		if(b7.getText() == b8.getText() && b7.getText() == b9.getText()) {
						
			b1.setDisable(true);
			b2.setDisable(true);
			b3.setDisable(true);
			b4.setDisable(true);
			b5.setDisable(true);
			b6.setDisable(true);
			b7.setDisable(true);
			b8.setDisable(true);
			b9.setDisable(true);
					
			botonReinicio.setDisable(false);
			botonResultados.setDisable(false);
			
			if(b9.getText() == "X") {
				
				juego.getJugadores().get(0).setPartidas(juego.getJugadores().get(0).getPartidas() + 1);
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Felicitaciones");
				alert.setHeaderText(null);
				alert.setContentText(juego.getJugadores().get(0).getNombre() + ", fuiste el ganador");

				alert.showAndWait();
				
			} else {
				
				juego.getJugadores().get(1).setPartidas(juego.getJugadores().get(1).getPartidas() + 1);
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Felicitaciones");
				alert.setHeaderText(null);
				alert.setContentText(juego.getJugadores().get(1).getNombre() + ", fuiste el ganador");

				alert.showAndWait();
				
			}
			
		}
		
		if(b3.getText() == b6.getText() && b3.getText() == b9.getText()) {
						
			b1.setDisable(true);
			b2.setDisable(true);
			b3.setDisable(true);
			b4.setDisable(true);
			b5.setDisable(true);
			b6.setDisable(true);
			b7.setDisable(true);
			b8.setDisable(true);
			b9.setDisable(true);
							
			botonReinicio.setDisable(false);
			botonResultados.setDisable(false);
			
			if(b9.getText() == "X") {
				
				juego.getJugadores().get(0).setPartidas(juego.getJugadores().get(0).getPartidas() + 1);
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Felicitaciones");
				alert.setHeaderText(null);
				alert.setContentText(juego.getJugadores().get(0).getNombre() + ", fuiste el ganador");

				alert.showAndWait();
				
			} else {
				
				juego.getJugadores().get(1).setPartidas(juego.getJugadores().get(1).getPartidas() + 1);
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Felicitaciones");
				alert.setHeaderText(null);
				alert.setContentText(juego.getJugadores().get(1).getNombre() + ", fuiste el ganador");

				alert.showAndWait();
				
			}
			
		}
		
		// ******************************************
		
		if(b1.getText() == b5.getText() && b1.getText() == b9.getText()) {
								
			b1.setDisable(true);
			b2.setDisable(true);
			b3.setDisable(true);
			b4.setDisable(true);
			b5.setDisable(true);
			b6.setDisable(true);
			b7.setDisable(true);
			b8.setDisable(true);
			b9.setDisable(true);
							
			botonReinicio.setDisable(false);
			botonResultados.setDisable(false);
			
			if(b9.getText() == "X") {
				
				juego.getJugadores().get(0).setPartidas(juego.getJugadores().get(0).getPartidas() + 1);
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Felicitaciones");
				alert.setHeaderText(null);
				alert.setContentText(juego.getJugadores().get(0).getNombre() + ", fuiste el ganador");

				alert.showAndWait();
				
			} else {
				
				juego.getJugadores().get(1).setPartidas(juego.getJugadores().get(1).getPartidas() + 1);
				
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Felicitaciones");
				alert.setHeaderText(null);
				alert.setContentText(juego.getJugadores().get(1).getNombre() + ", fuiste el ganador");

				alert.showAndWait();
				
			}
					
		}
		
		// ******************************************
		
		if(b1.isDisable() && b2.isDisable() && b3.isDisable()) {
			
			if(b4.isDisable() && b5.isDisable() && b6.isDisable()) {
				
				if(b7.isDisable() && b8.isDisable() && b9.isDisable()) {
					
					if(botonReinicio.isDisable() && botonResultados.isDisable()) {
						
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setTitle("Resultado");
						alert.setHeaderText(null);
						alert.setContentText("Empate");

						alert.showAndWait();
						
						botonReinicio.setDisable(false);
						botonResultados.setDisable(false);
						
					}
					
				}
				
			}
			
		}
		
    }
    
    // ----------------------------------------------------------------------------

    @FXML
    public void reinicio(ActionEvent event) throws IOException {
    	
    	Node source = (Node) event.getSource();
    	
        Stage stage = (Stage) source.getScene().getWindow();
        
        stage.close();
        
        // ******************************************
    	
    	Stage primaryStage = new Stage();
    	
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("pantalla2.fxml"));

		fxmlLoader.setController(this);
		
		Parent root = fxmlLoader.load();
		
		Scene scene = new Scene(root);
		
		primaryStage.setScene(scene);
		
		primaryStage.setTitle("Triqui");
		
		primaryStage.show();
		
		// ******************************************
		
		botonReinicio.setDisable(true);
		
		botonResultados.setDisable(true);
		
		// ******************************************
		
		numero = 2;
		
		// ******************************************
		
		if(numero % 2 == 0) {
						
			texto.setText(juego.getJugadores().get(0).getNombre());
						
		} else {
						
			texto.setText(juego.getJugadores().get(1).getNombre());
						
		}
    	
    }
    
    // ----------------------------------------------------------------------------
    
    @FXML
    public void resultados(ActionEvent event) throws IOException {
    	
    	Node source = (Node) event.getSource();
    	
        Stage stage = (Stage) source.getScene().getWindow();
        
        stage.close();
        
        // ******************************************
    	
    	Stage primaryStage = new Stage();
    	
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("pantalla3.fxml"));

		fxmlLoader.setController(this);
		
		Parent root = fxmlLoader.load();
		
		Scene scene = new Scene(root);
		
		primaryStage.setScene(scene);
		
		primaryStage.setTitle("Triqui");
		
		iniciarTabla();
		
		primaryStage.show();
		
    }
    
    // ----------------------------------------------------------------------------
    
    public void iniciarTabla() {
    	
    	juego.ordenar();
    	
    	ObservableList<Jugador> observableList;
    	
    	observableList = FXCollections.observableArrayList(juego.getJugadores());
    	
		tabla.setItems(observableList);
		
		nombre.setCellValueFactory(new PropertyValueFactory<Jugador,String>("nombre")); 
		
		partidas.setCellValueFactory(new PropertyValueFactory<Jugador,Integer>("partidas"));
    	
    }
    
    // ----------------------------------------------------------------------------
    
    @FXML
    public void nuevo(ActionEvent event) throws IOException {
    	
    	juego.getJugadores().clear();
    	
    	// ******************************************
    	
    	Node source = (Node) event.getSource();
    	
        Stage stage = (Stage) source.getScene().getWindow();
        
        stage.close();
        
        // ******************************************
    	
    	Stage primaryStage = new Stage();
    	
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("pantalla1.fxml"));

		fxmlLoader.setController(this);
		
		Parent root = fxmlLoader.load();
		
		Scene scene = new Scene(root);
		
		primaryStage.setScene(scene);
		
		primaryStage.setTitle("Triqui");
		
		primaryStage.show();
		
		numero = 2;

    }
    
    // ----------------------------------------------------------------------------

    @FXML
    public void partida(ActionEvent event) throws IOException {
    	
    	Node source = (Node) event.getSource();
    	
        Stage stage = (Stage) source.getScene().getWindow();
        
        stage.close();
        
        // ******************************************
    	
    	Stage primaryStage = new Stage();
    	
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("pantalla2.fxml"));

		fxmlLoader.setController(this);
		
		Parent root = fxmlLoader.load();
		
		Scene scene = new Scene(root);
		
		primaryStage.setScene(scene);
		
		primaryStage.setTitle("Triqui");
		
		primaryStage.show();
		
		// ******************************************
		
		botonReinicio.setDisable(true);
		
		botonResultados.setDisable(true);
		
		// ******************************************
		
		numero = 2;
		
		if(numero % 2 == 0) {
			
			texto.setText(juego.getJugadores().get(0).getNombre());
						
		} else {
						
			texto.setText(juego.getJugadores().get(1).getNombre());
						
		}

    }
    
    // ----------------------------------------------------------------------------

}
