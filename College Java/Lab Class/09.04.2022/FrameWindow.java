import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameWindow extends JFrame{
    private JLabel label;
    public FrameWindow()
    {
        label = new JLabel("Frame Window");
        label.setBounds(100,100,100,30);
        add(label);
        setLayout(null);
        setSize(300, 300);
        setTitle("Frame Window");
        setVisible(true);
        show();

    }
    public static void main(String[] args) {
        new FrameWindow();
    }
}
