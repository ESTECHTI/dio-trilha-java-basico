public class SmartTv {
  boolean ligada = false;
  int canal = 1;
  int volume = 25;

  public void mudarCanal(int novoCanal) {
    if (novoCanal > 0) {
      canal = novoCanal;
      System.out.println("Mudando para o canal: " + canal);
    } else {
      System.out.println("Canal inválido. O canal deve ser maior que 0.");
    }
  }

  public void aumentarCanal() {
    canal++;
    System.out.println("Aumentando o canal para: " + canal);
  }

  public void diminuirCanal() {
    canal--;
    System.out.println("Diminuindo o canal para: " + canal);
  }

  public void aumentarVolume() {
    volume++;
    System.out.println("Aumentando o volume para: " + volume);
  }

  public void diminuirVolume() {
    volume--;
    System.out.println("Diminuindo o volume para: " + volume);
  }

  public void ligar() {
    ligada = true;
  }

  public void desligar() {
    ligada = false;
  }
}
