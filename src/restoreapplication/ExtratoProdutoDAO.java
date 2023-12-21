package restoreapplication;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ExtratoProdutoDAO {
    Conn conexao = new Conn();
    
    public ArrayList extratoProduto(String produtoP) throws ClassNotFoundException {
       conexao.Conectar();
        
        ArrayList<ExtratoProduto> listaProdutos = new ArrayList();
        try {
            //and te.datahora like '%2023-05%'
            String query = "select * from testextrato te where te.produto = '"+produtoP+"' and te.empresa = '01' and te.almox = '01'  order by te.datahora";
            PreparedStatement pst;
            ResultSet rs;
            pst = conexao.con.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                ExtratoProduto produto = new ExtratoProduto();

                produto.setEMPRESA(rs.getString("EMPRESA"));
                produto.setALMOX(rs.getString("ALMOX"));
                produto.setENTRADASAIDA(rs.getString("ENTRADASAIDA"));
                produto.setPRODUTO(rs.getString("PRODUTO"));
                produto.setQTDE(rs.getString("QTDE"));
                produto.setSALDO(rs.getString("SALDO"));
                produto.setDATAHORA(rs.getString("DATAHORA"));
                produto.setCODIGOID(rs.getString("CODIGOID"));
                produto.setMOVIMENTOID(rs.getString("MOVIMENTOID"));

                listaProdutos.add(produto);
            }
        } catch (SQLException e) {
            System.out.println("Erro na Conexão com o Banco " + e);
        }
        conexao.FecharConexao();
        return listaProdutos;
    }
    
}
