
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KaioT
 */
public class Estoque {
    public ArrayList<Produto> estoque = new ArrayList<Produto>();
    
    public static void insereProduto(ArrayList<Produto> estoque,javax.swing.JTextField id_produto,javax.swing.JTextField nome_produto){
        Produto produto_criado = new Produto();
        
        produto_criado.setId_produto(id_produto.getText());
        produto_criado.setNome_produto(nome_produto.getText()); 
        
        estoque.add(produto_criado);
        if (estoque.add(produto_criado) == true){
           JOptionPane.showMessageDialog(null,"Cadastrado com Sucesso"); 
        }else{
           JOptionPane.showMessageDialog(null,"Não Foi possível cadastrar");
        }
            
        
    }
    
    // Lembrar de Construir este método!
    public static void retiraProduto(ArrayList<Produto> estoque,javax.swing.JTextField id_produto,javax.swing.JTextField nome_produto){
        Produto produto_criado = new Produto();
        
        produto_criado.setId_produto(id_produto.getText());
        produto_criado.setNome_produto(nome_produto.getText()); 
        
        estoque.add(produto_criado);
        JOptionPane.showMessageDialog(null,"Cadastrado com Sucesso");
    }
    
    public static void consultaProduto(ArrayList<Produto> estoque,javax.swing.JTextField id_produto,javax.swing.JTextField nome_produto){
        Produto produto_criado = new Produto();
        
        produto_criado.setId_produto(id_produto.getText());
        produto_criado.setNome_produto(nome_produto.getText()); 
        
        estoque.add(produto_criado);
        JOptionPane.showMessageDialog(null,"Cadastrado com Sucesso");
    }
    
    
}



