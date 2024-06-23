import java.util.*;

interface Crud {
    void criar(TimeFutebol time);
    List<TimeFutebol> ler();
    void atualizar(TimeFutebol time);
    void deletar(int id);
}