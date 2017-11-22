package dao;

import java.time.LocalDate;
import dominio.Movimentacao;
import java.util.List;

/**
 *
<<<<<<< HEAD
 * @author rodrigoavellar
=======
 * @author Francke
>>>>>>> b22852bd592ade8c511fe45dd179bf17158c0c96
 */
public interface MovimentacaoDAO extends Dao<Movimentacao>{   
    public Movimentacao procurarPorData(LocalDate data);
    public Movimentacao procurarPorValor(Double valor);
    public List<Movimentacao> getListaMovimentacoes(CategoriaDAO listaCat);
    public List<Movimentacao> listarPorTipo(Boolean tipo);
}
