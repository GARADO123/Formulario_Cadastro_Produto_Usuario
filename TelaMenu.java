import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaMenu extends JFrame {
    private JPanel pnlTelaMenu;
    private JButton btnCadUsuario;
    private JButton btnCadProduto;


    public TelaMenu() {
        ConfTelaMenu();
        InfoUsuario();
        InfoProduto();
    }
    public void InfoProduto(){
            btnCadProduto.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    CadastroProduto cadastroP = new CadastroProduto();
                    cadastroP.setVisible(true);
                    dispose();
                }
            });
        }





    public void InfoUsuario(){

        btnCadUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                CadastroUsuario cadastroU = new CadastroUsuario();
                cadastroU.setVisible(true);
                dispose();
            }
        });
    }



    public void ConfTelaMenu(){

        setTitle("Tela de login");
        setSize(350,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(pnlTelaMenu);
        setVisible(true);
    }






}
