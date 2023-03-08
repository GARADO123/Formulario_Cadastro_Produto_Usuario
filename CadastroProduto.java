import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroProduto extends JFrame {
    private JPanel pnlCadastroProduto;
    private JButton btnSalvar;
    private JTextField txtQuantidade;
    private JTextField txtPreco;
    private JTextField txtDescricao;
    private JTextField txtCodigo;
    private JButton voltarMenuButton;


    public CadastroProduto(){
        ConfTelaProduto();
        SalvarProduto();
        VoltarMenuProd();
    }
        public void SalvarProduto() {
            btnSalvar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    JOptionPane.showMessageDialog(btnSalvar," O Codigo do produto e "+txtPreco.getText()+
                            "\n e sua Descricao e "+txtDescricao.getText()+
                            "\n seu Valor e "+txtPreco.getText()+
                            "\n a sua Quantidade e de "+txtQuantidade.getText()+".");
                }
            });
        }
        public void VoltarMenuProd(){
            voltarMenuButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    TelaMenu VoltarMenuProd = new TelaMenu();
                    VoltarMenuProd.setVisible(true);
                    dispose();
                }
            });

        }
    private void ConfTelaProduto(){
        setTitle("Tela de login");
        setSize(350,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(pnlCadastroProduto);
        setVisible(true);
    }

}
