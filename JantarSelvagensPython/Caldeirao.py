class Caldeirao:
    def __init__(self, porcoes):
        self.porcoes = porcoes

    def servir(self):
        with self.mutex:
            while self.porcoes == 0:
                self.sinal_vazio.wait()
            self.porcoes -= 1
            print("Um selvagem se serviu. Porções restantes:", self.porcoes)
            if self.porcoes == 0:
                self.sinal_cheio.notify()

    def encher(self, N):
        with self.mutex:
            while self.porcoes > 0:
                self.sinal_cheio.wait()
            self.porcoes += N
            print("O cozinheiro encheu o caldeirão.")
            self.sinal_vazio.notifyAll()
