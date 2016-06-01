import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author KaioT
 */
public class Estoque {
    public static ArrayList<Item> estoque = new ArrayList<Item>();
    
    public static void insereProduto(String id,String nome,Float preço,int quantidadeInserida){
        Produto produtoCriado = new Produto(id,nome,preço);
        Item itemCriado = new Item(produtoCriado,quantidadeInserida);
        if (estoque.isEmpty()){
            if (estoque.add(itemCriado) == true){
               JOptionPane.showMessageDialog(null,"Cadastrado com Sucesso"); 
            }else{
               JOptionPane.showMessageDialog(null,"Não Foi possível cadastrar"); 
            }        
        }else{
            for (int i=0;i<estoque.size();i++){           
                if (estoque.get(i).getProduto().getIdProduto().equalsIgnoreCase(id)){
                    estoque.get(i).setQuantidade(estoque.get(i).getQuantidade()+quantidadeInserida);
                }else{
                    if (estoque.add(itemCriado) == true){
                       JOptionPane.showMessageDialog(null,"Cadastrado com Sucesso"); 
                    }else{
                       JOptionPane.showMessageDialog(null,"Não Foi possível cadastrar");
                    }   
                }
            }
        }
        
    }
    // Falta tratar quando o produto não é encontrado
    public static void consultaProduto (String idProduto){
        int i;
        //Produto produtoConsultado = new Produto();
            for (i=0;i<Estoque.estoque.size();i++){
                if (estoque.get(i).getProduto().getIdProduto().equalsIgnoreCase(idProduto)){
                    System.out.print("ID: ");
                    System.out.println(estoque.get(i).getProduto().getIdProduto());
                    System.out.print("Nome do produto: ");
                    System.out.println(estoque.get(i).getProduto().getNomeProduto());
                    System.out.print("Preço: R$");
                    System.out.println(estoque.get(i).getProduto().getPreço());
                    System.out.print("Quantidade: ");
                    System.out.println(estoque.get(i).getQuantidade());
                }else{
                    System.out.print("Produto não encontrado.");
                }
            }
    }
    
    public static void retiraProduto(String nomeProduto,int quantidadeSolicitada){
        int i; 
        
        if (estoque.isEmpty()){
            JOptionPane.showMessageDialog(null,"Produto não encontrado");
        }else{
            for (i=0;i<Estoque.estoque.size();i++){
                if (estoque.get(i).getProduto().getNomeProduto().equalsIgnoreCase(nomeProduto)){
                    if(estoque.get(i).getQuantidade() == quantidadeSolicitada){
                       estoque.remove(estoque.get(i)); 
                    }else{
                        estoque.get(i).setQuantidade(estoque.get(i).getQuantidade() - quantidadeSolicitada);
                    }
                        
                    JOptionPane.showMessageDialog(null,"Retirado com Sucesso");
                }else{
                    JOptionPane.showMessageDialog(null,"Produto não encontrado");
                }
            }
        }
                    
    }  
}