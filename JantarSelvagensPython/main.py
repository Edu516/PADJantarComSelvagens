import threading

from Caldeirao import Caldeirao
from Selvagem import Selvagem
from Cozinheiro import Cozinheiro

if __name__ == "__main__":
    N_PORCOES_INICIAL = 5  # Número inicial de porções no caldeirão
    caldeirao = Caldeirao(N_PORCOES_INICIAL)
    num_selvagens = 10
    num_cozinheiros = 1
    N_PORCOES = 5  # Novo número de porções para encher o caldeirão

    mutex = threading.Lock()
    caldeirao.mutex = mutex
    caldeirao.sinal_cheio = threading.Condition(mutex)
    caldeirao.sinal_vazio = threading.Condition(mutex)

    selvagens = [Selvagem(caldeirao) for _ in range(num_selvagens)]
    cozinheiros = [Cozinheiro(caldeirao, N_PORCOES) for _ in range(num_cozinheiros)]

    for selvagem in selvagens:
        selvagem.start()

    for cozinheiro in cozinheiros:
        cozinheiro.start()

    for selvagem in selvagens:
        selvagem.join()

    for cozinheiro in cozinheiros:
        cozinheiro.join()
