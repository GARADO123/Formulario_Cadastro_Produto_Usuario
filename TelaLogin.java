import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaLogin extends JFrame {
    private JButton btnOK;
    private JTextField txtUsuario;
    private JLabel Usuario;
    private JPasswordField pswSenha;
    private JPanel TelaLogin;
    private JLabel Senha;

    public TelaLogin(){
        iniviarComponentes();
        criarListener();
    }
    public void iniviarComponentes(){

        setTitle("Tela de login");
        setSize(300,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(TelaLogin);
        setVisible(true);
    }

    public void criarListener(){

        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validarLogin();
            }
        });
    }
    private void validarLogin(){
        String usario=txtUsuario.getText();
        String senha = new String(pswSenha.getPassword());

            if(usario.equals("admin") && senha.equals("admin")){


                TelaMenu menu = new TelaMenu();
                menu.setVisible(true);
                dispose();




            }else{
                JOptionPane.showMessageDialog(this,"Usuario ou senha incorreto");
            }
    }

    public static void main(String[] args){
        TelaLogin iniciar = new TelaLogin();

    }


}
