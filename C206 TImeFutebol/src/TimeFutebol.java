class TimeFutebol {
    private int id;
    private String nome;
    private boolean campeaoMundial;
    private int quantasVezesCampeao;

    public TimeFutebol(int id, String nome, boolean campeaoMundial, int quantasVezesCampeao) {
        this.id = id;
        this.nome = nome;
        this.campeaoMundial = campeaoMundial;
        this.quantasVezesCampeao = quantasVezesCampeao;
    }

    // Getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isCampeaoMundial() {
        return campeaoMundial;
    }

    public void setCampeaoMundial(boolean campeaoMundial) {
        this.campeaoMundial = campeaoMundial;
    }

    public int getQuantasVezesCampeao() {
        return quantasVezesCampeao;
    }

    public void setQuantasVezesCampeao(int quantasVezesCampeao) {
        this.quantasVezesCampeao = quantasVezesCampeao;
    }

    @Override
    public String toString() {
        String info = "Time [ID=" + id + ", Nome=" + nome;
        if (campeaoMundial) {
            info += ", Campeão Mundial, Títulos: " + quantasVezesCampeao;
        } else {
            info += ", Não é Campeão Mundial";
        }
        return info + "]";
    }
}
