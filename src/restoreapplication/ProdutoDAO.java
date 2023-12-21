package restoreapplication;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class ProdutoDAO {
Conn conexao = new Conn();
    
    public Produto consultaProduto(String produtoP) throws ClassNotFoundException {
       conexao.Conectar();
        Produto produto = new Produto();
        ArrayList<Produto> listaProdutos = new ArrayList();
        try {
            String query = "select * from testprodutogeral tpg inner join testproduto tp on tp.produto = tpg.codigo where tpg.codigo = '"+produtoP+"' and tp.empresa = '01'";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {

                produto.setCODIGO(rs.getString("CODIGO"));
                produto.setDESCRICAO(rs.getString("DESCRICAO"));
                produto.setCODIGOBARRA(rs.getString("CODIGOBARRA"));
                produto.setESTARETIRAR(rs.getString("ESTARETIRAR"));
                produto.setESTCONDICIONAL(rs.getString("ESTCONDICIONAL"));
                produto.setESTDISPONIVEL(rs.getString("ESTDISPONIVEL"));
                produto.setESTRESERVADO(rs.getString("ESTRESERVADO"));
                
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return produto;
    }
public ArrayList produtosDoPedido(String pedido,String empresa) throws ClassNotFoundException {
       conexao.Conectar();
        
        ArrayList<Produto> listaProdutos = new ArrayList();
        try {
            String query = "select * from tvenproduto tvp where tvp.pedido = '"+pedido+"' and tvp.empresa = '"+empresa+"' order by tvp.identificador";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setCODIGO(rs.getString("PRODUTO"));
                produto.setDESCRICAO(rs.getString("DESCRICAOEDITADA"));
                produto.setALMOX(rs.getString("ALMOX"));
                produto.setQTDE(rs.getString("QTDE"));
                listaProdutos.add(produto);
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return listaProdutos;
    }
public ArrayList produtosDaNota(String nota,String empresa) throws ClassNotFoundException {
       conexao.Conectar();
        
        ArrayList<Produto> listaProdutos = new ArrayList();
        try {
            String query = "select * from testnfeprod tprod where tprod.codigoid = '"+nota+"' and tprod.empresa = '"+empresa+"'";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setCODIGO(rs.getString("PRODUTO"));
                produto.setALMOX(rs.getString("ALMOX"));
                produto.setQTDE(rs.getString("QTDE"));
                listaProdutos.add(produto);
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return listaProdutos;
    }
public ArrayList buscaSaldo(String produtoP) throws ClassNotFoundException {
       conexao.Conectar();
        
        ArrayList<Produto> listaProdutos = new ArrayList();
        try {
            String query = "select * from TESTEXTSALDOPRODUTO tsp where tsp.produto = '"+produtoP+"' and tsp.almox = '01' and tsp.empresa = '01' order by tsp.anomes";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setCODIGO(rs.getString("PRODUTO"));
                produto.setALMOX(rs.getString("ALMOX"));
                produto.setANOSMES(rs.getString("ANOMES"));
                produto.setANTERIOR(rs.getDouble("ANTERIOR"));
                produto.setENTRADA(rs.getDouble("ENTRADA"));
                produto.setSAIDA(rs.getDouble("SAIDA"));
                produto.setATUAL(rs.getDouble("ATUAL"));
                produto.setEMPRESA(rs.getString("EMPRESA"));
                listaProdutos.add(produto);
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return listaProdutos;
    }
public ArrayList buscaCodigos() throws ClassNotFoundException {
       conexao.Conectar();
        
        ArrayList<Integer> listaCodigos = new ArrayList();
        try {
            String query = "select tp.produto from testproduto tp";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                int codigo = (rs.getInt("PRODUTO"));
                listaCodigos.add(codigo);
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return listaCodigos;
    }

}
