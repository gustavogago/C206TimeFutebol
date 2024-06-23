import java.util.*;

class GerenciadorDeTimes implements Crud {
    private List<TimeFutebol> times = new ArrayList<>();

    @Override
    public void criar(TimeFutebol time) {
        times.add(time);
    }

    @Override
    public List<TimeFutebol> ler() {
        return times;
    }

    @Override
    public void atualizar(TimeFutebol time) {
        TimeFutebol timeEncontrado = times.stream()
                .filter(t -> t.getId() == time.getId())
                .findFirst()
                .orElse(null);
        if (timeEncontrado != null) {
            timeEncontrado.setNome(time.getNome());
        }
    }

    @Override
    public void deletar(int id) {
        times.removeIf(t -> t.getId() == id);
    }
}