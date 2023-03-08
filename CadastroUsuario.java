import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroUsuario extends JFrame {
    private JPanel pnlTelaUsuario;
    private JButton bntSalvar;
    private JTextField txtLogin;
    private JTextField txtFunçao;
    private JTextField txtSetor;
    private JTextField txtSobrenome;
    private JTextField txtNome;
    private JPasswordField pwfSenha;
    private JButton voltarMenuButton;

    public CadastroUsuario() {
        ConfTelaUsuario();
        SalvarInforUsuario();
        VoltarMenuUsuari();
    }
    public void SalvarInforUsuario(){
        bntSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(bntSalvar," O Nome do usuario e "+txtNome.getText()+
                        "\n e seu Sobrenome e "+txtSobrenome.getText()+
                        "\n trabalha no Setor "+txtSetor.getText()+
                        "\n e na Funcao  "+txtFunçao.getText()+
                        "\n e seu login e "+txtLogin.getText()+".");
            }
        });
    }

    public void VoltarMenuUsuari(){
        voltarMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    TelaMenu VoltarMenuUsuari= new TelaMenu();
                    VoltarMenuUsuari.setVisible(true);
                    dispose();
            }
        });
    }




        private void ConfTelaUsuario(){
           setTitle("Tela de login");
           setSize(350,300);
           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           setContentPane(pnlTelaUsuario);
           setVisible(true);
       }
}
