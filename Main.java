import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Main {
  public static void main(String[] args) {
    List<Gasto> gastos = new ArrayList<>();
    gastos.add(new Gasto("Restaurante", new Date(), 250.0, "Cartão de Crédito"));
    gastos.add(new Gasto("Faculdade", new Date(), 900.0, "PIX"));
    gastos.add(new Gasto("Verdureira", new Date(), 150.0, "Dinheiro"));
    gastos.add(new Gasto("Mercado", new Date(), 250.0, "Cartão de Débito"));
    gastos.add(new Gasto("Escola", new Date(), 450.0, "Cartão de Crédito"));
    gastos.add(new Gasto("Comida", new Date(), 400.0, "PIX"));

    List<Ganho> ganhos = new ArrayList<>();
    ganhos.add(new Ganho("Loja", new Date(), 2500.0));
    ganhos.add(new Ganho("Freelance", new Date(), 1300.0));

    Relatorio relatorio = new Relatorio();
    relatorio.gerarRelatorioDespesas(gastos);
    relatorio.gerarRelatorioReceitas(ganhos);
    relatorio.gerarRelatorioSaldoMensal(ganhos, gastos);
  }
}