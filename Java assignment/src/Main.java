import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PetSelector extends JFrame implements ActionListener {
    private JLabel petImageLabel;

    public PetSelector() {
        setTitle("Pet Selector");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(6, 1));

        // Title label
        JLabel titleLabel = new JLabel("Select a pet:");
        panel.add(titleLabel);

        // Radio buttons for pet selection
        JRadioButton birdButton = new JRadioButton("Bird");
        JRadioButton catButton = new JRadioButton("Cat");
        JRadioButton dogButton = new JRadioButton("Dog");
        JRadioButton rabbitButton = new JRadioButton("Rabbit");
        JRadioButton pigButton = new JRadioButton("Pig");

        // Grouping radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(birdButton);
        group.add(catButton);
        group.add(dogButton);
        group.add(rabbitButton);
        group.add(pigButton);

        // Add action listeners to radio buttons
        birdButton.addActionListener(this);
        catButton.addActionListener(this);
        dogButton.addActionListener(this);
        rabbitButton.addActionListener(this);
        pigButton.addActionListener(this);

        // Add radio buttons to panel
        panel.add(birdButton);
        panel.add(catButton);
        panel.add(dogButton);
        panel.add(rabbitButton);
        panel.add(pigButton);

        // Label to display pet image
        petImageLabel = new JLabel();
        panel.add(petImageLabel);

        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Mapping pet names to image file names
        String imageName = "";
        switch (e.getActionCommand()) {
            case "Bird":
                imageName = "bird.jpg";
                break;
            case "Cat":
                imageName = "cat.jpg";
                break;
            case "Dog":
                imageName = "dog.jpg";
                break;
            case "Rabbit":
                imageName = "rabbit.jpg";
                break;
            case "Pig":
                imageName = "pig.jpg";
                break;
        }

        // Displaying the selected pet image
        ImageIcon icon = new ImageIcon(getClass().getResource(imageName));
        petImageLabel.setIcon(icon);
    }

    public static void main(String[] args) {
        new PetSelector();
    }
}
