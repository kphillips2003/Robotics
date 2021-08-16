package frc.robot;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.XboxController.Button;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

public class Controller {
    private static Controller instance = new Controller();
    public static Controller getInstance() {return instance;}
    private final XboxController op = new XboxController(2); 
    private final JoystickButton op_A = new JoystickButton(op, Button.kA.value);
    private final JoystickButton op_B = new JoystickButton(op, Button.kB.value);
    private final JoystickButton op_X = new JoystickButton(op, Button.kX.value);
    private final JoystickButton op_Y = new JoystickButton(op, Button.kY.value);

    private final DigitalInput b_A = new DigitalInput(0);
    // private final DigitalInput b_B = new DigitalInput(1);
    // private final DigitalInput b_C = new DigitalInput(2);

    private final DigitalOutput l_G = new DigitalOutput(1);
    private final DigitalOutput l_R = new DigitalOutput(2);
    private final DigitalOutput l_Y = new DigitalOutput(3);

    public Controller() {
        //TODO: MOVE THE NEW PART OF THE CONSTRUCTORS INTO HERE WITH MOUSE
    }

    public JoystickButton getA() {return op_A;}
    public JoystickButton getB() {return op_B;}
    public JoystickButton getX() {return op_X;}
    public JoystickButton getY() {return op_Y;}

    public boolean getBotA() {return b_A.get();}
    // public boolean getBotB() {return b_B.get();}
    // public boolean getBotC() {return b_C.get();}

    public void setGreen(boolean value) {l_G.set(value);}
    public void setRed(boolean value) {l_R.set(value);}
    public void setYellow(boolean value) {l_Y.set(value);}
}
