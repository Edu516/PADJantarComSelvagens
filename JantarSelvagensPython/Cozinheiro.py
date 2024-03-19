import threading
import time
import random

class Cozinheiro(threading.Thread):
    def __init__(self, caldeirao, N):
        threading.Thread.__init__(self)
        self.caldeirao = caldeirao
        self.N = N

    def run(self):
        while True:
            self.caldeirao.encher(self.N)
            self.dormir()

    def dormir(self):
        print("O cozinheiro está dormindo.")
        time.sleep(random.uniform(0.5, 1.5))  # Tempo aleatório para dormir
