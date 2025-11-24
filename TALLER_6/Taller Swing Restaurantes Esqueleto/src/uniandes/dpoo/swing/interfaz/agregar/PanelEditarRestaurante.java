package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PanelEditarRestaurante extends JPanel
{
    /**
     * El campo para que el usuario ingrese el nombre del restaurante
     */
    private JTextField txtNombre;

    /**
     * Un selector (JComboBox) para que el usuario seleccione la calificación (1 a 5) del restaurante
     */
    private JComboBox<String> cbbCalificacion;

    /**
     * Un selector (JComboBox) para que el usuario indique si ya visitó el restaurante o no
     */
    private JComboBox<String> cbbVisitado;

    public PanelEditarRestaurante( )
    {
    	
    	this.setLayout( new GridLayout( 3, 1 ) );

        // Crea el campo para el nombre con una etiqueta al frente
    	JPanel panelNombre = new JPanel( new FlowLayout( FlowLayout.LEFT ) );
        panelNombre.add( new JLabel( "Nombre del restaurant: " ) );
        txtNombre = new JTextField(20);      
        panelNombre.add( txtNombre );
    	
    	
    	
        // Crea el selector para la calificación con una etiqueta al frente
        JPanel panelCalificacion = new JPanel( new FlowLayout( FlowLayout.LEFT ) );
        panelCalificacion.add( new JLabel( "Puntaje: " ) );

        cbbCalificacion = new JComboBox<>();
        
        

        cbbCalificacion.addItem("1");
        cbbCalificacion.addItem("2");
        cbbCalificacion.addItem("3");
        cbbCalificacion.addItem("4");
        cbbCalificacion.addItem("5");
        
        panelCalificacion.add( cbbCalificacion );
        
        
        
        // Crea el selector para indicar si ya ha sido visitado, con una etiqueta al frente
        JPanel panelVisitado = new JPanel( new FlowLayout( FlowLayout.LEFT ) );
        panelVisitado.add( new JLabel( "¿Visitado?: " ) );
        cbbVisitado = new JComboBox<>();
        
        cbbVisitado.addItem("YES");
        cbbVisitado.addItem("NO");

        
        panelVisitado.add( cbbVisitado );
        
        
        // Agregar todos los elementos al panel
        this.add( panelNombre );
        this.add( panelCalificacion );
        this.add( panelVisitado );
    }

    /**
     * Indica si en el selector se seleccionó la opción que dice que el restaurante fue visitado
     * @return
     */
    public boolean getVisitado( )
    {
    	
    	
    	 String opcion = (String) cbbVisitado.getSelectedItem();
         return opcion.equals( "YES" );
    }
    




    /**
     * Indica la calificación marcada en el selector
     * @return
     */
    public int getCalificacion( )
    {
        String calif = ( String )cbbCalificacion.getSelectedItem( );
        return Integer.parseInt( calif );
    }

    /**
     * Indica el nombre digitado para el restaurante
     * @return
     */
    public String getNombre( )
    {
        return txtNombre.getText();

    }
}
